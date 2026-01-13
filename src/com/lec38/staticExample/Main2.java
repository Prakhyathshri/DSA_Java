package com.lec38.staticExample;


public class Main2 {
    public static void main(String[] args) {

        Human2 h1 = new Human2();
        Human2 h2 = new Human2();

        h1.population = 1;

        System.out.println(h2.population); // Output: 1
    }
}

class Human2 {
    static int population;
}