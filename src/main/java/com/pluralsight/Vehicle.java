package com.pluralsight;

public class Vehicle {

    interface Drive {
        void start();
        void stop();
    }
    interface spin {
        void spinClockwise();
        void spinCounterClockwise();
    }
    interface flip {
        void flipForward();
        void flipBackward();
    }

    static class Car implements Drive, spin, flip {
        public void start() {
            System.out.println("vrum vrum vrum vrum.. ");
        }
        public void stop() {
            System.out.println("trrrch tun");
        }
        public void spinClockwise() {
            System.out.println("I'm spinning");
        }
        public void spinCounterClockwise() {
            System.out.println("I'm spinning the other way this time.");
        }
        public void flipForward() {
            System.out.println("Flippin me forward");
        }
        public void flipBackward() {
            System.out.println("Flippin me backward");
        }
    }
    static class Motorcycle implements Drive {
        public void start() {
            System.out.println("drrraat ta ta ta ta ta");
        }
        public void stop() {
            System.out.println("addra dan");
        }
    }
}
