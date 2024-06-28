package jobsheet10.latihan;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainQueueProgram {
    private static Queue<Integer> queue = new LinkedList<>();
    private static int capacity;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan kapasitas Queue: ");
        capacity = scanner.nextInt();

        int choice;
        do {
            System.out.println("\nContoh Program Queue dengan Java");
            System.out.println("Menu:");
            System.out.println("1. Tambah Queue");
            System.out.println("2. Keluarkan 1 data dari Queue");
            System.out.println("3. Status Queue");
            System.out.println("4. Tampilkan data dalam Queue");
            System.out.println("5. Bersihkan Queue");
            System.out.println("6. Keluar dari Program");
            System.out.print("Pilihan Menu (1 - 6) >>>");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addData(scanner);
                    break;
                case 2:
                    removeData();
                    break;
                case 3:
                    statusQueue();
                    break;
                case 4:
                    displayQueue();
                    break;
                case 5:
                    clearQueue();
                    break;
                case 6:
                    System.out.println("Keluar dari Program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 6);

        scanner.close();
    }

    private static void addData(Scanner scanner) {
        if (queue.size() >= capacity) {
            System.out.println("\nAntrian Penuh!, kosongkan data satu terlebih dahulu!");
        } else {
            System.out.print("\nMasukan Data (angka): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Masukan harus berupa Angka!");
                System.out.print("Masukan Data (angka): ");
                scanner.next();
            }
            int data = scanner.nextInt();
            queue.add(data);
        }
    }

    private static void removeData() {
        if (queue.isEmpty()) {
            System.out.println("\nQueue kosong, tidak ada data untuk dihapus.");
        } else {
            int removedData = queue.poll();
            System.out.println("Data yang dikeluarkan: " + removedData);
        }
    }

    private static void statusQueue() {
        System.out.println("Status Storage:");
        System.out.println("Kapasitas: " + capacity);
        System.out.println("Terisi: " + queue.size());
    }

    private static void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("\nQueue kosong.");
        } else {
            System.out.print("\nData dalam Queue: ");
            int index = 0;
            for (int data : queue) {
                System.out.print("[" + index + " => " + data + "] ");
                index++;
            }
            System.out.println();
        }
    }

    private static void clearQueue() {
        queue.clear();
        System.out.println("\nQueue telah dibersihkan.");
    }
}
