public class ArrayParity{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int n = arr.length;

        int result[] = new int[n];

        int even = 0;
        int odd = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                result[even] = arr[i];
                even += 2;
            } else {
                result[odd] = arr[i];
                odd += 2;
            }
        }

        System.out.println("Original Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nRearranged Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}