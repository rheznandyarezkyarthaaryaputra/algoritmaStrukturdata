import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Linked list kosong
        System.out.println("Linked list kosong");

        // Isi Linked List: 890
        linkedList.add(890);
        System.out.println("Isi Linked List: " + linkedList);

        // Isi Linked List: 890 760
        linkedList.add(760);
        System.out.println("Isi Linked List: " + linkedList);

        // Isi Linked List: 700 890 760
        linkedList.addFirst(700);
        System.out.println("Isi Linked List: " + linkedList);

        // Isi Linked List: 700 890 760
        System.out.println("Isi Linked List: " + linkedList);

        // Isi Linked List: 700 999 890 833 760
        linkedList.add(1, 999);
        linkedList.add(3, 833);
        System.out.println("Isi Linked List: " + linkedList);

        // Data pada indeks ke-1=-999
        int dataAtIndex1 = linkedList.get(1);
        System.out.println("Data pada indeks ke-1= " + dataAtIndex1);

        // Data 3 berada pada indeks ke -4
        int indexofData3 = linkedList.indexOf(3);
        System.out.println("Data 3 berada pada indeks ke-" + indexofData3);

        // Isi Linked List: 700 890 833 760
        linkedList.remove(1);
        System.out.println("Isi Linked List: " + linkedList);

        // Isi Linked List: 890 833 760
        linkedList.removeFirst();
        System.out.println("Isi Linked List: " + linkedList);

        // Isi Linked List: Isi Linked List: 833 760 833
        linkedList.removeLast();
        System.out.println("Isi Linked List: " + linkedList);

        // isi linked list :833
        linkedList.clear();
        linkedList.add(833);
        System.out.println("Isi Linked List: " + linkedList);
    }
}