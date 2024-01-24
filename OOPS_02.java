package JAVA;

import static JAVA.OOPS_02example.message;// by this we can invoke other program files

public class OOPS_02{//outside classes never be static 
    public static void main(String[] args){
        message();// this funtion is invoked from the OOPS_02 example java code
        OOPS_02 outerClass = new OOPS_02();// by this we can able to class a public class inside a public OOPS_02 class
        human raghul = outerClass.new human(21 ,"raghul", 20000, false);
        human venkat = outerClass.new human(20 ,"venkat", 30000, true);
        System.out.println(raghul.name);
        A obj = outerClass.new A("some name");
        System.out.println(obj);
        System.out.println(raghul.population);
        System.out.println(venkat.population);//both population print as '2' coz two objects are there
        System.out.println(human.population);//rather than calling with object, convention method is by calling with class name
        
        //nonStatic(); ->this cannaotbe able to run because inside a static class we can able to run only static variable
        outerClass.nonStatic();//by this we can invoke this non-static functions because they are object dependent

        /*
         Static variable is a variable that are common for all the objects of class, but not related to object
         static variable is independent of object (i.e) we can use static variable without creating a object
         */

        StaticBlock object1 = outerClass.new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);// to print the variables 'a' and 'b'

        StaticBlock.b = 3;//static block ran once, so for second object the b value is changed
        
        StaticBlock object2 = outerClass.new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        Singleton singleobj1 = new Singleton();// new obj created

        Singleton singleobj2 = new Singleton();// already one obj is created, so it assigns to singleobj1

        Singleton singleobj3 = new Singleton();// already one obj is created, so it assigns to singleobj1

    }

    void nonStatic(){
        System.out.println("this is a non static function");
        staticFun();
    }

    static void staticFun(){
        System.out.println("this is a static function, able to inherit inside a non static function");
    }

    class A{
        String name;

        A(String name){
            this.name = name;
        }
    }

    public class human{
        int age;
        String name;
        float salary;
        boolean married;
        static long population;// this is common to all human, but irrelevant to raghul

        public human(int age, String name, float salary, boolean married){
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.married = married;
            human.population +=1;// this give the no of humans in the human class, This funtion is accessed by human class
        }
    }

    public class StaticBlock{
        //demo to show initialization of static variables
        //will only run once, when the first obj is created (i.e) when the class is loaded for first time
        static int a = 4; static int b;

        static{
            System.out.println("I am inside the static block");
            b = a * 5;
        }
    }

    public static class Singleton{
        //allows you to create only one object in this class
        private Singleton(){

        }
        private static Singleton instance;

        public static Singleton getInstance(){
            //check whether 1 obj is ceated or not
            if (instance == null){
                instance = new Singleton();
            }

            return instance;
        }
    }
}