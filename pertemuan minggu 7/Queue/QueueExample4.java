public class QueueExample4 {
    public static void main(String[] args) {
        Queue antrianMahasiswa = new Queue(5);

        // Menambahkan beberapa mahasiswa ke dalam antrian
        antrianMahasiswa.enqueue(new Mahasiswa("12345", "John", 1, 3.5));
        antrianMahasiswa.enqueue(new Mahasiswa("67890", "Jane", 2, 3.2));
        antrianMahasiswa.enqueue(new Mahasiswa("54321", "Alice", 3, 3.8));
        antrianMahasiswa.enqueue(new Mahasiswa("98765", "Bob", 4, 3.0));

        // Menampilkan informasi tentang antrian
        antrianMahasiswa.print();

        // Menampilkan mahasiswa paling depan dalam antrian
        antrianMahasiswa.peek();

        // Menampilkan mahasiswa paling belakang dalam antrian
        antrianMahasiswa.peekRear();

        // Menampilkan posisi (indeks) seorang mahasiswa dalam antrian berdasarkan NIM
        antrianMahasiswa.peekPosition("54321");

        // Menampilkan data mahasiswa pada posisi tertentu dalam antrian
        antrianMahasiswa.printMahasiswa(2);

        // Mengeluarkan mahasiswa dari antrian
        Mahasiswa mahasiswaDidequeue = antrianMahasiswa.dequeue();
        if (mahasiswaDidequeue != null) {
            System.out.println("Mahasiswa dengan NIM " + mahasiswaDidequeue.nim + " telah keluar dari antrian.");
        } else {
            System.out.println("Antrian kosong. Tidak ada mahasiswa yang dapat dikeluarkan.");
        }
    }
}
