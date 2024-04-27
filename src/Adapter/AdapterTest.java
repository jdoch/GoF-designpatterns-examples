package Adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterTest {
    public static void main(String[] args){
        List<UsbCCharger> chargers = new ArrayList<>();
        chargers.add(new AndroidCharger());
        chargers.add(new LightingToUsbCAdapter(new IPhoneCharger()));

        for (UsbCCharger charger: chargers) {
            charger.plugInUsbC();
        }
    }
}
