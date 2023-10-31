


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedListFilm filmList = new DoublyLinkedListFilm();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("====================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("====================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("===================");

            System.out.print("Pilih menu (1/2/3/4/5/6/7/8/9/10): ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                System.out.println("====================");
                System.out.println("Masukkan Data Posisi Awal");
                System.out.print("ID Film: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Judul Film: ");
                String judul = scanner.nextLine();
                System.out.print("Rating Film: ");
                double rating = scanner.nextDouble();
                scanner.nextLine();
                filmList.tambahDataAwal(id, judul, rating);
            } else if (menu == 2) {
                System.out.println("====================");
                System.out.println("Masukkan Data Posisi Akhir");
                System.out.print("ID Film: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Judul Film: ");
                String judul = scanner.nextLine();
                System.out.print("Rating Film: ");
                double rating = scanner.nextDouble();
                scanner.nextLine();
                filmList.tambahDataAkhir(id, judul, rating);
            } else if (menu == 3) {
                System.out.println("====================");
                System.out.println("Masukkan Data Film Posisi Awal");
                System.out.print("ID Film: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Judul Film: ");
                String judul = scanner.nextLine();
                System.out.print("Rating Film: ");
                double rating = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Data Film ini akan masuk di urutan ke-");
                int index = scanner.nextInt();
                scanner.nextLine();
                filmList.tambahDataIndex(id, judul, rating, index);
            } else if (menu == 4) {
                filmList.hapusDataPertama();
            } else if (menu == 5) {
                filmList.hapusDataTerakhir();
            } else if (menu == 6) {
                System.out.print("Masukkan ID Film yang akan dihapus: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                filmList.hapusDataTertentu(id);
            } else if (menu == 7) {
                filmList.cetakData();
            } else if (menu == 8) {
                System.out.println("=================");
                System.out.println("Cari Data");
                System.out.print("Masukkan ID Film yang dicari: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                filmList.cariData(id);
            } else if (menu == 9) {
                filmList.urutDataRatingDesc();
            } else if (menu == 10) {
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
