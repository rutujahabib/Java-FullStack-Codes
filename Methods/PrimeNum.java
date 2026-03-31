class PrimeNum{
    public static void main(String[] args){
        isPrime(7);
    }
    public static void isPrime(int num){
        int den = 2;
        while(den < num){
            if(num % den == 0){
              break;
            }
            den++ ;
        }
        if(den == num){
            System.out.print("It is a Prime Number.");
        }else{
            System.out.print("It is not a Prime Number.");
        }
    }
}