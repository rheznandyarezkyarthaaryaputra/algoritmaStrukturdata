class BinaryTree1 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    Node root;

    public BinaryTree1() {
        root = null;
    }

    // Metode untuk menambahkan node secara rekursif
    public void insert(int data) {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    // Metode untuk menampilkan nilai terkecil dalam pohon
    public int findSmallestValue() {
        if (root == null) {
            throw new IllegalStateException("Pohon kosong");
        }

        Node current = root;
        while (current.left != null) {
            current = current.left;
        }

        return current.data;
    }

    // Metode untuk menampilkan nilai terbesar dalam pohon
    public int findLargestValue() {
        if (root == null) {
            throw new IllegalStateException("Pohon kosong");
        }

        Node current = root;
        while (current.right != null) {
            current = current.right;
        }

        return current.data;
    }
}