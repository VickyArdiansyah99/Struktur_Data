package jobsheet06.latahan;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRekursif {
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return binarySearch(arr, left, mid - 1, target);
            }
            return binarySearch(arr, mid + 1, right, target);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = input.nextInt();
        
        int[] data = new int[n];
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            data[i] = input.nextInt();
        }

        Arrays.sort(data);

        System.out.print("Masukkan angka yang ingin dicari: ");
        int target = input.nextInt();

        int result = binarySearch(data, 0, data.length - 1, target);

        if (result == -1) {
            System.out.println("Elemen tidak ditemukan");
        } else {
            System.out.println("Elemen ditemukan pada indeks: " + result);
        }
        input.close();
    }
}
