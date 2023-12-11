import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitList {
    public static void main(String[] args) {
        // Langkah 1: Mencetak daftar buah
        System.out.println("Banana Orange Watermelon Lecy Snake Fruit");

        // Langkah 2: Menyimpan daftar buah dalam ArrayList
        List<String> fruits = new ArrayList<>();
        Collections.addAll(fruits, "Banana", "Orange", "Watermelon", "Lecy", "Snake Fruit");
        System.out.println(fruits);

        // Langkah 3: Membalikkan urutan daftar buah dan mencetaknya
        Collections.reverse(fruits);
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println(); // Untuk baris baru

        // Langkah 4: Mencetak 'Melon Durian' tiga kali
        for (int i = 0; i < 3; i++) {
            System.out.println("Melon Durian");
        }
    }
}
