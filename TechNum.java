import java.util.Scanner;
class TechNum{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int num = sc.nextInt();

        int ct = 0;
        for(int i=num ; i!=0; i/=10){
            ct++;
        }
        if(ct%2==0){
            int pow = 1;
            for(int i = 0; i<ct/2;i++){
                pow*=10;
            }

            int lastHalf= num%pow ;
            int firstHalf = num/pow ;
            int total =firstHalf + lastHalf;
            if((total*total) == num){
                System.out.println("It is a tech number.");
            }else{
                System.out.println("It is not a tech number.");
            }
        }else{
            System.out.println("It is not a tech number.");
        }
    }
}