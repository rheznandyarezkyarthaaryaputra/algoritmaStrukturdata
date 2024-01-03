import java.util.Scanner;

public class Persegipanjang1{
    public int panjang;
    public int lebar;

    public static void main(String[] args) {
        Persegipanjang1[] ppArray = new Persegipanjang1[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            ppArray[i] = new Persegipanjang1();

            System.out.println("Persegi panjang ke-" + (i));
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();

            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" + (i));
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }
    }
}
