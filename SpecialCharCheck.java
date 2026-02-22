//conditional formatting method
// import java.util.Scanner;
// public class SpecialCharCheck{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter a charcter to check: ");
//         char ch = sc.next().charAt(0);

//         String op =
//         ((ch >=0 && ch<=47) || (ch >=58 && ch<=64)|| (ch >=91 && ch<=96) ||(ch >= 123 && ch <= 126))?
//         (ch+ " is a special character."):
//         (ch+ " is not a specail character.");
//         System.out.println(op);
//     }
// }

//If - Else loop
// import java.util.Scanner;
// public class SpecialCharCheck{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter a charcter to check: ");
//         char ch = sc.next().charAt(0);
//         if((ch >=0 && ch<=47) || (ch >=58 && ch<=64)|| (ch >=91 && ch<=96) ||(ch >= 123 && ch <= 126)){
//             System.out.println(ch+ " is a special Character.");
//         }else{
//             System.out.println(ch+ " is not a special Character.");
//         }
//     }
// }

//use Java’s built-in method Character.isLetter()
import java.util.Scanner;
public class SpecialCharCheck{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a charcter to check: ");
        char ch = sc.next().charAt(0);

        if(Character.isDigit(ch)){
            System.out.println(ch+ " is a digit.");
        }else if(Character.isLetter(ch)){
            System.out.println(ch+ " is Character.");
        }else{
            System.out.println(ch+" is a Special Character.");
        }
    }
}
