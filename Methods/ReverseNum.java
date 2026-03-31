class ReverseNum{
    public static void main(String[] args){
        reverse(372);
    }
    public static void reverse(int num){
        int rev= 0;
        int temp = 0;
        while(num != 0){
            rev = rev*10 + num%10;
            num = num /10;
        }
        System.out.println(rev);  //273
    }
}