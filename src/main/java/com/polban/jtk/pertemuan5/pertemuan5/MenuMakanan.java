/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polban.jtk.pertemuan5.pertemuan5;

/**
 *
 * @author USER
 */
public class MenuMakanan {
    private String nama;
    private double harga;
    private int stok;

    public MenuMakanan(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            throw new IllegalArgumentException("Stok tidak boleh negatif");
        }
    }

    public boolean isOutOfStock() {
        return stok == 0;
    }
}


