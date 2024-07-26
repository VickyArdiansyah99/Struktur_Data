package uas;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("Element pada antrian: " + queue);

        int removedElement = queue.remove();
        System.out.println("Elemen dihapus dari antrian: " + removedElement);

        int headElement = queue.poll();
        System.out.println("Keluarkan item posisi paling depan pada antrian: " + headElement);

        System.out.println("Melihat item paling depan dari antrian terbaru: " + queue.peek());

        System.out.println("Antrian sekarang: " + queue);
    }
}
