class RotateNumber {
     public static void main(String[] args) {
        int num = 12345;
        int k = 2;

        int result = rotate(num, k);
        System.out.println("Result after rotation: " + result);
    }
    public static int rotate(int num, int k) {
        for (int i = 1; i <= k; i++) {
            int lastDigit = num % 10;
            int remainingNum = num / 10;

            int temp = remainingNum;
            int multiplier = 1;

            while (temp > 0) {
                multiplier *= 10;
                temp /= 10;
            }

            num = lastDigit * multiplier + remainingNum;
        }
        return num;
    }

   
}