package JAVA;

import java.time.LocalDate;

public class Amingoscode_PrimitiveReferenceDatatype_concept {
    /* variable to be decided based on datatypes
     (1) primitive data type  (2) reference type
     */
    public static void main(String[] args){
        // lets see about primitive data type
        byte the_byte = -128; // stores value from -128 to 127
        short the_short = 8989; //stores from -32768 to 32767
        int the_int = 585585858; //-2147483648 to 2147483647
        //long the_long = 7788775805; // -9223372036854775808 to 9223372036854775807

        float pie = 3.14F;// store decimal value but need to specify 'f' or 'F'. sufficient to store upto 6 to 7 decimal digit
        double double_pie = 3.1415;//store decimal value upto 15 decimal digits

        boolean isadult = true; //only take true or false

        char single_letter = 'A'; // char should be taken into single quotes
            
        
        /* reference data types used to store complex data types.
         reference types always start with capital letter. eg String,Date
         reference type variables can access attributes and behaviours whereas primitive data variables can't
         for example if we want to find out current date, we can proceed as following
         whenever we use 'new' it refers to reference type where we store more complex then primitivies
        */
        String name = "Sample String";
        //Date dates = new Date();
        // some non-primitive or reference data types
        String names = new String("Raghul");
        System.out.println(names);
        System.out.println(name);
        System.out.println(names.toUpperCase());// some attributes can be used

        // to know the current date
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getMonth());
        System.out.println("name: "+ name + names);//concatination symbols can be used to print more results
    }
}
