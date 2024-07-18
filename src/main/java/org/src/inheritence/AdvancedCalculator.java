package org.src.inheritence;

public class AdvancedCalculator extends Calculator{
    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        AdvancedCalculator ac = new AdvancedCalculator();
        System.out.println(ac.multiply(2.0, 3.0)+" "+ ac.add(2,5));
    }
}
