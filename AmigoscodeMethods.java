package JAVA;

import java.util.Arrays;

public class AmigoscodeMethods {
    public static void main(String[] args){//Public static is a method and parameters are string
        //Methods
        System.out.println("HELLO");// some data are passed by this method
        String brand = "SAMSUNG";
        System.out.println(brand.toLowerCase());
        boolean contain = brand.contains("SAM");
        System.out.println(contain);
        boolean end = brand.endsWith("G");
        boolean start = brand.startsWith("S");
        System.out.println(end);
        System.out.println(start);

        //Understanding methods
        char [] letters = {'a','b','a','c','d','d'};
        String[] names = {"Raghul"};
        //Lets create a method that count the  no.of occurances of letter
        int count = CountOccurances(letters, 'a');//by this syntanx we can invoke this method, searchLetter is invoked by pressing '' 
        //int count = CountOccurances(names);//This wont work beacuse the passing argument is char data type
        System.out.println(count);
    }
    public static int CountOccurances(char[] letters, char searchLetter){// this will accept char array and letter
        System.out.println("Method invoked");
        System.out.println(Arrays.toString(letters));//to print an array
        System.out.println(searchLetter);//tis is our search letter
        int counts = 0;
        for (char letter : letters){
            if (letter == searchLetter){
                counts +=1;
            }
        }
        return counts;// return 0 is given because the method in int. If we use double in place of int, we can give return 0.0
    }
}
