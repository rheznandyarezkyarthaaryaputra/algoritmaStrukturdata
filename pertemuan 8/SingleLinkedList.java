class SingleLinkedList {

    private Node head;

    public SingleLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void insertAfter(int data, int key) {
        Node newNode = new Node(data);
        Node current = head;
        while (current != null) {
            if (current.getData() == key) {
                newNode.setNext(current.getNext());
                current.setNext(newNode);
                break;
            }
            current = current.getNext();
        }
    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
                if (current == null) {
                    System.out.println("Index is out of bound");
                    return;
                }
            }
            Node newNode = new Node(data);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }
}
