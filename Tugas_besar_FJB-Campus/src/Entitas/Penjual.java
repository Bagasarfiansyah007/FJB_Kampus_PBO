package Entitas;
import java.util.Scanner;


public class Pembeli extends User{
    private int saldo;
    private int barangTerbeli;
    
    public void tampilMenuPembeli(User[] tableUser,int indeks){
        System.out.println("-----------------------------------------------");
        System.out.println("|            Login Sebagai Pembeli            |");
        System.out.println("-----------------------------------------------");
        System.out.println("|    Sukses login sebagai user : " + tableUser[indeks].getNim() + "    |");
        System.out.println("-----------------------------------------------");
        System.out.println("1.Beli Barang");
        System.out.println("2.Checkout");
        System.out.println("3.Status pembayaran");
        System.out.println("4.Update account");
        System.out.println("0.Keluar");
        System.out.println(" ");
    }
}
