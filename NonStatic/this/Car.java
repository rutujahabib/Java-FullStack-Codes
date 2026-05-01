public class Car {
    String name;
    double price;
    String color;
    public void displayDetails() {
        System.out.println(this. name);
        System.out.println(this.price);
        System.out.println(this.color);
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.name = "Toyota Camry";
        myCar.price = 24000;
        myCar.color = "Red";
        myCar.displayDetails();
    } 
}

// Toyota Camry
// 24000.0
// Red
