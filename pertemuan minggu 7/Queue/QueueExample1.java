import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class QueueExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int capacity = scanner.nextInt();
        Queue<Antrian> queue = new LinkedList<>();

        while (true) {
            System.out.println("Pilih menu:");
            System.out.println("1. Antrian baru");
            System.out.println("2. Antrian keluar");
            System.out.println("3. Cek Antrian terdepan");
            System.out.println("4. Cek Semua Antrian");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (queue.size() < capacity) {
                        scanner.nextLine(); // Membuang karakter newline
                        System.out.print("Nama: ");
                        String nama = scanner.nextLine();
                        System.out.print("Kota Asal: ");
                        String kotaAsal = scanner.nextLine();
                        System.out.print("Kota Tujuan: ");
                        String kotaTujuan = scanner.nextLine();
                        System.out.print("Jumlah Tiket: ");
                        int jumlahTiket = scanner.nextInt();
                        System.out.print("Harga: ");
                        double harga = scanner.nextDouble();

                        Antrian antrian = new Antrian(nama, kotaAsal, kotaTujuan, jumlahTiket, harga);
                        queue.add(antrian);
                        System.out.println("Antrian berhasil ditambahkan.");
                    } else {
                        System.out.println("Queue penuh. Tidak dapat menambahkan antrian baru.");
                    }
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        Antrian antrian = queue.poll();
                        System.out.println("Antrian yang keluar:");
                        System.out.println(antrian);
                    } else {
                        System.out.println("Queue kosong. Tidak ada antrian yang dapat dikeluarkan.");
                    }
                    break;
                case 3:
                    if (!queue.isEmpty()) {
                        Antrian terdepan = queue.peek();
                        System.out.println("Antrian terdepan:");
                        System.out.println(terdepan);
                    } else {
                        System.out.println("Queue kosong. Tidak ada antrian terdepan.");
                    }
                    break;
                case 4:
                    if (!queue.isEmpty()) {
                        System.out.println("Semua Antrian:");
                        for (Antrian antrian : queue) {
                            System.out.println(antrian);
                            System.out.println("---------------");
                        }
                    } else {
                        System.out.println("Queue kosong. Tidak ada antrian yang tersimpan.");
                    }
                    break;
                default:
                    System.out.println("Menu tidak valid. Masukkan nomor menu yang benar.");
            }

            System.out.println();
        }
    }
}