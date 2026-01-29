package com.lec39;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;

//        this.x = -1;
//        X is declared as private in Box class you cant access from child class
    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // Call the parent class constructor
        // Used to initialize the values present in parent class constructor

        // we have declared weight in parent class Box also
        super.weight = weight;

        this.weight = weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
