package jobsheet05.percobaan;

import java.util.Arrays;

public class TestMahasiswa2 {
    public static void main(String[] args) {
        Mahasiswa dataMhs[] = {new Mahasiswa("05", "Cahaya"),
            new Mahasiswa("04", "Rudi"),
            new Mahasiswa("01", "Endah"),
            new Mahasiswa("03", "Rita"),
            new Mahasiswa("02", "Tika")};
        System.out.println("SEBELUM SORTING");
        System.out.println(Arrays.toString(dataMhs));
        Arrays.sort(dataMhs, new NamaComperator());
        System.out.println("\nSEBELUM SORTING");
        System.out.println(Arrays.toString(dataMhs));
    }
}
