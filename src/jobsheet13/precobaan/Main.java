package jobsheet13.precobaan;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Product> pq = new PriorityQueue<Product>(3);
        pq.add(new Product("A", ProductQuality.Low));
        pq.add(new Product("B", ProductQuality.High));
        pq.add(new Product("C", ProductQuality.Medium));
        Product m;
        while ((m = pq.poll()) != null) {
            System.out.println(m.name + " Priority: " + m.priority);
        }
        PriorityQueue<Product> pqRev = new PriorityQueue<Product>(3, new MessageComparator());
        pqRev.add(new Product("D", ProductQuality.Low));
        pqRev.add(new Product("E", ProductQuality.High));
        pqRev.add(new Product("F", ProductQuality.Medium));
        while ((m = pqRev.poll()) != null) {
            System.out.println(m.name + " Priority: " + m.priority);
        }
    }
}
