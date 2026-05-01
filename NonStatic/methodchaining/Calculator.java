public class Calculator {
    int n1;
    int n2;
    public Calculator add() {
        System.out.println("Sum: " + n1+n2);
        return this;
    }  
    public Calculator subtract() {
        System.out.println("Difference: " + (n1-n2));
        return this;
    }
    public Calculator multiply() {
        System.out.println("Product: " + n1*n2);
        return this;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.n1 = 10;
        calc.n2 = 5;
        calc.add().subtract().multiply();
    }  
}

// Sum: 105
// Difference: 5
// Product: 50
