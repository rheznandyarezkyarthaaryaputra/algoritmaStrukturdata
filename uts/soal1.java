import java.util.Scanner;

public class soal1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi objek pembeli dan pesanan
        Pembeli pembeli = new Pembeli();
        Pesanan pesanan = new Pesanan();

        // Input data pembeli
        System.out.print("Masukkan nama pembeli: ");
        pembeli.nama = scanner.nextLine();
        System.out.print("Masukkan NIM pembeli: ");
        pembeli.nim = scanner.nextLine();
        System.out.print("Masukkan absen pembeli: ");
        pembeli.absen = scanner.nextInt();

        // Input data pesanan
        System.out.print("Masukkan nama menu: ");
        pesanan.namaMenu = scanner.nextLine();
        System.out.print("Masukkan jumlah pesanan: ");
        pesanan.jumlahPesanan = scanner.nextInt();
        System.out.print("Masukkan harga menu: ");
        pesanan.hargaMenu = scanner.nextDouble();

        // Cetak data pembeli
        System.out.println("Data pembeli:");
        System.out.println("Nama: " + pembeli.nama);
        System.out.println("NIM: " + pembeli.nim);
        System.out.println("Absen: " + pembeli.absen);

        // Cetak data pesanan
        System.out.println("Data pesanan:");
        System.out.println("Nama menu: " + pesanan.namaMenu);
        System.out.println("Jumlah pesanan: " + pesanan.jumlahPesanan);
        System.out.println("Harga menu: " + pesanan.hargaMenu);
        System.out.println("Total harga: " + pesanan.totalHarga());
    }
}

class Pembeli {

    String nama;
    String nim;
    int absen;

}

class Pesanan {

    String namaMenu;
    int jumlahPesanan;
    double hargaMenu;

    double totalHarga() {
        return this.jumlahPesanan * this.hargaMenu;
    }
}
