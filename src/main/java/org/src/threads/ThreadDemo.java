package org.src.threads;

class A extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi from A");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi from B");
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
      A a = new A();
        B b = new B();
        System.out.println(a.getPriority());
        a.setPriority(Thread.MAX_PRIORITY);
        //b.setPriority(10);
        System.out.println(b.getPriority());
        a.start();
        b.start();
    }
}
