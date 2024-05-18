package jobsheet06.latahan;

import java.util.Scanner;

public class KombinasiDanFaktorial {

    public static void kombinasiKarakter(String prefix, int n, int totalKarakter) {
        if (n == 0) {
            System.out.print(prefix + " ");
        } else {
            for (int i = 97; i < 97 + totalKarakter; i++) {
                kombinasiKarakter(prefix + (char) i, n - 1, totalKarakter);
            }
        }
    }

    public static int faktorial(int x) {
        if (x <= 1) {
            return 1;
        } else {
            return x * faktorial(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah karakter = ");
        int N = input.nextInt();

        System.out.print("Semua kombinasi: ");
        kombinasiKarakter("", N, N);
        System.out.println();

        System.out.println("Faktorial dari " + N + " adalah: " + faktorial(N));
    }
}
