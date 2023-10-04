import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        daftaranggota data = new daftaranggota();
        int jummhs = 5;

        for (int i = 0; i < jummhs; i++) {
            System.out.println("Mahasiswa ke - " + (i + 1));
            System.out.print("Nama : ");
            String nama = input.nextLine();
            System.out.print("Tahun Masuk : ");
            int tahunMasuk = input.nextInt();
            System.out.print("Umur : ");
            int umur = input.nextInt();
            System.out.print("IPK : ");
            double ipk = input.nextDouble();

            Mahasiswa m = new Mahasiswa(nama, tahunMasuk, umur, ipk);
            data.tambah(m);
            input.nextLine(); // Membersihkan newline character setelah input IPK
        }

        System.out.println("---------------");
        System.out.println("Data Mahasiswa sebelum sorting:");
        data.tampil();
        System.out.println("Data Mahasiswa sesudah sorting berdasarkan IPK :");
        data.bubbleSort();
        data.tampil();
        System.out.println("Data Mahasiswa sesudah selection sort berdasarkan IPK : ");
        data.selectionSort();
        data.tampil();
    }
}
