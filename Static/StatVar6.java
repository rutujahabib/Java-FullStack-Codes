class StatVar6{
    public static void main(String[] args){
        System.out.println(StatVar5.name);  //it brings intial value of name form class StatVar5 so its null as its not initialised
        StatVar5.main(null);
        System.out.println("-----------------");
        System.out.println(StatVar5.name);
    }
}