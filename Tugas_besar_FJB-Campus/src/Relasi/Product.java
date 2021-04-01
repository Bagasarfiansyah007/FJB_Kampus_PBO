/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relasi;
import java.util.Scanner;
import Entitas.Penjual;
/**
 *
 * @author AMS
 */
public class Product {
    private String id_produk;
    private String nama_produk;
    private String author;
    private int harga;
    private String kategori;
    private int beratBarang;
    Scanner input = new Scanner(System.in);
    
    public void setId(String id){
        System.out.println("ID Produk: ");
        id = input.nextLine();
        id_produk = id;
    }
    public void setNamaProduk(String nama){
        System.out.println("Nama Produk: ");
        nama = input.nextLine();
        nama_produk = nama;
    }
    public void setHarga(int price){
        System.out.println("Harga Produk: ");
        price = input.nextInt();
        harga = price;
    }
    public void setKategori(String category){
        System.out.println("Kategori  : ");
        category = input.nextLine();
        kategori = category;
    }
    public void setBerat(int berat){
        System.out.println("Berat Produk: ");
        berat = input.nextInt();
        beratBarang = berat;
    }
    public String getId(){
        return id_produk;
    }
    public String getNamaProduk(){
        return nama_produk;
    }
    public int getHarga(){
        return harga;
    }
    public String getKategori(){
        return kategori;
    }
    public int getBerat(){
        return beratBarang;
    }
    public void info(){
        System.out.println("ID Produk: " + getId());
        System.out.println("Nama Produk: " + getNamaProduk());
        System.out.println("Harga Produk: " + getHarga());
        System.out.println("Kategori Produk: " + getKategori());
        System.out.println("Berat Produk: " + getBerat());
    }
}
