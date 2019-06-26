public class Main {
    public static void main(String[] args) {
        int[] array = {4, 12, 2, 24, 7, 1, 20, 1};

        System.out.println("Selection Sort results:");
        selectionSort(array);

        System.out.println("Insertion Sort results:");
        insertionSort(array);
    }

    public static void print(int[] array) {
        // Print sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }

    public static void selectionSort(int[] array) {
        int pnt = 0;
        int lowest = 0;

        do {
            for (int i = pnt; i < array.length; i++) {
                if (array[i] < array[lowest]) {
                    lowest = i;
                }
            }
            int tmp = array[pnt];
            array[pnt] = array[lowest];
            array[lowest] = tmp;
            pnt++;
            if (pnt < array.length) {
                lowest = pnt;
            }
        } while (pnt < array.length);

        print(array);
    }

    public static void insertionSort(int[] array) {
        int key = 0;

        for (int i = key + 1; i < array.length; i++) {
            int j = key + 1;
            if (array[j] < array[key]) {
                while (j-1 >= 0 && array[j] < array[j-1]) {
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                    j--;
                }
            }
            key++;
        }

        print(array);
    }
}
