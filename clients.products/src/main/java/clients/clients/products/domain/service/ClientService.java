package clients.clients.products.domain.service;

import clients.clients.products.application.mainmodule.dto.ClientDto;
import clients.clients.products.application.mainmodule.service.IClientService;
import clients.clients.products.domain.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements IClientService {

    @Autowired
    private IClientRepository clientRepository;

    public List<ClientDto> getAll() {
        return clientRepository.getAll();
    }

    public Optional<ClientDto> getClient(long clientId) {
        return clientRepository.getClient(clientId);
    }

}
