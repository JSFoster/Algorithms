import java.util.Random;

public class Main {
    private static final int SIZE = 10;

    public static void main(String[] args) {

        System.out.println("Selection Sort results:");
        selectionSort(newArray());

        System.out.println("Insertion Sort results:");
        insertionSort(newArray());

          System.out.println("Merge Sort results:");
          mergeSort(newArray());
    }

    public static void print(int[] array) {
        // Print sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }

    public static int[] newArray() {
        int[] array = new int[SIZE];

        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(SIZE);
        }

        return array;
    }

    public static void selectionSort(int[] array) {
        long startTime = System.nanoTime();

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

        long endTime = System.nanoTime();

        print(array);

        System.out.println("Selection sort time taken: " + (endTime - startTime) / 1e+6 + " ms" + "\n");
    }

    public static void insertionSort(int[] array) {
        long startTime = System.nanoTime();

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

        long endTime = System.nanoTime();

        print(array);

        System.out.println("Insertion sort time taken: " + (endTime - startTime) / 1e+6 + " ms" + "\n");
    }

    public static void mergeSort(int[] array) {
        long startTime = System.nanoTime();

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j-1]) {
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }
            }
        }

        long endTime = System.nanoTime();

        print(array);

        System.out.println("Merge sort time taken: " + (endTime - startTime) / 1e+6 + " ms" + "\n");
    }
}
