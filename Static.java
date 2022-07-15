public class Static {

        static int no1 = 111;
        static int no2 = 222;
    
        int num1 = 50;
        int num2 = 100;
    
       
        static void staticMethod1()
         { 
            Static obj = new Static();
            System.out.println("Instance variables: " + obj.num1 + ", " + obj.num2);
        }
        void instanceMethod1() 
        {
           
            System.out.println("Static variables: " + no1+ ", " + no2);
        }
        static void staticMethod2()
         {
            Static obj = new Static();
            obj.instanceMethod1();
        }
        void instanceMethod2() 
        {
            staticMethod1();
        } 
        public static void main(String[] args) 
        {
            Static stc = new Static();

            System.out.println("Static variables: " + no1 + ", " + no2);
            System.out.println("Instance variables: " + stc.num1 + ", " + stc.num2);
    
           
            staticMethod1();
            staticMethod2();
            stc.instanceMethod1();
            stc.instanceMethod2();
        }
    }