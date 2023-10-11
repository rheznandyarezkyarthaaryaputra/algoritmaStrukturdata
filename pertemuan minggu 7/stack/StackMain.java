import java.util.Scanner;
import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Buku> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        boolean tambahData = true;
        while (tambahData) {
            System.out.println("Masukkan data buku:");
            System.out.print("Judul: ");
            String judul = sc.nextLine();
            System.out.print("Nama Pengarang: ");
            String pengarang = sc.nextLine();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = sc.nextInt();
            System.out.print("Jumlah Halaman: ");
            int jumlahHalaman = sc.nextInt();
            System.out.print("Harga: ");
            int harga = sc.nextInt();
            
            sc.nextLine(); // Membersihkan karakter newline dari input

            Buku buku = new Buku(judul, pengarang, tahunTerbit, jumlahHalaman, harga);
            stack.push(buku);

            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
            String jawaban = sc.nextLine();
            tambahData = jawaban.equalsIgnoreCase("y");
        }

        System.out.println("Isi stack:");
        for (Buku buku : stack) {
            buku.printInfo();
        }

        System.out.println("Data yang keluar: " + stack.pop().toString());
        System.out.println("Elemen teratas: " + stack.peek().toString());
        System.out.println("Isi stack:");
        for (Buku buku : stack) {
            buku.printInfo();
        }
    }
}

class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    private int jumlahHalaman;
    private int harga;

    public Buku(String judul, String pengarang, int tahunTerbit, int jumlahHalaman, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public void printInfo() {
        System.out.println(judul + " " + pengarang + " " + tahunTerbit + " " + jumlahHalaman + " " + harga);
    }

    @Override
    public String toString() {
        return judul + " " + pengarang + " " + tahunTerbit + " " + jumlahHalaman + " " + harga;
    }
}
