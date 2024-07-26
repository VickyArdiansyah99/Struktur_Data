package uas;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList<String> months = new LinkedList<>();
        Collections.addAll(months, "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli");

        System.out.println("Urutan Asli (unsorted): " + months);

        LinkedList<String> sortedByAlphabet = new LinkedList<>(months);
        Collections.sort(sortedByAlphabet);
        System.out.println("\nLinkedList (Urutkan berdasarkan abjad): " + sortedByAlphabet);

        LinkedList<String> sortedByLength = new LinkedList<>(months);
        sortedByLength.sort(Comparator.comparingInt(String::length));
        System.out.println("LinkedList (Urutkan berdasarkan jumlah karakter huruf): " + sortedByLength);

    }
}
