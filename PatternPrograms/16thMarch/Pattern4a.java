//Alternating Character–Number Pattern (Column-wise Alternating).
class Pattern4a{
    public static void main(String[] args){
        int n = 5;
        char ch = 'a';
        int num = 1 ;
        for(int i = 1; i <= n; i++){
            for(int j=1; j <=n; j++){
                if(j%2 == 0){
                    System.out.print((num++)+ " ");
                }else{
                    System.out.print((ch++)+ " ");
                }
            }
        System.out.println();
        }
    }
}

// a 1 b 2 c 
// d 3 e 4 f
// g 5 h 6 i
// j 7 k 8 l
// m 9 n 10 o