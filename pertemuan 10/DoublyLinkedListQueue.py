from Node import Node

class DoublyLinkedListQueue:
    def _init_(self):
        self.head = None
        self.tail = None

    def tambah_data(self, nomor_antrian, nama):
        new_node = Node(nomor_antrian, nama)
        if not self.head:
            self.head = new_node
            self.tail = new_node
        else:
            new_node.prev = self.tail
            self.tail.next = new_node
            self.tail = new_node

    def hapus_data(self):
        if not self.head:
            return None
        nama_selesai = self.head.nama
        self.head = self.head.next
        if self.head:
            self.head.prev = None
        return nama_selesai

    def daftar_penerima_vaksin(self):
        current = self.head
        if not current:
            print("Antrian kosong")
        else:
            print("Daftar Penerima Vaksin")
            print("| No.  | Nama   |")
            while current:
                print(f"| {current.nomor_antrian:<5} | {current.nama:<6} |")
                current = current.next