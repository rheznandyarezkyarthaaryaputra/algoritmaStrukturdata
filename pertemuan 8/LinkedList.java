public class LinkedList {
    Node head;

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertBefore(String keyword, String newData) {
        Node newNode = new Node(newData);
        Node current = head;
        Node prev = null;

        // Traverse the linked list to find the keyword
        while (current != null && !current.data.equals(keyword)) {
            prev = current;
            current = current.next;
        }

        // If the keyword is not found, do nothing
        if (current == null) {
            System.out.println("Keyword not found in the list.");
            return;
        }

        // Update the pointers to insert the new node before the keyword
        newNode.next = current;
        if (prev == null) {
            // If the keyword is at the head, update the head
            head = newNode;
        } else {
            prev.next = newNode;
        }
    }

    // Other methods for displaying and manipulating the linked list

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node("Apple");
        list.head.next = new Node("Banana");
        list.head.next.next = new Node("Cherry");

        System.out.println("Original List:");
        list.displayList();

        list.insertBefore("Banana", "Grapes");

        System.out.println("\nList after inserting before 'Banana':");
        list.displayList();
    }
}