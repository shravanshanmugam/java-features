package com.shravan.explore.java17;

public class SealedClasses {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.calculateArea(4, 5);

        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea(4, 5);

        OuterRectangle outerRectangle = new OuterRectangle();
        outerRectangle.calculateArea(4, 5);

        Square square = new Square();
        square.calculateArea(4, 5);
    }

    static abstract sealed class Shape {
        abstract void calculateArea(int a, int b);
    }

    non-sealed static class Triangle extends Shape {

        @Override
        void calculateArea(int a, int b) {
            System.out.println("area of triangle " + a*b/2);
        }
    }

    sealed static class Rectangle extends Shape permits OuterRectangle {

        @Override
        void calculateArea(int a, int b) {
            System.out.println("area of rectangle " + a*b);
        }
    }

    static final class OuterRectangle extends Rectangle {
        @Override
        void calculateArea(int a, int b) {
            super.calculateArea(a, b);
            System.out.println("perimeter of rectangle " + 2*(a+b));
        }
    }

    // Not allowed in Sealed hierarchy
    // only permitted subclasses can extend the class
    // if permitted but does not extend then compile time error
    /*static final class FilledRectangle extends Rectangle {
        @Override
        void calculateArea(int a, int b) {
            super.calculateArea(a, b);
            System.out.println("I am filled in black color");
        }
    }*/

    static final class Square extends Shape {

        @Override
        void calculateArea(int a, int b) {
            System.out.println("area of square " + a*a);
        }
    }
}
