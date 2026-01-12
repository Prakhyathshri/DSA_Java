package com.lec37;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        Integer num = 45;
//        a. - will not give anything
//        num. - will give so many in built functions to use
//        so wrapper is like converting a primitive into object

        int x = 10, y = 20;
        Integer c = 10, d = 20;
        swap(c, d);
        System.out.println(c + " " + d);

        final int bonus = 2;
//        bonus = 3; - I cant modify it

        final A kunal = new A("Yuva");
        kunal.name = "other name";

        // when a non primitive is final, we cant reassign it or anything
        // we can only reassign it aste
//        kunal = new A("New object");

    }

    static void swap (int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }


}

class A {
//    final int num; - It will say it is not initialized
//    since we cant modify or anything, always initialize which declaring
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }
}

