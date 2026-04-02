class SortedNum{
    public static void main(String[] args){
        int ans = 0;
        for(int i=0; i<=9; i++){
            int num=121463;
            for(int j=num; j!=0; j/=10){
                if(j%10==i){
                    ans=ans*10+j%10;
                }
            }
        }
        System.out.println(ans);
    }
}