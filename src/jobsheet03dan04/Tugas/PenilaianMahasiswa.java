package jobsheet03dan04.Tugas;

import java.util.Scanner;

public class PenilaianMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        // Input jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = scanner.nextInt();
        // membuat array untuk nama mahasiswa
        String[] namaMahasiswa = new String[jumlahMahasiswa];
        // Membuat array untuk nama mata kuliah
        String[] namaMataKuliah = new String[jumlahMataKuliah];
        // input nama mahasiswa
        scanner.nextLine();
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa " + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();
        }
        // Input nama mata kuliah
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Masukkan nama mata kuliah " + (i + 1) + ": ");
            namaMataKuliah[i] = scanner.nextLine();
        }
        // membuat array untuk nilai mahasiswa
        float[][] nilaiMahasiswa = new float[jumlahMahasiswa][jumlahMataKuliah];
        // input nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai untuk " + namaMahasiswa[i]);
            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Nilai " + namaMataKuliah[j] + ": ");
                nilaiMahasiswa[i][j] = scanner.nextFloat();
            }
        }
        // Output nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nNilai Mahasiswa:");
            System.out.println("Mahasiswa " + namaMahasiswa[i]);
            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.println(namaMataKuliah[j] + ": " + nilaiMahasiswa[i][j]);
            }
        }
    }
}
