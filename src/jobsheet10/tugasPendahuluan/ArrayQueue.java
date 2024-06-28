package jobsheet10.tugasPendahuluan;

import jobsheet10.percobaan.D3.BQueue;
import java.util.NoSuchElementException;

public class ArrayQueue<T> implements PQueue<T> {
    private T[] arr;
    private int qfront = 0;
    private int qback = 0;
    private int qsize = 0;
    private int qcapacity;

    @SuppressWarnings("unchecked")
    public ArrayQueue(int size) {
        arr = (T[]) new Object[size];
        qcapacity = size;
    }

    @Override
    public boolean isEmpty() {
        return qsize == 0;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        }
        return arr[qfront];
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        }
        T item = arr[qfront];
        arr[qfront] = null; // Help GC
        qfront = (qfront + 1) % qcapacity;
        qsize--;
        return item;
    }

    @Override
    public void enqueue(T item) {
        if (full()) {
            throw new NoSuchElementException("Queue is full.");
        }
        arr[qback] = item;
        qback = (qback + 1) % qcapacity;
        qsize++;
    }

    @Override
    public int size() {
        return qsize;
    }

    @Override
    public boolean full() {
        return qsize == qcapacity;
    }

    public void displayQueue() {
        System.out.print("Queue: ");
        for (int i = 0; i < qsize; i++) {
            System.out.print(arr[(qfront + i) % qcapacity] + " ");
        }
        System.out.println();
    }
}
