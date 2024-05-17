package jobsheet05.contoh;

import java.util.Comparator;

public class UsiaComparator implements Comparator<Penduduk>{
    @Override
    public int compare(Penduduk o1, Penduduk o2) {
        return o1.getUsia()-o2.getUsia();
    }
    
}
