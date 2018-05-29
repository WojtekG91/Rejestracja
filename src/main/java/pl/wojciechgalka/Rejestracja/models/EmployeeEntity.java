package pl.wojciechgalka.Rejestracja.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter @Setter
@Table (name = "temployee")
public class EmployeeEntity {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String surname;

    @OneToMany (mappedBy = "employeeEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<RegisteredServiceEntity> registeredServiceEntityList;

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
