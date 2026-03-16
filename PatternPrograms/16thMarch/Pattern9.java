//Column-wise Number Triangle (or Column Major Triangle Pattern).
class Pattern9{
    public static void main(String[] args){
        int n=4;
        for(int i=1; i<=n; i++){
            int diff= n-1;
            int temp= i;
            for(int j= 1 ; j<=i ; j++){
                System.out.print((temp)+" ");
                temp+=diff;
                diff--;
            }
        System.out.println();    
        }
    }        
}

// 1 
// 2 5
// 3 6 8
// 4 7 9 10