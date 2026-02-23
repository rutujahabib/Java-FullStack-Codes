//conditional formatting
import java.util.Scanner;
class VowelconsonantCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String op =
        ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))?
        ((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')?(ch+ " is a vowel"):(ch+ " is a consotant.")):
        (ch+ " is not a alpahabet");
        System.out.println(op);
    }
}

//or

import java.util.Scanner;
class VowelconsonantCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        String op =
        (ch >= 'a' && ch <= 'z') ?
            (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ?
                ch + " is a vowel" :
                ch + " is a consonant")
            : ch + " is not an alphabet";

        System.out.println(op);
    }
}

//if else loop
// import java.util.Scanner;
// class VowelconsonantCheck{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a character: ");
//         char ch = sc.next().charAt(0);
//         if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
//             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
//                 System.out.println(ch+" is a vowel.");
//             }else{
//                 System.out.println(ch+ " is a consotant.");
//             }
//         }else{
//             System.out.println(ch+ " is not a alpahabet");
//         }
//     }
// }
