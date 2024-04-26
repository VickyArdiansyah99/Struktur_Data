/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet01;

/**
 *
 * @author user
 */
public class Buku {
    private String judul;
    private String pengarang;
    // Konstruktor
    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }
    // Getter untuk judul buku
    public String getJudul() {
        return judul;
    }
    // Getter untuk pengarang buku
    public String getPengarang() {
        return pengarang;
    }
}
