/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan41.objectorientedmassajenis;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini untuk menghitung massa jenis dengan berbasis
 *                     Objek.
 */
public class Kubus {
    private int sisi, massa;
    
    public int getSisi() {
        return this.sisi;
    }
    
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    public int getMassa() {
        return this.massa;
    }
    
    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi) {
        return parSisi * parSisi * parSisi;
    }
    
    public int hitungMassaJenis(int parMassa, int volume) {
        return parMassa / volume;
    }

}
