package com.shravan.explore.java14;

public record Customer(String name) {
    // custom constructor
    public Customer {
        if (null == name || name.isBlank())
            throw new IllegalArgumentException("name cannot be empty");
    }

    public static int CODE;
    static {
        // static initialized
        CODE = 1;
    }
    // static variable
    public static final String PREFIX = "CUS-";
    // instance method
    public String doSomething() {
        return "doing something";
    }
    // static method
    public static void doNothing() {
        System.out.println("doing nothing");
    }

    public void setName(String name) {
//        this.name = name;// not allowed since it is final member variable of this class
    }
}
