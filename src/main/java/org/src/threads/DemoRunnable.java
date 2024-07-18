package org.src.threads;

/*class AA implements Runnable{
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

class BB implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi from B");
        }
    }
}*/

public class DemoRunnable {
    public static void main(String[] args) {
        Runnable aa =  () -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hi from A");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            }
        };
        Runnable bb = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi from B");
            }
        };

        Thread t1 = new Thread(aa);
        Thread t2 = new Thread(bb);

        t1.start();
        t2.start();
    }
}
