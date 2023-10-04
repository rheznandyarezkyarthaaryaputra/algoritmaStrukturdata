
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        Scanner str18 = new Scanner(System.in);
        daftaranggota data = new daftaranggota();
        int jum = 5;
        
        for (int i = 0; i < jum; i++) {
            System.out.println("Calon ke - " + (i + 1));
            System.out.print("Masukkan Nama : ");
            String nama = str18.nextLine();
            System.out.print("Masukkan Kelas : ");
            String kelas = str18.nextLine();
            System.out.print("Masukkan Tinggi : ");
            int tinggi = sc18.nextInt();
            
            anggota n = new anggota(nama, kelas, tinggi);
            data.tambah(n);
        }
        
        System.out.println("---------------");
        System.out.println("Data Calon Paskibraka : ");
        data.tampil();
        System.out.println("---------------");
        
        System.out.println("");
        System.out.println("Data dari Tertinggi ke terendah");
        data.selectionsort();
        data.tampil();
        System.out.println("");
    }
}
