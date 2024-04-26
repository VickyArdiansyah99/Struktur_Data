/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jobsheet02;

/**
 *
 * @author user
 */
public interface Set<E> {
    boolean add(E element);
    boolean remove(E element);
    boolean contains(E element);
    boolean isEmpty();
    int size();
    void clear();
    Set<E> union(Set<E> otherset);
    Set<E> intersection(Set<E> otherset);
    Set<E> difference(Set<E> otherset);
}
