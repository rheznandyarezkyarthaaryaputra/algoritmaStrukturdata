public class Sequential{
    public static void main(String[] args) {
        int[] array = {17, 20, 26, 33, 37, 41, 53, 65, 73, 83};
        int a = 41;
        int b = 50;

        int indexA = sequentialSearch(array, a);
        int indexB = sequentialSearch(array, b);

        if (indexA != -1) {
            System.out.println("Nilai " + a + " ditemukan di indeks " + indexA);
        } else {
            System.out.println("Nilai " + a + " tidak ditemukan dalam array.");
        }

        if (indexB != -1) {
            System.out.println("Nilai " + b + " ditemukan di indeks " + indexB);
        } else {
            System.out.println("Nilai " + b + " tidak ditemukan dalam array.");
        }
    }

    public static int sequentialSearch(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i; // Nilai ditemukan, kembalikan indeks
            }
        }
        return -1; // Nilai tidak ditemukan
    }
}