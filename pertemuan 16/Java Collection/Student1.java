import java.util.ArrayList;
import java.util.List;

public class Student1 {
    String nim;
    String nama;
    String noteIp;

    public Student1(String nim, String nama, String noteIp) {
        this.nim = nim;
        this.nama = nama;
        this.noteIp = noteIp;
    }

    @Override
    public String toString() {
        return String.format("Mahasiswa{nim='%s', nama='%s', noteIp='%s'}", nim, nama, noteIp);
    }

    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();
        students.add(new Student1("19001", "Noureen", "08123456789"));
        students.add(new Student1("19002", "Akhleema", "08123456789"));
        students.add(new Student1("19003", "Shannum", "08123456789"));

        // Assuming you want to print the output twice as shown in the image.
        for (Student1 student : students) {
            System.out.println(student);
        }

        for (Student1 student : students) {
            System.out.println(student);
        }
    }
}
