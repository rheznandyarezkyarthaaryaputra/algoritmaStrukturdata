import java.util.LinkedList;

public class soal1 {

    public static void main(String[] args) {
        // Inisialisasi linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Cetak ukuran linked list
        System.out.println("Linked Lists Kosong");
        System.out.println("Size : " + linkedList.size());

        // Tambahkan elemen ke linked list
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(40);

        // Cetak ukuran linked list
        System.out.println("Berhasil diisi");
        System.out.println("Size : " + linkedList.size());

        // Cetak elemen linked list
        for (Integer element : linkedList) {
            System.out.println(element);
        }

        // Cetak ukuran linked list
        System.out.println("Linked Lists Kosong");
        System.out.println("Size : " + linkedList.size());
    }
    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }
}
