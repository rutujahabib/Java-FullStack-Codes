class StatVar2{
    static String name;
    public static void main(String[] args){
        System.out.println(name);            //null
        String name ="abc";
        System.out.println(name);           //abc
        demo();
        System.out.println(StatVar2.name);        //xyz
    }
    public static void demo(){
        name="xyz";
        System.out.println(name);              //xyz
    }
}