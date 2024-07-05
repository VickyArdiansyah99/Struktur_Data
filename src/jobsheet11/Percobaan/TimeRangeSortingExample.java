package jobsheet11.Percobaan;

public class TimeRangeSortingExample {
    public static void main(String[] args) {
        String[] timeRanges = {"08:00-09:00", "10:30-11:00", "07:30-80:30", "09:30-10:30", "08:30-09:30"};
        System.out.println("Array sebelum sorting:");
        printArray(timeRanges);
        insertionSortByStartTime(timeRanges);
        System.out.println("\nArray setelah sorting:");
        printArray(timeRanges);
    }
    public static void insertionSortByStartTime(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            String keyStartTime = key.substring(0, 5); // Ambil jam mulai (HH:mm)
            int j = i - 1;
            while (j >= 0 && compareTime(arr[j].substring(0, 5), keyStartTime) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    // Metode untuk membandingkan dua string waktu dalam format HH:mm
    public static int compareTime(String time1, String time2) {
        int hour1 = Integer.parseInt(time1.substring(0, 2));
        int minute1 = Integer.parseInt(time1.substring(3, 5));
        int hour2 = Integer.parseInt(time2.substring(0, 2));
        int minute2 = Integer.parseInt(time2.substring(3, 5));
        if (hour1 != hour2) {
            return hour1 - hour2;
        } else {
            return minute1 - minute2;
        }
    }
    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
}
