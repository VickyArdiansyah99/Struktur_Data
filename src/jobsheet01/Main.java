/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet01;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Java", "John Doe");
        Buku buku2 = new Buku("Dasar Algoritma", "Jane Smith");
        
        Anggota anggota1 = new Anggota("Alice", 1001);
        Anggota anggota2 = new Anggota("Bob", 1002);
        
        Perpustakaan perpustakaan = new Perpustakaan(10, 5);
        
        perpustakaan.tambahBuku(buku1, 0);
        perpustakaan.tambahBuku(buku2, 1);
        
        perpustakaan.tambahAnggota(anggota1, 0);
        perpustakaan.tambahAnggota(anggota2, 1);
        
        perpustakaan.cetakInfoBuku();
        perpustakaan.cetakInfoAnggota();
    }
}
