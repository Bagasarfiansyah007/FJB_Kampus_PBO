

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
        System.out.println("| 1.Input data Barang                         |");
        System.out.println("| 2.Update data Barang                        |");
        System.out.println("| 3.Tampil Product                            |");
        System.out.println("| 0.Keluar                                    |");
        System.out.println("-----------------------------------------------");
        System.out.println(" ");   
    }
    
    public void setProdukterjual(int Produk_terjual){
        this.Produk_terjual = Produk_terjual;
    }
    
    public void setSaldoPenjualan(int saldo_penjualan){
        this.saldo_penjualan = saldo_penjualan;
    }
    
    public int getProdukterjual(){
        return Produk_terjual;
    }
    
    public int getSaldoPenjualan(){
        return saldo_penjualan;
    }
    
}
