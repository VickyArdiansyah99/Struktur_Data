package jobsheet11.Percobaan;

public class NameSortingBubble {
    public static void main(String[] args) {
        String[] studentName = {"Zainab", "Abdullah", "Yusuf", "Khadija", "Fatimah"};
        System.out.println("Name mahasiswa sebelum sorting:");
        printArray(studentName);
        bubbleSortAlphabetically(studentName);
        System.out.println("\nNama mahasiswa setelah sorting:");
        printArray(studentName);
    }
    public static void bubbleSortAlphabetically(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    // Swap arr[j] dengan arr[j + 1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
