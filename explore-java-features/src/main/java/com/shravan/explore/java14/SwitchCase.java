package com.shravan.explore.java14;

public class SwitchCase {

    public static void main(String[] args) {
        switchCase("red");
        switchCase("black");
        switchCase("abc");
        switchCase("");
    }

    public static void switchCase(String color) {
        var result = switch (color) {
            case "red", "blue", "green" -> "rgb";
            case "yellow", "magenta", "cyan", "black" -> "ymck";
            default -> color.length() == 0 ? "give me a color" : "none";
        };
        System.out.println("result = " + result);
    }
}
