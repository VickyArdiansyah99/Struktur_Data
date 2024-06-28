package jobsheet10.tugasPendahuluan;

import java.util.NoSuchElementException;

public class MainArrayQueue {
    public static void main(String[] args) {
        try {
            ArrayQueue<Integer> queue = new ArrayQueue<>(5);

            // Kondisi awal
            queue.enqueue(5);
            queue.enqueue(3);
            queue.enqueue(2);
            queue.displayQueue(); // [5, 3, 2]

            // Enqueue(7)
            queue.enqueue(7);
            queue.displayQueue(); // [5, 3, 2, 7]

            // Enqueue(8)
            queue.enqueue(8);
            queue.displayQueue(); // [5, 3, 2, 7, 8]

            // Enqueue(9)
            try {
                queue.enqueue(9); // Queue should be full, this should throw an exception
            } catch (NoSuchElementException e) {
                System.out.println(e.getMessage()); // Queue is full.
            }

            // Dequeue()
            queue.dequeue();
            queue.displayQueue(); // [3, 2, 7, 8]

            // Peek()
            System.out.println("Elemen depan: " + queue.peek()); // 3

            // Dequeue()
            queue.dequeue();
            queue.displayQueue(); // [2, 7, 8]

            // Enqueue(9)
            queue.enqueue(9);
            queue.displayQueue(); // [2, 7, 8, 9]

        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
