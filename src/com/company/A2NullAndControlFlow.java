package com.company;

public class A2NullAndControlFlow {
    public static void main(String[] args) {
        String text = null;
        int length;

        if (text != null) {
            length = text.length();
        } else {
            length = 5;
        }

        System.out.println(length);
    }

}
