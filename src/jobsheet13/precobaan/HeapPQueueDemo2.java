package jobsheet13.precobaan;

public class HeapPQueueDemo2 {
    public static void main(String[] args) {
        HeapPQueue pq = new HeapPQueue(new PrimaComparator());
        pq.push(1);
        pq.push(5);
        pq.push(6);
        pq.push(4);
        pq.push(2);
        pq.push(9);
        pq.push(7);
        pq.push(8);
        pq.push(10);
        pq.push(3);
        while (!pq.isEmpty()) {
            System.out.println(pq.pop() + " ");
        }
    }
}
