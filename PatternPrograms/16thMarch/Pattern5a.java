//Alphanumeric Sequential Pattern (number + letter pair increasing row-wise).
class Pattern5a{
    public static void main(String[] args){
        int n = 4;
        char ch = 'a';
        int num = 1 ;
        for(int i = 1; i <= n; i++){
            for(int j=1; j <=n; j++){
                System.out.print((num++)+""+(ch++)+" ");
            }
        System.out.println();
        }
    }
}

// 1a 2b 3c 4d 
// 5e 6f 7g 8h
// 9i 10j 11k 12l
// 13m 14n 15o 16p

