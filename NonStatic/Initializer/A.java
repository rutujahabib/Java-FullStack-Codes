

public class A {
 int a = 10;
 {
    a=20;
 }   
 public static void main(String[] args) {
    A ref = new A();
    System.out.println(ref.a);
 }
}

//20
