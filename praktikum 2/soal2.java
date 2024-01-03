public class soal2 {
        public int alas;
        public int tinggi;
    
        // Konstruktor tanpa parameter
        public soal2() {
            alas = 0;
            tinggi = 0;
        }
    
        // Konstruktor dengan parameter
        public soal2(int a, int t) {
            alas = a;
            tinggi = t;
        }
    
        // Method untuk menghitung luas segitiga
        public double hitungLuas() {
            return 0.5 * alas * tinggi;
        }
    
        // Method untuk menghitung keliling segitiga (asumsi segitiga siku-siku)
        public double hitungKeliling() {
            double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
            return alas + tinggi + sisiMiring;
        }
    
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
    
