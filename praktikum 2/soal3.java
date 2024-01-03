public class soal3 {
    public class Segitiga {
        public int alas;
        public int tinggi;

        // Kelas untuk menghitung luas dan keliling segitiga
        public Segitiga() {
            alas = 0;
            tinggi = 0;
        }

        // Konstruktor tanpa parameter untuk menginisialisasi atribut alas dan tinggi dengan nilai default
        public Segitiga(int a, int t) {
            alas = a;
            tinggi = t;
        }

        // Method untuk menghitung luas segitiga
        public double hitungLuas() {
            // Method untuk menghitung luas segitiga
            return 0.5 * alas * tinggi;
        }

        // Method untuk menghitung keliling segitiga
        public double hitungKeliling() {
            // Method untuk menghitung keliling segitiga
            return alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
        }

        // Menggunakan looping untuk mencetak luas dan keliling setiap segitiga
        public static void main(String[] args) {
            // Membuat array Segitiga dan menginisialisasi atributnya
            Segitiga[] sgArray = new Segitiga[4];
            sgArray[0] = new Segitiga(10, 4);
            sgArray[1] = new Segitiga(20, 10);
            sgArray[2] = new Segitiga(15, 6);
            sgArray[3] = new Segitiga(25, 10);

            // Menggunakan looping untuk mencetak luas dan keliling setiap segitiga
            for (int i = 0; i < sgArray.length; i++) {
                System.out.println("Segitiga ke-" + i);
                System.out.println("Alas: " + sgArray[i].alas + ", Tinggi: " + sgArray[i].tinggi);
                System.out.println("Luas: " + sgArray[i].hitungLuas());
                System.out.println("Keliling: " + sgArray[i].hitungKeliling());
                System.out.println();
            }
        }
    }
}
