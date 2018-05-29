package pl.wojciechgalka.Rejestracja.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wojciechgalka.Rejestracja.models.CategoryEntity;
import pl.wojciechgalka.Rejestracja.models.repositories.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<CategoryEntity> getCategories() {
        return (List<CategoryEntity>) categoryRepository.findAll();
    }
}
