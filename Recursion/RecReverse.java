class RecReverse{
    public static void main(String[] args){
        System.out.println(reverse(1234,0));   //------->4321
    }
    public static int reverse(int num, int rev){{
        return num==0?rev:reverse(num/10, rev*10+(num%10));
    }}
}