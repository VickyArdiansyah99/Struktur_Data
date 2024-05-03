package jobsheet03dan04.LangkahKerja;

public class ArrayKosong {
    public static void main(String[] args) {
        // cara pertama
        String[] nama;

        //cara kedua
        String nama1[];

        // cara ketiga dengan kata kunci new
        String[] nama2 = new String[5];
        
        nama2[0] = "Linda";
        nama2[1] = "Santi";
        nama2[2] = "Susan";
        nama2[3] = "Mila";
        nama2[4] = "Ayu";
        
        String[] nama3 = {"Linda", "Santi", "Susan", "Mila", "Ayu"};

        // mengambil data array
        System.out.println(nama3[2]);
    }
}
