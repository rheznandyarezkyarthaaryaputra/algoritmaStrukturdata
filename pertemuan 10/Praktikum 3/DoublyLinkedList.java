public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (this.isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }

        this.size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (this.isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }

        this.size++;
    }

    public void add(int data, int index) throws Exception {
        if (this.isEmpty() || index >= this.size) {
            throw new Exception("Nilai indeks di luar batas.");
        }

        if (index == 0) {
            this.addFirst(data);
        } else if (index == this.size - 1) {
            this.addLast(data);
        } else {
            Node newNode = new Node(data);
            Node tmp = this.head;

            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }

            newNode.next = tmp.next;
            newNode.prev = tmp;
            tmp.next.prev = newNode;
            tmp.next = newNode;

            this.size++;
        }
    }

    public int getFirst() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Linked List kosong");
        }

        return this.head.data;
    }

    public int getLast() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Linked List kosong");
        }

        return this.tail.data;
    }

    public int get(int index) throws Exception {
        if (this.isEmpty() || index >= this.size) {
            throw new Exception("Nilai indeks di luar batas.");
        }

        Node tmp = this.head;

        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }

        return tmp.data;
    }

    public void print() {
        Node tmp = this.head;

        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }

        System.out.println();
    }

    private static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}