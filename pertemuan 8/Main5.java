import java.util.LinkedList;

public class Main5{
    public static void main(String[] args) {
        LinkedList<Nasabah> queue = new LinkedList<>();

        // Menambahkan nasabah ke dalam antrian
        queue.add(new Nasabah("John Doe", "Jl. Merdeka No. 1", "1234567890"));
        queue.add(new Nasabah("Jane Doe", "Jl. Pancasila No. 2", "9876543210"));

        // Mengambil nasabah dari antrian
        Nasabah nasabah = queue.poll();
        System.out.println(nasabah);

        // Mencetak seluruh isi antrian
        System.out.println(queue);
    }
}
