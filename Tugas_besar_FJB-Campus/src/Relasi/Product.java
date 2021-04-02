/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relasi;
import Entitas.Penjual;
import java.util.Scanner;

public class Product extends Penjual{

    public int indeks = 0;
    private String id_produk;
    private String nama_product;
    private int Harga;
    private String kategori;
    
    public void setProduct (Penjual cari){
        super.setNim(cari.getNim());
        super.setNama(cari.getNama());
        super.setFakultas(cari.getfakultas());
        super.setProdi(cari.getProdi());
        
        System.out.println("NIM Mahasiswa      : " + cari.getNim());
        System.out.println("Nama Mahasiswa     : " + cari.getNama());
        System.out.println("Fakultas Mahasiswa : " + cari.getfakultas());
        System.out.println("Prodi Mahasiswa    : " + cari.getProdi());
        
        Scanner input = new Scanner(System.in);
        
        id_produk = "PRD0" + (indeks) ;
        System.out.print  ("Id Product         : " + id_produk);
         
        
        System.out.print  ("Nama Product       : ");
        nama_product = input.nextLine();
        
        Harga = input.nextInt();
        
        System.out.print  ("Harga Product      : ");
        Harga = input.nextInt();
        
        System.out.println("");
        
        System.out.println("Kategori Product");
        System.out.println("----------------------");
        System.out.println("1.Elektronik");
        System.out.println("2.Fashion");
        System.out.println("3.Sport");
        System.out.println("4.Lainnya");
        
        System.out.print  ("pilih 1/2/3/4       : ");
        kategori = input.nextLine();
        if (kategori == "1") {
            kategori = "Elektronik";
        } else if (kategori == "2") {
            kategori = "Fashion";
        } else if (kategori == "3") {
            kategori = "Sport";
        } else if (kategori == "4") {
            kategori = "Lainnya";
        }
        
        indeks = indeks + 1;
        
    }
    
    public String getIdproduk(){
        return id_produk;
    }
    
    public String getNama(){
        return nama_product;
    }
    
    public int getHarga(){
        return Harga;
    }
    
    public String getKategori(){
        return kategori;
    }
    
    public void info(){
        System.out.println(" ");
        System.out.println("Id Product       : " + getIdproduk());
        System.out.println("Nama Prdouct     : " + getNama());
        System.out.println("Harga Product    : " + getHarga());
        System.out.println("Kategori Product : " + getKategori());
    }
}
