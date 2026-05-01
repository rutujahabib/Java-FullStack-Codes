public class B {
    {
        System.out.println("Welcome!");
    } 
    B(){
        System.out.println("This is a constructor.");
    }
    public static void main(String[] args) {
        B ref = new B();
    }
}

// Welcome!
// This is a constructor.