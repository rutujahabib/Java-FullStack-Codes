class RecArmstrong {
    public static void main(String[] args) {
        System.out.println(isArmStrong(153));
    }

    public static boolean isArmStrong(int num) {
        int digits = count(num, 0);
        return sumOfDigit(num, digits, 0) == num;
    }

    public static int sumOfDigit(int num, int digits, int sum) {
        return num == 0 
            ? sum 
            : sumOfDigit(num / 10, digits, sum + power(num % 10, digits));
    }

    public static int power(int base, int raise) {
        return raise == 0 ? 1 : base * power(base, raise - 1);
    }

    public static int count(int num, int ct) {
        return num == 0 ? ct : count(num / 10, ct + 1);
    }
}