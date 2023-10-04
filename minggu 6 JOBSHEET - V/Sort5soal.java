public class Sort5soal {
    public int[] data;
    public int jumData;

    public Sort5soal(int[] data, int jmlData) {
        this.jumData = jmlData;
        this.data = new int[jmlData];
        for (int i = 0; i < jmlData; i++) {
            this.data[i] = data[i];
        }
    }

    public void bubbleSort() {
        int temp;
        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 0; j < jumData - i - 1; j++) {
                if (data[j] < data[j + 1]) { // Perubahan kondisi menjadi < untuk DESC
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < jumData - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < jumData; j++) {
                if (data[j] > data[maxIndex]) { // Perubahan kondisi menjadi > untuk DESC
                    maxIndex = j;
                }
            }
            int temp = data[maxIndex];
            data[maxIndex] = data[i];
            data[i] = temp;
        }
    }

    public void tampilData() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = {15, 10, 7, 22, 5};
        Sort5soal urut = new Sort5soal(a, a.length);

        System.out.println("Data sebelum urut:");
        urut.tampilData();

        System.out.println("Data sesudah urut Bubble sort (DESC):");
        urut.bubbleSort();
        urut.tampilData();

        System.out.println("Data sesudah urut Selection sort (DESC):");
        urut.selectionSort();
        urut.tampilData();
    }
}
