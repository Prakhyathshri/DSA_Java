package com.lec38.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("Hi");
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.message();

        Human.population += 1;
        // As the instance variable has no personal connection,
        // we are using the Class name for pop, every time a
        // object being created, pop = pop + 1;

        // But if this was used
//        this.population += 1;
        // This will say the object is kunal
        // so does kunal had population, no does the class have
        // Yes, so add it to class and it will be Human itself
    }
}
