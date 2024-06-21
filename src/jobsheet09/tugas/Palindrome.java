package jobsheet09.tugas;

import java.util.Scanner;
import jobsheet09.percobaan.ALStack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String input = scanner.nextLine();
        
        // Membalik kalimat menggunakan Stack
        ALStack<Character> stack = new ALStack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Menentukan apakah kalimat tersebut palindrom
        boolean isPalindrome = input.equals(reversed.toString());

        // Menampilkan hasil
        System.out.println("Hasil = " + reversed.toString());
        if (isPalindrome) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Bukan palindrom");
        }

        scanner.close();
    }
}
