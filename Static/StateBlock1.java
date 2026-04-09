class StateBlock1{
        static{
            System.out.println("From static block 1");
        }
        public static void main(String[] args){
            System.out.println("From main()");
        }
        static{
            System.out.println("From static block 2");
        }
        static{
            System.out.println("From static block 3");
        }
}


//From static block 1
// From static block 2
// From static block 3
// From main()
