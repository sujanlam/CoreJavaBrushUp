package org.src.inheritence;

public class VeryAdvanceCalculator extends AdvancedCalculator{
    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        VeryAdvanceCalculator vac = new VeryAdvanceCalculator();
        System.out.println(vac.multiply(2.0, 3.0)+" "+ vac.add(2,5)+" "+vac.power(3,3));
    }
}
