package AbstractFactory.factory;

import AbstractFactory.abstraction.Factory;
import AbstractFactory.abstraction.Car;
import AbstractFactory.abstraction.Specification;
import AbstractFactory.product.GermanCar;

public class GermanFactory implements Factory {

    @Override
    public Car createCar() {
        return new GermanCar();
    }

    @Override
    public Specification createSpecification() {
        return null;
    }
}
