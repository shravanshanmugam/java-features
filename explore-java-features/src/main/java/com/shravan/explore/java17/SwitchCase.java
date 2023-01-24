package com.shravan.explore.java17;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("formatterPatternSwitch(1) = " + formatterPatternSwitch(1));
        System.out.println("formatterPatternSwitch(10l) = " + formatterPatternSwitch(10L));
        try {
            System.out.println("formatterPatternSwitch(100.2d) = " + formatterPatternSwitch(101.021D));
        } catch (Exception e) {

        }
        System.out.println("formatterPatternSwitch(\"str\") = " + formatterPatternSwitch("str"));
        guardedPattern(new Triangle());
        guardedPattern(new Rectangle());
    }

    public static String formatterPatternSwitch(Object o) {
        return switch (o) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %d", d);
            case String s -> String.format("string %s", s);
            default -> o.toString();
        };
    }

    interface Shape {
        int calculateArea();
    }

    static class Triangle implements Shape {

        @Override
        public int calculateArea() {
            System.out.println("1/2*b*h");
            return 5;
        }
    }

    static class Rectangle implements Shape {

        @Override
        public int calculateArea() {
            System.out.println("a*b");
            return 10;
        }
    }

    public static void guardedPattern(Shape s ) {
        switch (s) {
            case Triangle t && t.calculateArea() == 5 -> System.out.println("/\\");
            case Rectangle r && r.calculateArea() == 10 -> System.out.println("|_`_|");
            default -> System.out.println("s = " + s);
        }
    }

}
