package pl.wojciechgalka.Rejestracja.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@NoArgsConstructor
@Getter @Setter
@Table (name = "tregistered_visit")
public class RegisteredServiceEntity {
    @Id
    @GeneratedValue
    private int id;

    private Date date;
    private Time time;

    @ManyToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "service_id")
    private  ServiceEtity services;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private ClientEntity clients;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employeeEntity;

    @Override
    public String toString() {
        return "RegisteredServiceEntity{" +
                "id=" + id +
                ", date=" + date +
                ", time=" + time +
                ", services=" + services +
                ", clients=" + clients +
                '}';
    }
}
