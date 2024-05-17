package jobsheet05.contoh;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Set<Penduduk> set = new TreeSet<Penduduk>(new UsiaComparator());
        set.add(new Penduduk("Toni", 30));
        set.add(new Penduduk("Ucup", 40));
        set.add(new Penduduk("eko", 26));
                
        System.out.println(set);
    }
}
