/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polban.jtk.pertemuan5.pertemuan5;

/**
 *
 * @author USER
 */
public class Penjualan {
    private String namaProduk;
    private int quantity;
    private double hargaTotal;

    public Penjualan(String namaProduk, int quantity, double hargaTotal) {
        this.namaProduk = namaProduk;
        this.quantity = quantity;
        this.hargaTotal = hargaTotal;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getHargaTotal() {
        return hargaTotal;
    }
}

