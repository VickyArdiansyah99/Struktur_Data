/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet02;

/**
 *
 * @author user
 */
public class ArrayStack<E> implements Stack<E> {
    private E[] array;
    private int top;
    public ArrayStack(int capacity) {
        array = (E[]) new Object[capacity];
        top = -1;
    }
    public void push(E item) {
        if (top == array.length - 1) {
            throw new IllegalStateException("Stack is full");
        }
        array[++top] = item;
    }
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top--];
    }
    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
}
