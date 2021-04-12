package clients.clients.products.presentation.web.controller;


import clients.clients.products.application.mainmodule.dto.ClientDto;
import clients.clients.products.application.mainmodule.service.IClientService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private Environment environment;

    @Autowired
    private IClientService clientService;

    @GetMapping("/getAll")
    @ApiOperation("Get All clients.")
    @ApiResponse(code = 200, message = "SUCCESS")

    public List<ClientDto> getAll(){
        return clientService.getAll().stream().map(
                p -> {
                    p.setPortInUse(environment.getProperty("local.server.port"));
                    return p;
                }).collect(Collectors.toList());
    }

    @GetMapping("/getClient/{clientId}")
    @ApiOperation("Get client by ID.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "SUCCESS"),
            @ApiResponse(code = 404, message = "CLIENT NOT FOUND")
    })
    public ClientDto getClient(@ApiParam(value = "This ID of the client.", example = "5", required = true)
                                 @PathVariable("clientId") long clientId){
        ClientDto clientDto = clientService.getClient(clientId).get();
        clientDto.setPortInUse(environment.getProperty("local.server.port"));
        return clientDto;
    }

}
