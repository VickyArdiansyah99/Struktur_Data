/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jobsheet02;

/**
 *
 * @author user
 */
public interface List<E> {
    void add(E element);
    void add(int index, E element);
    E get(int index);
    E remove(int index);
    boolean isEmpty();
    int size();
    boolean contains(E element);
    void clear();
}
