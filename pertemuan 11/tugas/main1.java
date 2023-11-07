public class main1 {
    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Nilai terkecil: " + tree.findSmallestValue());
        System.out.println("Nilai terbesar: " + tree.findLargestValue());
    }
}
