public class Main {
    public static void main(String[] args) {
        int[] unsorted = {4, 12, 2, 24, 7, 1, 20};

        //selectionSort(unsorted);
        insertionSort(unsorted);
    }

    public static void selectionSort(int[] unsorted) {
        int pnt = 0;
        int lowest = 0;

        do {
            for (int i = pnt; i < unsorted.length; i++) {
                if (unsorted[i] < unsorted[lowest]) {
                    lowest = i;
                }
            }
            int tmp = unsorted[pnt];
            unsorted[pnt] = unsorted[lowest];
            unsorted[lowest] = tmp;
            pnt++;
            if (pnt < unsorted.length) {
                lowest = pnt;
            }
        } while (pnt < unsorted.length);

        // Print sorted array
        for (int i = 0; i < unsorted.length; i++) {
            System.out.println(unsorted[i]);
        }
    }

    public static void insertionSort(int[] unsorted) {
        for (int i = 0; i < unsorted.length; i++) {
            int key = unsorted[i];
            
        }

        // Print sorted array
        for (int i = 0; i < unsorted.length; i++) {
            System.out.println(unsorted[i]);
        }
    }
}
