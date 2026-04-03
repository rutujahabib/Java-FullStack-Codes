class ArmStrong{
    public static void main(String[] args){
        System.out.println(isArmStrong(153));
    }
    //armstrong conditon---> 153--->1*3+5*3+3*3=
    public static boolean isArmStrong(int num){
        int sum=0;
        int ct=count(num);
        for(int i=num; i!=0; i/=10){              ///------>i=153, 
            int last=i%10; //153%10-->3
            sum=sum+power(last,ct); //-->0+pow(3,3)--->27+125+1==>153
        }
        return num==sum;      //153=153-->true
    }
    //count logic
    public static int count(int num){
        int ct=0;
        while(num>0){
            ct++;
            num/=10;
        }
        return ct;
    }

    //power logic----> loop runs until raise times
    public static int power(int base, int raise){
        int pow=1;
        while(raise>0){
            pow*=base;
            raise--;
        }
        return pow;
    }
}