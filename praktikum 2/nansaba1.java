public class nansaba1 {
    
        // ... (Implementasi kelas Nasabah seperti sebelumnya)
    
        public static void main(String[] args) {
            // Membuat array objek Nasabah
            Nasabah[] nasabahArray = new Nasabah[2];
    
            // Inisialisasi objek Nasabah dan tambahkan ke array
            nasabahArray[0] = new Nasabah(1, "John Doe", "Jl. Contoh", 123456789);
            nasabahArray[0].bukaRekening(1001);
    
            nasabahArray[1] = new Nasabah(2, "Jane Smith", "Jl. Contoh Lain", 987654321);
            nasabahArray[1].bukaRekening(1002);
    
            // Contoh penggunaan array objek Nasabah
            System.out.println("Nasabah 1 - Saldo: " + nasabahArray[0].lihatSaldo());  // Output: Nasabah 1 - Saldo: 0
            System.out.println("Nasabah 2 - Saldo: " + nasabahArray[1].lihatSaldo());  // Output: Nasabah 2 - Saldo: 0
    
            nasabahArray[0].menabung(1000);
            System.out.println("Nasabah 1 - Saldo setelah menabung: " + nasabahArray[0].lihatSaldo());  // Output: Nasabah 1 - Saldo setelah menabung: 1000
    
            nasabahArray[1].berhutang(500);
            System.out.println("Nasabah 2 - Info peminjaman: " + nasabahArray[1].berhutang(500));  // Output: Nasabah 2 - Info peminjaman: Pinjaman disetujui. Cicilan per bulan: 83.333336
        }
    }
    
