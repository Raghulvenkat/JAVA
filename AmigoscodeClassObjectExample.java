package JAVA;

import java.time.LocalDate;

public class AmigoscodeClassObjectExample {
    public static void main(String[] args){
        //Class object example -> passport example
        Passport pass1 = new Passport("2343","India",LocalDate.of(2025,1,15));
        Passport pass2 = new Passport("423","Usa",LocalDate.of(2024,1,10));
        System.out.println(pass2.expiryDate);
    }
    
    static class Passport{
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number,String country, LocalDate expiryDate){
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
}
