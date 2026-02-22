////conditional formatting method
// import java.util.Scanner;
// public class DigitCheck{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a digit to check: ");
//         char ch = sc.next().charAt(0);
//         String op =
//         (ch>='0' && ch<='9')?
//         (ch+ " is a digit."):
//         (ch+ " is not a digit.");
//         System.out.println(op);
//     }
// }


// If - Else loop
// import java.util.Scanner;
// public class DigitCheck{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter a charcter to check: ");
//         char ch = sc.next().charAt(0);

//         if(ch >='0' && ch<='9'){
//             System.out.println(ch+ " is a digit.");
//         }else{
//             System.out.println(ch+ " is not a digit.");
//         }
//     }
// }

//use Java’s built-in method Character.isLetter()
import java.util.Scanner;
public class DigitCheck{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a charcter to check: ");
        char ch = sc.next().charAt(0);

        if(Character.isDigit(ch)){
            System.out.println(ch+ " is a digit.");
        }else{
            System.out.println(ch+ " is not a digit.");
        }
    }
}
