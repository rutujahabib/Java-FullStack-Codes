class RecRotateNum{
    public static void main(String[] args){
        System.out.println(rotate(162));    //---------->216
    }
    public static int rotate(int num){
        return num%10*power(10, count(num/10,0))+num/10;
    }
    public static int count(int num, int ct) {         
        return num == 0 ? ct : count(num / 10, ct + 1);            
    }
    public static int power(int base, int raise) {    
        return raise == 0 ? 1 : base * power(base, raise - 1);       
    }
}