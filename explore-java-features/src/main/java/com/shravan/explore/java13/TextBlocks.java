package com.shravan.explore.java13;

public class TextBlocks {

    public static void main(String[] args) {
        textBlock();
    }

    public static void textBlock() {
        String textBlock = """
            Hi
            My Name is Shravan
                        This text is indented on multiple lines
                And prints like this
                    This is crazy stuff
            """;
        System.out.println("textBlock = " + textBlock);
        var address = """
                Apartment name, Door no
                Street Name, Colony name
                City name - Pincode
                State
                Country
                """;
        System.out.println("address = " + address);
    }
}
