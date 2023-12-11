package prak3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Kelas Student
class Student implements Comparable<Student> {
    String nim;
    String nama;
    String noteIp;

    public Student(String nim, String nama, String noteIp) {
        this.nim = nim;
        this.nama = nama;
        this.noteIp = noteIp;
    }

    @Override
    public int compareTo(Student other) {
        return this.nim.compareTo(other.nim);
    }

    public static Comparator<Student> descendingNimComparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s2.nim.compareTo(s1.nim);
        }
    };

    @Override
    public String toString() {
        return String.format("Mahasiswa{nim='%s', nama='%s', noteIp='%s'}", nim, nama, noteIp);
    }
}

