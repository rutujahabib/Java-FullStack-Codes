//Column-wise Number Pattern or Column Major Order Pattern
class Pattern8{
    public static void main(String[] args){
        int n=4;
        for(int i=1; i<=n; i++){
            int temp= i;
            for(int j= 1 ; j<=n ; j++){
                System.out.print((temp)+" ");
                temp+=n;
            }
        System.out.println();    
        }
    }        
}

// 1 5 9 13 
// 2 6 10 14
// 3 7 11 15
// 4 8 12 16


