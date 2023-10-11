import java.util.Stack;

class StrukBelanja {
    String nomorTransaksi;
    String tanggalPembelian;
    int jumlahBarang;
    double totalHarga;

    public StrukBelanja(String nomorTransaksi, String tanggalPembelian, int jumlahBarang, double totalHarga) {
        this.nomorTransaksi = nomorTransaksi;
        this.tanggalPembelian = tanggalPembelian;
        this.jumlahBarang = jumlahBarang;
        this.totalHarga = totalHarga;
    }

    @Override
    public String toString() {
        return "Nomor Transaksi: " + nomorTransaksi +
                ", Tanggal Pembelian: " + tanggalPembelian +
                ", Jumlah Barang: " + jumlahBarang +
                ", Total Harga: " + totalHarga;
    }
}

public class StrukBelanjaDewi {
    public static void main(String[] args) {
        Stack<StrukBelanja> strukBelanjaStack = new Stack<>();

        // Menambahkan delapan struk belanja ke dalam stack
        strukBelanjaStack.push(new StrukBelanja("123", "2023-01-05", 3, 150.0));
        strukBelanjaStack.push(new StrukBelanja("124", "2023-01-12", 2, 80.0));
        strukBelanjaStack.push(new StrukBelanja("125", "2023-01-19", 4, 200.0));
        strukBelanjaStack.push(new StrukBelanja("126", "2023-01-26", 1, 50.0));
        strukBelanjaStack.push(new StrukBelanja("127", "2023-02-02", 2, 90.0));
        strukBelanjaStack.push(new StrukBelanja("128", "2023-02-09", 3, 120.0));
        strukBelanjaStack.push(new StrukBelanja("129", "2023-02-16", 5, 250.0));
        strukBelanjaStack.push(new StrukBelanja("130", "2023-02-23", 2, 100.0));

        // Mengambil lima struk belanja untuk ditukarkan dengan voucher
        System.out.println("Struk belanja yang akan ditukarkan:");
        for (int i = 0; i < 5; i++) {
            if (!strukBelanjaStack.isEmpty()) {
                StrukBelanja struk = strukBelanjaStack.pop();
                System.out.println(struk);
            } else {
                System.out.println("Tidak ada struk belanja yang tersisa.");
                break;
            }
        }
    }
}
