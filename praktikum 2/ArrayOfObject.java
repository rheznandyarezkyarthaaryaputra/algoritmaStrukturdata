import java.util.Scanner;

public class ArrayOfObject {
    public static void main(String[] args) {
        Student[] students = new Student[2][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                students[i][j] = new Student();

                System.out.println("Mahasiswa ke-" + (i * 3 + j));
                System.out.print("Masukkan nama: ");
                students[i][j].nama = sc.nextLine();

                System.out.print("Masukkan NIM: ");
                students[i][j].nim = sc.nextInt();

                System.out.print("Masukkan IPK: ");
                students[i][j].ipk = sc.nextDouble();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Mahasiswa ke-" + (i * 3 + j));
                System.out.println("Nama: " + students[i][j].nama);
                System.out.println("NIM: " + students[i][j].nim);
                System.out.println("IPK: " + students[i][j].ipk);
            }
        }
    }
}

class Student {
    public String nama;
    public int nim;
    public double ipk;
}
