package Facade;

public class LightsImpl implements Lights {
    public void turnOnLights(){
        System.out.println("Lights turned on!");
    }

    public void turnOffLights(){
        System.out.println("Lights turned off!");
    }
}
