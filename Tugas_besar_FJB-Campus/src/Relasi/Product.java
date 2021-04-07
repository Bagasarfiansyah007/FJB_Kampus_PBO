package Relasi;
import Entitas.Penjual;
import Entitas.User;
import java.util.Scanner;

public class Product extends Penjual{
    private int no = 0;
    private String id_barang;
    private String nama;
    private String kategori;
    public int Harga;
    
        public void setBarang(User[] data,int indeks,int indeksglobal){
        Scanner input = new Scanner(System.in);
        
        this.no = indeksglobal + 1;
        
        System.out.println("-----------------------------------------------");
        System.out.println("|            Input Product Jualan             |");
        System.out.println("-----------------------------------------------");
        
        id_barang = "PRD0";
        System.out.print("ID Barang               : ");
        System.out.println(id_barang);
        
        super.setNim(data[indeks].getNim());
        System.out.print("nim mahasiswa           : ");
        System.out.println(super.getNim());
        
        super.setNama(data[indeks].getNama());
        System.out.print("Nama mahasiswa          : ");
        System.out.println(super.getNama());
        
        super.setFakultas(data[indeks].getfakultas());
        System.out.print("Fakultas mahasiswa      : ");
        System.out.println(super.getfakultas());
        
        super.setNo(data[indeks].getNo());
        System.out.print("Telphone mahasiswa      : ");
        System.out.println(super.getNo());
        
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
      
    }
    
    public void cariBarang(Product[] produk,String cari){
        int i = 0;
        while(cari.intern() != produk[i].getIdbarang() && i < produk[0].getValue(produk)){
            i = i + 1;
        }
    }
    
    public void updateBarang(Product[] produk,String cari){
        Scanner input = new Scanner(System.in);
        int i = 0;
        for (int j = 0 ; j < produk[0].getValue(produk) ; j++) {
           if (cari.intern() == produk[j].getIdbarang()){
               i = j;
           }
        }
        
        
        System.out.println("-----------------------------------------------");
        System.out.println("|            Update Product Jualan            |");
        System.out.println("-----------------------------------------------");
        
        System.out.print("ID Barang               : ");
        System.out.println(produk[i].getIdbarang());
        
        System.out.print("nim mahasiswa           : ");
        System.out.println(produk[i].getNim());
        
        System.out.print("Nama mahasiswa          : ");
        System.out.println(produk[i].getNama());
        
        System.out.print("Fakultas mahasiswa      : ");
        System.out.println(produk[i].getfakultas());
        
        System.out.print("Telphone mahasiswa      : ");
        System.out.println(produk[i].getNo());
        
        System.out.print("nama Barang             : ");
        nama = input.nextLine();
        produk[i].setNamaBarang(nama);
        
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
            produk[i].setKategoriBarang(kategori);
        } else if (nopilihan == 2) {
            kategori = "Fashion";
            produk[i].setKategoriBarang(kategori);
        } else if (nopilihan == 3) {
            kategori = "Kecantikan";
            produk[i].setKategoriBarang(kategori);
        } else if (nopilihan == 4) {
            kategori = "Makanan";
            produk[i].setKategoriBarang(kategori);
        } else {
            System.out.println("-------------------------------------------");
            System.out.println("|      Input Yang anda masukan Salah      |");
            System.out.println("-------------------------------------------");
        }
        
        System.out.print("Harga Barang             : ");
        Harga = input.nextInt();
        produk[i].setHarga(Harga);
        
