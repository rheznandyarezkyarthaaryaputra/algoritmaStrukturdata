public class anggota {
    private String nama;
    private String kelas;
    private int tinggi;

    public anggota(String nama, String kelas, int tinggi) {
        this.nama = nama;
        this.kelas = kelas;
        this.tinggi = tinggi;
    }

    public void tampil() {
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("Tinggi : " + tinggi);
    }
}
