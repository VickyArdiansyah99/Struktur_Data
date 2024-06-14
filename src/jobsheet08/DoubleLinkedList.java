package jobsheet08;

public class DoubleLinkedList<T> {
    private DNode<T> front = null, back = null;

    @Override
    public String toString() {
        if (front == null) {
            return "Double Linked List Kosong";
        }

        DNode<T> curr = front;
        StringBuilder str = new StringBuilder("[" + curr.nodeValue);

        while (curr.next != null) {
            curr = curr.next;
            str.append(", ").append(curr.nodeValue);
        }
        str.append("]");
        return str.toString();
    }

    public String toStringBack() {
        if (back == null) {
            return "Double Linked List Kosong";
        }

        DNode<T> curr = back;
        StringBuilder str = new StringBuilder("[" + curr.nodeValue);

        while (curr.prev != null) {
            curr = curr.prev;
            str.append(", ").append(curr.nodeValue);
        }
        str.append("]");
        return str.toString();
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

    public void tambahNode_Sebelum(DNode<T> newNode, T targetValue) {
        DNode<T> current = front;

        while (current != null && !current.nodeValue.equals(targetValue)) {
            current = current.next;
        }

        if (current != null) {
            newNode.next = current;
            newNode.prev = current.prev;
            if (current.prev != null) {
                current.prev.next = newNode;
            } else {
                front = newNode;
            }
            current.prev = newNode;
        }
    }

    public void tambahNode_SebelumBacaMundur(DNode<T> newNode, T targetValue) {
        DNode<T> current = back;

        while (current != null && !current.nodeValue.equals(targetValue)) {
            current = current.prev;
        }

        if (current != null) {
            newNode.next = current;
            newNode.prev = current.prev;
            if (current.prev != null) {
                current.prev.next = newNode;
            } else {
                front = newNode;
            }
            current.prev = newNode;
        }
    }

    public void tambahNode_Setelah(DNode<T> newNode, T targetValue) {
        DNode<T> current = front;

        while (current != null && !current.nodeValue.equals(targetValue)) {
            current = current.next;
        }

        if (current != null) {
            newNode.prev = current;
            newNode.next = current.next;
            if (current.next != null) {
                current.next.prev = newNode;
            } else {
                back = newNode;
            }
            current.next = newNode;
        }
    }

    public void tambahNode_SetelahBacaMundur(DNode<T> newNode, T targetValue) {
        DNode<T> current = back;

        while (current != null && !current.nodeValue.equals(targetValue)) {
            current = current.prev;
        }

        if (current != null) {
            newNode.prev = current;
            newNode.next = current.next;
            if (current.next != null) {
                current.next.prev = newNode;
            } else {
                back = newNode;
            }
            current.next = newNode;
        }
    }
}
