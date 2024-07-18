package org.src.basics.strings;

public class TestString {
    public static void main(String[] args) {
        String original = new String("Hello");
        System.out.println("Original : " + original);
        original += "Wolrd!";

        System.out.println("Modified : " + original);

        String another = new String("Hello");
        System.out.println("Another : " + another);
        System.out.println(original == another);

        int a = 5;
        System.out.println(a);
        int b = 5;
        System.out.println(b);

        System.out.println(a == b);
    }
}
