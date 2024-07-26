package uas;

import java.util.PriorityQueue;
import java.util.Scanner;

class Nasabah implements Comparable<Nasabah> {
    int nominal;
    String nama;

    Nasabah(String nama, int nominal) {
        this.nama = nama;
        this.nominal = nominal;
    }

    @Override
    public int compareTo(Nasabah other) {
        return Integer.compare(other.nominal, this.nominal);
    }

    @Override
    public String toString() {
        return "(priority-" + nominal + ", data " + nama + ")";
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kapasitas Queue: ");
        int capacity = scanner.nextInt();
        PriorityQueue<Nasabah> priorityQueue = new PriorityQueue<>();

        int choice;
        do {
            System.out.println("\n### Program Priority Queue Amik PGRI Kebumen ###");
            System.out.println("Menu:");
            System.out.println("1. Tambah Nasabah");
            System.out.println("2. Keluarkan 1 data dari Antrian");
            System.out.println("3. Status Antrian");
            System.out.println("4. Tampilkan data Nasabah");
            System.out.println("5. Bersihkan data Antrian");
            System.out.println("6. Keluar dari Program");
            System.out.print("Pilihan Menu (1-6) >>> ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (priorityQueue.size() >= capacity) {
                        System.out.println("Antrian Penuh, kosongkan data satu terlebih dahulu!");
                    } else {
                        System.out.print("Nama Nasabah: ");
                        String nama = scanner.nextLine();
                        System.out.print("Nominal (angka tidak pakai titik): ");
                        int nominal = scanner.nextInt();
                        scanner.nextLine();
                        priorityQueue.add(new Nasabah(nama, nominal));
                        System.out.println("Nasabah telah ditambahkan.");
                    }
                    break;
                case 2:
                    Nasabah removed = priorityQueue.poll();
                    if (removed != null) {
                        System.out.println("Nasabah yang dikeluarkan: " + removed);
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;
                case 3:
                    System.out.println("Status Storage:");
                    System.out.println("Kapasitas: " + capacity);
                    System.out.println("Terisi: " + priorityQueue.size());
                    break;
                case 4:
                    System.out.println("Data dalam Antrian:");
                    for (Nasabah nasabah : priorityQueue) {
                        System.out.println(nasabah);
                    }
                    break;
                case 5:
                    priorityQueue.clear();
                    System.out.println("Antrian telah dibersihkan.");
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
