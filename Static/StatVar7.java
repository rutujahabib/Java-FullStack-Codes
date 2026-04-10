class StatVar7{
    static double balance;
    public static void main(String[] args){
        printBalance();
        deposit(10000);
        withDraw(1000);
    }
    public static void printBalance(){
        System.out.println("Balance: "+ balance);
    }
    public static void withDraw(double amt){
        if(amt > 0 && balance-amt >2000){
            balance -=amt;
            System.out.println("Amout Debited!");
            System.out.println("Your current balance is "+balance);
        }else{
            System.out.println(amt>0?"Insufficient Balance":"Invalid Amount");
        }
    }
    public static void deposit(double amt){
        if(amt >0){
            balance+= amt;
            System.out.println("Amount deposited!");
            System.out.println("Your balance is: "+balance);
        }else{
            System.out.println("Invalid Amount");
        }
    }
}