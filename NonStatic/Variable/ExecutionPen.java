import NonStatic.Initializer.Pen;

public class ExecutionPen {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.name = "Cello";
        p.color = "Blue";
        p.type = "Ball Point";
        p.price = 10;
        p.refill = true;
        System.out.println("Pen Name: " + p.name);
        System.out.println("Pen Color: " + p.color);
        System.out.println("Pen Type: " + p.type);
        System.out.println("Pen Price: " + p.price);
        System.out.println("Pen Refill: " + p.refill);
        
    }
}

// Pen Name: Cello
// Pen Color: Blue
// Pen Type: Ball Point
// Pen Price: 10
// Pen Refill: true

