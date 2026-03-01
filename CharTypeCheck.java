import java.util.Scanner;
class CharTypeCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character to check: ");
        char ch= sc.next().charAt(0);

        String result =
        ((ch>'A' && ch<='Z'))?
        (ch+" is a UpperCase Alphabet."):
        (ch>'a' && ch<='z')?(ch+" is a LowerCase Alphabet."):
        (ch>='0' && ch<='9')?(ch+ " is a Digit."):
        (ch+ " is a special Character.");

        System.out.println(result);
    }
}