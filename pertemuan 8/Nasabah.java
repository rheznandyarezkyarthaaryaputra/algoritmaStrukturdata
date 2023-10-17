public class Nasabah {
    private String nama;
    private String alamat;
    private String noRekening;

    public Nasabah(String nama, String alamat, String noRekening) {
        this.nama = nama;
        this.alamat = alamat;
        this.noRekening = noRekening;
    }

    @Override
    public String toString() {
        return "Nasabah {nama = " + nama + ", alamat = " + alamat + ", noRekening = " + noRekening + "}";
    }
}
