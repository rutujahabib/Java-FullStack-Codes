import java.util.Scanner;

public class KaprekarNumber
{   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (isKaprekar(num))
            System.out.println("It is tech number");
        else
            System.out.println("Not tech number");

        sc.close();
    }
    public static boolean isKaprekar(int num)
    {
        int square = num * num;   // 45 -> 2025

        int ct = 0;
        int temp = square;

        // count digits of square
        while (temp != 0)
        {
            ct++;
            temp /= 10;
        }

        int pow = 1;
        for (int i = 0; i < ct / 2; i++)
        {
            pow *= 10;
        }

        int firstHalf = square / pow;   // 20
        int lastHalf = square % pow;    // 25

        int total = firstHalf + lastHalf; // 45

        return total == num;
    }
}