package jobsheet09.percobaan;

public interface Stack<T> {
    abstract boolean isEmpty();
    abstract T peek();
    abstract T pop();
    abstract void push(T item);
    abstract int size();
}
