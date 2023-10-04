
public class ProsesPerpus {
    private Perpus[] array = new Perpus[4];
    private int id;

    public void tambah(Perpus d) {
        if (id < array.length) {
            array[id] = d;
            id++;
        } else {
            System.out.println("Data sudah Penuh");
        }
    }

    public void tampil() {
        for (Perpus d : array) {
            if (d != null) {
                d.output();
                System.out.println("------------------");
            }
        }
    }

    public void halaman() {
        for (int i = 0; i < id - 1; i++) {
            int max = i;
            for (int j = i + 1; j < id; j++) {
                if (array[j].getHalaman() > array[max].getHalaman()) {
                    max = j;
                }
            }
            Perpus tmp = array[max];
            array[max] = array[i];
            array[i] = tmp;
        }
    }

    public void tinggi() {
        for (int i = 0; i < id - 1; i++) {
            for (int j = 1; j < id - i; j++) {
                if (array[j].getTinggi() > array[j - 1].getTinggi()) {
                    Perpus tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
    }
}
