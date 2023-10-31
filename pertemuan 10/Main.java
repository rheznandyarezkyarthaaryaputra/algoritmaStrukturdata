public class Main {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static void main(String[] args) {
        // Membuat linked list kosong
        head = null;

        // Menambahkan node ke linked list
        addNode(40);

        // Menampilkan linked list
        System.out.println("Data awal pada Linked Lists adalah : " + getFirstData());
        System.out.println("Data akhir pada Linked Lists adalah : " + getLastData());
        System.out.println("Data indeks ke-1 pada Linked Lists adalah : " + getData(1));
        System.out.println();

        // Menambahkan node ke linked list
        addNode(40);

        // Menampilkan linked list
        System.out.println("Berhasil diisi");
        System.out.println("Size: " + getSize());
        System.out.println();

        // Menambahkan node ke linked list
        addNode(7);
        addNode(3);
        addNode(4);

        // Menampilkan linked list
        System.out.println("7 3 40 4");
        System.out.println("Berhasil diisi");
        System.out.println("Size: " + getSize());
        System.out.println();

        // Menambahkan node ke linked list
        addNode(7);
        addNode(40);
        addNode(3);
        addNode(40);
        addNode(4);

        // Menampilkan linked list
        System.out.println("7 40 3 40 4");
        System.out.println("Berhasil diisi");
        System.out.println("Size: " + getSize());
    }

    public static void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public static int getSize() {
        int size = 0;
        Node current = head;

        while (current != null) {
            size++;
            current = current.next;
        }

        return size;
    }

    public static int getFirstData() {
        if (head == null) {
            return -1;
        }

        return head.data;
    }

    public static int getLastData() {
        if (head == null) {
            return -1;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        return current.data;
    }

    public static int getData(int index) {
        if (head == null) {
            return -1;
        }

        Node current = head;
        int i = 0;

        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        if (current == null) {
            return -1;
        }

        return current.data;
    }
}
