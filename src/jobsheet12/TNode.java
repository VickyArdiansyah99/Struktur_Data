package jobsheet12;

public class TNode<T> {
    // data dari sebuah node
    public T nodeValue;
    // menyimpan alamat dari anak kiri dan anak kanan
    public TNode<T> left, right;
    // membuat obyek dengan sebuah data item dan anak kiri dan anak kanan diset null
    public TNode(T item) {
        nodeValue = item;
        left = right = null;
    }
    // membuat obyek dengan sebuah data item dan menentukan alamat dari anak kiri dan anak kanan
    public TNode(T item, TNode<T> left, TNode<T> right) {
        nodeValue = item;
        this.left = left;
        this.right = right;
    }
}
