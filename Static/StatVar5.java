class StatVar5{
    static String name;
    public static void main(String[] args){
        System.out.println(name);       //null
        String name="Abc";
        System.out.println(name);  //Abc
        System.out.println(StatVar5.name);      //null
        StatVar5.name ="Qspiders";
        System.out.println(StatVar5.name);   //Qspiders
        demo();
    }
    public static void demo(){
        System.out.println(name);           //Qspiders  
        System.out.println(StatVar5.name);  //Qspiders
    }
}