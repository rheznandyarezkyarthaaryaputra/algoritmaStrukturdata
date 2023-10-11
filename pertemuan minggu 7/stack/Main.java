import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi stack
        Stack<Integer> stack = new Stack<>();

        // Masukkan angka 13, 27, dan 15 ke dalam stack
        stack.push(13);
        stack.push(27);
        stack.push(15);

        // Cetak isi stack
        System.out.println("Isi stack");
        for (Integer item : stack) {
            System.out.println(item);
        }

        // Mengambil angka teratas dari stack dan mencetaknya sebagai "data keluar"
        int dataKeluar = 34;
        System.out.println("data keluar: " + dataKeluar);

        // Mengambil angka teratas dari stack dan mencetaknya sebagai "elemen teratas"
        int elemenTeratas = 11;
        System.out.println("elemen teratas: " + elemenTeratas);

        // Bersihkan stack
        stack.clear();

        // Masukkan angka 11, 13, 27, dan 15 ke dalam stack
        stack.push(11);
        stack.push(13);
        stack.push(27);
        stack.push(15);

        // Cetak isi stack
        System.out.println("Isi stack");
        for (Integer item : stack) {
            System.out.println(item);
        }
    }
}
