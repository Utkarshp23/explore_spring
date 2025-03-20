package in.experiment.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    Engine engine;

    @Autowired
    public Vehicle(@Qualifier("engineV8") Engine engine) {
        this.engine = engine;
    }    

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
