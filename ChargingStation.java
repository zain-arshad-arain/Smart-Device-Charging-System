import java.util.ArrayList;
import java.util.List;

public class ChargingStation {
    private Charger charger;                         // Composition
    private List<SmartDevice> connectedDevices;      // Aggregation

    public ChargingStation() {
        charger = new Charger();
        connectedDevices = new ArrayList<>();
    }


    public void connectDevice(SmartDevice device) {
        connectedDevices.add(device);
        System.out.println(" Connecting " + device.deviceName + " to Smart Charger...");
        charger.charge(device);
    }


    public void disconnectDevice(SmartDevice device) {
        charger.stopCharging(device);
        connectedDevices.remove(device);
        System.out.println( device.deviceName + " disconnected from Smart Charger.");
    }
}
