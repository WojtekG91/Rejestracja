package pl.wojciechgalka.Rejestracja.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tcategory")
@NoArgsConstructor
@Getter @Setter
public class CategoryEntity {

    @Id
    @GeneratedValue
    private int id;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ServiceEtity> services;

    @Override
    public String toString() {
        return "CategoryEntity{" +
                "id=" + id +
                ", services=" + services +
                '}';
    }
}
