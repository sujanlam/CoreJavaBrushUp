package org.src.abstractkeyword;

abstract class Car {
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Play music");
    }
}

abstract class SedanCar extends Car{

    @Override
    public void drive() {
        System.out.println("4 wheel drive!!!");
    }
}

class UpdatedSedanCar extends SedanCar{

    @Override
    public void fly() {

    }
}

public class CarMain{
    public static void main(String[] args) {
        Car car = new UpdatedSedanCar();
        car.drive();
        car.playMusic();
    }
}
