package jobsheet12.percobaan;

import jobsheet12.TNode;

public class BinaryTree<T> {
    public String inorderDisplay(TNode<T> t) {
        if (t == null) {
            return "";
        }
        if (t.left == null && t.right == null) {
            return String.valueOf(t.nodeValue);
        }
        String left = inorderDisplay(t.left);
        String right = inorderDisplay(t.right);
        return "(" + left + t.nodeValue + right + ")";
    }

    public String preorderDisplay(TNode<T> t) {
        if (t == null) return "";
        return t.nodeValue + " " + preorderDisplay(t.left) + " " + preorderDisplay(t.right);
    }

    public String postorderDisplay(TNode<T> t) {
        if (t == null) return "";
        return postorderDisplay(t.left) + " " + postorderDisplay(t.right) + " " + t.nodeValue;
    }

    public static TNode<Integer> bulldTreeExample() {
        TNode<Integer> root, p, q, r;
        p = new TNode<Integer>(20);
        q = new TNode<Integer>(40);
        r = new TNode<Integer>(30, q, null);
        root = new TNode<Integer>(10, p, r);
        return root;
    }

    public static TNode<Character> bulldTree1() {
        TNode<Character> a, b, c, d, e, f, g, h, j;
        d = new TNode<>('D');
        g = new TNode<>('G');
        e = new TNode<>('E', g, null);
        b = new TNode<>('B', d, e);
        h = new TNode<>('H');
        j = new TNode<>('J');
        f = new TNode<>('F', h, j);
        c = new TNode<>('C', null, f);
        a = new TNode<>('A', b, c);
        return a;
    }

    public static TNode<Character> bulldTree2() {
        TNode<Character> a, b, c, d, e, f, g, h, i;
        g = new TNode<>('G');
        d = new TNode<>('D', null, g);
        b = new TNode<>('B', d, null);
        h = new TNode<>('H');
        i = new TNode<>('I');
        e = new TNode<>('E', h, i);
        f = new TNode<>('F');
        c = new TNode<>('C', e, f);
        a = new TNode<>('A', b, c);
        return a;
    }

    public static TNode<Character> buildTree3() {
        TNode<Character> a, b, c, d, e, mul, sub, div, add;
        // Membuat node daun
        a = new TNode<>('a');
        b = new TNode<>('b');
        c = new TNode<>('c');
        d = new TNode<>('d');
        e = new TNode<>('e');
        // Membuat node operator dan menggabungkannya dengan anak-anaknya
        mul = new TNode<>('*', a, b);
        sub = new TNode<>('-', c, d);
        div = new TNode<>('/', sub, e);
        add = new TNode<>('+', mul, div);
        return add;
    }


    // untuk mendapatkan kedalaman dari Binary Tree
    public static <T> int height(TNode<T> t) {
        int heightLeft, heightRight, heightVal;
        if (t == null) {// tinggi dari tree kosong adalah -1
            heightVal = -1;
        } else {
            // mendapatkan kedalaman dari subtree kiri dari t
            heightLeft = height(t.left);
            // mendapatkan kedalaman dari subtree kanan dari t
            heightRight = height(t.right);
            // kedalaman dari tree dari root t adalah 1 + maximum dari kedalaman dua subtree t
            heightVal = 1 + (heightLeft > heightRight ? heightLeft : heightRight);
        }
        return heightVal;
    }

    // untuk mengkopi Binary Tree
    public static <T> TNode<T> copyTree(TNode<T> t) {
        TNode<T> newLeft, newRight, newNode;
        if (t == null) {
            return null;
        }
        newLeft = copyTree(t.left);
        newRight = copyTree(t.right);
        newNode = new TNode<>(t.nodeValue, newLeft, newRight);
        return newNode;
    }
    // untuk menghapus Binary Tree
    public static <T> void clearTree(TNode<T> t) {
        if (t != null) {
            clearTree(t.left);
            clearTree(t.right);
            t.left = null;
            t.right = null;
        }
    }
}
