package com.shravan.explore.java11;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotRunner {

    public static void main(String[] args) {
        List<Integer> integers = List.of(3, 4, 6, 7, 80, 82, 87);
        Predicate<Integer> checkEven = number -> number % 2 == 0;
        even(integers, checkEven);
        odd(integers, checkEven);
    }

    private static void odd(List<Integer> integers, Predicate<Integer> checkEven) {
        List<Integer> oddNumbers = integers.stream().filter(Predicate.not(checkEven)).collect(Collectors.toList());
        System.out.println("oddNumbers = " + oddNumbers);
    }

    private static void even(List<Integer> integers, Predicate<Integer> even) {
        List<Integer> evenNumbers = integers.stream().filter(even).collect(Collectors.toList());
        System.out.println("evenNumbers = " + evenNumbers);
    }
}
