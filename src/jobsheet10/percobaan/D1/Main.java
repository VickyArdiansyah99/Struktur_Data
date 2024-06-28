package jobsheet10.percobaan.D1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<String>();
        myQueue.add("A");
        myQueue.add("B");
        myQueue.add("C");
        myQueue.add("D");
        List<String> myList = new ArrayList<String>(myQueue);
        for (Object theFruit : myList) {
            System.out.println(theFruit);
        }
    }
}
