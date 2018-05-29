package pl.wojciechgalka.Rejestracja.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@Table (name = "tclient")
@NoArgsConstructor
public class ClientEntity {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String surname;
    private String mail;
    private String phone;
    private String password;

    @OneToMany(mappedBy = "clients", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<RegisteredServiceEntity> registeredServiceEntityList;

    @Override
    public String toString() {
        return "ClientEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
