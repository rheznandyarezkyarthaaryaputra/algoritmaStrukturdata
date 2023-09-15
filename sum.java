import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan: ");
        int jumlahBulan = scanner.nextInt();

        double[] keuntunganBulan = new double[jumlahBulan];

        for (int i = 0; i < jumlahBulan; i++) {
            System.out.print("Masukkan untung bulan ke-" + (i + 1) + ": ");
            keuntunganBulan[i] = scanner.nextDouble();
        }

        // Algoritma Brute Force
        double totalKeuntunganBruteForce = 0;
        for (int i = 0; i < jumlahBulan; i++) {
            totalKeuntunganBruteForce += keuntunganBulan[i];
        }

        // Algoritma Divide Conquer
        double totalKeuntunganDivideConquer = hitungTotalDivideConquer(keuntunganBulan, 0, jumlahBulan - 1);

        System.out.println("\nAlgoritma Brute Force");

        for (int i = 0; i < jumlahBulan; i++) {
            System.out.println("ke-" + (i + 1) + "=" + keuntunganBulan[i]);
        }

        System.out.println("Total keuntungan perusahaan selama " + jumlahBulan + " bulan adalah = " + totalKeuntunganBruteForce);

        System.out.println("\nAlgoritma Divide Conquer");

        for (int i = 0; i < jumlahBulan; i++) {
            System.out.println("ke-" + (i + 1) + "=" + keuntunganBulan[i]);
        }

        System.out.println("Total keuntungan perusahaan selama " + jumlahBulan + " bulan adalah = " + totalKeuntunganDivideConquer);

        scanner.close();
    }

    // Metode Divide Conquer untuk menghitung total keuntungan
    public static double hitungTotalDivideConquer(double[] keuntungan, int start, int end) {
        if (start == end) {
            return keuntungan[start];
        } else {
            int mid = (start + end) / 2;
            double leftTotal = hitungTotalDivideConquer(keuntungan, start, mid);
            double rightTotal = hitungTotalDivideConquer(keuntungan, mid + 1, end);
            return leftTotal + rightTotal;
        }
    }
}
