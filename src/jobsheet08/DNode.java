package jobsheet08;

public class DNode<T> {
    public T nodeValue;
    public DNode<T> prev;
    public DNode<T> next;
    
    public DNode() {
        nodeValue = null;
        next = this;
        prev = this;
    }
    
    public DNode(T item) {
        nodeValue = item;
        next = this;
        prev = this;
    }
}
