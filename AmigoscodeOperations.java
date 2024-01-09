package JAVA;

public class AmigoscodeOperations {
    public static void main(String[] agrs){
        //some arithmetic operations
        int ten = 10;
        int two = 2;
        int add = ten + two;
        System.out.println(add);
        int addition = 2 + 10;
        System.out.println(addition);
        System.out.println(10 + 2);
        System.out.println(10 - 2);
        System.out.println(10 * 2);
        System.out.println(10 / 2);
        System.out.println(10 % 3);

        //There is a class called math and comes from java.lang module
        System.out.println(Math.abs(-10));//changes to positive number
        System.out.println(Math.abs(10));//changes to positive number
        System.out.println(Math.max(7,10));
        System.out.println(Math.min(5,7));
        System.out.println(Math.pow(5.0,2));//5^2 it is the power fuction
        System.out.println((int)Math.pow(5,2));// this will give a whole number
        System.out.println(Math.sqrt(25));
        System.out.println((int)Math.sqrt(25));// introducing 'int' is casting the result to integer
        System.out.println(Math.PI);//It will give pie

        //Comparison operators
        int RaghulAge = 20;
        int VenkatAge = 19;
        boolean isRaghulOlderThanVenkat = RaghulAge > VenkatAge;
        System.out.println(isRaghulOlderThanVenkat);
        //returns value in boolean
        System.out.println(RaghulAge < VenkatAge);
        System.out.println(RaghulAge <= VenkatAge);
        System.out.println(RaghulAge > VenkatAge);
        System.out.println(RaghulAge >= VenkatAge);
        System.out.println(RaghulAge == VenkatAge);
        System.out.println(RaghulAge != VenkatAge);

        //Logical operators
        boolean isAdult = false;
        boolean isStudent = true;
        boolean isMember = true;
        System.out.println(isAdult && isStudent);// both should be true
        System.out.println(isAdult || isStudent);// any one should be true
        System.out.println((isAdult || isStudent) && isMember);// check both condition
        System.out.println(!isAdult);// flips the condition (i.e) like NOT operator
        System.out.println(isAdult || !isStudent);
        System.out.println(isAdult == false);// it returns true
        System.out.println(isAdult == true);
        String name = "Raghul";
        System.out.println(10 > 8 || 2 <= 2 && isAdult && name.contains("ghu"));// we can able to combine many booleans
        }
}
