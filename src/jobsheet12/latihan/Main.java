package jobsheet12.latihan;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Menyisipkan node
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Traversal inorder
        System.out.println("Inorder traversal:");
        bst.inorder();

        // Mencari nilai
        System.out.println("Search 40: " + bst.search(40)); // true
        System.out.println("Search 25: " + bst.search(25)); // false

        // Menghapus nilai
        System.out.println("Delete 20");
        bst.delete(20);
        System.out.println("Inorder traversal after deleting 20:");
        bst.inorder();

        System.out.println("Delete 30");
        bst.delete(30);
        System.out.println("Inorder traversal after deleting 30:");
        bst.inorder();

        System.out.println("Delete 50");
        bst.delete(50);
        System.out.println("Inorder traversal after deleting 50:");
        bst.inorder();
    }
}
