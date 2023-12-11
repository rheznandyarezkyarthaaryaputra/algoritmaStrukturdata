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

        System.out.println(heap.getHeap()); // Expected: [95, 75, 80, 55, 60, 50, 65]

        heap.remove(); // Removes the maximum value, 95

        System.out.println(heap.getHeap()); // Expected after first remove: [80, 75, 65, 55, 60, 50]

        heap.remove(); // Removes the next maximum value, 80

        System.out.println(heap.getHeap()); // Expected after second remove: [75, 60, 65, 55, 50]
    }
}