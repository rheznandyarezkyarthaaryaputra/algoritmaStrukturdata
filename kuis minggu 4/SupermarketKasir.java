import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class SupermarketKasir {
    private ArrayList<ItemBelanja> daftarPembelian = new ArrayList<>();

    public void addItem(String namaItem, int jumlahItem, double hargaItem) {
        ItemBelanja item = new ItemBelanja(namaItem, jumlahItem, hargaItem);
        daftarPembelian.add(item);
    }

    public void deleteItem(String namaItem) {
        Iterator<ItemBelanja> iterator = daftarPembelian.iterator();
        while (iterator.hasNext()) {
            ItemBelanja item = iterator.next();
            if (item.getNama().equals(namaItem)) {
                iterator.remove();
            }
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (ItemBelanja item : daftarPembelian) {
            total += item.getJumlah() * item.getHarga();
        }
        return total;
    }

    public double total_price() {
        double totalBelanja = calculateTotal();
        double diskon = 0;

        if (totalBelanja > 500000) {
            diskon = 0.10; // Diskon 10% untuk total belanja di atas Rp 500.000
        } else if (totalBelanja > 300000) {
            diskon = 0.08; // Diskon 8% untuk total belanja di atas Rp 300.000
        } else if (totalBelanja > 200000) {
            diskon = 0.05; // Diskon 5% untuk total belanja di atas Rp 200.000
        }

        double totalSetelahDiskon = totalBelanja - (totalBelanja * diskon);
        return totalSetelahDiskon;
    }

    public void resetTransaction() {
        daftarPembelian.clear();
    }

    public void displayItems() {
        for (ItemBelanja item : daftarPembelian) {
            System.out.println("Nama: " + item.getNama() + ", Jumlah: " + item.getJumlah() + ", Harga: " + item.getHarga());
        }
    }

    public void check_order() {
        boolean isError = false;

        // Cek apakah ada item yang memiliki jumlah atau harga negatif
        for (ItemBelanja item : daftarPembelian) {
            if (item.getJumlah() <= 0 || item.getHarga() <= 0) {
                isError = true;
                break;
            }
        }

        // Tampilkan pesan berdasarkan hasil pemeriksaan
        if (!isError) {
            System.out.println("Pemesanan sudah benar");
        } else {
            System.out.println("Terdapat kesalahan input data");
        }

        // Tampilkan informasi tentang pesanan yang telah dibeli
        System.out.println("Daftar Pesanan:");
        for (ItemBelanja item : daftarPembelian) {
            System.out.println("Nama Item: " + item.getNama());
            System.out.println("Jumlah Item: " + item.getJumlah());
            System.out.println("Harga Item: Rp " + item.getHarga());
            System.out.println("Total Harga: Rp " + (item.getJumlah() * item.getHarga()));
        }
    }

    private class ItemBelanja {
        private String nama;
        private int jumlah;
        private double harga;

        public ItemBelanja(String nama, int jumlah, double harga) {
            this.nama = nama;
            this.jumlah = jumlah;
            this.harga = harga;
        }

        public String getNama() {
            return nama;
        }

        public int getJumlah() {
            return jumlah;
        }

        public double getHarga() {
            return harga;
        }
    }

    public static void main(String[] args) {
        SupermarketKasir kasir = new SupermarketKasir();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih tindakan:");
            System.out.println("1. Tambah item");
            System.out.println("2. Hapus item");
            System.out.println("3. Hitung total");
            System.out.println("4. Reset transaksi");
            System.out.println("5. Tampilkan item");
            System.out.println("6. Check Order");
            System.out.println("7. Keluar");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama item: ");
                    String namaItem = scanner.next();
                    System.out.print("Masukkan jumlah item: ");
                    int jumlahItem = scanner.nextInt();
                    System.out.print("Masukkan harga item: ");
                    double hargaItem = scanner.nextDouble();
                    kasir.addItem(namaItem, jumlahItem, hargaItem);
                    break;
                case 2:
                    System.out.print("Masukkan nama item yang ingin dihapus: ");
                    String namaItemHapus = scanner.next();
                    kasir.deleteItem(namaItemHapus);
                    break;
                case 3:
                    double totalBelanja = kasir.calculateTotal();
                    System.out.println("Total Belanja: Rp " + totalBelanja);
                    break;
                case 4:
                    kasir.resetTransaction();
                    System.out.println("Transaksi telah di-reset.");
                    break;
                case 5:
                    System.out.println("Daftar Item Belanjaan:");
                    kasir.displayItems();
                    break;
                case 6:
                    kasir.check_order();
                    break;
                case 7:
                    double totalSetelahDiskon = kasir.total_price();
                    System.out.println("Total Belanja setelah diskon: Rp " + totalSetelahDiskon);
                    System.out.println("Terima kasih! Program selesai.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}