package AbstractFactory;

import AbstractFactory.abstraction.Factory;
import AbstractFactory.abstraction.Car;
import AbstractFactory.abstraction.Specification;
import AbstractFactory.enums.Country;
import AbstractFactory.factory.FactoryProducer;

public class AbstractFactoryTest {
    public static void main(String[] args){
        Factory factory = FactoryProducer.createFactory(Country.POLAND);
        Car car = factory.createCar();
        car.getModel();
        Specification specification = factory.createSpecification();
        specification.getText();
    }
}
