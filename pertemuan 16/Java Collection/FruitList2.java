import java.util.Stack;
import java.util.Collections;

public class FruitList2 {
    public static void main(String[] args) {
        // Membuat sebuah Stack untuk menyimpan daftar buah
        Stack<String> fruits = new Stack<>();

        // Menambahkan elemen-elemen ke dalam Stack
        fruits.push("Banana");
        fruits.push("Orange");
        fruits.push("Watermelon");
        fruits.push("Lecy");
        fruits.push("Snake Fruit");

        // Menambahkan tiga buah baru
        fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");

        // Melakukan sorting (pengurutan)
        Collections.sort(fruits);

        // Mencetak isi Stack setelah penambahan dan sorting
        System.out.println("Isi Stack setelah penambahan dan sorting:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
