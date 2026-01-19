package com.lec39;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.l + " " + box1.h + " " + box1.w);

        Box box2 = new Box(4);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);

        Box box3 = new Box(3,6,9);
        System.out.println(box3.l + " " + box3.h + " " + box3.w);

        Box box4 = new Box(box3);
        System.out.println(box3.l + " " + box3.h + " " + box3.w);

        // Box box5 = new Box(2,3); - No constructor is there that takes 2 arguments
        // It will say Cannot resolve constructor

    }
}
