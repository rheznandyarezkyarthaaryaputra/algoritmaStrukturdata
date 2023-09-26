import java.util.Scanner;

public class mainorderedsearch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah data: ");
        int n = sc.nextInt();

        double[] data = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = sc.nextDouble();
        }

        OrderedSearch os = new OrderedSearch(data);

        System.out.println("Isi elemen array:");
        os.tampilkan();

        double key = 3.12;
        int index = os.cari(key);

        if (index != -1) {
            System.out.println("Data " + key + " pada index " + index);
        } else {
            System.out.println("Data " + key + " tidak ditemukan");
        }
    }
}