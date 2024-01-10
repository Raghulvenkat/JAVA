package JAVA;

public class AmigoscodeLoops {
    /**
     * @param args
     */
    public static void main(String[] args){
        // incremental decremental operator
        int number = 0;
        int num = 0;
        int nums = 0;
        int numss = 0;
        number++;// number + 1
        num--;//  number - 1
        System.out.println(++nums);
        System.out.println(--numss);
        System.out.println(number);
        System.out.println(num);

        // for loops(enchanced for loop -> for easier working)
        int [] numbers = {2 , 4 , 5 , 3 , 78 , 9};
        String [] name = {"Raghul" , "Venkat" , "Venki" , "Raghs"};
        for(int numberInArray : numbers){// each elements in a array was assigned to numberInArray
            System.out.println("The elements are : " + numberInArray);// in this loop we dont access the index, we access the element
        }
        for ( int i = 0; i < numbers.length; i++){
            System.out.println("The elements are : " + numbers[i]);
        }
        
        for (String names : name){
            System.out.println("The name is : " + names);
        }

        // break and continue
        for (String name2 : name) {
            if (name2.equals("Venki")){
                break;
            }
            System.out.println(name2);
        }
        for (String name2 : name) {
            if (name2.startsWith("V")){
                continue;// if name start with 'V' it will not print, instead continue the loop
            }
            System.out.println(name2);
        }

        // while loop -> based on boolean expression
        int count = 0;
        while(count <=5){// runs only when boolean expression is true
            System.out.println("HI");
            count++;
        }

        // do while loop
        int counts = 0;
        do {// execute the code once no matter what 
            System.out.println(counts);
            counts++; 
        }
        while (counts <= 5);
    }
}
