public class LinkedList3 {
    public static void main(String[] args) {
        Node head = null;

        // Linked list kosong
        System.out.println("Linked list kosong");

        // Menambahkan node dengan data 890
        head = new Node(890);

        System.out.println("Isi Linked List: " + head.data);

        // Menambahkan node dengan data 760
        Node node2 = new Node(760);
        node2.next = head;
        head = node2;

        System.out.println("Isi Linked List: " + head.data);

        // Menambahkan node dengan data 700
        Node node3 = new Node(700);
        node3.next = head;
        head = node3;

        System.out.println("Isi Linked List: " + head.data);

        // Menambahkan node dengan data 999
        node2 = new Node(999);
        node2.next = head;
        head = node2;

        System.out.println("Isi Linked List: " + head.data);

        // Menambahkan node dengan data 833
        node3 = new Node(833);
        node3.next = head;
        head = node3;

        System.out.println("Isi Linked List: " + head.data);
    }

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
