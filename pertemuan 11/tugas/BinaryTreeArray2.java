public class BinaryTreeArray2 {
    int[] data;
    int idxLast;

    public BinaryTreeArray2() {
        data = new int[10];
    }

    public void populateData(int[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            if (data[idxStart] != 0) {
                System.out.print(data[idxStart] + " ");
            }
            traverseInOrder(2 * idxStart + 2);
        }
    }

    public void add(int data, int idx) {
        this.data[idx] = data;
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != 0) {
                System.out.print(data[idxStart] + " ");
            } else {
                System.out.print(idxLast + " ");
            }
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    public void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            if (data[idxStart] != 0) {
                System.out.print(data[idxStart] + " ");
            } else {
                System.out.print(idxLast + " ");
            }
        }
    }
}