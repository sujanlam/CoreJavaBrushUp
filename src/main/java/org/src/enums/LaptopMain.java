package org.src.enums;

enum Laptop {
    MacBook(2000), XPS(900), Surface, ThinkPad(1800);

    Laptop() {
        price = 900;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    Laptop(int price) {
        this.price = price;
    }
}

public class LaptopMain {
    public static void main(String[] args) {
        Laptop mac = Laptop.MacBook;
        System.out.println(mac+" "+mac.getPrice());

        for(Laptop laptop : Laptop.values()) {
            System.out.println(laptop+" "+laptop.getPrice());
        }
    }



}
