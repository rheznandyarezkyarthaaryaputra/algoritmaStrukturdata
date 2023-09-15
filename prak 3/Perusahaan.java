import java.util.Scanner;

public class Perusahaan {

    private String nama;
    private int jumlahBulan;
    private double[] keuntunganBulan;

    public Perusahaan(String nama, int jumlahBulan, double[] keuntunganBulan) {
        this.nama = nama;
        this.jumlahBulan = jumlahBulan;
        this.keuntunganBulan = keuntunganBulan;
    }

    public double getTotalKeuntungan() {
        double totalKeuntungan = 0;
        for (double keuntungan : keuntunganBulan) {
            totalKeuntungan += keuntungan;
        }
        return totalKeuntungan;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca data perusahaan
        System.out.println("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = scanner.nextInt();

        // Membuat array untuk menyimpan objek perusahaan
        Perusahaan[] perusahaan = new Perusahaan[jumlahPerusahaan];

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Masukkan data perusahaan ke-" + (i + 1) + ":");

            System.out.print("Nama perusahaan: ");
            String namaPerusahaan = scanner.next();

            System.out.print("Jumlah bulan: ");
            int jumlahBulan = scanner.nextInt();

            // Membaca keuntungan bulanan
            double[] keuntunganBulan = new double[jumlahBulan];
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("Keuntungan bulan ke-" + (j + 1) + ": ");
                keuntunganBulan[j] = scanner.nextDouble();
            }

            perusahaan[i] = new Perusahaan(namaPerusahaan, jumlahBulan, keuntunganBulan);
        }

        // Menghitung total keuntungan perusahaan
        for (Perusahaan p : perusahaan) {
            System.out.println("Total keuntungan perusahaan " + p.nama + " adalah = " + p.getTotalKeuntungan() + " juta");
        }

        scanner.close();
    }
}
