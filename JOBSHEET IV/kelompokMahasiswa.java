import java.util.*;

public class kelompokMahasiswa {
    public static void main(String[] args) {
        Map<Integer, List<String>> kelompokMahasiswa = new HashMap<>();
        
        // Mengisi daftar kelompok dengan nama-nama mahasiswa
        kelompokMahasiswa.put(1, Arrays.asList("Alfi", "Safira", "Tiara", "Arif", "Erdi"));
        kelompokMahasiswa.put(2, Arrays.asList("Yudha", "Nisa", "Yulia", "Fauzan", "Dwi"));
        kelompokMahasiswa.put(3, Arrays.asList("Dewa", "Ana", "Abdul", "Dani", "Ammar"));

        // Meminta nama mahasiswa yang dicari
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa yang dicari: ");
        String namaDicari = scanner.nextLine();

        // Mencari nama mahasiswa dan menampilkan hasilnya
        boolean ditemukan = false;
        for (Map.Entry<Integer, List<String>> entry : kelompokMahasiswa.entrySet()) {
            int kelompok = entry.getKey();
            List<String> mahasiswa = entry.getValue();

            int urutan = mahasiswa.indexOf(namaDicari);
            if (urutan != -1) {
                System.out.println("Mahasiswa bernama " + namaDicari + " berada pada kelompok ke-" + kelompok + " dan urutan ke-" + (urutan + 1) + " dalam kelompok.");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Mahasiswa dengan nama " + namaDicari + " tidak ditemukan dalam daftar kelompok.");
        }
    }
}