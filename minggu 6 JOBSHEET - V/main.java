
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Tahun Masuk: ");
            int thnMasuk = input.nextInt();
            System.out.print("Umur: ");
            int umur = input.nextInt();
            System.out.print("IPK: ");
            double ipk = input.nextDouble();

            // Membersihkan newline character setelah input IPK
            input.nextLine();

            Mahasiswa m = new Mahasiswa(nama, thnMasuk, umur, ipk);
            data.tambah(m);
        }

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan IPK:");
        data.bubbleSort();
        data.tampil();
    }
}
