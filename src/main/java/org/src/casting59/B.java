package org.src.casting59;

public class B extends A{
    public void showB(){
        System.out.println("Show 1");
    }

    public static void main(String[] args) {
        A a = new A();
        a.showA();
        B aa = (B) a;
        aa.showA();
        aa.showB();
    }
}
