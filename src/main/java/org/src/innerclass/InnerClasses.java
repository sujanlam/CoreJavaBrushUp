package org.src.innerclass;


class  A{
    int age;

    public void show(){
        System.out.println("In show method");
    }
    class B{
        public void config(){
            System.out.println("In config!!!");
        }
    }
    static class C{
        public void config(){
            System.out.println("In C!!!");
        }
    }
}
public class InnerClasses {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        A.B b = a.new B();
        b.config();

        A.C b1= new A.C();
        b1.config();

    }
}
