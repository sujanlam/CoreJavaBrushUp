package org.src.innerclass.anonymous;

abstract class A {
       public abstract void show();
    public abstract void run();
}

public class Anon {

    public static void main(String[] args) {
        A a = new A(){
            public void show(){
                System.out.println("From show method in anonymous class");
            }

            @Override
            public void run() {
                System.out.println("Run method in anonymous class");
            }
        };
        a.show();
        a.run();
    }
}
