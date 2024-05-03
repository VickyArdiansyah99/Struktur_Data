package jobsheet03dan04.LangkahKerja;

import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        // deklarasi variabel
        String nama, alamat;
        int usia, anakke;
        
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        // Tampilan output ke user
        System.out.println("### Pendapatan Mahasiswa Amik PGRI Kebumen ###");
        System.out.print("Nama Mahasiswa: ");
        // menggunakan scenner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.next();
        // Tampilkan output lagi
        System.out.print("Alamat: ");
        // menggunakan scenner lagi
        alamat = keyboard.next();
        
        System.out.print("Usia (angka dalam tahun): ");
        usia = keyboard.nextInt();
        
        System.out.print("Anak Ke: ");
        anakke = keyboard.nextInt();
        
        // menampilkan apa yang sudah tersimpan di variabel
        System.out.println("-----------------------");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Anak Ke: " + anakke);
    }
}
