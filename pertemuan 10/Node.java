public class Node {
    public int nomorAntrian;
    public String nama;
    public Node next;
    public Node prev;

    public Node(int nomorAntrian, String nama) {
        this.nomorAntrian = nomorAntrian;
        this.nama = nama;
        this.next = null;
        this.prev = null;
    }
}