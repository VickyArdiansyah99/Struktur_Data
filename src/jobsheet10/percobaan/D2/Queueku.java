package jobsheet10.percobaan.D2;

import java.util.NoSuchElementException;

public interface Queueku<T> {
    boolean isEmpty();
    T peek() throws NoSuchElementException;
    T pop() throws NoSuchElementException;
    void push(T item);
    int size();
}
