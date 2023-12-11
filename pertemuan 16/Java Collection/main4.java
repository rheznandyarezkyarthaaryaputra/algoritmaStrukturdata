import java.util.LinkedList;
import java.util.List;

public class main4 {
    public static void main(String[] args) {
        // LinkedList yang hanya akan menampung objek String
        List<String> names = new LinkedList<>();

        // Menambahkan elemen ke dalam LinkedList
        names.add("Cireng");
        names.add("My Kid");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");

        // Menampilkan menggunakan LinkedList
        System.out.println("Menggunakan LinkedList:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
