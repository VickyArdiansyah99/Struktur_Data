/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jobsheet02;

/**
 *
 * @author user
 */
public interface Stack<E> {
    void push(E item);
    E pop();
    E peek();
    boolean isEmpty();
}
