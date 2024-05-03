package jobsheet03dan04.Tugas;

import java.util.Scanner;

public class Buah {
    public static void main(String[] args) {
        String[] buah = new String[5];
        Scanner scanner = new Scanner(System.in);

        // input
        for (int i = 0; i < buah.length; i++) {
            System.out.print("Buah ke-" + (i + 0) + ": ");
            buah[i] = scanner.next();
        }
        
        System.out.println("----------------------");
        // output
        for (int j = 0; j < buah.length; j++) {
            System.out.println(buah[j]);
        }
    }
}
