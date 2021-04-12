package clients.clients.products.infrastructure.crud;

import clients.clients.products.domain.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface IClientCrudRepository extends CrudRepository<Client, Long> {
}
