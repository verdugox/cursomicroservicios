package clients.clients.products.infrastructure.repository;

import clients.clients.products.application.mainmodule.dto.ClientDto;
import clients.clients.products.application.mainmodule.mapper.IClientMapper;
import clients.clients.products.domain.entity.Client;
import clients.clients.products.domain.repository.IClientRepository;
import clients.clients.products.infrastructure.crud.IClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository implements IClientRepository {

    @Autowired
    private IClientCrudRepository clientCrudRepository;

    @Autowired
    private IClientMapper clientMapper;

    public List<ClientDto> getAll(){
        List<Client> clients = (List<Client>)clientCrudRepository.findAll();
        return clientMapper.toClientDto(clients);
    }

    public Optional<ClientDto> getClient(long id){
        return clientCrudRepository.findById(id).map(e -> clientMapper.toClientDto(e));
    }

}
