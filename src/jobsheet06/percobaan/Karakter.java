package jobsheet06.percobaan;

public class Karakter {
    public static void CharCombination(String a, int n) {
        if (n == 0) {
            System.out.print(a + " ");
        } else {
            for (int i = 97; i < 99; i++) {
                CharCombination(a + (char) i, n - 1);
            }
        }
    }
    public static void main(String[] args) {
        CharCombination("", 2);
    }
}
