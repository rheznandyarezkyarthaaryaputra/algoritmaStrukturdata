package com.company;

public class Dll {
    private Node head;
    private int size;

    public Dll() {
        head = null;
        size = 0;
    }

    public void daftar(int nomorAntrian, String nama) {
        Node newNode = new Node(nomorAntrian, nama);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
        System.out.println("Data penerima vaksin berhasil ditambahkan");
    }

    public void hapus() {
        if (head == null) {
            System.out.println("Daftar penerima vaksin kosong");
        } else {
            head = head.getNext();
            size--;
            System.out.println("Data penerima vaksin pertama berhasil dihapus");
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("Daftar penerima vaksin kosong");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println("Nomor Antrian: " + current.getNomorAntrian() + ", Nama: " + current.getNama());
                current = current.getNext();
            }
        }
    }

    public int getSize() {
        return size;
    }
}
