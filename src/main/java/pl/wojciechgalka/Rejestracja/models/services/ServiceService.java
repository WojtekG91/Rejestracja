package pl.wojciechgalka.Rejestracja.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wojciechgalka.Rejestracja.models.CategoryEntity;
import pl.wojciechgalka.Rejestracja.models.ServiceEtity;
import pl.wojciechgalka.Rejestracja.models.repositories.CategoryRepository;
import pl.wojciechgalka.Rejestracja.models.repositories.ServiceRepository;

@Service
public class ServiceService {

    @Autowired
    ServiceRepository serviceRepository;

    @Autowired
    CategoryRepository categoryRepository;

    public void addService(String name, int duration, double price, int categoryId){
        CategoryEntity categoryEntity = categoryRepository.findById(categoryId).get();
        ServiceEtity serviceEtity = createNewServiceEntity(name, duration, price, categoryEntity);


    }

    private ServiceEtity createNewServiceEntity(String name, int duration, double price, CategoryEntity categoryEntity) {
        ServiceEtity newService = new ServiceEtity();
        newService.setName(name);
        newService.setDuration(duration);
        newService.setPrice(price);
        newService.setCategory(categoryEntity);
        return newService;
    }
}
