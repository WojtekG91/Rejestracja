package pl.wojciechgalka.Rejestracja.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wojciechgalka.Rejestracja.models.CategoryEntity;

@Repository
public interface CategoryRepository extends CrudRepository <CategoryEntity, Integer> {
}
