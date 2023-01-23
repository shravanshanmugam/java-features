package com.shravan.explore.java11;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("  ".isBlank());
        System.out.println("  abc ".strip().replace(" ","@"));
        System.out.println("  abc ".stripLeading().replace(" ","@"));
        System.out.println("  abc ".stripTrailing().replace(" ","@"));
        "line1\nlin2\nline3\nadfoaije\n923oijlkmsdf".lines().forEach(System.out::println);
        System.out.println("UPPER".<String>transform(s -> s.substring(1)));
        System.out.println("My name is %s. My age is %d".formatted("Shravan", 18));
    }
}
