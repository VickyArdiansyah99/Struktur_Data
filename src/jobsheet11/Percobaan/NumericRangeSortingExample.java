package jobsheet11.Percobaan;

public class NumericRangeSortingExample {
    public static void main(String[] args) {
        int[] values = {85, 60, 90, 70, 50};
        System.out.println("Array sebelum sorting:");
        printArray(values);
        selectionSortAscending(values);
        System.out.println("\nArray setelah sorting:");
        printArray(values);
    }
    public static void selectionSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
