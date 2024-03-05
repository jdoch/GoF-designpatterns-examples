package AbstractFactory.factory;

import AbstractFactory.abstraction.Factory;
import AbstractFactory.enums.Country;

public class FactoryProducer {
    public static Factory createFactory(Country country){
        return switch (country) {
            case POLAND -> new PolishFactory();
            case GERMANY -> new GermanFactory();
        };
    }
}
