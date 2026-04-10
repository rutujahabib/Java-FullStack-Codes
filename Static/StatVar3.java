class StatVar3{
    static String name;
    public static void main(String[] args){
        System.out.println(name);  //null
        name="Qspiders";
        System.out.println(name);  //Qspiders
        test();
        System.out.println(name);  //Jspiders
    }
    public static void test(){
        System.out.println(name); //Qspiders
        name="Jspiders";
        System.out.println(name);  //Jspiders
    }
}