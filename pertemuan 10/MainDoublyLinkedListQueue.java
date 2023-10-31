import java.util.Scanner;

public class MainDoublyLinkedListQueue {
    public static void main(String[] args) {
        DoublyLinkedListQueue queue = new DoublyLinkedListQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");

            System.out.print("Pilih menu (1/2/3/4): ");
            String menu = scanner.nextLine();

            if (menu.equals("1")) {
                System.out.println("===========================");
                System.out.println("Masukkan Data Penerima Vaksin");
                System.out.println("===========================");
                System.out.print("Nomor Antrian: ");
                int nomorAntrian = Integer.parseInt(scanner.nextLine());
                System.out.print("-Nama Penerima: ");
                String nama = scanner.nextLine();
                queue.tambahData(nomorAntrian, nama);
            } else if (menu.equals("2")) {
                String namaSelesai = queue.hapusData();
                if (namaSelesai != null) {
                    System.out.println(namaSelesai + " telah selesai divaksinasi.");
                } else {
                    System.out.println("Antrian kosong");
                }
            } else if (menu.equals("3")) {
                queue.daftarPenerimaVaksin();
            } else if (menu.equals("4")) {
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}