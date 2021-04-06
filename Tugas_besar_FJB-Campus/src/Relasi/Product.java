
package Relasi;
import Entitas.Penjual;
import Entitas.User;
import java.util.Scanner;

public class Product extends Penjual{
    private String id_barang;
    private String nama;
    private String kategori;
    private int Harga;
    private int indeksglobal = 0;
    public int i = 0 ;
    
    User L = new Penjual();
    Penjual Le = (Penjual) L;
    
    
    public void setBarang(User[] data,int indeks){
        Scanner input = new Scanner(System.in);
        
        System.out.println("-----------------------------------------------");
        System.out.println("|            Input Product Jualan             |");
        System.out.println("-----------------------------------------------");
        
        id_barang = "PRD0";
        System.out.print("ID Barang               : ");
        System.out.println(id_barang);
        
        Le.setNim(data[indeks].getNim());
        System.out.print("nim mahasiswa           : ");
        System.out.println(Le.getNim());
        
        Le.setNama(data[indeks].getNama());
        System.out.print("Nama mahasiswa          : ");
        System.out.println(Le.getNama());
        
        Le.setFakultas(data[indeks].getfakultas());
        System.out.print("Fakultas mahasiswa      : ");
        System.out.println(Le.getfakultas());
        
        Le.setNo(data[indeks].getNo());
        System.out.print("Telphone mahasiswa      : ");
        System.out.println(Le.getNo());
        
        System.out.print("nama Barang             : ");
        nama = input.nextLine();
        
        System.out.println("-----------------------");
        System.out.println("|   kategori Barang   |");
        System.out.println("-----------------------");
        System.out.println("| 1.Elektronik        |");
        System.out.println("| 2.Fashion           |");
        System.out.println("| 3.Kecantikan        |");
        System.out.println("| 4.Makanan           |");
        System.out.println("-----------------------");
        System.out.print("Masukan Pilihan(1/2/3/4) : ");
        int nopilihan = input.nextInt();
        
        if(nopilihan == 1) {
            kategori = "Elektronik";
        } else if (nopilihan == 2) {
            kategori = "Fashion";
        } else if (nopilihan == 3) {
            kategori = "Kecantikan";
        } else if (nopilihan == 4) {
            kategori = "Makanan";
        } else {
            System.out.println("-------------------------------------------");
            System.out.println("|      Input Yang anda masukan Salah      |");
            System.out.println("-------------------------------------------");
        }
        
        System.out.print("Harga Barang             : ");
        Harga = input.nextInt();
        
        System.out.println("-------------------------------------------");
        System.out.println("|      Input Penjualan Barang Sukses      |");
        System.out.println("-------------------------------------------");
       
        
        i++;
    }
    
    
    public String getIdbarang() {
        return id_barang;
    }
    
    public String getNamaBarang() {
        return nama;
    }
    
    public String getKategori() {
        return kategori;
    } 
    
    public int getHarga() {
        return Harga;
    } 
  
    public void inputDataProductJual(Product[] tableProduct,int indeksglobal,User[] tableUser,int indekscari){
        indeksglobal = tableProduct[0].getValue(tableProduct);
        tableProduct[indeksglobal] = new Product();
        tableProduct[indeksglobal-1].setBarang(tableUser, indekscari);
    }
    
    public int getValue(Product[] total){
        int banyak = 0;
        while (total[banyak] != null && banyak <= total.length) {
            banyak = banyak + 1;
        }
        
        return banyak;
    }
    
    public void info(Product[] tableProduct){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                           Produk Tersedia                            |");        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("| Pilih Kategori | 1.Elektronik | 2.Fashion | 3.kecantikan | 4.Makanan |");
        System.out.println("------------------------------------------------------------------------");
        for (int i = 0; i < tableProduct[0].getValue(tableProduct); i++) {
            System.out.println("|                | Id Barang          : " + tableProduct[i].getIdbarang());
            System.out.println("|                | nim mahasiswa      : " + tableProduct[i].getNim());
            System.out.println("|                | Nama mahasiswa     : " + tableProduct[i].getNama());
            System.out.println("|        "+ (i + 1) +"       | Nama Barang        : " + tableProduct[i].getNamaBarang());
            System.out.println("|                | No Telphone        : " + tableProduct[i].getNo());
            System.out.println("|                | Kategori Barang    : " + tableProduct[i].getKategori());
            System.out.println("|                | Harga Barang       : " + tableProduct[i].getHarga());
            System.out.println("------------------------------------------------------------------------");
        }
    }
    
    public void setUserManual(int nim,String nama,String fakultas,String noTelpon,String prodi,String id,String namabarang,String kategori,int harga){
        super.setNim(nim);
        super.setNama(nama);
        super.setFakultas(fakultas);
        super.setProdi(prodi);
        super.setNo(noTelpon);
        this.nama = namabarang;
        this.Harga = harga;
        this.kategori = kategori;
        this.id_barang = id;
    }
    
    public void inputdatapreview (Product[] tableProduct){
        for (int i = 1 ; i < 2 ; i ++) {
            tableProduct[i] = new Product();
        }
        tableProduct[0].setUserManual(1302194007,"Bagas Arfiansyah","FIF","089119231492","RPL","PRD01","Tote Bag","Fashion",10000);
        tableProduct[1].setUserManual(1302191000,"Erlangga saputro","FKB","082144412433","Akutansi","PRD02","Iphone 11 pro","Elektronik",2000000);
    }
}
 
