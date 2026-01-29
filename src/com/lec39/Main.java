package com.lec39;

public class Main {
    public static void main(String[] args) {

        BoxPrice box7 = new BoxPrice(5,8,200);
        System.out.println(box7.l + ", " + box7.h + ", " + box7.w + ", " + box7.weight + ", " + box7.cost);


        Box box1 = new Box();
        System.out.println(box1.l + " " + box1.h + " " + box1.w);

        Box box2 = new Box(4);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);

        Box box3 = new Box(3,6,9);
        System.out.println(box3.l + " " + box3.h + " " + box3.w);

        Box box4 = new Box(box3);
        System.out.println(box4.l + " " + box4.h + " " + box4.w);

        // Box box5 = new Box(2,3); - No constructor is there that takes 2 arguments
        // It will say Cannot resolve constructor

        BoxWeight box5 = new BoxWeight();
        System.out.println(box5.l + " " + box5.h + " " + box5.w + " " + box5.weight);

        Box box6 = new BoxWeight(2,3,4,5);
        System.out.println(box6.l + " " + box6.h + " " + box6.w);
        // You can only refer the properties of the reference variable
        // System.out.println(box6.weight); - This is an error

        // BoxWeight box7 = new Box(2,3,4,5);
        // System.out.println(box7.l + " " + box7.h + " " + box7.w);
        // You can access parent from child - ERROR
        // There are many variables in parent anc child
        // you are given access to variables in "BoxWeight"
        // so, if you want to access weight, you should initialize it as well
        // but here when the object is itself of Box you cant call BoxWeight
    }
}
