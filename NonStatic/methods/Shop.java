

public class Shop {
    String name;
    String type;
    int employeeCount;
    boolean homeDelivery;
    boolean onlinePayment;
    public void display(){
        System.out.println("Shop name: "+ name);
        System.out.println("Type: "+ type);
        System.out.println("Employees: "+ employeeCount);
    }    
    public void showHomeDelivery(){
        System.out.println("Home Delivery: "+ homeDelivery);
    }
    public void showOnlinePayment(){
        System.out.println("Online payment: "+ onlinePayment);
    }
    public static void main(String[] args){
        Shop shop1= new Shop();
        shop1.name = "Reliance Mart";
        shop1.type="Grocery";
        shop1.employeeCount = 12;
        shop1.homeDelivery= true;
        shop1.onlinePayment= true;
        shop1.display();

        shop1.showHomeDelivery();
        shop1.showOnlinePayment();

    }
}


// Shop name: Reliance Mart
// Type: Grocery
// Employees12
// Home Delivery: true
// Online payment: true