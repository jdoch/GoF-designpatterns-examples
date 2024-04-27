package Adapter;

public class IPhoneCharger implements LightingCharger{
    @Override
    public void plugInLighting() {
        System.out.println("Plug in lighting...");
    }
}
