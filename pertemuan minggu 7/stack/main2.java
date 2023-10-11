import java.util.Stack;

public class main2 {
    public static void main(String[] args) {
        // Inisialisasi stack
        Stack<Integer> stack = new Stack<>();

        // Masukkan angka 13, 27, dan 15 ke dalam stack
        stack.push(13);
        stack.push(27);
        stack.push(15);

        // Menambahkan angka 18 ke dalam stack
        stack.push(18);

        // Menambahkan angka 40 ke dalam stack
        stack.push(40);

        // Cetak isi stack
        System.out.println("Isi stack:");
        for (Integer item : stack) {
            System.out.println(item);
        }
    }
}
