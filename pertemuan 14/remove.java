public boolean remove(String key) {
    int hash = getHash(key); // Asumsikan getHash() adalah metode yang menghitung indeks hash dari kunci
    Node current = this.dataMap[hash];

    // Jika tidak ada node di indeks tersebut
    if (current == null) {
        return false;
    }

    // Jika node pertama adalah node yang ingin dihapus
    if (current.key.equals(key)) {
        this.dataMap[hash] = current.next;
        return true;
    }

    // Iterasi melalui linked list untuk mencari node dengan kunci yang sesuai
    while (current.next != null) {
        // Jika node selanjutnya adalah yang ingin dihapus
        if (current.next.key.equals(key)) {
            current.next = current.next.next; // Lepaskan node dari linked list
            return true;
        }
        current = current.next;
    }

    // Kunci tidak ditemukan
    return false;
}
