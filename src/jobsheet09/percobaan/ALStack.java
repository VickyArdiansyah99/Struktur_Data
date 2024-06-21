package jobsheet09.percobaan;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;

public class ALStack<T> implements Stack<T>{
    private ArrayList<T> stackList = null;
    
    public ALStack() {
        stackList = new ArrayList<T>();
    }
    
    @Override
    public boolean isEmpty() {
        return stackList.size() == 0;
    }
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.remove(stackList.size() - 1);
    }
    @Override
    public void push(T item) {
        stackList.add(item);
    }
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.get(stackList.size() - 1);
    }
    @Override
    public int size() {
        return stackList.size();
    }
    public Iterator<T> iterator() {
        return stackList.iterator();
    }
    
    public void clear() {
        stackList.clear();
    }
}
