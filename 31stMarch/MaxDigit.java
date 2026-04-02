class MaxDigit{
    public static void main(String[] args){
        //intial vale max=0;
        int num = 192145;
        int max=0;
        //loop
        while(num!=0){
            if(num%10>max){  //5>0----->4>5(false)--->9>5
                max=num%10;  //max=5 ------> max=9
            }
            num/=10; //19214 
        }
        System.out.println(max);
    }
}
