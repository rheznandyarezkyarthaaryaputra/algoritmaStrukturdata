import java.util.Scanner;

public class PemilihanKetua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pemilih: ");
        int jumlahPemilih = input.nextInt();

        System.out.print("Masukkan jumlah kandidat: ");
        int jumlahKandidat = input.nextInt();

        int[] hasilPemilihan = new int[jumlahKandidat];

        for (int i = 0; i < jumlahKandidat; i++) {
            System.out.print("Masukkan jumlah suara untuk kandidat ke-" + (i + 1) + ": ");
            hasilPemilihan[i] = input.nextInt();
        }

        int kandidatMayoritas = cariMayoritas(hasilPemilihan);

        if (kandidatMayoritas != -1) {
            System.out.println("Kandidat ke-" + (kandidatMayoritas + 1) + " adalah elemen mayoritas dengan " + hasilPemilihan[kandidatMayoritas] + " suara.");
        } else {
            System.out.println("Tidak ada elemen mayoritas.");
        }
    }

    public static int cariMayoritas(int[] arr) {
        int n = arr.length;
        int kandidat = -1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                kandidat = arr[i];
                count = 1;
            } else if (arr[i] == kandidat) {
                count++;
            } else {
                count--;
            }
        }

        int kandidatCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == kandidat) {
                kandidatCount++;
            }
        }
        if (kandidatCount > n / 2) {
            return kandidat;
        }

        return -1;
    }
}
