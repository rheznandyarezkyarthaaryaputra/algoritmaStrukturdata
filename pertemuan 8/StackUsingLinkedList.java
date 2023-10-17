public class StackUsingLinkedList {
    Node top;

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(String data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        if (top == null) {
            return null;
        }
        String data = top.data;
        top = top.next;
        return data;
    }

    public void displayStack() {
        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push("Statistika");
        stack.push("Algoritma");
        stack.push("Matematika");
        stack.push("Multimedia");
        stack.push("Basis Data");
        stack.push("Komputer");
        stack.push("Android");
        stack.push("Multimedia");
        stack.push("Bahasa");
        stack.push("Statistika");

        stack.displayStack();
    }
}