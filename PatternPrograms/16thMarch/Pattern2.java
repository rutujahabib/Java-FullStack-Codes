//printing numbers row wise

class Pattern2 {
    public static void main(String[] args){
        int num= 1;
        int n = 5;
        for(int i = 0; i < n; i++){
            for(int j=0; j<n; j++){
                System.out.print((num++)+"");
            }
        System.out.println();
        }
    }
}

// 1 2 3 4 5 
// 6 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24 25



class Pattern2{
    public static void main(String[] args){
        int n = 5;
        char ch = 'a';
        for(int i = 0; i < n; i++){
            for(int j=0; j <n; j++){
                System.out.print((ch++)+" ");
            }
        System.out.println();
        }
    }
}

// a b c d e 
// f g h i j
// k l m n o
// p q r s t
// u v w x y
