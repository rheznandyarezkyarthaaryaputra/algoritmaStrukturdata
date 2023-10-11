import java.util.Stack;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan kalimat
        System.out.print("Masukkan kalimat: ");
        String input = scanner.nextLine();

        String reversedSentence = reverseSentence(input);

        // Menampilkan kalimat dengan urutan karakter terbalik
        System.out.println("Hasil:");
        System.out.println(reversedSentence);

        scanner.close();
    }

    public static String reverseSentence(String sentence) {
        Stack<Character> stack = new Stack<>();

        // Memasukkan karakter-karakter dalam kalimat ke dalam stack
        for (int i = 0; i < sentence.length(); i++) {
            char character = sentence.charAt(i);
            stack.push(character);
        }

        // Membangun kembali kalimat dengan urutan karakter terbalik
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
