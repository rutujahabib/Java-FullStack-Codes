class RecPattern{
    public static void main(String[] args){
        square(0,0,4);
    }
    public static void square(int i, int j, int n){
        if(i<n){
            if(j<n){
                System.out.print("*"+" ");
                square(i,j+1,n);
            }else if(j==n){
                System.out.println();
                square(i+1,0,n);
            }
        }else{
            return ;
        }
    }
}




// * * * * 
// * * * *
// * * * *
// * * * *