public class Customer2 {
    private int nomorAntrian;
    private String namaCustomer;
    private String nomorHp;
    private double pendapatan;

    public Customer2(int nomorAntrian, String namaCustomer, String nomorHp) {
        this.nomorAntrian = nomorAntrian;
        this.namaCustomer = namaCustomer;
        this.nomorHp = nomorHp;
        this.pendapatan = 50000; 
    }

    // Getter untuk atribut pendapatan
    public double getPendapatan() {
        return pendapatan;
    }

    // Metode untuk menambahkan pendapatan
    public void tambahPendapatan(double jumlah) {
        pendapatan += jumlah;
    }

    // Getter untuk atribut nomor antrian
    public int getNomorAntrian() {
        return nomorAntrian;
    }

    // Getter untuk atribut nama customer
    public String getNamaCustomer() {
        return namaCustomer;
    }

    // Getter untuk atribut nomor hp
    public String getNomorHp() {
        return nomorHp;
    }
}
