package org.src.wrapperclasses;

public class TestWrapperClass {
    public static void main(String[] args) {
        int a = 45;
        Integer aa = a; //Auto Boxing
        System.out.println(a);
        System.out.println(aa);
        Integer aaa = 23;
        int aaaa = aaa.intValue();
        System.out.println(aaaa);
        String ss = "12";
        int b = Integer.parseInt(ss);
        System.out.println(b);
        System.out.println(b*23);
    }
}
