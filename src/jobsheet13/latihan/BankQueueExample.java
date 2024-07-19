package jobsheet13.latihan;

import jobsheet13.precobaan.HeapPQueue;

import java.util.Comparator;

public class BankQueueExample {
    public static void main(String[] args) {
        Comparator<Customer> comparator = Comparator.comparingInt(Customer::getBalance).reversed();
        HeapPQueue<Customer> bankQueue = new HeapPQueue<>(comparator);

        bankQueue.push(new Customer("Andi", 2000000));
        bankQueue.push(new Customer("Budi", 10000000));
        bankQueue.push(new Customer("Cahya", 15000000));
        bankQueue.push(new Customer("Dinda", 12000000));
        bankQueue.push(new Customer("Rudi", 3000000));

        System.out.println("|-----|------------|-----------------|");
        System.out.printf("| %-3s | %-10s | %-15s |%n", "No", "Nama", "Jumlah Tabungan");
        System.out.println("|-----|------------|-----------------|");

        int no = 1;
        while (!bankQueue.isEmpty()) {
            Customer customer = bankQueue.pop();
            System.out.printf("| %-3d | %-10s | %,15d |%n", no++, customer.getName(), customer.getBalance());
        }
        System.out.println("|-----|------------|-----------------|");
    }
}

