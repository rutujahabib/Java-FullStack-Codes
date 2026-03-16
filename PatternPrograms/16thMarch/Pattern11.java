//Palindromic Number Pyramid (or Number Palindrome Pyramid).
class Pattern11{
    public static void main(String[] args){
        int n=5;
        for(int i=0; i<n; i++){
            int num = 1;
            for(int j= 0; j<n+i ; j++){
                if(j<n-i-1){
                    System.out.print(" "+ " ");
                }else{
                    if(j<n){
                        System.out.print(num+ " ");
                        num++;
                    }else{
                        if(j==n){
                            num-=2;
                        }
                        System.out.print(num+ " ");
                        num--;
                    }
                }
            }
        System.out.println();    
        }
    }        
}


//         1 
//       1 2 1
//     1 2 3 2 1
//   1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1