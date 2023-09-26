import java.util.Arrays;
import java.util.Scanner;

public class Mahasiswa3 {

    private String nim;
    private String namaMahasiswa;
    private double ipk;

    public Mahasiswa3(String nim, String namaMahasiswa, double ipk) {
        this.nim = nim;
        this.namaMahasiswa = namaMahasiswa;
        this.ipk = ipk;
    }

    public static void main(String[] args) {

        Mahasiswa3[] mhs = new Mahasiswa3[10];

        mhs[0] = new Mahasiswa3("19970506001", "anggi", 3.9);
        mhs[1] = new Mahasiswa3("19910421002", "Gitta", 3.8);
        mhs[2] = new Mahasiswa3("19950322002", "Amanda", 3.75);
        mhs[3] = new Mahasiswa3("19980129001", "Rovin", 3.5);
        mhs[4] = new Mahasiswa3("19990208002", "Windy", 3.92);
        mhs[5] = new Mahasiswa3("19970710001", "Belva", 3.6);
        mhs[6] = new Mahasiswa3("19520602001", "James", 3.7);
        mhs[7] = new Mahasiswa3("19901106002", "Aruna", 3.3);
        mhs[8] = new Mahasiswa3("19901005002", "Sabrina", 3.55);
        mhs[9] = new Mahasiswa3("19991201001", "Agus", 3.65);

        // Perubahan 1: Urutkan array berdasarkan IPK
        Arrays.sort(mhs, (m1, m2) -> Double.compare(m1.ipk, m2.ipk));

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan IPK yang dicari: ");

        double cariIpk;
        // Perubahan 2: Menambahkan penanganan kesalahan jika input bukan bilangan desimal
        try {
            cariIpk = sc.nextDouble();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input tidak valid. Harap masukkan bilangan desimal.");
            return;
        }

        int index = Arrays.binarySearch(mhs, new Mahasiswa3(null, null, cariIpk), (m1, m2) -> Double.compare(m1.ipk, m2.ipk));

        if (index >= 0) {
            System.out.println("Nama: " + mhs[index].namaMahasiswa);
            System.out.println("NIM: " + mhs[index].nim);
            System.out.println("IPK: " + mhs[index].ipk);
        } else {
            System.out.println("Data dengan IPK " + cariIpk + " tidak ditemukan");
        }
    }
}
