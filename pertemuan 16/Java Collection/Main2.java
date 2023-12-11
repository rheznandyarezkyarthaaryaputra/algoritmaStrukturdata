import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        // List ini sekarang adalah LinkedList yang hanya akan menampung objek String
        List<String> names = new LinkedList<>();

        // Menambahkan elemen ke dalam list
        names.add("Cireng");
        names.add("My Kid");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");

        // Iterasi dan cetak semua nama
        for (String name : names) {
            System.out.println(name);
        }
    }
}
