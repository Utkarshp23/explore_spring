package in.experiment;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import in.experiment.Components.Car;
import in.experiment.Components.Person;
import in.experiment.Components.Vehicle;
import in.experiment.Configurations.AppConfig;

public class Main {
    public static void main(String[] args) {

        //{--1--} @@@@---Setter Based Injection / Constructor Based Injection
        // Accessing the IOC container
        // Refer beans.xml
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        // ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Retrieving Person Bean from IOC container
        Person person = (Person) factory.getBean("person");
        System.out.println("Name: " + person.getName());

        //{--2--} @@@@---Annotation Based Configuration
        // Refer Car.java
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("in.experiment");
        Car car = context.getBean(Car.class);
        System.out.println("Brand: " + car.getBrand());
        context.close();

        //{--2--} @@@@---Annotation Based Configuration using @ComponentScan
        // Refer AppConfig.java
        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car1 = context1.getBean(Car.class);
        System.out.println("Brand: " + car1.getBrand());

        //{--3--} @@@@---Java Based Configuration
        // Refer AppConfig.java
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle vehicle = context2.getBean(Vehicle.class);
        System.out.println("Engine Type: " + vehicle.getEngine().getType());
        context2.close();
    }
}
