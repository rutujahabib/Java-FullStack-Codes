//A Strong number is a number where the sum of the factorial of its digits equals the number itself.
//Example: 145 → 1! + 4! + 5! = 1 + 24 + 120 = 145
import java.util.Scanner;
public class StrongNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num to check: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while(num!=0){
            int last= num%10; //lastdigit
            int fact = 1;
            for(int i=1; i<=last; i++){
                fact = fact * i;
            }
        sum =sum + fact;
        num /=10;
        }
        
        System.out.println("The sum of digits factorial is "+sum);
        if(sum== temp){
            System.out.println("It is Strong Number.");
        }else{
            System.out.println("It is not a Strong Number.");
        }
    }
}