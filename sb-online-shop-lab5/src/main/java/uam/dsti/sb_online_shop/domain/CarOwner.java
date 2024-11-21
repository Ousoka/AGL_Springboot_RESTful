package uam.dsti.sb_online_shop.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazy Initializer", "handler"})
@Entity
public class CarOwner {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long ownerid;
    private String firstname, lastname;

    public CarOwner() {}

    public CarOwner(String firstname, String lastname) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;

    }
    
    @JsonIgnore
    @OneToMany(cascade=CascadeType.ALL, mappedBy="owner")

    private List<Car> cars;
 
    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars){
        this.cars = cars;
    }
}


