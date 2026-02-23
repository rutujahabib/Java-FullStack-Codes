//conditional formatting
// import java.util.Scanner;
// class UpperLowerCaseCheck{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a character to check : ");
//         char ch = sc.next().charAt(0);
        
//         String op =
//         (ch>='A' && ch<='Z')?   //65-90
//         (ch+ " is uppercase character"):
//         (ch>='a' && ch<='z')?     //97-122
//         (ch+ " is lowercase character"):
//         (ch+ " is not a alphabet");
//         System.out.println(op);
//     }
// }

//if-else loop
import java.util.Scanner;
class UpperLowerCaseCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character to check : ");
        char ch = sc.next().charAt(0);
        
        if(ch>='A' && ch<='Z'){
            System.out.println(ch+ " is uppercase character.");
        }else if(ch>='a' && ch<='z'){
            System.out.println(ch+ " is lowercase character.");
        }else{
            System.out.println(ch+ " is not a alphabet");
        }
    }
}