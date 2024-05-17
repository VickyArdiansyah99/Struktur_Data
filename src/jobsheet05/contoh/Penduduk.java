package jobsheet05.contoh;

public class Penduduk implements Comparable<Penduduk>{
    private String nama;
    private int usia;

    public Penduduk(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    @Override
    public int compareTo(Penduduk o) {
//        return this.usia - o.getUsia();
        return this.nama.compareTo(o.getNama());
    }

    @Override
    public String toString() {
        return this.nama+"-"+this.usia;
    }
    
}
