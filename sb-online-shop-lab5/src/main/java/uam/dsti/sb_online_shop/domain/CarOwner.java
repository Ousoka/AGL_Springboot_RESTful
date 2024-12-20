package uam.dsti.sb_online_shop.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

//@JsonIgnoreProperties({"hibernateLazy Initializer", "handler"})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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
    //@OneToMany(mappedBy = "owner")
    //@JsonBackReference
    private List<Car> cars;


    public long getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(long ownerid) {
        this.ownerid = ownerid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

 
    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars){
        this.cars = cars;
    }
}


