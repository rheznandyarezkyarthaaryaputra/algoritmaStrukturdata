import java.util.ArrayList;
import java.util.Scanner;

public class PencarianDataPenduduk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inisialisasi array list
        ArrayList<Penduduk> penduduk = new ArrayList<>();

        // Tambah data penduduk
        penduduk.add(new Penduduk("1234567890123456", "John Doe", "Jalan Sudirman No. 1", "Laki-laki"));
        penduduk.add(new Penduduk("9876543210987654", "Jane Doe", "Jalan Gatot Subroto No. 2", "Perempuan"));
        penduduk.add(new Penduduk("3456789012345678", "Peter Parker", "Jalan MH Thamrin No. 3", "Laki-laki"));
        penduduk.add(new Penduduk("7890123456789012", "Mary Jane Watson", "Jalan Jenderal Sudirman No. 4", "Perempuan"));

        // Minta input NIK yang akan dicari
        System.out.println("Masukkan NIK yang akan dicari: ");
        String nik = sc.nextLine();

        // Cari penduduk berdasarkan NIK
        Penduduk pendudukDitemukan = null;
        for (Penduduk pendudukItem : penduduk) {
            if (pendudukItem.getNik().equals(nik)) {
                pendudukDitemukan = pendudukItem;
                break;
            }
        }

        // Cetak hasil pencarian
        if (pendudukDitemukan != null) {
            System.out.println("Data penduduk ditemukan:");
            System.out.println("NIK: " + pendudukDitemukan.getNik());
            System.out.println("Nama: " + pendudukDitemukan.getNama());
            System.out.println("Alamat: " + pendudukDitemukan.getAlamat());
            System.out.println("Jenis kelamin: " + pendudukDitemukan.getJenisKelamin());
        } else {
            System.out.println("Data penduduk tidak ditemukan.");
        }
    }
}

class Penduduk {

    private String nik;
    private String nama;
    private String alamat;
    private String jenisKelamin;

    public Penduduk(String nik, String nama, String alamat, String jenisKelamin) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }
}
