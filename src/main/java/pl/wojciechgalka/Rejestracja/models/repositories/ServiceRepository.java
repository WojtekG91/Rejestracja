package pl.wojciechgalka.Rejestracja.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wojciechgalka.Rejestracja.models.ServiceEtity;

@Repository
public interface ServiceRepository extends CrudRepository<ServiceEtity, Integer> {
}
