import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Customer2> antrian = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int pilihan = 0;

        while (pilihan != 6) {
            System.out.println("Menu");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan pesanan by nama");
            System.out.println("5. Hitung total Pendapatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih (1-6): ");

            try {
                pilihan = scanner.nextInt();
            } catch (Exception e) {
                scanner.next(); // Membersihkan input yang salah
                System.out.println("Masukkan angka dari 1 hingga 6.");
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Data Pembeli");
                    System.out.print("Nomor Antrian: ");
                    int nomorAntrian = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan newline
                    System.out.print("Nama Customer: ");
                    String namaCustomer = scanner.nextLine();
                    System.out.print("Nomor Hp: ");
                    String nomorHp = scanner.nextLine();
                    Customer2 customer = new Customer2(nomorAntrian, namaCustomer, nomorHp);
                    antrian.add(customer);
                    System.out.println("Customer ditambahkan ke antrian.");
                    break;

                case 2:
                    System.out.println("Antrian saat ini:");
                    for (Customer2 c : antrian) {
                        System.out.println("Nomor Antrian: " + c.getNomorAntrian());
                        System.out.println("Nama: " + c.getNamaCustomer());
                        System.out.println("Nomor Hp: " + c.getNomorHp());
                        System.out.println();
                    }
                    break;

                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        antrian.remove(0);
                        System.out.println("Antrian pertama dihapus.");
                    }
                    break;

                case 4:
                    if (!antrian.isEmpty()) {
                        Collections.sort(antrian, (c1, c2) -> c1.getNamaCustomer().compareTo(c2.getNamaCustomer()));
                        System.out.println("Laporan Pengurutan pesanan by nama:");
                        for (Customer2 c : antrian) {
                            System.out.println("Nomor Antrian: " + c.getNomorAntrian());
                            System.out.println("Nama: " + c.getNamaCustomer());
                            System.out.println("Nomor Hp: " + c.getNomorHp());
                            System.out.println();
                        }
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;

                case 5:
                    double totalPendapatan = 0;
                    for (Customer2 c : antrian) {
                        totalPendapatan += c.getPendapatan();
                    }
                    System.out.println("Total Pendapatan: " + totalPendapatan);
                    break;

                case 6:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih (1-6).");
                    break;
            }
        }
    }
}
