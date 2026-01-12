package com.lec38.b;
// we need to mention which package the file lies in
// the whole file path will be and should be specified for the compiler

import static com.lec38.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Good morning all");

        message(); // the above import statement is what is helping to run
        // but it should be a public class
    }
}
