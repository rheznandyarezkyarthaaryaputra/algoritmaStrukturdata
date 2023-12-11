public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap();

        heap.insert(95);
        heap.insert(75);
        heap.insert(80);
        heap.insert(55);
        heap.insert(60);
        heap.insert(50);
        heap.insert(65);

        System.out.println("Initial Heap: " + heap.getHeap());

        int removed = heap.remove();
        System.out.println("Removed minimum value: " + removed);
        System.out.println("Heap after first removal: " + heap.getHeap());
    }
}
