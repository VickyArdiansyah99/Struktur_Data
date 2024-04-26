/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet01;

/**
 *
 * @author user
 */
public class Anggota {
    private String nama;
    private int id;
    // Konstruktor
    public Anggota(String nama, int id) {
        this.nama = nama;
        this.id = id;
    }
    // Getter untuk nama anggota
    public String getNama() {
        return nama;
    }
    // Getter untuk ID anggota
    public int getId() {
        return id;
    }
}
