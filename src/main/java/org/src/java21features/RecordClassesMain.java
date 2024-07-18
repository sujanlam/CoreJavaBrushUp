package org.src.java21features;

record Car(int id, String model){}
public class RecordClassesMain {
    public static void main(String[] args) {
        Car car = new Car(5, "Ford");
        Car car2 = new Car(5, "Ford");
        System.out.println(car);
        System.out.println(car2);
        System.out.println();
        System.out.println(car.equals(car2));
    }
}
