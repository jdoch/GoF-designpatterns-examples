package FactoryMethod;

public class VehicleFactory {
    Vehicle createVehicle(VehicleType type){
        return switch (type) {
            case PLANE -> new Plane();
            case SHIP -> new Ship();
        };
    }
}
