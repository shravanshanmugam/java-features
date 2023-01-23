package com.shravan.explore.java14;

public class HelpfulNPE {
    static class CheckNull {
        String str = null;
    }
    public static void main(String[] args) {
        CheckNull checkNull = new CheckNull();
        System.out.println("str.isBlank() = " + checkNull.str.isBlank());
        // "com.shravan.explore.java14.HelpfulNPE$CheckNull.str" is null
    }
}
