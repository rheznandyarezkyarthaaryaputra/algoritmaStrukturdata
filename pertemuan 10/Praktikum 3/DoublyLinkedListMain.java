public class DoublyLinkedListMain {
    public static void main(String[] args) throws Exception {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Mencetak linked list kosong
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");

        // Menambahkan node ke linked list
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);

        // Mencetak linked list
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");

        // Menambahkan node ke linked list
        dll.add(40, 1);

        // Mencetak linked list
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");

        // Mendapatkan data awal, akhir, dan indeks ke-1 pada linked list
        System.out.println("Data awal pada Linked Lists adalah : " + dll.getFirst());
        System.out.println("Data akhir pada Linked Lists adalah : " + dll.getLast());
        System.out.println("Data indeks ke-1 pada Linked Lists adalah : " + dll.get(1));
    }
}
