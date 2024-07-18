package org.src.functionalInterface;

@java.lang.FunctionalInterface
interface FunctionalInterface {
    int calcResult(int a, int b);

}

public class FunctionalInterfaceMain {
    public static void main(String[] args) {
        FunctionalInterface add = (a, b) -> a+b;
        System.out.println(add.calcResult(10, 20));
        FunctionalInterface subt = (a,b) -> b-a;
        System.out.println(subt.calcResult(12,24));
    }
    void main(){
        System.out.println();
    }
}
