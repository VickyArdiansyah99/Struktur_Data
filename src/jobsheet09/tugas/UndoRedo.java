package jobsheet09.tugas;

import java.util.Scanner;
import jobsheet09.percobaan.ALStack;

public class UndoRedo {
    private ALStack<String> undoStack = new ALStack<>();
    private ALStack<String> redoStack = new ALStack<>();
    private String currentText = "";

    public static void main(String[] args) {
        UndoRedo editor = new UndoRedo();
        editor.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Teks Sekarang: " + currentText);
            System.out.println("Pilihan Anda:");
            System.out.println("1. Tambah teks");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Tutup");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addText(scanner);
                    break;
                case 2:
                    undo();
                    break;
                case 3:
                    redo();
                    break;
                case 4:
                    System.out.println("Program ditutup.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private void addText(Scanner scanner) {
        System.out.print("Masukan teks tambahan: ");
        String additionalText = scanner.nextLine();
        undoStack.push(currentText);
        currentText += additionalText;
        redoStack.clear();
    }

    private void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(currentText);
            currentText = undoStack.pop();
        } else {
            System.out.println("Tidak ada tindakan yang bisa di-undo.");
        }
    }

    private void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(currentText);
            currentText = redoStack.pop();
        } else {
            System.out.println("Tidak ada tindakan yang bisa di-redo.");
        }
    }
}
