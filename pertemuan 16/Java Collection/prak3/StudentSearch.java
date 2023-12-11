package prak3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSearch {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("1001", "Alice", "3.5"));
        students.add(new Student("1002", "Bob", "3.2"));
        students.add(new Student("1003", "Charlie", "3.7"));
        students.add(new Student("1004", "David", "3.9"));
        students.add(new Student("1005", "Eve", "3.1"));

        // Urutkan daftar berdasarkan nim
        Collections.sort(students);

        // Cari mahasiswa dengan nim tertentu menggunakan binarySearch
        String targetNim = "1003";
        int resultIndex = Collections.binarySearch(students, new Student(targetNim, "", ""), Student.descendingNimComparator);

        if (resultIndex >= 0) {
            Student foundStudent = students.get(resultIndex);
            System.out.println("Mahasiswa ditemukan: " + foundStudent);
        } else {
            System.out.println("Mahasiswa tidak ditemukan.");
        }
    }
}

