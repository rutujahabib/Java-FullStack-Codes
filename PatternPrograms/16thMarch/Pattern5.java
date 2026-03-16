//Paired Character–Number Pattern or Alphanumeric Pair Pattern
class Pattern5{
    public static void main(String[] args){
        int n = 4;
        char ch = 'a';
        int num = 1 ;
        for(int i = 1; i <= n; i++){
            for(int j=1; j <=n; j++){
                System.out.print((ch++)+""+(num++)+" ");
            }
        System.out.println();
        }
    }
}

// a1 b2 c3 d4 
// e5 f6 g7 h8
// i9 j10 k11 l12
// m13 n14 o15 p16


