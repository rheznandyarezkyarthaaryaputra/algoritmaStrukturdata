import java.util.HashMap;
import java.util.Map;

class Mahasiswa {
    private String NIM;
    private String namaLengkap;
    private String jurusan;
    private String programStudi;

    public Mahasiswa(String NIM, String namaLengkap, String jurusan, String programStudi) {
        this.NIM = NIM;
        this.namaLengkap = namaLengkap;
        this.jurusan = jurusan;
        this.programStudi = programStudi;
    }

    // Getters and toString method for printing
    public String getNIM() {
        return NIM;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    @Override
    public String toString() {
        return "NIM: " + NIM + ", Nama Lengkap: " + namaLengkap + ", Jurusan: " + jurusan + ", Program Studi: " + programStudi;
    }
}

class HashTable {
    private Map<String, Mahasiswa> map = new HashMap<>();

    public void tambahMahasiswa(Mahasiswa m) {
        map.put(m.getNIM(), m);
    }

    public Mahasiswa getMahasiswa(String NIM) {
        return map.get(NIM);
    }

    public void hapusMahasiswa(String NIM) {
        map.remove(NIM);
    }

    public void tampilkanNIM() {
        map.keySet().forEach(System.out::println);
    }
}


