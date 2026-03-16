//Alternating Character–Number Pattern (or Column-wise Increasing Number Pattern).
class Pattern4{
    public static void main(String[] args){
        int n = 5;
        char ch = 'a';
        int num = 1 ;
        for(int i = 1; i <= n; i++){
            for(int j=1; j <=n; j++){
                if(i%2 == 0){
                    System.out.print((num++)+ " ");
                }else{
                    System.out.print((ch++)+ " ");
                }
            }
        System.out.println();
        }
    }
}

// a b c d e 
// 1 2 3 4 5
// f g h i j
// 6 7 8 9 10
// k l m n o


