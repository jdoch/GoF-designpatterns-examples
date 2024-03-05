package AbstractFactory.product;

import AbstractFactory.abstraction.Car;

public class GermanCar implements Car {
    @Override
    public void getModel() {
        System.out.println("German car...");
    }
}
