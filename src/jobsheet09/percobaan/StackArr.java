package jobsheet09.percobaan;

import java.util.EmptyStackException;

public class StackArr<T> implements Stack<T>{
    T value[];
    int topOfStack;
    public StackArr(int size){
        value = (T[]) new Object[size];
    }
    @Override
    public boolean isEmpty() {
        return topOfStack == 0;
    }
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        topOfStack--;
        return value[topOfStack];
    }
    @Override
    public void push(T item) {
        value[topOfStack] = item;
        topOfStack++;
    }
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        topOfStack--;
        T temp = value[topOfStack];
        topOfStack++;
        return temp;
    }
    @Override
    public int size() {
        return topOfStack;
    }
    @Override
    public String toString() {
        String str = "";
        for(int i=0; i<topOfStack; i++) {
            str += value[i] + " ";
        }
        return str;
    }
}
