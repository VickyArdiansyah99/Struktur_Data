package jobsheet12.percobaan;

import jobsheet12.TNode;

public class TestBinaryTree {
    public static void main(String[] args) {
        // Instantiate object BinaryTree
        BinaryTree<Integer> integerTree = new BinaryTree<>();
        BinaryTree<Character> characterTree = new BinaryTree<>();

        System.out.println("==Build tree untuk Gambar Example==");
        TNode<Integer> root = BinaryTree.bulldTreeExample();
        System.out.println("Tampilan Inorder tree: " + integerTree.inorderDisplay(root));
        System.out.println("Tampilan Preorder tree: " + integerTree.preorderDisplay(root));
        System.out.println("Tampilan Postorder tree: " + integerTree.postorderDisplay(root));
        // Testing height method
        System.out.println("Kedalaman Binary Tree: " + BinaryTree.height(root));
        // Testing copyTree method
        TNode<Integer> copiedRoot = BinaryTree.copyTree(root);
        System.out.println("Kedalaman Binary Tree setelah copy: " + BinaryTree.height(copiedRoot));
        // Testing clearTree method
        BinaryTree.clearTree(root);
        System.out.println("Kedalaman Binary Tree setelah clear: " + BinaryTree.height(root));

        System.out.println("\n==Build tree Studi kasus 1==");
        TNode<Character> root1 = BinaryTree.bulldTree1();
        // Testing height method
        System.out.println("Kedalaman Binary Tree: " + BinaryTree.height(root1));
        // Testing copyTree method
        TNode<Character> copiedRoot1 = BinaryTree.copyTree(root1);
        System.out.println("Kedalaman Binary Tree setelah copy: " + BinaryTree.height(copiedRoot1));
        // Testing clearTree method
        BinaryTree.clearTree(root1);
        System.out.println("Kedalaman Binary Tree setelah clear: " + BinaryTree.height(root1));

        System.out.println("\n==Build tree Studi kasus 2==");
        TNode<Character> root2 = BinaryTree.bulldTree2();
        // Testing height method
        System.out.println("Kedalaman Binary Tree: " + BinaryTree.height(root2));
        // Testing copyTree method
        TNode<Character> copiedRoot2 = BinaryTree.copyTree(root2);
        System.out.println("Kedalaman Binary Tree setelah copy: " + BinaryTree.height(copiedRoot2));
        // Testing clearTree method
        BinaryTree.clearTree(root2);
        System.out.println("Kedalaman Binary Tree setelah clear: " + BinaryTree.height(root2));

        System.out.println("\n==Build tree Studi kasus 3==");
        TNode<Character> root3 = BinaryTree.buildTree3();
        String expression = characterTree.inorderDisplay(root3);
        System.out.println("Expression: " + expression);
        // Testing height method
        System.out.println("Kedalaman Binary Tree: " + BinaryTree.height(root3));
        // Testing copyTree method
        TNode<Character> copiedRoot3 = BinaryTree.copyTree(root3);
        System.out.println("Kedalaman Binary Tree setelah copy: " + BinaryTree.height(copiedRoot3));
        // Testing clearTree method
        BinaryTree.clearTree(root3);
        System.out.println("Kedalaman Binary Tree setelah clear: " + BinaryTree.height(root3));
    }
}
