public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok(int p, int l, int t) {
        panjang = p;
        lebar = l; // Fixed variable name from '1' to 'l'
        tinggi = t;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public static void main(String[] args) {
        Balok[] blArray = new Balok[3]; // Declare and initialize the array

        blArray[0] = new Balok(100, 30, 12);
        blArray[1] = new Balok(120, 40, 15);
        blArray[2] = new Balok(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Balok ke-" + i);
            System.out.println("Panjang: " + blArray[i].panjang + ", Lebar: " + blArray[i].lebar + ", Tinggi: " + blArray[i].tinggi);
            System.out.println("Volume: " + blArray[i].hitungVolume());
        }
    }
}
