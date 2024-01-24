package JAVA;

public class OOPS_01 {
    public static void main(String[] args){
        student raghul = new student(34, "raghul", 55.3f);
        student venki_mama = new student(34,"Venki mama", 78.90f);
        System.out.println(venki_mama);
        System.out.println(raghul);
        System.out.println(raghul.mark);
        raghul.greeting();
        raghul.change_name();
        student random = new student(raghul);
        System.out.println(random.mark);//it print the same value of the object named 'raghul'
        student venkat = new student();
        System.out.println(venkat.mark);// it print as 0, because diff argument passed
        student something = raghul;// by this we can assign new obj to existing obj
        System.out.println(something.name);//it print the name of the object 'raghul'
    }

    //create a class
    static class student{
        int rno;
        String name;
        float mark;

        void greeting(){
            System.out.println("My name is "+this.name);
        }

        void change_name(){
            System.out.println("Venki");
        }

        student(student other){//this type is called constructor overloading,where passing diff argument we use diff functions
            this.name = other.name;
            this.rno = other.rno;
            this.mark = other.mark;
        }

        student(){
            System.out.println("Nothing");
        }

        student(int rno , String name,float mark){//class name and constructor name should want to match
            this.rno = rno;
            this.name = name;// if we use name = name, it wont get the value, inthat case we should use this.name
            this.mark = mark;
            System.out.println(rno + name + mark);
        }
    }
}
