class M6{
    public static void main(String[] args){
        boolean ans = isEven(100);
        System.out.println(ans);  //true 
    }
    public static boolean isEven(int num){
        if(num%2==0){
            return true; 
        }else{
            return false;
        }
    }
}