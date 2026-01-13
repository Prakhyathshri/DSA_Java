package com.lec38.staticExample;

public class Main {
    public static void main(String[] args) {
        Human prak = new Human(22, "Prakhyath Shri", 1100, true);
        Human bhavana = new Human(22, "Bhavana P", 1100, true);
        Human rahul = new Human(23, "Rahul Iyer", 1100, false);


        System.out.println(prak.name);

        System.out.println(prak.population);
        System.out.println(rahul.population);
        System.out.println(bhavana.population);

//        System.out.println(Human.population);
        // we can use this even when no object is being created
    }

// This is not dependent on object, bcz its static
// This does not belong to an instance
    static void fun(){
//        greeting(); - I cant call greeting her
// you cant use this because it required an instance
// but the function you are using it in does not depend on instance

// This is dependent on objects
// This belongs to an instance
// w.k.t something which is not static, belongs to object

// you cannot access non static stuff without referencing their instance in a static context
        Main obj = new Main();
        obj.greeting();
    }
    void fun2 (){
        greeting();
    }

    void greeting(){
        fun();
        System.out.println("!Hello world");
    }
}
