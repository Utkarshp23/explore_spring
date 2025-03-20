package in.experiment.Components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

// @Component annotation is used to mark this class as a Spring bean to be managed by Spring IOC container
@Component
public class Car {

    // Injecting value using @Value annotation
    @Value("Toyota")
    String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Method to be called after bean initialization
    @PostConstruct
    public void init() {
        System.out.println("Bean is going through init.");
    }
}
