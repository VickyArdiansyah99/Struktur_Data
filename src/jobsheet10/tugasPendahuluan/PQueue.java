package jobsheet10.tugasPendahuluan;

public interface PQueue<T> {
    boolean isEmpty();
    T peek();
    T dequeue();
    void enqueue(T item);
    int size();
    boolean full();
}
