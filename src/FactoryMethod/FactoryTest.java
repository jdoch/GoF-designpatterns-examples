package FactoryMethod;

public class FactoryTest {
    public static void main(String[] args){
        VehicleFactory vf = new VehicleFactory();
        Vehicle v = vf.createVehicle(VehicleType.PLANE);
        v.printType();
    }
}
