public class Sort {
    public int[] data;
    public int jumData;

    public Sort(int[] data, int jmlData) {
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
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < jumData - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < jumData; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[minIndex];
            data[minIndex] = data[i];
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
        Sort urut = new Sort(a, a.length);

        System.out.println("Data sebelum urut:");
        urut.tampilData();

        System.out.println("Data sesudah urut Bubble sort (ASC):");
        urut.bubbleSort();
        urut.tampilData();

        System.out.println("Data sesudah urut Selection sort (ASC):");
        urut.selectionSort();
        urut.tampilData();
    }
}
