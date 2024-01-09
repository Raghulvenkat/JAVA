package JAVA;

public class AmingoscodeStringsExample {
    public static void main(String[] args){
        //string examples
        char letter = 'A';
        String name = new String("Raghul");
        //Here String is a class and name is a object and lowercase is an attribute
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(1));// this method takes integer and giv the character based on index position
        System.out.println(name.contains("ghu"));// this check for the string present in the name
        String code = new String("code");
        System.out.println(name.contains(code));
    }
}
