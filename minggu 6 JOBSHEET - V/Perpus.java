
public class Perpus {
    private String nama;
    private int halaman;
    private float tinggi;

    public Perpus(String nm, int hlm, float tng) {
        nama = nm;
        halaman = hlm;
        tinggi = tng;
    }

    public void output() {
        System.out.println("Nama : " + nama);
        System.out.println("Halaman : " + halaman);
        System.out.println("Tinggi : " + tinggi);
    }

    // Tambahkan getter jika Anda ingin mengakses atribut privat dari luar kelas.
    public String getNama() {
        return nama;
    }

    public int getHalaman() {
        return halaman;
    }

    public float getTinggi() {
        return tinggi;
    }
}
