class Bitwise1{
    public static void main(String[] args){
        //and
        System.out.println(10&7); //2
        System.out.println(3&5&7); //1

        //or
        System.out.println(10|7); //15
        System.out.println(5|7); //7
        System.out.println(3|5|7); //7

        //complement
        System.out.println(~10); //-11
        System.out.println(~-10); //9
        
        //XOR 
        System.out.println(10^7); //13
    }
}
