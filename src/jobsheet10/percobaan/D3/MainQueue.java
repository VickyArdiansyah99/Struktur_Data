package jobsheet10.percobaan.D3;

import java.util.NoSuchElementException;

public class MainQueue {
    public static void main(String[] args) {
        try {
            ArrQueue<Integer> arr = new ArrQueue<>(5);
            arr.push(1);
            arr.push(4);
            arr.push(10);
            arr.push(2);
            arr.push(7);
            arr.pop();
            arr.pop();
            arr.push(17);
            arr.push(3);
            arr.push(27);
            while (!arr.isEmpty()) {
                System.out.println(arr.pop());
            }
        } catch (NoSuchElementException | IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
