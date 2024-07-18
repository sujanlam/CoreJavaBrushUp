package org.src.streams;

public class Student {
        private int id;
        private String name;
        private int age;
        private char grade;

        // Constructor
        public Student(int id, String name, int age, char grade) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        // Getters
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public char getGrade() {
            return grade;
        }

        // toString method for easy printing
        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", grade=" + grade +
                    '}';
        }
    }
