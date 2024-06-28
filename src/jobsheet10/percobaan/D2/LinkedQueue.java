package jobsheet10.percobaan.D2;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedQueue<T> implements Queueku<T>{
    private LinkedList<T> qlist;
    public LinkedQueue() {
        qlist = new LinkedList<>();
    }
    @Override
    public boolean isEmpty() {
        return qlist.isEmpty();
    }
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        }
        return qlist.getFirst();
    }
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        }
        return qlist.removeFirst();
    }
    @Override
    public void push(T item) {
        qlist.addLast(item);
    }
    @Override
    public int size() {
        return qlist.size();
    }
}
