package pl.wojciechgalka.Rejestracja.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wojciechgalka.Rejestracja.models.ClientEntity;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Integer> {
}
