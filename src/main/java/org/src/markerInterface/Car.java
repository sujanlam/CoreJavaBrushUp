package org.src.markerInterface;

import java.io.Serializable;

public class Car implements Serializable {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;

        int[] arr = new int[5];
        String str = null;

        try {
            b = 19 / a;
            System.out.println(arr[0]);
            System.out.println(arr[2]);
            System.out.println(str.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Range is over the limit: "+ e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Are you dividing number by zero? " + e.getMessage());
        }catch (Exception e){
            System.out.println();
        }
    }
}
