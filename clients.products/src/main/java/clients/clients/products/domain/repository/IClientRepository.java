package clients.clients.products.domain.repository;

import clients.clients.products.application.mainmodule.dto.ClientDto;

import java.util.List;
import java.util.Optional;

public interface IClientRepository {

    List<ClientDto> getAll();
    Optional<ClientDto> getClient(long clientId);

}
