package clients.clients.products.application.mainmodule.service;

import clients.clients.products.application.mainmodule.dto.ClientDto;

import java.util.List;
import java.util.Optional;

public interface IClientService {
    List<ClientDto> getAll();
    Optional<ClientDto> getClient(long clientId);
}
