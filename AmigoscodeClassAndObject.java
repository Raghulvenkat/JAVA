package JAVA;

public class AmigoscodeClassAndObject {
    public static void main(String [] args){
        //classes and objects
        lens lens1 = new lens("Sony","85mm",true);// just fill the argument,it takes accordingly
        lens lens2 = new lens("sony","30mm",true);
        lens lens3 = new lens("sony","24-70mm",true);
        System.out.println("Lens1 : "+ lens1.brand+'\t'+ lens1.focalLenght+'\t'+lens1.isPrime);
        System.out.println("Lens2 : "+ lens2.brand+'\t'+ lens2.focalLenght+'\t'+lens2.isPrime);
        System.out.println("Lens3 : "+ lens3.brand+'\t'+ lens3.focalLenght+'\t'+lens3.isPrime);
    } 

    static class lens{
        String brand;
        String focalLenght;
        boolean isPrime;

        lens(String brand, String FocalLenght, Boolean isPrime){// this is a constructor
            this.brand = brand;// 'this' refers to current instance of the class -> in python we use 'self'
            this.focalLenght = FocalLenght;
            this.isPrime = isPrime;
        }
    }
    
}
