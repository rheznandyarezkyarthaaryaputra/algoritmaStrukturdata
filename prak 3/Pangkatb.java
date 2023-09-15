import java.util.Scanner;

public class Pangkatb {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        final int jumlahElemen = scanner.nextInt();

        Pangkat[] pangkats = new Pangkat[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + ": ");
            int nilai = scanner.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + ": ");
            int pemangkat = scanner.nextInt();

            pangkats[i] = new Pangkat(nilai, pemangkat);
        }

        System.out.println("Hasil Pangkat dengan Brute Force");

        for (int i = 0; i < jumlahElemen; i++) {
            long hasilBruteForce = pangkats[i].pangkatBruteForce();
            System.out.println("Nilai " + pangkats[i].nilai + " peringkat " + pangkats[i].pemangkat + " adalah: " + hasilBruteForce);
        }

        System.out.println("\nHasil Pangkat dengan Divide and Conquer");

        for (int i = 0; i < jumlahElemen; i++) {
            long hasilDivideConquer = pangkats[i].pangkatDivideConquer();
            System.out.println("Nilai " + pangkats[i].nilai + " pangkat " + pangkats[i].pemangkat + " adalah: " + hasilDivideConquer);
        }

        scanner.close();
    }

    public static class Pangkat {
        private final int nilai;
        private final long pemangkat;

        public Pangkat(int nilai, long pemangkat) {
            this.nilai = nilai;
            this.pemangkat = pemangkat;
        }

        public long pangkatBruteForce() {
            long hasil = 1;
            for (long i = 0; i < pemangkat; i++) {
                hasil *= nilai;
            }
            return hasil;
        }

        public long pangkatDivideConquer() {
            if (pemangkat == 0) {
                return 1;
            } else {
                long paruh = pangkatDivideConquer(nilai, pemangkat / 2);
                if ((pemangkat & 1) == 0) {
                    return paruh * paruh;
                } else {
                    return nilai * paruh * paruh;
                }
            }
        }
    }
}
