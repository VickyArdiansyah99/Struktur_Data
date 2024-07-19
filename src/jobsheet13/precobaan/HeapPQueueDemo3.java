package jobsheet13.precobaan;

public class HeapPQueueDemo3 {
    public static void main(String[] args) {
        HeapPQueue<Product> pq = new HeapPQueue<Product>();
        pq.push(new Product("A", ProductQuality.Low));
        pq.push(new Product("B", ProductQuality.High));
        pq.push(new Product("C", ProductQuality.Medium));
        while (!pq.isEmpty()) {
            System.out.println(pq.pop().toString());
        }
    }
}
