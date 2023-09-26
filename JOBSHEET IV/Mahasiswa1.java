import java.util.Arrays;
import java.util.Scanner;

public class Mahasiswa1 {

    private String nim;
    private String namaMahasiswa;
    private double ipk;

    public Mahasiswa1(String nim, String namaMahasiswa, double ipk) {
        this.nim = nim;
        this.namaMahasiswa = namaMahasiswa;
        this.ipk = ipk;
    }

    public static void main(String[] args) {

        Mahasiswa1[] mhs = new Mahasiswa1[10];

        mhs[0] = new Mahasiswa1("19970506001", "anggi", 3.9);
        mhs[1] = new Mahasiswa1("19910421002", "Gitta", 3.8);
        mhs[2] = new Mahasiswa1("19950322002", "Amanda", 3.75);
        mhs[3] = new Mahasiswa1("19980129001", "Rovin", 3.5);
        mhs[4] = new Mahasiswa1("19990208002", "Windy", 3.92);
        mhs[5] = new Mahasiswa1("19970710001", "Belva", 3.6);
        mhs[6] = new Mahasiswa1("19520602001", "James", 3.7);
        mhs[7] = new Mahasiswa1("19901106002", "Aruna", 3.3);
        mhs[8] = new Mahasiswa1("19901005002", "Sabrina", 3.55);
        mhs[9] = new Mahasiswa1("19991201001", "Agus", 3.65);

        Arrays.sort(mhs, (m1, m2) -> m1.namaMahasiswa.compareTo(m2.namaMahasiswa));

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nama mahasiswa yang dicari: ");
        String cari = sc.nextLine();

        int index = Arrays.binarySearch(mhs, new Mahasiswa1(null, cari, 0), (m1, m2) -> m1.namaMahasiswa.compareTo(m2.namaMahasiswa));

        if (index >= 0) {
            System.out.println("Nama: " + mhs[index].namaMahasiswa);
            System.out.println("NIM: " + mhs[index].nim);
            System.out.println("IPK: " + mhs[index].ipk);
        } else {
            System.out.println("Data dengan nama '" + cari + "' tidak ditemukan");
        }
    }
}
