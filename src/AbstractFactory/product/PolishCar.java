package AbstractFactory.product;

import AbstractFactory.abstraction.Car;

public class PolishCar implements Car {
    @Override
    public void getModel() {
        System.out.println("Polish car...");
    }
}
