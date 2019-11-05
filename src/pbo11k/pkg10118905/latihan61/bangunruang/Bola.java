/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan61.bangunruang;

/**
 *
 * @author Fitri
 * NAMA             : Anindira Dina Fitriani
 * NIM              : 10118905
 * KELAS            : IF11 Kariawan
 * Deskripsi        : Program Bangun Ruang
 */
public class Bola extends BangunRuang{

    @Override
    public float hitungVolume() {
        return (4* (PHI*getR()*getR()*getR()))/3;
    }
    
}