        System.out.println("-------------------------------------------");
        System.out.println("|      Input Penjualan Barang Sukses      |");
        System.out.println("-------------------------------------------");
    }
    
    public void setIdBarang(String id_barang){
        this.id_barang = id_barang;
    }
    
    public void setNamaBarang(String nama){
        this.nama = nama;
    }
    
    public void setKategoriBarang(String kategori){
        this.kategori = kategori;
    }
    
    public void setHarga(int Harga) {
        this.Harga = Harga;
    }
    
    public int getNopilihan(){
        return no;
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
    
    public void tampilProductOption(){
        System.out.println(" ");        
        System.out.println("------------ Pilih menu ------------");
        System.out.println("| 1 | Hapus Data Barang            |");
        System.out.println("| 2 | Cari Barang                  |");
        System.out.println("| 3 | Kategori barang              |");
        System.out.println("| 0 | keluar                       |");
        System.out.println("------------------------------------");
        System.out.print("Masukan Pilihan(1/2/3/4) : ");
    }

  
    public void inputDataProductJual(Product[] tableProduct,int indeksglobal,User[] tableUser,int indekscari){
        indeksglobal = tableProduct[0].getValue(tableProduct);
        tableProduct[indeksglobal] = new Product();
        tableProduct[indeksglobal].setBarang(tableUser, indekscari,indeksglobal);
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
            System.out.println("|        "+ tableProduct[i].getNopilihan()+"       | Nama Barang        : " + tableProduct[i].getNamaBarang());
            System.out.println("|                | No Telphone        : " + tableProduct[i].getNo());
            System.out.println("|                | Kategori Barang    : " + tableProduct[i].getKategori());
            System.out.println("|                | Harga Barang       : " + tableProduct[i].getHarga());
            System.out.println("------------------------------------------------------------------------");
        }
    }
    
    public void infoBerdasarkanKategori(Product[] tableProduct,int j){
        boolean kebenaran = true;
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                           Produk Tersedia                            |");        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("| Pilih Kategori | 1.Elektronik | 2.Fashion | 3.kecantikan | 4.Makanan |");
        System.out.println("------------------------------------------------------------------------");
        for (int i = 0; i < tableProduct[0].getValue(tableProduct); i++) {
            if (j == 1 ) {
                if ("Elektronik" == tableProduct[i].getKategori().intern()) {
                    System.out.println("|                | Id Barang          : " + tableProduct[i].getIdbarang());
                    System.out.println("|                | nim mahasiswa      : " + tableProduct[i].getNim());
                    System.out.println("|                | Nama mahasiswa     : " + tableProduct[i].getNama());
                    System.out.println("|        "+ tableProduct[i].getNopilihan()+"       | Nama Barang        : " + tableProduct[i].getNamaBarang());
                    System.out.println("|                | No Telphone        : " + tableProduct[i].getNo());
                    System.out.println("|                | Kategori Barang    : " + tableProduct[i].getKategori());
                    System.out.println("|                | Harga Barang       : " + tableProduct[i].getHarga());
                    System.out.println("------------------------------------------------------------------------");
                } else {
                    kebenaran = false;
                }
            } else if (j == 2 ) {
                if ("Fashion" == tableProduct[i].getKategori().intern()) {
                    System.out.println("|                | Id Barang          : " + tableProduct[i].getIdbarang());
                    System.out.println("|                | nim mahasiswa      : " + tableProduct[i].getNim());
                    System.out.println("|                | Nama mahasiswa     : " + tableProduct[i].getNama());
                    System.out.println("|        "+ tableProduct[i].getNopilihan()+"       | Nama Barang        : " + tableProduct[i].getNamaBarang());
                    System.out.println("|                | No Telphone        : " + tableProduct[i].getNo());
                    System.out.println("|                | Kategori Barang    : " + tableProduct[i].getKategori());
                    System.out.println("|                | Harga Barang       : " + tableProduct[i].getHarga());
                    System.out.println("------------------------------------------------------------------------");
                } else {
                    kebenaran = false;
                }
            } else if (j == 3 ) {
                if ("kecantikan" == tableProduct[i].getKategori().intern()) {
                    System.out.println("|                | Id Barang          : " + tableProduct[i].getIdbarang());
                    System.out.println("|                | nim mahasiswa      : " + tableProduct[i].getNim());
                    System.out.println("|                | Nama mahasiswa     : " + tableProduct[i].getNama());
                    System.out.println("|        "+ tableProduct[i].getNopilihan()+"       | Nama Barang        : " + tableProduct[i].getNamaBarang());
                    System.out.println("|                | No Telphone        : " + tableProduct[i].getNo());
                    System.out.println("|                | Kategori Barang    : " + tableProduct[i].getKategori());
                    System.out.println("|                | Harga Barang       : " + tableProduct[i].getHarga());
                    System.out.println("------------------------------------------------------------------------");
                } else {
                    kebenaran = false;
                }
            } else if (j == 4 ) {
                if ("Makanan" == tableProduct[i].getKategori().intern()) {
                    System.out.println("|                | Id Barang          : " + tableProduct[i].getIdbarang());
                    System.out.println("|                | nim mahasiswa      : " + tableProduct[i].getNim());
                    System.out.println("|                | Nama mahasiswa     : " + tableProduct[i].getNama());
                    System.out.println("|        "+ tableProduct[i].getNopilihan()+"       | Nama Barang        : " + tableProduct[i].getNamaBarang());
                    System.out.println("|                | No Telphone        : " + tableProduct[i].getNo());
                    System.out.println("|                | Kategori Barang    : " + tableProduct[i].getKategori());
                    System.out.println("|                | Harga Barang       : " + tableProduct[i].getHarga());
                    System.out.println("------------------------------------------------------------------------");
                } else {
                    kebenaran = false;
                }
            }
            
        }
        if (kebenaran == false) {
            System.out.println("-----------------------------------------------");
            System.out.println("|            Kategori tidak ditemukan         |");
            System.out.println("-----------------------------------------------");
        }
        
    }
    
    public void infoBerdasarkanPencarian(Product[] tableProduct,String cari){
        boolean kebenaran = true;
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                           Produk Tersedia                            |");        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("| Pilih Kategori | 1.Elektronik | 2.Fashion | 3.kecantikan | 4.Makanan |");
        System.out.println("------------------------------------------------------------------------");
        for (int i = 0; i < tableProduct[0].getValue(tableProduct); i++) {
            if (cari.intern() == tableProduct[i].getNamaBarang().intern() ) {
                System.out.println("|                | Id Barang          : " + tableProduct[i].getIdbarang());
                System.out.println("|                | nim mahasiswa      : " + tableProduct[i].getNim());
                System.out.println("|                | Nama mahasiswa     : " + tableProduct[i].getNama());
                System.out.println("|        "+ tableProduct[i].getNopilihan()+"       | Nama Barang        : " + tableProduct[i].getNamaBarang());
                System.out.println("|                | No Telphone        : " + tableProduct[i].getNo());
                System.out.println("|                | Kategori Barang    : " + tableProduct[i].getKategori());
                System.out.println("|                | Harga Barang       : " + tableProduct[i].getHarga());
                System.out.println("------------------------------------------------------------------------");
            } else {
                kebenaran = false;
            } 
        }
        if (kebenaran == false) {
            System.out.println("-----------------------------------------------");
            System.out.println("|            Data tidak ditemukan             |");
            System.out.println("-----------------------------------------------");
        }
        
    }
    
    public void setUserManual(int no,int nim,String nama,String fakultas,String noTelpon,String prodi,String id,String namabarang,String kategori,int harga){
        this.no = no;
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
        tableProduct[0].setUserManual(1,1302194007,"Bagas Arfiansyah","FIF","089119231492","RPL","PRD01","Tote Bag","Fashion",10000);
        tableProduct[1].setUserManual(2,1302191000,"Erlangga saputro","FKB","082144412433","Akutansi","PRD02","Iphone 11 pro","Elektronik",2000000);
    }
}
 
