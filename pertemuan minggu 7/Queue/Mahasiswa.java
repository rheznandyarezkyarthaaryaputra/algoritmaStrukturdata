class Mahasiswa {
    String nim;
    String nama;
    int absen;
    double ipk;

    public Mahasiswa(String nim, String nama, int absen, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Absen: " + absen + ", IPK: " + ipk;
    }
}

class Queue {
    int max;
    int front;
    int rear;
    int size;
    Mahasiswa[] antrian;

    public Queue(int max) {
        this.max = max;
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.antrian = new Mahasiswa[max];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa mahasiswa) {
        if (!isFull()) {
            if (rear == max - 1) {
                rear = -1;
            }
            antrian[++rear] = mahasiswa;
            size++;
            System.out.println("Mahasiswa dengan NIM " + mahasiswa.nim + " telah masuk dalam antrian.");
        } else {
            System.out.println("Antrian sudah penuh. Mahasiswa tidak dapat masuk.");
        }
    }

    public Mahasiswa dequeue() {
        if (!isEmpty()) {
            Mahasiswa mahasiswa = antrian[front++];
            if (front == max) {
                front = 0;
            }
            size--;
            return mahasiswa;
        }
        return null;
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Daftar Mahasiswa dalam Antrian:");
            int current = front;
            for (int i = 0; i < size; i++) {
                System.out.println(antrian[current]);
                current = (current + 1) % max;
            }
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa paling depan dalam antrian:");
            System.out.println(antrian[front]);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa paling belakang dalam antrian:");
            System.out.println(antrian[rear]);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekPosition(String nim) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (antrian[(front + i) % max].nim.equals(nim)) {
                    System.out.println("Mahasiswa dengan NIM " + nim + " berada di posisi antrian ke-" + i);
                    return;
                }
            }
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan dalam antrian.");
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void printMahasiswa(int posisi) {
        if (!isEmpty() && posisi >= 0 && posisi < size) {
            System.out.println("Data Mahasiswa pada posisi antrian ke-" + posisi + ":");
            System.out.println(antrian[(front + posisi) % max]);
        } else {
            System.out.println("Posisi tidak valid atau antrian kosong.");
        }
    }
}


