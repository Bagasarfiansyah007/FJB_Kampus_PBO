package Relasi;

import java.util.Scanner;
import Entitas.User;

public class Chcekout extends Product{
    int no = 0;
    private String no_order;
    private int total_harga;
    
    
    
    public void add_order(Product[] produk,int indeksglobal, int indeksNo){
        this.no = indeksNo + 1;
        Scanner input = new Scanner(System.in);
        produk[0].info(produk);
        System.out.println(" ");        
        System.out.println("------------ Pilih menu ------------");
        System.out.println("| 1 | Pilih Kategori               |");
        System.out.println("| 2 | Cari Barang                  |");
        System.out.println("| 3 | Checkout barang              |");
        System.out.println("| 0 | keluar barang                |");
        System.out.println("------------------------------------");
        
        System.out.print("Masukan No pilihan  : ");
        int nopilihan = input.nextInt();
        while (nopilihan != 0) {
            if (nopilihan == 1) {
                produk[0].info(produk);
                System.out.print("Masukan No Kategori : ");
                nopilihan = input.nextInt();
                if (nopilihan != 0) {
                    produk[0].infoBerdasarkanKategori(produk, nopilihan);
                } else {
                    System.out.print("Anda keluar");
                }
            } else if(nopilihan == 2) {
                System.out.print("Masukan Nama barang : ");
                String cari = input.nextLine();
                cari = input.nextLine();
                produk[0].infoBerdasarkanPencarian(produk, cari);
            } else if(nopilihan == 3) {
                System.out.print("Masukan No pilihan  : ");
                nopilihan = input.nextInt();
                int i = 0;
                
                while (nopilihan != produk[i].getNopilihan() && produk[i] != null && i < produk[0].getValue(produk)) {
                    i = i + 1;
                }
                
                no_order = "ORD0" + no;
                System.out.println("No Order     : " + no_order );

                super.setIdBarang(produk[i].getIdbarang());
                System.out.println("Id Barang    : " + produk[i].getIdbarang());

                super.setNamaBarang(produk[i].getNamaBarang());
                System.out.println("Nama Barang  : " + produk[i].getNamaBarang());

                super.setNama(produk[i].getNama());
                System.out.println("Nama Penjual : " + produk[i].getNama());

                super.setHarga(produk[i].getHarga());
                System.out.println("Harga Barang : " + produk[i].getHarga());
                
                no = no + 1;
            }
            
            System.out.println(" ");        
            System.out.println("------------ Pilih menu ------------");
            System.out.println("| 1 | Pilih Katefori               |");
            System.out.println("| 2 | Cari Barang                  |");
            System.out.println("| 3 | Checkout barang              |");
            System.out.println("| 0 | keluar barang                |");
            System.out.println("------------------------------------");

            System.out.print("Masukan No pilihan  : ");
            nopilihan = input.nextInt();
        }       
    }
    
    public void inputDataCheckout(Chcekout[] tablecheckout,Product[] tableProduct,int indeksglobal, int indeksNo){
        indeksglobal = tablecheckout[0].getValue(tablecheckout);
        tablecheckout[indeksglobal] = new Chcekout();
        tablecheckout[indeksglobal-1].add_order(tableProduct,indeksglobal, indeksNo);
    }
    
    public int getNochcekout() {
        return no;
    }
    
    public String getNoorder(){
        return no_order;
    }
    
    public int getTotalharga(){
        return total_harga;
    }
    
    public void info(Chcekout[] chcekout,User[] user,int indeks){
        System.out.println("------------------------------------------------");
        System.out.println("|               Checkout Product               |");
        System.out.println("------------------------------------------------");
        System.out.println("|    Sukses login sebagai user : " + user[indeks].getNim() + "    |");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < chcekout[0].getValue(chcekout) - 1; i++) {
            System.out.println("|           | No order          : " + chcekout[i].getNoorder());
            System.out.println("|           | Id barang         : " + chcekout[i].getIdbarang());
            System.out.println("|    "+ chcekout[i].getNochcekout()+"      | Nama Barang       : " + chcekout[i].getNamaBarang());
            System.out.println("|           | Nama Penjual      : " + chcekout[i].getNama());
            System.out.println("|           | Harga Barang      : " + chcekout[i].getHarga());
            System.out.println("------------------------------------------------");
        }
    }
    
    public int getValue(Chcekout[] total){
        int banyak = 0;
        while (total[banyak] != null && banyak <= total.length) {
            banyak = banyak + 1;
        }
        
        return banyak;
    }
    
    public void setNo(String no_order){
        this.no_order = no_order;
    }
    
    public void setHarga(int total) {
        total_harga = total;
    }
    
    public String getNo(){
        return no_order;
    }
    
    public int getHarga(){
        return total_harga;
    }    
}
