class RecPrime1{
    public static void main(String[] args){
        System.out.println(isPrime(55,2));
    }
    public static boolean isPrime(int num, int den){
        return den<num?(num%den==0?false:isPrime(num,den+1)):true;
    }
}

//1 Line approach