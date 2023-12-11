package prak3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("19001", "Noureen", "08123456789"));
        students.add(new Student("19002", "Akhleema", "08123456789"));
        students.add(new Student("19003", "Shannum", "08123456789"));

        Collections.sort(students);
        System.out.println("Sorted in ascending order by nim:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, Student.descendingNimComparator);
        System.out.println("\nSorted in descending order by nim:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
