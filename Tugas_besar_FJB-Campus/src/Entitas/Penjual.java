
package Entitas;

import java.util.Scanner;


public class Penjual extends User {
    private int Produk_terjual;
    private int saldo_penjualan;
    
    
    public void tampilanMenuPenjual (User[] tableUser,int indeks){
        System.out.println("-----------------------------------------------");
        System.out.println("|            Login Sebagai Penjual            |");
        System.out.println("-----------------------------------------------");
        System.out.println("|    Sukses login sebagai user : " + tableUser[indeks].getNim() + "   |");
        System.out.println("-----------------------------------------------");
        System.out.println("1.Input User");
        System.out.println("2.Tampil data");
        System.out.println("0.Keluar");
        System.out.println(" ");   
    }
}
