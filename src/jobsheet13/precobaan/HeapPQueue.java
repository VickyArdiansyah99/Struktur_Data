package jobsheet13.precobaan;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class HeapPQueue<T extends Comparable<? super T>> implements PQueue<T> {
    private LinkedList<T> qlist;
    private Comparator<T> comparator;
    public HeapPQueue() {
        qlist = new LinkedList<>();
    }
    public HeapPQueue(Comparator<T> comp) {
        qlist = new LinkedList<>();
        comparator = comp;
    }

    @Override
    public boolean isEmpty() {
        return qlist.isEmpty();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return qlist.getFirst();
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return qlist.removeFirst();
    }

    @Override
    public void push(T item) {
        qlist.add(item);
        if (comparator != null) {
            qlist.sort(comparator);
        } else {
            Collections.sort(qlist);
        }
    }

    @Override
    public int size() {
        return qlist.size();
    }
}
