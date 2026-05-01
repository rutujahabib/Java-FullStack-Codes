public class ExecutionRemote {
    public static void main(String[] args) {
        Remote r = new Remote();
        r.brand = "Sony";
        r.batteryLife = 12;
        r.isUniversal = true;
        r.type = "Infrared";
        r.price = 1500;
        System.out.println("Remote Brand: " + r.brand);
        System.out.println("Battery Life: " + r.batteryLife + " hours");
        System.out.println("Is the Remote Universal? " + r.isUniversal);
        System.out.println("Remote Type: " + r.type);
        System.out.println("Remote Price: $" + r.price);

        Remote r2 = new Remote();
        r2.brand = "Samsung";
        r2.batteryLife = 10;
        r2.isUniversal = false;
        r2.type = "Bluetooth";
        r2.price = 2000;
        System.out.println("Remote Brand: " + r2.brand);
        System.out.println("Battery Life: " + r2.batteryLife + " hours");
        System.out.println("Is the Remote Universal? " + r2.isUniversal);
        System.out.println("Remote Type: " + r2.type);
        System.out.println("Remote Price: $" + r2.price);
    }    
}



// Remote Brand: Sony
// Battery Life: 12 hours
// Is the Remote Universal? true
// Remote Type: Infrared
// Remote Price: $1500
// Remote Brand: Samsung
// Battery Life: 10 hours
// Is the Remote Universal? false
// Remote Type: Bluetooth
// Remote Price: $2000