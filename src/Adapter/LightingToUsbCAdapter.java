package Adapter;

public class LightingToUsbCAdapter implements UsbCCharger{

    private final LightingCharger lightingCharger;

    public LightingToUsbCAdapter(LightingCharger lightingCharger) {
        this.lightingCharger = lightingCharger;
    }

    @Override
    public void plugInUsbC() {
        lightingCharger.plugInLighting();
    }
}
