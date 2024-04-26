/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jobsheet02;

/**
 *
 * @author user
 */
public interface JsonMapInterface {
    void put(String key, Object value);
    Object get(String key);
    void remove(String key);
    int size();
    boolean isEmpty();
    String toString();
}
