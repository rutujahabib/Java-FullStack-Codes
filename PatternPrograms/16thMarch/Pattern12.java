//Mirror Column Number Pattern or Zig-Zag Column Pattern.
class Pattern12{
    public static void main(String[] args){
        int n=4, evenDiff=2*n-1, oddDiff=1;
        for(int i=1; i<=n; i++){
            int temp = i;

            for(int j= 1; j<=n ; j++){

                if(j%2 !=0){
                    System.out.print(temp+" ");
                    temp+=evenDiff;
                }else{
                    System.out.print(temp+" ");
                    temp+=oddDiff;
                }
            }
        System.out.println(); 
        evenDiff -= 2;
        oddDiff +=2;   
        }
    }        
}


// 1 8 9 16 
// 2 7 10 15
// 3 6 11 14
// 4 5 12 13