package jobsheet13.precobaan;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> stringQueue;
        stringQueue = new PriorityQueue<String>();
        stringQueue.add("ab");
        stringQueue.add("abcd");
        stringQueue.add("abc");
        stringQueue.add("a");
        while (stringQueue.size() > 0) {
            System.out.println(stringQueue.remove());
        }
    }
}
