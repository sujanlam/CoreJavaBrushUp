package org.src.loops;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Student forLoop1 = new Student("John Bill", 30);
        Student forLoop2 = new Student("Will Coll", 23);
        Student forLoop3 = new Student("Bill Roll", 90);

        Student[] stdArray = {forLoop1, forLoop2, forLoop3};
        for(Student forLoop : stdArray) {
            System.out.println(forLoop.age+" "+forLoop.name);
        }


        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        String[] names = {
                "Alice",
                "Benjamin",
                "Catherine",
                "David",
                "Emily",
                "Felix",
                "Grace"
        };

        for (String name : names) {
            System.out.print(name+" ");
        }
        System.out.println();
        for (int num : nums) {
            System.out.print(num+" ");
        }

    }
}
