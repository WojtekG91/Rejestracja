package pl.wojciechgalka.Rejestracja.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wojciechgalka.Rejestracja.models.CategoryEntity;
import pl.wojciechgalka.Rejestracja.models.RegisteredServiceEntity;
import pl.wojciechgalka.Rejestracja.models.ServiceEtity;
import pl.wojciechgalka.Rejestracja.models.repositories.CategoryRepository;
import pl.wojciechgalka.Rejestracja.models.repositories.RegisteredServiceRepository;
import pl.wojciechgalka.Rejestracja.models.repositories.ServiceRepository;

import java.util.List;
import java.util.Optional;

@Controller
public class MainControler {
    @Autowired
    RegisteredServiceRepository registeredServiceRepository;

    @Autowired
    ServiceRepository serviceRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/")
//    @ResponseBody
    public String index() {
        Optional<RegisteredServiceEntity> registeredServiceEntity= registeredServiceRepository.findById(1);
        RegisteredServiceEntity registeredServiceEntity1 = registeredServiceEntity.get();
        System.out.println(registeredServiceEntity1.getServices().getName());
        return "index";
    }
}
