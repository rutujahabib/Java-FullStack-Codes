class StatVar1{
    static String a="abc";
    public static void main(String[] args){
        System.out.println("Inside main");
        demo();
        System.out.println(a);
        System.out.println("End of main()");
    }
    public static void demo(){
        System.out.println("Inside Demo");
        System.out.println(a);
        System.out.println("End of demo");
    }

}