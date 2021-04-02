/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relasi;

/**
 *
 * @author AMS
 */
public class Chcekout extends User{
    private String no_order;
    private int jumlah_order;
    private String tanggal_order;
    private int total_harga;
    
    
    
    public void add_order(){
        int jumlah, total;
        String no, tanggal;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("No Order: ");
        no = input.nextLine();
        
        System.out.println("Jumlah Order: ");
        jumlah = input.nextInt();
        
        System.out.println("Tanggal Order: ");
        tanggal = input.nextLine();
        
        System.out.println("Total harga: ");
        total = input.nextInt();
    }
    public void delete_order(){
        
    }
    public void setNo(String no_order){
        this.no_order = no_order;
    }
    public void setJumlah(int jumlah_order){
        this.jumlah_order = jumlah_order;
    }
    public void setTanggal(String tanggal_order){
        this.tanggal_order = tanggal_order;
    }
    public void setTotal(int total_harga){
        this.total_harga = total_harga;
    }
    public String getNo(){
        return no_order;
    }
    public int getJumlah(){
        return jumlah_order;
    }
    public String getTanggal(){
        return tanggal_order;
    }
    public int getTotal(){
        return total_harga;
    }
}
