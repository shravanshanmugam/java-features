package com.shravan.explore.java10;

import java.util.List;

public class LocalVariableTypeInference {
//    private var y = "abc"; // not allowed for member variables
    public static void main(String[] args) {
        var str = "abc";
        System.out.println("str = " + str);
        List<String> a = List.of("a");
        List<String> b = List.of("b", "c");
        var names = List.of(a, b);
        names.forEach(System.out::println);

//        var x = null; // not allowed for null value

    }
}
