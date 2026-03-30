class DigitCount{
    public static void main(String[] args){
        frequency(1223);
    }
    public static void frequency(int num){
        for(int i=0; i<=9; i++){
            int ct=0;
            int temp  = num;
            while(temp!=0){
                if(temp%10==i){
                    ct++;
                }
                temp/=10;
            }
            if(ct>0){
                System.out.println(i+"---->"+ct);
            }
        }
    }
}

// 1---->1
// 2---->2
// 3---->1
