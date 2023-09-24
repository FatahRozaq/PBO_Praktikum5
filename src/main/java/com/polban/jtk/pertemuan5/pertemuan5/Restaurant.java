/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polban.jtk.pertemuan5.pertemuan5;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;
/**
 *
 * @author USER
 */
public class Restaurant {
    
    private static final Logger logger = Logger.getLogger(Restaurant.class.getName());
    private List<MenuMakanan> daftarMenu = new ArrayList<>();

    public void tambahMenuMakanan(MenuMakanan menu) {
        daftarMenu.add(menu);
    }

    public void tampilMenuMakanan() {
        for (MenuMakanan menu : daftarMenu) {
            if (!menu.isOutOfStock()) {
                System.out.println(menu.getNama() + "[" + menu.getStok() + "]\tRp. " + menu.getHarga());
            }
        }
    }
    
    public List<MenuMakanan> getDaftarMenu() {
        return daftarMenu;
    }
}
