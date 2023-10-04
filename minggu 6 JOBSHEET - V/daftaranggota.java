
public class daftaranggota{
    private anggota list[] = new anggota[5];
    private int id;

    public void tambah(anggota n) {
        if (id < list.length) {
            list[id] = n;
            id++;
        } else {
            System.out.println("Data sudah Penuh");
        }
    }

    public void tampil() {
        for (anggota n : list) {
            if (n != null) { // Pastikan hanya menampilkan data yang ada (bukan null)
                n.tampil();
                System.out.println("------------------");
            }
        }
    }

    public void selectionSort() { // Ubah penulisan nama metode sesuai konvensi penamaan Java
        for (int i = 0; i < id - 1; i++) {
            int max = i;
            for (int j = i + 1; j < id; j++) {
                if (list[j].tinggi() > list[max].tinggi()) { 
                    max = j;
                }
            }
            anggota tmp = list[max];
            list[max] = list[i];
            list[i] = tmp;
        }
    }
}
