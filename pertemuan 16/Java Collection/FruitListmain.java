import java.util.Stack;

public class FruitListmain{
    public static void main(String[] args) {
        // Membuat sebuah Stack untuk menyimpan daftar buah
        Stack<String> fruits = new Stack<>();

        // Menambahkan elemen-elemen ke dalam Stack
        fruits.push("Banana");
        fruits.push("Orange");
        fruits.push("Watermelon");
        fruits.push("Lecy");
        fruits.push("Snake Fruit");

        // Mengganti elemen terakhir dengan "Strawberry"
        fruits.pop(); // Menghapus elemen terakhir ("Snake Fruit")
        fruits.push("Strawberry"); // Menambahkan "Strawberry" sebagai elemen terbaru

        // Mencetak isi Stack
        System.out.println("Isi Stack setelah penggantian elemen terakhir:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
