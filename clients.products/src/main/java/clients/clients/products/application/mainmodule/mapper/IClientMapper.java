package clients.clients.products.application.mainmodule.mapper;

import clients.clients.products.application.mainmodule.dto.ClientDto;
import clients.clients.products.domain.entity.Client;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IClientMapper {

    @Mappings({
            @Mapping(source = "id", target = "clientId"),
            @Mapping(source = "nombrecompleto", target = "nombrecompleto"),
            @Mapping(source = "dni", target = "dni"),
            @Mapping(target = "portInUse", ignore = true)
    })
    ClientDto toClientDto(Client client);
    List<ClientDto> toClientDto(List<Client> clients);
    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "createAt", ignore = true)
    })
    Client toClient(ClientDto clientDto);

}
