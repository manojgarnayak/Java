package OOPS;

//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // int[] rno = new int[5];
        // String[] names = new String[5];
        // float[] marks = new float[5];

        //Student[] students = new Student[5];
        //System.out.println(Arrays.toString(students));

        Student manoj = new Student(31,"Garnayak",78.9f);

        // manoj.rno = 21;
        // manoj.name = "Bhalu";
        // manoj.marks = 83.3f;

        System.out.println(manoj.name);
        System.out.println(manoj.rno);
        System.out.println(manoj.marks);
        manoj.greeting();
    }
}


// Creating a class
class Student{
    int rno;
    String name;
    float marks;

    //we need a way to add the values of the above properties object by object

    void greeting(){
        System.out.println("Hello ," + this.name);
    }

    // default constructor
    // Student (){
    //     this.rno = 0;
    //     this.name = "Manoj";
    //     this.marks = 0.0f;
    // }
    
    //parameterised constructor
    Student (int roll, String name, float marks){
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }
    //constructor calling
    Student(){
        this(13,"Bhalu",7.83f);
    }
}