package Adapter;

public class AndroidCharger implements UsbCCharger{
    @Override
    public void plugInUsbC() {
        System.out.println("Plug in USB C...");
    }
}
