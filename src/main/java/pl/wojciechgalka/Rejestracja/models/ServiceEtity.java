package pl.wojciechgalka.Rejestracja.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tservice")
@NoArgsConstructor
@Getter @Setter
public class ServiceEtity {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private int duration;
    private double price;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    @OneToMany (mappedBy = "services", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<RegisteredServiceEntity> registeredServiceEntityList;

    @Override
    public String toString() {
        return "ServiceEtity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }
}
