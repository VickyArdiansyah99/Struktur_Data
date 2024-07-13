package jobsheet12.latihan;

import jobsheet12.TNode;

public class BinarySearchTree {
    private TNode<Integer> root;

    public BinarySearchTree() {
        root = null;
    }

    // Metode untuk menyisipkan node baru
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TNode<Integer> insertRec(TNode<Integer> root, int value) {
        if (root == null) {
            root = new TNode<>(value);
            return root;
        }
        if (value < root.nodeValue) {
            root.left = insertRec(root.left, value);
        } else if (value > root.nodeValue) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    // Metode untuk menghapus node
    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private TNode<Integer> deleteRec(TNode<Integer> root, int value) {
        if (root == null) {
            return root;
        }
        if (value < root.nodeValue) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.nodeValue) {
            root.right = deleteRec(root.right, value);
        } else {
            // Node dengan satu atau tanpa anak
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Node dengan dua anak
            root.nodeValue = minValue(root.right);
            root.right = deleteRec(root.right, root.nodeValue);
        }
        return root;
    }

    private int minValue(TNode<Integer> root) {
        int minValue = root.nodeValue;
        while (root.left != null) {
            minValue = root.left.nodeValue;
            root = root.left;
        }
        return minValue;
    }

    // Metode untuk mencari nilai
    public boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(TNode<Integer> root, int value) {
        if (root == null) {
            return false;
        }
        if (root.nodeValue == value) {
            return true;
        }
        return value < root.nodeValue ? searchRec(root.left, value) : searchRec(root.right, value);
    }

    // Metode untuk traversal inorder
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(TNode<Integer> root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.nodeValue + " ");
            inorderRec(root.right);
        }
    }
}
