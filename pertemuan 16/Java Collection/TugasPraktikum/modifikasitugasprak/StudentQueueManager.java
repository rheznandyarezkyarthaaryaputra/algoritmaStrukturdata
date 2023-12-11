package TugasPraktikum.modifikasitugasprak;

import java.util.LinkedList;
import java.util.Queue;

public class StudentQueueManager {
    private Queue<Student> studentQueue;

    public StudentQueueManager() {
        studentQueue = new LinkedList<>();
    }

    // Menambahkan mahasiswa ke Queue
    public void enqueue(Student student) {
        studentQueue.add(student);
    }

    // Menghapus mahasiswa dari Queue
    public Student dequeue() {
        return studentQueue.poll(); // Mengembalikan null jika Queue kosong
    }

    // Menampilkan semua mahasiswa dalam Queue
    public void displayQueue() {
        for (Student student : studentQueue) {
            System.out.println("NIM: " + student.nim + ", Nama: " + student.nama + ", Catatan IP: " + student.noteIp);
        }
    }

    // Main method untuk demonstrasi
    public static void main(String[] args) {
        StudentQueueManager manager = new StudentQueueManager();

        // Menambahkan mahasiswa
        manager.enqueue(new Student("12345", "Ayu", "3.5"));
        manager.enqueue(new Student("12346", "Budi", "3.6"));
        manager.enqueue(new Student("12347", "Chika", "3.7"));

        // Menampilkan mahasiswa
        System.out.println("Queue Mahasiswa:");
        manager.displayQueue();

        // Menghapus mahasiswa
        Student removedStudent = manager.dequeue();
        if (removedStudent != null) {
            System.out.println("Mahasiswa dihapus: " + removedStudent.nama);
        }

        // Menampilkan Queue setelah penghapusan
        System.out.println("\nQueue setelah penghapusan:");
        manager.displayQueue();
    }
}
