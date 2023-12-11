import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int indexOne, int indexTwo) {
        int temp = heap.get(indexOne);
        heap.set(indexOne, heap.get(indexTwo));
        heap.set(indexTwo, temp);
    }

    private void heapifyUp() {
        int index = heap.size() - 1;
        while (index > 0 && heap.get(parent(index)) > heap.get(index)) {
            swap(parent(index), index);
            index = parent(index);
        }
    }

    private void heapifyDown() {
        int index = 0;
        while (leftChild(index) < heap.size()) {
            int smallerChildIndex = leftChild(index);
            if (rightChild(index) < heap.size() && heap.get(rightChild(index)) < heap.get(smallerChildIndex)) {
                smallerChildIndex = rightChild(index);
            }

            if (heap.get(index) < heap.get(smallerChildIndex)) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }

    public void insert(int element) {
        heap.add(element);
        heapifyUp();
    }

    public int remove() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        int item = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        heapifyDown();
        return item;
    }
}
