package JAVA;

import java.util.Arrays;

public class AmigoscodeArrays {
    public static void main(String[] args){
        int zero = 0;
        int one = 1;

        // here both value safe at different address, so we use array
        int [] numbers = new int[4];//tells the size of array (does not start from 0) // prints zero
        System.out.println(Arrays.toString(numbers));// syntax to print an array (i.e) kind of list format in python
        System.out.println(numbers);// it print some garbage value if we call directly
        String [] number = new String[4];
        System.out.println(Arrays.toString(number));// prints null

        // we can also do like this
        int [] num = new int[2];
        num [0] = 0;
        num [1] = 1;
        System.out.println(Arrays.toString(num));// if it goes beyond, it through error

        // to create array directly
        int [] arrays = {0 , 1 , 33};
        System.out.println(Arrays.toString(arrays));
        System.out.println(arrays.length);//gives the no of elements present
        String [] names = { "Raghul" , "Venkat"};
        System.out.println(names.length);

        //accesing arrays based on index
        int three = arrays[2];
        System.out.println(three);// can able to call by variable, but need to specify data type. Here it is 'int'
        int lastElement = arrays[arrays.length - 1];// to access the last element, based on index we substract it
        System.out.println(lastElement);
    }
}
