
public class ExecutionBottle {
    public static void main(String[] args) {
        Bottle b = new Bottle();
        b.name = "Nalgene";
        b.capacity = 1000;
        b.isReusable = true;
        b.material = "Plastic";
        System.out.println("Bottle Name: " + b.name);
        System.out.println("Bottle Capacity: " + b.capacity + " ml");
        System.out.println("Is the Bottle Reusable? " + b.isReusable);
        System.out.println("Bottle Material: " + b.material);

        Bottle b2 = new Bottle();
        b2.name = "Coca-Cola";
        b2.capacity = 500;
        b2.isReusable = false;
        b2.material = "Plastic";
        System.out.println("Bottle Name: " + b2.name);
        System.out.println("Bottle Capacity: " + b2.capacity + " ml");
        System.out.println("Is the Bottle Reusable? " + b2.isReusable);
        System.out.println("Bottle Material: " + b2.material);

    }    
}

// Bottle Name: Nalgene
// Bottle Capacity: 1000 ml
// Is the Bottle Reusable? true
// Bottle Material: Plastic


// Bottle Name: Nalgene
// Bottle Capacity: 1000 ml
// Is the Bottle Reusable? true
// Bottle Material: Plastic
// Bottle Name: Coca-Cola
// Bottle Capacity: 500 ml
// Is the Bottle Reusable? false
// Bottle Material: Plastic