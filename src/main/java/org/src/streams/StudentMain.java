package org.src.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        // Creating 5 student objects
        Student student1 = new Student(1, "Alice", 20, 'A');
        Student student2 = new Student(2, "Bob", 21, 'B');
        Student student3 = new Student(3, "Charlie", 22, 'A');
        Student student4 = new Student(4, "David", 23, 'C');
        Student student5 = new Student(5, "Eva", 20, 'B');

        List<Student> students = Arrays.asList(student5, student2, student4, student1, student3);
        //System.out.println(students);

        Map<Character, Double> averageAgeByGrade = students
                .stream()
                .collect(Collectors.groupingBy(Student::getGrade, Collectors.averagingInt(Student::getAge)));
        System.out.println(averageAgeByGrade);

    }
}
