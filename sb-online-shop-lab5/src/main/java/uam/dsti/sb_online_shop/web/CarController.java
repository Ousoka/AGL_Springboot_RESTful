package uam.dsti.sb_online_shop.web;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uam.dsti.sb_online_shop.domain.Car;
import uam.dsti.sb_online_shop.domain.CarOwnerRepository;
import uam.dsti.sb_online_shop.domain.CarRepository;

@RestController
//@RequestMapping("/cars") // Maps all routes prefixed with /cars
public class CarController {

    @Autowired
    private CarRepository repository;
    
    @Autowired
    private CarOwnerRepository orepository;

    //@RequestMapping("/cars")
    //@GetMapping("/cars")
    // @GetMapping // Handles GET requests to /cars
    
    //public Iterable<Car> getCars() {
    //    return repository.findAll(); 
    //}

    @GetMapping("/cars")
    public Iterable<Car> getCars() {
        Iterable<Car> cars = repository.findAll();
        //for (Car car : cars) {
        //    Hibernate.initialize(car.getOwner());  // Explicitly initialize owner
        //}
        return cars;
    }

}






