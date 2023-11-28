import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Cari Mahasiswa");
            System.out.println("3. Hapus Mahasiswa");
            System.out.println("4. Tampilkan semua NIM");
            System.out.println("5. Exit");
            System.out.print("Pilih opsi: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1: {
                    System.out.print("Masukkan NIM: ");
                    String NIM = scanner.nextLine();
                    System.out.print("Masukkan Nama Lengkap: ");
                    String namaLengkap = scanner.nextLine();
                    System.out.print("Masukkan Jurusan: ");
                    String jurusan = scanner.nextLine();
                    System.out.print("Masukkan Program Studi: ");
                    String programStudi = scanner.nextLine();

                    Mahasiswa mahasiswa = new Mahasiswa(NIM, namaLengkap, jurusan, programStudi);
                    hashTable.tambahMahasiswa(mahasiswa);
                    System.out.println("Mahasiswa berhasil ditambahkan.");
                    break;
                }
                case 2: {
                    System.out.print("Masukkan NIM yang ingin dicari: ");
                    String NIM = scanner.nextLine();
                    Mahasiswa mahasiswa = hashTable.getMahasiswa(NIM);
                    if (mahasiswa != null) {
                        System.out.println(mahasiswa);
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + NIM + " tidak ditemukan.");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Masukkan NIM mahasiswa yang ingin dihapus: ");
                    String NIM = scanner.nextLine();
                    hashTable.hapusMahasiswa(NIM);
                    System.out.println("Mahasiswa dengan NIM " + NIM + " telah dihapus.");
                    break;
                }
                case 4: {
                    System.out.println("Daftar NIM Mahasiswa:");
                    hashTable.tampilkanNIM();
                    break;
                }
                case 5: {
                    System.out.println("Program selesai.");
                    scanner.close();
                    return;
                }
                default: {
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
                    break;
                }
            }
        }
    }
}
