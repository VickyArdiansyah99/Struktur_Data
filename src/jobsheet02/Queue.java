/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jobsheet02;

/**
 *
 * @author user
 */
public interface Queue<E> {
    void enqueue(E irem);
    E dequeue();
    E peek();
    boolean isEmpty();
    int size();
}
