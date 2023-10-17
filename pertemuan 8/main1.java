import java.util.LinkedList;

public class main1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Linked list kosong");

        linkedList.add(890);
        System.out.println("Isi Linked List: " + linkedList);

        linkedList.add(760);
        System.out.println("Isi Linked List: " + linkedList);

        linkedList.addFirst(700);
        System.out.println("Isi Linked List: " + linkedList);

        linkedList.add(1, 999);
        System.out.println("Isi Linked List: " + linkedList);

        linkedList.add(833);
        System.out.println("Isi Linked List: " + linkedList);

        linkedList.removeFirst();
        System.out.println("Isi Linked List: " + linkedList);
    }
}