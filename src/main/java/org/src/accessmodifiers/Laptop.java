package org.src.accessmodifiers;

class Computer{
    static final double PI = 3.142;
    public void show(){
        System.out.println("Computer is running");
    }
}

class Tabloid extends Computer {
    public void show() {
        System.out.println("Tabloid is off!!");
    }
}

public class Laptop extends Computer{
    public void show(){
        System.out.println("Laptop is running");
    }
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.show();
        computer = new Laptop();
        computer.show();
        computer = new Tabloid();
        computer.show();
        System.out.println(PI);
    }
}
