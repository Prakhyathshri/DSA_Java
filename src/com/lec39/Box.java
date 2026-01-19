package com.lec39;

public class Box { // Box is a class
    double l;      // These are PROPERTIES OF BOXES
    double h;      // Also called as instance variable
    double w;

    // Something with same name as Class inside class
    // is called as Constructor
    Box (){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //Cube
    Box (double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
