package com.lec37;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // stores 5 rolls number
        int[] numbers = new int[5];

        // stores 5 names
        String[] names = new String[5];

        // data of 5 students: {roll num, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student one = new Student();
        Student two = one;

        one.name = "Shri";
        System.out.println(two.name);
        // two is just pointing to the same object to which one is pointing
        // so any changes made in any of the two variables, will reflect in each other
        // name of one was changed, two's name was also reflected

        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students)); // This will give null

        // Just declaring, still the object is not created
//        Student kunal;
//        kunal = new Student();
//        System.out.println(kunal); - It will say variable might not have been initialized
        Student random2 = new Student();
        System.out.println(random2.name);

        Student yuva = new Student();
        yuva.greeting();
        yuva.changeName("Prak");
        yuva.greeting();

        Student random = new Student(yuva);
        System.out.println(random.name);


        System.out.println(yuva);  // It will give me some random value
        System.out.println(yuva.rno); // It will give 0 by default
//        It will give the by default value of that data type
        System.out.println(yuva.name);
        System.out.println(yuva.marks);

//        yuva.rno = 13;
//        yuva.name = "Yuva";
//        yuva.marks = 99.434f;
// If here any of the property is not initialized and if its given any value by default, that value will be used

        System.out.println(yuva);
        System.out.println(yuva.rno);
        System.out.println(yuva.name);
        System.out.println(yuva.marks);
    }

}
// Create a class - Syntax
class Student{
    int rno;
    String name;
    float marks = 90;

    void greeting(){
        System.out.println("Hello! My name is " + this.name);
    }

    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    void changeName(String newName){
        name = newName;
    }

    // we need a way to add the values of the above properties object by object
//    Student(){
//         // This is a CONSTRUCTOR - special function
//        this.rno = 13;
//        this.name = "Yuva";
//        this.marks = 98;
//    }

    Student(){
        // this is how you can another constructor from constructor
        // internally it is something like : new Student (13, "default", 100.0f);
        this(13, "defualt", 100.0f);
    }

    // Student jack = new Student(7, "Jack", 78.43f);
    // here, "this" will be replaced with jack - This is what happens internally
//    jack.rno = rno you have passed - 7
//    jack.name = name you have passed - Jack
//    jack.marks = marks you have passed - 78.43
    Student(int rno, String name, float marks){
        // This is a CONSTRUCTOR - special function
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
