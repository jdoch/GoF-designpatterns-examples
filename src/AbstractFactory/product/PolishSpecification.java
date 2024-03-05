package AbstractFactory.product;

import AbstractFactory.abstraction.Specification;

public class PolishSpecification implements Specification {
    @Override
    public void getText() {
        System.out.println("Dzień dobry...");
    }
}
