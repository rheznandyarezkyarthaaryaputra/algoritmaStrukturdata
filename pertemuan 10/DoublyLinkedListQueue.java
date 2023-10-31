public class DoublyLinkedListQueue {
    private Node head;
    private Node tail;

    public DoublyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void tambahData(int nomorAntrian, String nama) {
        Node newNode = new Node(nomorAntrian, nama);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public String hapusData() {
        if (head == null) {
            return null;
        }
        String namaSelesai = head.nama;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        return namaSelesai;
    }

    public void daftarPenerimaVaksin() {
        Node current = head;
        if (current == null) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Daftar Penerima Vaksin");
            System.out.println("| No.  | Nama   |");
            while (current != null) {
                System.out.printf("| %-5d | %-6s |\n", current.nomorAntrian, current.nama);
                current = current.next;
            }
        }
    }
}