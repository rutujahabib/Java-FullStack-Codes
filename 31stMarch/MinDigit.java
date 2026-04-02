class MinDigit{ 
    public static void main(String[] args){
        int min = 9;
        int  num =121;
        while(num!=0){
            if(num%10<min){
                min=num%10;
            }
            num/=10;
        }
        System.out.print(min);
        }
   
}