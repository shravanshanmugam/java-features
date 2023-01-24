package com.shravan.explore.java17;

public class InstancePatternMatching {
    public static void main(String[] args) {
        display(new Triangle());
        display(new Circle());
    }

    private static void display(Shape s) {
        if (s instanceof Triangle t) {
            s.shout();
            t.sides();
        } else if (s instanceof Circle c) {
            s.shout();
            c.noSides();
        }
    }

    interface Shape {
        void shout();
    }

    static class Triangle implements Shape {

        @Override
        public void shout() {
            System.out.println("I am triangle");
        }

        public void sides() {
            System.out.println("I have 3 sides");
        }
    }

    static class Circle implements Shape {

        @Override
        public void shout() {
            System.out.println("I am circle");
        }

        public void noSides() {
            System.out.println("I have no sides");
        }
    }
}
