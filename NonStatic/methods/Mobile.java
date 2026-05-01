public class Mobile {
    String name;
    double price;
    int storage;
    int slots;    

    public void display(){
    name = "moto 70 fusion";
    price= 3002112;
    storage = 128;
    slots = 2;
    System.out.println("Name: "+ name);
    System.out.println("price: "+price);
    System.out.println("Storage: "+storage);
    System.out.println("slots: "+slots);
    }
    public static void main(String[] args){
        Mobile mob = new Mobile();
        mob.display();
    }
}



// Name: moto 70 fusion
// price: 3002112.0
// Storage: 128
// slots: 2