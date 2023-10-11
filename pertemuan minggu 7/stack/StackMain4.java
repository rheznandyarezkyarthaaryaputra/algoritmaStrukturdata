import java.util.Scanner;
import java.util.Stack;

public class StackMain4{
    public static void main(String[] args) {
        Stack<Buku> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        boolean tambahData = true;
        while (tambahData) {
            System.out.println("Menu:");
            System.out.println("1. Push (Tambahkan data buku ke stack)");
            System.out.println("2. Pop (Hapus data buku dari stack)");
            System.out.println("3. Peek (Tampilkan data buku teratas pada stack)");
            System.out.println("4. Print (Cetak isi stack)");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1/2/3/4/5): ");
            int pilihan = sc.nextInt();
            
            sc.nextLine(); // Membersihkan karakter newline dari input

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan data buku:");
                    System.out.print("Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Nama Pengarang: ");
                    String pengarang = sc.nextLine();
                    System.out.print("Tahun Terbit: ");
                    int tahunTerbit = sc.nextInt();
                    System.out.print("Jumlah Halaman: ");
                    int jumlahHalaman = sc.nextInt();
                    System.out.print("Harga: ");
                    int harga = sc.nextInt();
                    sc.nextLine(); // Membersihkan karakter newline dari input

                    Buku buku = new Buku(judul, pengarang, tahunTerbit, jumlahHalaman, harga);
                    stack.push(buku);
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        Buku dataKeluar = stack.pop();
                        System.out.println("Data yang keluar: ");
                        dataKeluar.printInfo();
                    } else {
                        System.out.println("Stack kosong.");
                    }
                    break;
                case 3:
                    if (!stack.isEmpty()) {
                        Buku elemenTeratas = stack.peek();
                        System.out.println("Elemen teratas: ");
                        elemenTeratas.printInfo();
                    } else {
                        System.out.println("Stack kosong.");
                    }
                    break;
                case 4:
                    if (!stack.isEmpty()) {
                        System.out.println("Isi stack:");
                        for (Buku bukuStack : stack) {
                            bukuStack.printInfo();
                        }
                    } else {
                        System.out.println("Stack kosong.");
                    }
                    break;
                case 5:
                    tambahData = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}
