package JAVA;

import java.util.Scanner;
import java.time.LocalDate;

public class AmigoscodeScanner {
    public static void main(String[] args){
        // scanner function simply get the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String username = scanner.nextLine();
        System.out.println("Hello " + username);
        System.out.println("Enter the age : ");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You ae born in "+ year);

        if(age <18){
            System.out.println("You are not an adult");
        }
        else{
            System.out.println("You are adult");
        }
        
    }
}
