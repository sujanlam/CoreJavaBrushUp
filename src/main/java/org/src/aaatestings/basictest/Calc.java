package org.src.aaatestings.basictest;

public class Calc {
    public int divide(int a, int b) {
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        int a = calc.divide(40, 20);
        System.out.println(a);
        int b = calc.multiply(10, 20);
        System.out.println(b);
    }
}
