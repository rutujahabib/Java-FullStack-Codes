package NonStatic.Initializer;
//Single line initializer cannot be reinitialized, inside the class block
public class Pen {
    String name;
    String color;
    double price;
    String entity = "Pen";
    public void displayDetails() {
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.price);
        System.out.println(this.entity);
    }
    public static void main(String[] args) {
        Pen myPen = new Pen();
        myPen.name = "Parker";
        myPen.color = "Blue";
        myPen.price = 15.99;
        myPen.displayDetails();
        Pen pen2 = new Pen();
        pen2.displayDetails();
    }
}

// Parker
// Blue
// 15.99
// Pen
// null
// null
// 0.0
// Pen