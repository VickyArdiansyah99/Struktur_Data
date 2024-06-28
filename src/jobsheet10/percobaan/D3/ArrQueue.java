package jobsheet10.percobaan.D3;

import java.util.NoSuchElementException;

public class ArrQueue<T> implements BQueue<T>{
    private T[] arr;
    private int qfront = 0;
    private int qback = 0;
    private int qsize = 0;
    private int qcapacity;
    public ArrQueue() {
        this(50);
    }
    public ArrQueue(int size) {
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
    public T pop() {
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
    public void push(T irem) {
        if (full()) {
            throw new NoSuchElementException("Queue is full.");
        }
        arr[qback] = irem;
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
}
