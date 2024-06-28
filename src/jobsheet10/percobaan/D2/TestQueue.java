package jobsheet10.percobaan.D2;

import java.util.NoSuchElementException;

public class TestQueue {
    public static void main(String[] args) {
        try {
            LinkedQueue<Integer> queue = new LinkedQueue<>();
            queue.push(1);
            queue.push(4);
            queue.push(10);
            queue.push(2);
            queue.push(7);
            System.out.println("Queue size: " + queue.size());
            System.out.println("Front elemen: " + queue.peek());
            queue.pop();
            System.out.println("Front elemen after pop: " + queue.peek());
            queue.push(17);
            queue.push(3);
            System.out.println("Queue size after more pushes: " + queue.size());
            while (!queue.isEmpty()) {
                System.out.println(queue.pop());
            }
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
