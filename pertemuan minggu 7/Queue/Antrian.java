import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Antrian {
    String nama;
    String kotaAsal;
    String kotaTujuan;
    int jumlahTiket;
    double harga;

    public Antrian(String nama, String kotaAsal, String kotaTujuan, int jumlahTiket, double harga) {
        this.nama = nama;
        this.kotaAsal = kotaAsal;
        this.kotaTujuan = kotaTujuan;
        this.jumlahTiket = jumlahTiket;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Nama: " + nama +
                "\nKota Asal: " + kotaAsal +
                "\nKota Tujuan: " + kotaTujuan +
                "\nJumlah Tiket: " + jumlahTiket +
                "\nHarga: " + harga;
    }
}

