package JAVA;

public class AmigoscodeConditionalStatements_6 {
    public static void main(String[] args){
        // if statement
        int age = 15;
        if (age >= 18){
            System.out.println("Adult");
        }
        else if(age == 0){
            System.out.println("Enter valid age");
        }
        else{
            System.out.println("Not an adult");
        }

        //ternary operator -> other way of using if statement
        String message = age >= 18 ? "I'm an adult" : "Not an adult";// '?' refers to checking operator
        System.out.println(message);

        //switch statements
        String gender = "FEMALE";
        /*
        // this is the usual way
        if (grnder.contains("FEMALE")){
            System.out.println("Female");
        }
        else if (gender.equals("Male")){
            System.out.println("Male");
        }else{
            System.out.println("Prefer not to say");
        }
        //By using switch condition we can see as
        */
        switch (gender){
            case "FEMALE":
                System.out.println("female");
                break;
            case "MALE":
                System.out.println("male");
                break;
            case "PREFER NOT TO SAY":
                System.out.println("prefer not to say");
                break;
            default:// there is no need to give default branch
                System.out.println("unknown gender");
        }
    }
}
