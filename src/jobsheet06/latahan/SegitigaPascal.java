package jobsheet06.latahan;

import java.util.Scanner;

public class SegitigaPascal {
    public static int pascal(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        }
        return pascal(row - 1, col - 1) + pascal(row - 1, col);
    }

    public static void printSegitigaPascal(int n) {
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n - row - 1; space++) {
                System.out.print("   ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.printf("%6d", pascal(row, col));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris untuk segitiga Pascal: ");
        int numRows = input.nextInt();

        printSegitigaPascal(numRows);

        input.close();
    }
}