package jobsheet03dan04.LangkahKerja;

public class Array2D {
    public static void main(String[] args) {
        String[][] kontak = {{"Lili","08111"},{"Lala","08222"},{"Lulu","08333"}};
        for (int x = 0; x < kontak.length; x++) {
            System.out.println("Nama: " + kontak[x][0]);
            System.out.println("Nama: " + kontak[x][1]);
            System.out.println("----------------------");
        }
    }
}
