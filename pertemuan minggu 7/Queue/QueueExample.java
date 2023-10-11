import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan kapasitas queue: ");
        int capacity = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        
        while (true) {
            System.out.println("Masukkan operasi yang diinginkan:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Clear");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    if (queue.size() < capacity) {
                        System.out.print("Masukkan data baru: ");
                        int data = scanner.nextInt();
                        queue.add(data);
                        System.out.println("Data " + data + " telah ditambahkan ke dalam queue.");
                    } else {
                        System.out.println("Queue penuh. Tidak dapat menambahkan data baru.");
                    }
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        int removedData = queue.poll();
                        System.out.println("Data " + removedData + " telah dihapus dari queue.");
                    } else {
                        System.out.println("Queue kosong. Tidak ada data yang dapat dihapus.");
                    }
                    break;
                case 3:
                    System.out.println("Isi queue saat ini: " + queue);
                    break;
                case 4:
                    if (!queue.isEmpty()) {
                        int front = queue.peek();
                        System.out.println("Elemen terdepan: " + front);
                    } else {
                        System.out.println("Queue kosong. Tidak ada elemen terdepan.");
                    }
                    break;
                case 5:
                    queue.clear();
                    System.out.println("Queue telah dikosongkan.");
                    break;
                default:
                    System.out.println("Operasi tidak valid. Masukkan nomor operasi yang benar.");
            }
            
            System.out.println();
        }
    }
}
