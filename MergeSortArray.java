import java.util.Arrays;
public class MergeSortArray {
    public static void mergeAndSort(int[] arr1, int[] arr2) {

    int[] arr3 = new int[arr1.length + arr2.length];

    for (int i = 0; i < arr1.length; i++) {
        arr3[i] = arr1[i];
    }

    for (int i = 0; i < arr2.length; i++) {
        arr3[arr1.length + i] = arr2[i];
    }

    for (int i = 0; i < arr3.length - 1; i++) {
        for (int j = 0; j < arr3.length - 1 - i; j++) {

            if (arr3[j] > arr3[j + 1]) {
                int temp = arr3[j];
                arr3[j] = arr3[j + 1];
                arr3[j + 1] = temp;
            }
        }
    }

   System.out.println("Merge and Sorted array: " + Arrays.toString(arr3));

}
public static void main(String[] args){
     int[] inputA = {9, 7, 5, 3, 1};
     int[] inputB = {1, 2, 3, 5, 4};

  System.out.println("========== INPUT A ==========");
  System.out.println("Original: " + Arrays.toString(inputA));

  System.out.println("\n========== INPUT B ==========");
  System.out.println("Original: " + Arrays.toString(inputB));
  
     mergeAndSort(inputA, inputB);
}
}