import java.util.Scanner;

class TechNumRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        
        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        boolean found = false; // to track if any tech number exists

        for (int num = start; num <= end; num++) {
            int ct = 0;
            for (int i = num; i != 0; i /= 10) {
                ct++;
            }

            if (ct % 2 == 0) {
                int pow = 1;
                for (int i = 0; i < ct / 2; i++) {
                    pow *= 10;
                }

                int lastHalf = num % pow;
                int firstHalf = num / pow;
                int total = firstHalf + lastHalf;

                if (total * total == num) {
                    System.out.println(num + " is a tech number.");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No tech numbers found in the given range.");
        }
    }
}