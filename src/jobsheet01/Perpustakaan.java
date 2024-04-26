/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet01;

/**
 *
 * @author user
 */
public class Perpustakaan {
    private Buku[] koleksiBuku;
    private Anggota[] anggota;
    // Konstruktor
    public Perpustakaan(int maxBuku, int maxAnggota) {
        koleksiBuku = new Buku[maxBuku];
        anggota = new Anggota[maxAnggota];
    }
    // Metode untuk menambahkan buku ke koleksi perpustakaan
    public void tambahBuku(Buku buku, int indeks) {
        koleksiBuku[indeks] = buku;
    }
    // Metode untuk menambahkan anggota baru
    public void tambahAnggota(Anggota anggota, int indeks) {
        this.anggota[indeks] = anggota;
    }
    // Metode untuk mencetak informasi buku di perpustakaan
    public void cetakInfoBuku() {
        System.out.println("Daftar Buku di Perpustakaan:");
        for (Buku buku : koleksiBuku) {
            if (buku != null) {
                System.out.println("Judul: " + buku.getJudul() + ", Pengarang: " + buku.getPengarang());
            }
        }
    }
    // Metode untuk mencetak informasi anggota perpustakaan
    public void cetakInfoAnggota() {
        System.out.println("\nDaftar Anggota Perpustakaan:");
        for (Anggota anggota : anggota) {
            if (anggota != null) {
                System.out.println("Nama: " + anggota.getNama() + ", ID: " + anggota.getId());
            }
        }
    }
}
