package in.experiment.Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import in.experiment.Components.Engine;
import in.experiment.Components.Vehicle;

@Configuration
@ComponentScan(basePackages = "in.experiment.*")
public class AppConfig {


    // Java Based Configuration
    @Bean
    @Scope("prototype") // Every time a new instance of Engine is created when requested from the container
    public Engine engineV6() {
        return new Engine("V6");
    }

    // Java Based Configuration
    @Bean
    @Scope("prototype")
    public Engine engineV8() {
        return new Engine("V8");
    }

}
