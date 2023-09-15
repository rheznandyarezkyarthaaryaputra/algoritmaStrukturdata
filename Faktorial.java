import java.util.Scanner;

public class Faktorial {
    public int nilai;
 
    public int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }

    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * faktorialDC(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang akan dihitung faktorialnya: ");
        int jumlahAngka = scanner.nextInt();

        Faktorial[] faktorials = new Faktorial[jumlahAngka];

        for (int i = 0; i < jumlahAngka; i++) {
            faktorials[i] = new Faktorial();

            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            int nilai = scanner.nextInt();
            faktorials[i].nilai = nilai;
        }

        System.out.println("Hasil faktorial untuk nilai-nilai yang dimasukkan:");

        for (int i = 0; i < jumlahAngka; i++) {
            int resultBF = faktorials[i].faktorialBF(faktorials[i].nilai);
            int resultDC = faktorials[i].faktorialDC(faktorials[i].nilai);

            System.out.println("Brute Force Factorial of " + faktorials[i].nilai + " is: " + resultBF);
            System.out.println("Divide and Conquer Factorial of " + faktorials[i].nilai + " is: " + resultDC);
        }

        scanner.close();
    }
}
