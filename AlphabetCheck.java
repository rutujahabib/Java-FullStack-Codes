// conditional formatting method
// import java.util.Scanner;
// public class AlphabetCheck{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter a charcter to check: ");
//         char ch = sc.next().charAt(0);

//         String op =
//         ((ch >='A' && ch<='Z') || (ch >='a' && ch<='z'))?
//         (ch+ " is a character."):
//         (ch+ " is not a character.");
//         System.out.println(op);
//     }
// }

//If - Else loop
// import java.util.Scanner;
// public class AlphabetCheck{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter a charcter to check: ");
//         char ch = sc.next().charAt(0);

//         if((ch >='A' && ch<='Z') || (ch >='a' && ch<='z')){
//             System.out.println(ch+ " is a character.");
//         }else{
//             System.out.println(ch+ " is not a character.");
//         }
//     }
// }

//use Java’s built-in method Character.isLetter()
import java.util.Scanner;
public class AlphabetCheck{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a charcter to check: ");
        char ch = sc.next().charAt(0);

        if(Character.isLetter(ch)){
            System.out.println(ch+ " is a character.");
        }else{
            System.out.println(ch+ " is not a character.");
        }
    }
}
