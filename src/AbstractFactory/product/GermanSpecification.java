package AbstractFactory.product;

import AbstractFactory.abstraction.Specification;

public class GermanSpecification implements Specification {
    @Override
    public void getText() {
        System.out.println("Guten Tag...");
    }
}
