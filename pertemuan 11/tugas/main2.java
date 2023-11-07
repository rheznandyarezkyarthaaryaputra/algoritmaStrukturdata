

public class main2 {
    public static void main(String[] args) {
        BinaryTreeArray2 tree = new BinaryTreeArray2();
        int[] inputData = {1, 2, 3, 4, 5, 6, 0, 8, 9, 10};
        int lastIndex = inputData.length - 1;
        tree.populateData(inputData, lastIndex);

        System.out.println("In-order traversal: ");
        tree.traverseInOrder(0);
        System.out.println("\nPre-order traversal: ");
        tree.traversePreOrder(0);
        System.out.println("\nPost-order traversal: ");
        tree.traversePostOrder(0);
    }
}
