//If-else loop
import java.util.Scanner;
class LeapYear{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a year to check: ");
        int year = sc.nextInt();

        if((year%4==0 && year%100 != 0) || (year%400==0)){
            System.out.println("It is Leap Year.");
        }else{
            System.out.println("It is not a Leap Year.");
        }
    }
}

//conditional statement
import java.util.Scanner;
class LeapYear{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a year to check: ");
        int year = sc.nextInt();

        String result=
        ((year%4==0 && year%100 != 0) || (year%400==0))?
        ("It is Leap Year."):
        ("It is not a Leap Year.");
        System.out.println(result);
    }
}