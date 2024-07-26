package uas;

import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Kondisi awal stack kosong?: " + stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Setelah dilakukan operasi push...");
        System.out.print("Cetak elemen stack....\n");
        displayStack(stack);

        System.out.println("Item yang dipop: " + stack.pop());
        System.out.println("\nItem yang dipops: " + stack.pop());

        System.out.println("Setelah dilakukan operasi pop...");
        System.out.print("Cetak elemen stack....\n");
        displayStack(stack);
    }

    private static void displayStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = (Stack<Integer>) stack.clone();

        while (!tempStack.isEmpty()) {
            System.out.print(tempStack.pop() + " ");
        }
        System.out.println();
    }
}
