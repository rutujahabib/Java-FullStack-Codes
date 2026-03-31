class M4{
    public static void main(String[] args){
        factorial(10);
        factorial(7);
        addition('a', 'b');  //97, 98
    }

    public static void factorial(int num){
        int fact = 1;
        while(num > 1){
            fact *= num ;
            num--;
        }
        System.out.println(fact);   
    }
    
    public static void addition(int n1, int n2){
        System.out.println(n1+n2);
    }
}

// 3628800
// 5040
// 195