public class Main {
    public static void main(String[] args) {

        SmartDevice phone = new Mobile("Mobile", 10);
        SmartDevice laptop = new Laptop("Laptop", 10);


        ChargingStation station = new ChargingStation();  // Fixed: charger instance not needed here

 //Mob
        station.connectDevice(phone);
        station.disconnectDevice(phone);

//Lap
        System.out.println("\n Switching to Laptop...\n");
        station.connectDevice(laptop);
station.disconnectDevice(laptop);






    }
}
