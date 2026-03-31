import java.util.Scanner;

class DualBasePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        System.out.println("Dual Base Palindromes up to " + n + ":");
        for (int i = 1; i <= n; i++) {
            // Check if it's a palindrome in Base 10 AND Base 2
            if (isBase10Palindrome(i) && isBase2Palindrome(i)) {
                System.out.println(i);
            }
        }
    }

    // This uses your original logic from the images
    public static boolean isBase10Palindrome(int num) {
        int temp = num;
        int rev = 0;
        
        while (temp != 0) {
            int last = temp % 10;
            rev = rev * 10 + last;
            temp /= 10;
        }
        
        return num == rev;
    }

    // This applies your same reversal logic, but for Base 2
    public static boolean isBase2Palindrome(int num) {
        int temp = num;
        int rev = 0;

        // Constraint: No built-in conversion or arrays
        // We use the same 'mod and divide' logic, but with 2 instead of 10
        while (temp > 0) {
            int last = temp % 2;  // Get the last binary digit
            rev = rev * 2 + last; // Shift and add
            temp /= 2;            // Move to the next binary digit
        }

        return num == rev;
    }
}