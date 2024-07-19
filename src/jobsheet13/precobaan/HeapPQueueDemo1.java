package jobsheet13.precobaan;

import java.util.Collections;
import java.util.Comparator;

public class HeapPQueueDemo1 {
    public static void main(String[] args) {
        Comparator comparator = Collections.reverseOrder();
        HeapPQueue<String> pq = new HeapPQueue<String>(comparator);
        pq.push("C");
        pq.push("A");
        pq.push("B");
        System.out.println(pq.pop());
        System.out.println(pq);
    }
}
