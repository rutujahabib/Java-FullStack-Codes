import java.util.Scanner;
class AbsoluteValue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int num = sc.nextInt();

        int abs =
        (num<0)?
        (-num):
        (num);
        System.out.println("Absolue value is : "+abs);
    }
}