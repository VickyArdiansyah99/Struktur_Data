package uts;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        //no1
        List<String> aList = new LinkedList<String>();
        aList.add("Merah");
        aList.add("Biru");
        aList.add("Hijau");
        aList.add("Hitam"); //no2
        aList.add("Biru"); //no2
        
        System.out.print(aList);
        //no2
        int jlmBiru = 0;
        for (String color : aList) {
            if (color.equals("Biru")) {
                jlmBiru++;
            }
        }
        System.out.println(" Biru = " + jlmBiru);
        
        StringBuilder positions = new StringBuilder();
        for (int i = 0; i < aList.size(); i++) {
            if (aList.get(i).equals("Biru")) {
                if (positions.length() > 0) {
                    positions.append(",");
                }
                positions.append(i);
            }
        }
        System.out.println("Posisi di index " + positions.toString() + ".");
        //no3
        aList.remove(1);
        System.out.println(aList);
        //no4
        System.out.println("Index ke-1 : " + aList.get(1));
        System.out.println("Index ke-3 : " + aList.get(3));
        aList.remove(1);
        System.out.println(aList);
        //no5
        aList.set(0, "Ungu");
        System.out.println(aList);
        aList.add(1, "Coklat");
        System.out.println(aList);
        //no6
        aList.addFirst("Kuning");
        aList.addFirst("Merah");
        System.out.println(aList);
        //no7
        aList.addLast("Hijau");
        aList.addLast("Orange");
        System.out.println(aList);
        //no8
        System.out.println("Elemen pertama : " + aList.getFirst());
        System.out.println("Elemen terakhir : " + aList.getLast());
        //no9
        aList.removeFirst();
        System.out.println(aList);
        aList.removeLast();
        System.out.println(aList);
        //no10
        ListIterator<String> iterator = aList.listIterator(aList.size());
        System.out.print("[");
        while (iterator.hasPrevious()) {            
            System.out.print(iterator.previous());
            if (iterator.hasPrevious()) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        // no 11
        Collections.sort(aList);
        System.out.println(aList);
    }
}
