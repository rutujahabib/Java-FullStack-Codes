import java.util.Scanner;
class PrimeCheck{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number to check: ");
        int num = sc.nextInt();
        String result=
        (num<=1)?(num+" is not Prime"):
        (num == 2 || num == 3 || num==5 || num==7)?("It is Prime"):
        (num%2==0 || num%3==0 || num%5==0 || num%7==0)?("It is not Prime."): ("It is Prime"); 
        System.out.println(result);
    }
}