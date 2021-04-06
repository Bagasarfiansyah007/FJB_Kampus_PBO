package Entitas;

import java.util.Scanner;


public class User {

    private int nim;
    private String nama;
    private String fakultas;
    private String noTelpon;
    private String prodi;
    private String username;
    private String Password;
    
    public void setUser() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("nama mahasiswa     : ");
        nama = input.nextLine();
        
        System.out.print("nim mahasiswa      : ");
        nim = input.nextInt();
        
        fakultas = input.nextLine();
        
        System.out.print("fakultas mahasiswa : ");
        fakultas = input.nextLine();
        
        System.out.print("Telpon mahasiswa   : ");
        noTelpon = input.nextLine();
        
        System.out.print("prodi mahasiswa    : ");
        prodi = input.nextLine();
        
        System.out.print("username mahasiswa : ");
        username = input.nextLine();
        
        System.out.print("password mahasiswa : ");
        Password = input.nextLine();
        
    }
    
    public void setUserManual(int nim,String nama,String fakultas,String noTelpon,String prodi,String username,String Password){
        this.nim = nim;
        this.nama = nama;
        this.fakultas = fakultas;
        this.noTelpon = noTelpon;
        this.prodi = prodi;
        this.username = username;
        this.Password = Password;
    }
    
    public void setNim(int nim){
        this.nim = nim;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }
    
    public void setNo(String Notelpon){
        this.noTelpon = Notelpon;
    }
    
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    
    public int getNim () {
        return nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getfakultas () {
        return fakultas;
    }
    
    public String getNo () {
        return noTelpon;
    }
    
    public String getProdi () {
        return prodi;
    }
    
    public String getUsername () {
        return username;
    }
    
    public String getPassword () {
        return Password;
    }
    
    public int getValue(User[] total){
        int banyak = 0;
        while (total[banyak] != null && banyak <= total.length) {
            banyak = banyak + 1;
        }
        
        return banyak;
    }
    
    public void inputdatapreview (User[] tableUser){
        for (int i = 1 ; i < 3 ; i ++) {
            tableUser[i] = new User();
        }
        tableUser[0].setUserManual(1302194007,"Bagas Arfiansyah","FIF","089119231492","RPL","bgs123","12345");
        tableUser[1].setUserManual(1302194005,"Ridho Anugrah","FIF","085119123422","RPL","rdr123","12345");
        tableUser[2].setUserManual(1302194010,"Zahid Al muhasibi","FIF","0821234444","RPL","zhm123","12345");
        
    }
    
    public void inputDataUser(User[] tableUser,int indeksglobal){
        indeksglobal = tableUser[0].getValue(tableUser);
        tableUser[indeksglobal] = new User();
        tableUser[indeksglobal].setUser();
    }
    
    public void infoarray(User[] tableUser){
        for (int i = 0 ; i < tableUser[0].getValue(tableUser) ; i++) {
            tableUser[i].info();
        }
    }
    
    public void tampilMenuUtama(){
        System.out.println("-----------------------------------------------");
        System.out.println("|   Selamat datang di FJB E-COMMERCE campus   |");
        System.out.println("-----------------------------------------------");
        System.out.println("                    Login As                   ");
        System.out.println("-----------------------------------------------");
        System.out.println("1.User Pembeli");
        System.out.println("2.User Penjual");
        System.out.println("3.Admin Aplikasi");
        System.out.println("4.Registrasi User");
        System.out.println("0.Keluar");
        System.out.println("-----------------------------------------------");
    }
    
    public void tampilMenuPembeli(User[] tableUser,int indeks){
        System.out.println("-----------------------------------------------");
        System.out.println("|            Login Sebagai Pembeli            |");
        System.out.println("-----------------------------------------------");
        System.out.println("|    Sukses login sebagai user : " + tableUser[indeks].getNim() + "    |");
        System.out.println("-----------------------------------------------");
        System.out.println("1.Beli Barang");
        System.out.println("2.Checkout");
        System.out.println("3.Cari Barang");                    
        System.out.println("4.pembayaran");
        System.out.println("0.Keluar");
        System.out.println(" ");
    }
    
    public int cariDataUser(User[] tableUser,String x,String y,int indekscari){
        for (int i = 0; i < tableUser[0].getValue(tableUser) ; i++) {
            if (tableUser[i].getUsername().intern() == x.intern() && tableUser[i].getPassword().intern() == y.intern()) {
                indekscari = i;
            }
        }
        return indekscari;
    }
    
    public boolean cariDataUserbool(User[] tableUser,String x,String y,boolean kebenaran){
        for (int i = 0; i < tableUser[0].getValue(tableUser) ; i++) {
            if (tableUser[i].getUsername().intern() == x.intern() && tableUser[i].getPassword().intern() == y.intern()) {
                kebenaran = true;
            }
        }
        return kebenaran;
    }
    
    public void info(){
        System.out.println(" ");
        System.out.println("nim mahasiswa      : " + getNim());
        System.out.println("Nama mahasiswa     : " + getNama());
        System.out.println("Fakultas mahasiswa : " + getfakultas());
        System.out.println("Prodi mahasiswa    : " + getProdi());
    }
}
