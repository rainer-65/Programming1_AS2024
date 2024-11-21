package lecture08.examples;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student(1, "Johnson", "John", 3.9);
        Student student2 = new Student(2, "Johnson", "Emily", 3.9);
        Student student3 = new Student(3, "Doe", "Alice", 3.5);
        Student student4 = new Student(4, "Jackson", "Alice", 3.5);

        // Adding students
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        // Comparing two students for equality
        System.out.println("Students 1 and 2 equal: " + student1.equals(student2));
        System.out.println();

        // Comparing two students based on the defined order
        if (student1.compareTo(student2) == 0) {
            System.out.println("Students are equal");
        } else if (student1.compareTo(student2) < 0) {
            System.out.println("Student 1 comes before student 2 in sorting");
        } else System.out.println("Student 1 comes after student 2 in sorting");
        System.out.println();

        // Printing students in unsorted manner
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        // Sorting and printing in sorted manner
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }


    }

}
