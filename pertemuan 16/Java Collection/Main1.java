import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        // List ini hanya akan menampung objek String
        List<String> names = new ArrayList<String>();

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
