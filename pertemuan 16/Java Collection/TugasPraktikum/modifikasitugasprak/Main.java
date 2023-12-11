package TugasPraktikum.modifikasitugasprak;


public class Main {
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
