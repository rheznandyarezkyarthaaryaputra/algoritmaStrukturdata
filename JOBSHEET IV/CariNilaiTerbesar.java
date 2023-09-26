import java.util.Arrays;

public class CariNilaiTerbesar {

    public static void main(String[] args) {
        int[] data = { 12, 15, 6, 3, 70, 51, 83, 15, 3, 83 };

        // Cari nilai terbesar
        int nilaiTerbesar = Arrays.stream(data).max().getAsInt();

        // Cari posisi nilai terbesar
        int[] posisiNilaiTerbesar = new int[2];
        int posisi = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == nilaiTerbesar) {
                posisiNilaiTerbesar[posisi] = i;
                posisi++;
            }
        }

        // Cetak hasil
        System.out.println("Nilai terbesar: " + nilaiTerbesar);
        System.out.println("Posisi nilai terbesar: ");
        for (int i = 0; i < posisiNilaiTerbesar.length; i++) {
            System.out.print(posisiNilaiTerbesar[i] + " ");
        }
    }
}
