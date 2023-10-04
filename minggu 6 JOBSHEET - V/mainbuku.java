

import java.util.Scanner;

public class mainbuku{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProsesPerpus buku = new ProsesPerpus();
        int jumlah = 4;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Buku ke - " + (i + 1));
            System.out.print("Masukkan Nama : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Halaman : ");
            int halaman = input.nextInt();
            System.out.print("Masukkan Tinggi : ");
            float tinggi = input.nextFloat();

            Perpus d = new Perpus(nama, halaman, tinggi);
            buku.tambah(d);
            input.nextLine(); // Membersihkan newline character setelah input tinggi
        }

        System.out.println("");
        System.out.println("------------");
        System.out.println("Data Buku yang Masuk : ");
        buku.tampil();
        System.out.println("");
        System.out.println("============");
        System.out.println("Pengurutan Sesuai Halaman : ");
        buku.halaman();
        buku.tampil();
        System.out.println("");
        System.out.println("============");
        System.out.println("Pengurutan Sesuai Tinggi : ");
        buku.tinggi();
        buku.tampil();
    }
}
