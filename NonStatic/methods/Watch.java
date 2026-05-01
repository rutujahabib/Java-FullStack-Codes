public class Watch {
    String brand;
    String color;
    int price;
    String type;
    boolean isWaterResistant;
    boolean isSmartWatch;
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);

    }
    public void showWaterproof(){
        System.out.println("Is the watch waterproof? " + isWaterResistant);
    }
    public void showSmartWatch(){
        System.out.println("Is the watch a smartwatch? " + isSmartWatch);
    }
    public static void main(String[] args) {
        Watch myWatch = new Watch();
        myWatch.brand = "Rolex";
        myWatch.color = "Silver";
        myWatch.price = 5000;
        myWatch.type = "Analog";
        myWatch.isWaterResistant = true;
        myWatch.isSmartWatch = false;

        myWatch.displayDetails();
        myWatch.showWaterproof();
        myWatch.showSmartWatch();

        System.out.println("*************************");

        Watch anotherWatch = new Watch();
        anotherWatch.brand = "Apple";
        anotherWatch.color = "Space Gray";
        anotherWatch.price = 399;
        anotherWatch.type = "Smartwatch";
        anotherWatch.isWaterResistant = true;
        anotherWatch.isSmartWatch = true;
        anotherWatch.displayDetails();
        anotherWatch.showWaterproof();
        anotherWatch.showSmartWatch();

    }
}


// Brand: Rolex
// Color: Silver
// Price: 5000
// Type: Analog
// Is the watch waterproof? true
// Is the watch a smartwatch? false