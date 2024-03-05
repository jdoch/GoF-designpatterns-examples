package AbstractFactory.factory;

import AbstractFactory.abstraction.Factory;
import AbstractFactory.abstraction.Car;
import AbstractFactory.abstraction.Specification;
import AbstractFactory.product.PolishCar;
import AbstractFactory.product.PolishSpecification;

public class PolishFactory implements Factory {

    @Override
    public Car createCar() {
        return new PolishCar();
    }

    @Override
    public Specification createSpecification() {
        return new PolishSpecification();
    }
}
