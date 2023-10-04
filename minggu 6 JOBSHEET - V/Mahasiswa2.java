import java.util.Scanner;

class Mahasiswa2{
    String nama;
    int tahunMasuk;
    int umur;
    double ipk;

    public Mahasiswa2(String nama, int tahunMasuk, int umur, double ipk) {
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.umur = umur;
        this.ipk = ipk;
    }
}

class DaftarMahasiswa {
    private Mahasiswa[] data;
    private int n;

    public DaftarMahasiswa(int maxSize) {
        data = new Mahasiswa[maxSize];
        n = 0;
    }

    public void tambah(Mahasiswa m) {
        data[n] = m;
        n++;
    }

    public void bubbleSort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (data[j].ipk < data[j + 1].ipk) {
                    // Tukar data[j] dengan data[j + 1]
                    Mahasiswa temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public void tampil() {
        for (int i = 0; i < n; i++) {
            System.out.println("Nama: " + data[i].nama + ", Tahun Masuk: " + data[i].thnMasuk +
                               ", Umur: " + data[i].umur + ", IPK: " + data[i].ipk);
        }
    }
}
