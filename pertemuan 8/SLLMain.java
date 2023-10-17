public class SLLMain {

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(40);
        list.addLast(50);
        list.add(2, 60);

        list.print();
    }
}
