package TugasPraktikum;

import java.util.*;

public class StudentGradeSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n***************************************");
            System.out.println("SISTEM PENGOALAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("***************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.print("Pilih : ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    mencariNilaiMahasiswa();
                    break;
                case 4:
                    urutDataNilai();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }

    private static void inputNilai() {
        System.out.print("Masukkan NIM: ");
        int nim = scanner.nextInt();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.next();
        System.out.print("Masukkan Mata Kuliah: ");
        String mataKuliah = scanner.next();
        System.out.print("Masukkan Nilai: ");
        double nilai = scanner.nextDouble();

        Student student = new Student(nim, nama);
        student.addCourseGrade(mataKuliah, nilai);
        studentList.add(student);
        System.out.println("Data telah dimasukkan.\n");
    }

    private static void tampilNilai() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    private static void mencariNilaiMahasiswa() {
        System.out.print("Masukkan NIM yang dicari: ");
        int nim = scanner.nextInt();
        for (Student student : studentList) {
            if (student.getNim() == nim) {
                System.out.println(student);
                break;
            }
        }
    }

    private static void urutDataNilai() {
        Collections.sort(studentList, Comparator.comparing(Student::getNim));
        System.out.println("Data telah diurutkan berdasarkan NIM.");
        tampilNilai();
    }

    static class Student {
        private int nim;
        private String nama;
        private Map<String, Double> mataKuliahNilai;

        public Student(int nim, String nama) {
            this.nim = nim;
            this.nama = nama;
            this.mataKuliahNilai = new HashMap<>();
        }

        public int getNim() {
            return nim;
        }

        public void addCourseGrade(String course, double grade) {
            mataKuliahNilai.put(course, grade);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NIM: ").append(nim)
              .append(", Nama: ").append(nama)
              .append(", Mata Kuliah: ").append(mataKuliahNilai);
            return sb.toString();
        }
    }
}
