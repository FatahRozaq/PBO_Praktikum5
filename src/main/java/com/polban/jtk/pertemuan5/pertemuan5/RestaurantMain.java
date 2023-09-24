/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.polban.jtk.pertemuan5.pertemuan5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author USER
 */
public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        MenuMakanan menu1 = new MenuMakanan("Bala-Bala", 1000, 20);
        MenuMakanan menu2 = new MenuMakanan("Gehu", 1000, 20);
        MenuMakanan menu3 = new MenuMakanan("Tahu", 1000, 0);
        MenuMakanan menu4 = new MenuMakanan("Molen", 1000, 20);

        restaurant.tambahMenuMakanan(menu1);
        restaurant.tambahMenuMakanan(menu2);
        restaurant.tambahMenuMakanan(menu3);
        restaurant.tambahMenuMakanan(menu4);

        Scanner scanner = new Scanner(System.in);
        boolean pesanLagi = true;
        List<Penjualan> penjualanList = new ArrayList<>();

        while (pesanLagi) {
            System.out.println("Menu Makanan:");
            restaurant.tampilMenuMakanan();

            System.out.print("Pilih nama menu: ");
            String namaMenu = scanner.nextLine();
            System.out.print("Jumlah yang dipesan: ");
            int jumlah = scanner.nextInt();

            MenuMakanan menuDipesan = null;
            for (MenuMakanan menu : restaurant.getDaftarMenu()) {
                if (menu.getNama().equalsIgnoreCase(namaMenu)) {
                    menuDipesan = menu;
                    break;
                }
            }

            if (menuDipesan != null) {
                if (menuDipesan.getStok() >= jumlah) {
                    double totalHarga = menuDipesan.getHarga() * jumlah;
                    penjualanList.add(new Penjualan(namaMenu, jumlah, totalHarga));
                    menuDipesan.setStok(menuDipesan.getStok() - jumlah);

                    System.out.println("Pesanan Anda (" + namaMenu + " x" + jumlah + ") berhasil dipesan.");
                } else {
                    System.out.println("Maaf, stok " + namaMenu + " tidak mencukupi.");
                }
            } else {
                System.out.println("Menu " + namaMenu + " tidak ditemukan.");
            }

            System.out.print("Pesan lagi? (ya/tidak): ");
            String pesanLagiStr = scanner.nextLine();
            pesanLagi = pesanLagiStr.equalsIgnoreCase("ya");
        }

        System.out.println("Pesanan Anda:");
        for (Penjualan penjualan : penjualanList) {
            System.out.println(penjualan.getNamaProduk() + " x" + penjualan.getQuantity() + " = Rp. " + penjualan.getHargaTotal());
        }

        double totalBayar = penjualanList.stream().mapToDouble(Penjualan::getHargaTotal).sum();
        System.out.println("Total Bayar: Rp. " + totalBayar);

        System.out.println("Terima kasih telah memesan!");
    }
}
