package in.experiment.Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.experiment.Components.Engine;
import in.experiment.Components.Vehicle;

@Configuration
@ComponentScan(basePackages = "in.experiment.*")
public class AppConfig {


    // Java Based Configuration
    @Bean
    public Engine engineV6() {
        return new Engine("V6");
    }

    // Java Based Configuration
    @Bean
    public Engine engineV8() {
        return new Engine("V8");
    }

    // Java Based Configuration
//    @Bean
//    public Vehicle vehicle() {
//        return new Vehicle(engineV6()); // Default to V6 engine
//    }
}
