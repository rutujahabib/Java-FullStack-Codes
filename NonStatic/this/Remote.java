

public class Remote {
    String name;
    double price;
    String type;
    String batteryType;
    public void displayDetails() {
        System.out.println(this.name);
        System.out.println(this.price);
        System.out.println(this.type);
        
    }   
    public void showBatteryType(){
        System.out.println("Battery Type: " + batteryType);
    }

    public static void main(String[] args) {
        Remote myRemote = new Remote();
        myRemote.name = "Sony Remote";
        myRemote.price = 29.99;
        myRemote.type = "Universal Remote";
        myRemote.batteryType = "AAA";
        myRemote.displayDetails();
        myRemote.showBatteryType();
    }
}


// Sony Remote
// 29.99
// Universal Remote
// Battery Type: AAA