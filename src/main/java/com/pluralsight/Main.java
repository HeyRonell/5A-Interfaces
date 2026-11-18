package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Vehicle.Car cah = new Vehicle.Car();
        Vehicle.Motorcycle moto = new Vehicle.Motorcycle();

        cah.start();
        cah.stop();
        cah.spinClockwise();
        cah.spinCounterClockwise();
        cah.flipForward();
        cah.flipBackward();
        moto.start();
        moto.stop();



    }
}
