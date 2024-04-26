/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jobsheet02;

import java.util.Collection;

/**
 *
 * @author user
 */
public interface Map<K, V> {
    void put(K key, V value);
    V get(K key);
    V remove(K key);
    boolean containsKey(K key);
    boolean isEmpty();
    int size();
    Set<K> keySet();
    Collection<V> values();
    void clear();
}
