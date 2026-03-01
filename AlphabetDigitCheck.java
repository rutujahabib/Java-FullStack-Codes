import java.util.Scanner;
class AlphabetDigitCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character to check: ");
        char ch= sc.next().charAt(0);

        String result =
        ((ch>'A' && ch<='Z') ||(ch>'a' && ch<='z'))?
        (ch+" is a Alphabet."):
        (ch>='0' && ch<='9')?(ch+ " is a Digit."):
        (ch+ " is a special Character.");

        System.out.println(result);
    }
}