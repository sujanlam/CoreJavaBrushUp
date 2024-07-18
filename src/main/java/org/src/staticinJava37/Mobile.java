package org.src.staticinJava37;

import lombok.Data;

//@Data
public class Mobile extends Satelite implements Telecomm{
    String brand;

    public Mobile() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double price;
    final static String name = "Latest Smart Phone";

    public Mobile(String brand, double price, String name) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile: {" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
    public static void show(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        //Mobile iphone = new Mobile("iphone", 1000.00, "Smart Phone");
        //Mobile samsung = new Mobile("samsung", 900.00, "Smart Phone");
        Mobile iphone = new Mobile();
        //iphone.name = "iphone";
        iphone.price = 1000;
        iphone.brand = "iphone";
        System.out.println(iphone);
        Mobile samsung = new Mobile();
        //samsung.name = "samsung";
        samsung.price = 800;
        samsung.brand = "samsung";
        System.out.println(samsung);
        //Mobile.name = "Latest Phone";
        //System.out.println();
        System.out.println(iphone);
        System.out.println(samsung);
    }


    @Override
    public void connects() {

    }

    @Override
    void sendSignals() {

    }
}
