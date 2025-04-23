import java.lang.Thread;
public class SmartDevice {
    String deviceName;
    int batteryLevel;
    boolean isCharging;

    public SmartDevice(String deviceName, int batteryLevel) {
        this.deviceName = deviceName;
        this.batteryLevel = batteryLevel;
        this.isCharging = false;
    }

    public void startCharging() {
        if(batteryLevel>=100) {
            System.out.println(deviceName + "Already fully charge");
        }
        else{
        if (isCharging) {
            System.out.println(deviceName + " is already charging.");
        } else {
            isCharging = true;
            System.out.println("Plugging in: " + deviceName);
            charge();
        }
    }}

    public void charge() {
        while (batteryLevel < 100) {
            batteryLevel += 10;
            System.out.println(deviceName + " charging: " + batteryLevel + "%");
            try {
                Thread.sleep(1000);  // Simulate charging time
            } catch (InterruptedException e) {
                System.out.println(deviceName + " charging interrupted.");
            }
        }
        System.out.println(deviceName + " fully charged!");
    }

    public void stopCharging() {
        if (!isCharging) {
            System.out.println(deviceName + " is not charging.");
        } else {
            isCharging = false;
            System.out.println(deviceName + " charging stopped.");
        }
    }
}
