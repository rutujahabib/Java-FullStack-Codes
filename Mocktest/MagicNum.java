class MagicNum{
    public static void main(String[] args){
        System.out.println(isMagic(3534));
    }
    public static boolean isMagic(int num){
        int sum= SumofDigit(num);
        while(sum!=1 && sum!=4){
            sum= SumofDigit(sum);
        }
        return sum == 1;
    }
    public static int SumofDigit(int num){
        int sum = 0;
        while(num!=0){
            int last= num%10;
            sum=sum+last*last;
            num/=10;
        }
        return sum;
    }
}