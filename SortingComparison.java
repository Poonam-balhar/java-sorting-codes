import java.util.Arrays;
public class SortingComparison {

    static int comparisons;
    static int swaps;
    static int shifts;

    static void bubbleSort(int[] arr) {
        comparisons = 0;
        swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                comparisons++;

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }

        System.out.println("Bubble Sort:");
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        comparisons = 0;
        swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                comparisons++;

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swaps++;
            }
        }

        System.out.println("Selection Sort:");
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

 
    static void insertionSort(int[] arr) {
        comparisons = 0;
        shifts = 0;

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0) {
                comparisons++;

                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    shifts++;
                    j--;
                } else {
                    break;
                }
            }

            arr[j + 1] = key;
        }

        System.out.println("Insertion Sort:");
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Shifts: " + shifts);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] inputA = {9, 7, 5, 3, 1};
        int[] inputB = {1, 2, 3, 5, 4};

        System.out.println("========== INPUT A ==========");
        System.out.println("Original: " + Arrays.toString(inputA));

        bubbleSort(inputA.clone());
        selectionSort(inputA.clone());
        insertionSort(inputA.clone());

        System.out.println("\n========== INPUT B ==========");
        System.out.println("Original: " + Arrays.toString(inputB));

        bubbleSort(inputB.clone());
        selectionSort(inputB.clone());
        insertionSort(inputB.clone());
    }
}