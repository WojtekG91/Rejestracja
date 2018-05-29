package pl.wojciechgalka.Rejestracja.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wojciechgalka.Rejestracja.models.RegisteredServiceEntity;

import java.util.List;

@Repository
public interface RegisteredServiceRepository extends CrudRepository<RegisteredServiceEntity, Integer> {
    List<RegisteredServiceEntity> findAll();
}
