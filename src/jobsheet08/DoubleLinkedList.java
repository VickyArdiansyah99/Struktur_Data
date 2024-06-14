package jobsheet08;

public class DoubleLinkedList<T> {
    private DNode<T> front = null, back = null;
    @Override
    public String toString() {
        DNode<T> curr = front;
        if (curr == null) {
            return "Double Linked List Kosong";
        } else {
            String str = "[" + curr.nodeValue;
            while (curr.next != curr) {                
                curr = curr.next;
                str += ", " + curr.nodeValue;
            }
            str += "]";
            return str;
        }
    }
    // latihan no 1
    public String toStringBack() {
        DNode<T> curr = back;
        if (curr == null) {
            return "Double Linked List Kosong";
        } else {
            String str = "[" + curr.nodeValue;
            while (curr.prev != curr) {
                curr = curr.prev;
                str += ", " + curr.nodeValue;
            }
            str += "]";
            return str;
        }
    }
    public void tambahNode_Depan(DNode<T> newNode) {
        if (front == null) {
            front = newNode;
            back = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }
    public void tambahNode_Akhir(DNode<T> newNode) {
        if (back == null) {
            tambahNode_Depan(newNode);
        } else {
            back.next = newNode;
            newNode.prev = back;
            back = newNode;
        }
    }
    // latihan no 2
    public void tambahNode_Sebelum(DNode<T> newNode, DNode<T> target) {
        if (target == front) {
            tambahNode_Depan(newNode);
        } else {
            newNode.next = target;
            newNode.prev = target.prev;
            target.prev.next = newNode;
            target.prev = newNode;
        }
    }
    // latihan no 3
    public void tambahNode_SebelumBacaMundur(DNode<T> newNode, DNode<T> target) {
        tambahNode_Sebelum(newNode, target);
    }
    // latihan no 4
    public void tambahNode_Setelah(DNode<T> newNode, DNode<T> target) {
        if (target == back) {
            tambahNode_Akhir(newNode);
        } else {
            newNode.prev = target;
            newNode.next = target.next;
            target.next.prev = newNode;
            target.next = newNode;
        }
    }
    // latihan no 5
    public void tambahNode_SetelahBacaMundur(DNode<T> newNode, DNode<T> target) {
        tambahNode_Setelah(newNode, target);
    }
}
