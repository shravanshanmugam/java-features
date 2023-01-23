package com.shravan.explore.java14;

public class RecordMain {

    public static void main(String[] args) {
        recordOperations();
        recordUsage();
    }

    private static void recordUsage() {
        System.out.println("Customer.PREFIX = " + Customer.PREFIX);
        Customer.doNothing();
        String result = new Customer("abc").doSomething();
        System.out.println("result = " + result);
    }

    private static void recordOperations() {
        var shravan = new Customer("shravan");
        System.out.println("Customer shravan = " + shravan);
        System.out.println("Customer shravan.name() = " + shravan.name());
        System.out.println("Customer shravan.hashCode() = " + shravan.hashCode());
        var shanmugam = new Customer("shanmugam");
        System.out.println("Customer shravan.equals(shanmugam)) = " + shravan.equals(shanmugam));
        Customer anotherShravan = new Customer("shravan");
        System.out.println("Customer shravan.equals(anotherShravan) = " + shravan.equals(anotherShravan));
    }
}
