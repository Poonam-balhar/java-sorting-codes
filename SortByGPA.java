public class SortByGPA {

    public static void bubbleSort(String[] names, double[] GPA) {

        int n = GPA.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (GPA[j] > GPA[j + 1]) {

                   
                    double tempGPA = GPA[j];
                    GPA[j] = GPA[j + 1];
                    GPA[j + 1] = tempGPA;

                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
    }

    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "Charlie", "David"};
        double[] GPA = {3.5, 3.8, 3.2, 3.9};

        bubbleSort(names, GPA);

        System.out.println("Sorted Student Records by GPA:");

        for (int i = 0; i < GPA.length; i++) {
            System.out.println(names[i] + " - GPA: " + GPA[i]);
        }
    }
}