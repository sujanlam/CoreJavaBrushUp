package org.src.java21features;


import java.util.ArrayList;

public class Test21 {

    public int setEast(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Test21 t = new Test21();
        System.out.println("Hello World!");
        var sum = t.setEast(3, 4);
        System.out.println(sum);

        var list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.forEach(System.out::println);
        var arr = new int[] { 1, 2, 3 };
        System.out.println(arr[0]);
    }

}
