public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        System.out.println("Pre-order traversal:");
        bt.traversePreOrder(bt.root);
        System.out.println();

        System.out.println("In-order traversal:");
        bt.traverseInOrder(bt.root);
        System.out.println();

        System.out.println("Post-order traversal:");
        bt.traversePostOrder(bt.root);
        System.out.println();

        System.out.println("Find 5: " + bt.find(5));

        System.out.println("Delete 8:");
        bt.delete(8);

        System.out.println("Pre-order traversal after deletion:");
        bt.traversePreOrder(bt.root);
        System.out.println();
    }
}