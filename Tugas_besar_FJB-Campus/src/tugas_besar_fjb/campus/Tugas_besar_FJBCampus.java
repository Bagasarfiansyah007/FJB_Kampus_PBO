package tugas_besar_fjb.campus;
import Entitas.Pembeli;
import Entitas.User;
import Entitas.Penjual;
import Relasi.Chcekout;
import Relasi.Product;
import java.io.IOException;
import java.util.Scanner;


public class Tugas_besar_FJBCampus {
    
    public static void main(String[] args) {
        // variabel global
        User[] tableUser = new User[10];
        Product[] tableProduct = new Product[10];
        Chcekout[] tableCheckout = new Chcekout[10];
        int indeksNo = 0;
        int indeksglobal = 0;
        int nopilihan;
        int indekscari = 0;
        String username,password;
        boolean kebenaran;
        
        // inisialisasi object
        Scanner input = new Scanner(System.in);
        tableUser[0] = new User();
        tableProduct[0] = new Product();
        tableCheckout[0] = new Chcekout();
        Penjual penjual = new Penjual();
        Pembeli pembeli = new Pembeli();
        
        //input data preview
        tableUser[0].inputdatapreview(tableUser);
        tableProduct[0].inputdatapreview(tableProduct);
       
        // tampil menu
        tableUser[0].tampilMenuUtama();
        System.out.print  ("Masukan Pilihan angka (1/2/3/4) : ");
        nopilihan = input.nextInt();
        
        // melakukan perulangan ketika nilai nopilihan tidak bernilai 0
        while (nopilihan != 0) {
            
            // kondisi untuk memilih role user
            if (nopilihan == 1) {
                
                // memasukan username dan password user
                System.out.println("-----------------------------------------------");
                System.out.println("|            Login Sebagai Pembeli            |");
                System.out.println("-----------------------------------------------");
                System.out.println("--   keluar tekan 0 di setiap form input    -- ");
                System.out.println("-----------------------------------------------");
                System.out.print("Username : ");
                username = input.nextLine();
                username = input.nextLine();
                System.out.print("Password : ");
                password = input.nextLine();                
                
                // mencari data user
                kebenaran = false;
                indekscari = tableUser[0].cariDataUser(tableUser, username, password, indekscari);
                kebenaran = tableUser[0].cariDataUserbool(tableUser, username, password, kebenaran);
                
                // konidisi ketika data ketemu dan mereutrnkan boolean
                if (kebenaran == true){
                    // menampilkan menu user pembeli
                    
                    pembeli.tampilMenuPembeli(tableUser, indekscari);
                    System.out.print("Masukan Pilihan menu : ");
                    nopilihan = input.nextInt();
                    
                    // kondisi perulangan ketika tidak menginputkan 0 untuk keluar
                    while (nopilihan != 0) {
                        // kondisi pilihan fitur menu
                        if (nopilihan == 1) {
                            tableCheckout[0].inputDataCheckout(tableCheckout,tableProduct,indeksglobal, indeksNo);
                        } else if (nopilihan == 2) {
                            tableCheckout[0].infoarray(tableCheckout, tableUser, indekscari);
                            tableCheckout[0].tampilCheckoutOption();
                            nopilihan = input.nextInt();
                            if(nopilihan == 1) {
                                System.out.print("Masukan Id Checkout : ");
                                String cari = input.nextLine();
                                cari = input.nextLine();
                                tableCheckout[0].deleteProduct(tableCheckout, cari);
                                tableCheckout[0].infoarray(tableCheckout, tableUser, indekscari);
                            } else if (nopilihan == 2) {
                            
                            }
                            
                        } else if (nopilihan == 3) {
                            
                        } else if (nopilihan == 4) {
                            tableUser[0].updateUser(tableUser, indekscari);
                        }
                        
                        // menampilakan menu user pembeli
                        pembeli.tampilMenuPembeli(tableUser, indekscari);
                        System.out.print("Masukan Pilihan menu : ");
                        nopilihan = input.nextInt();
                    }
                    
                } else {
                    System.out.println("Akun tidak ditemukan atau username/password salah !");                    
                }
               
            } else if (nopilihan == 2) {
                // memasukan username dan password user
                System.out.println("-----------------------------------------------");
                System.out.println("|            Login Sebagai Penjual            |");
                System.out.println("-----------------------------------------------");
                System.out.println("--   keluar tekan 0 di setiap form input    -- ");
                System.out.println("-----------------------------------------------");
                System.out.print("Username : ");
                username = input.nextLine();
                username = input.nextLine();
                System.out.print("Password : ");
                password = input.nextLine();                
                
                // mencari data user menggunakan perulangan                
                kebenaran = false;
                indekscari = tableUser[0].cariDataUser(tableUser, username, password, indekscari);
                kebenaran = tableUser[0].cariDataUserbool(tableUser, username, password, kebenaran);
                
                // konidisi ketika data ketemu dan mereutrnkan boolean
                if (kebenaran == true){
                    penjual.tampilanMenuPenjual(tableUser,indekscari);
                    System.out.print("Masukan Pilihan menu : ");
                    nopilihan = input.nextInt();
                    
                    // kondisi perulangan ketika tidak menginputkan 0 untuk keluar
                    while (nopilihan != 0) {
                        // kondisi pilihan fitur menu
                        if (nopilihan == 1) {
                            tableProduct[0].inputDataProductJual(tableProduct, indeksglobal, tableUser, indekscari);
                        } else if (nopilihan == 2) {
                            tableProduct[0].info(tableProduct);
                            System.out.print("Masukan Pilihan menu : ");
                            String cari = input.nextLine();
                            cari = input.nextLine();
                            tableProduct[0].updateBarang(tableProduct, cari);
                        } else if (nopilihan == 3) {
                            tableProduct[0].infoPenjual(tableProduct,tableProduct[indekscari].getNim());
                            tableProduct[0].tampilProductOption();
                            nopilihan = input.nextInt();
                            if (nopilihan == 1) {
                                System.out.println("Masukan Id Barang : ");
                                String cari = input.nextLine();
                                cari = input.nextLine();
                                tableProduct[0].deleteProduct(tableProduct, cari);
                            } else if (nopilihan == 2) {
                                System.out.print("Masukan Nama barang : ");
                                String cari = input.nextLine();
                                cari = input.nextLine();
                                tableProduct[0].infoBerdasarkanPencarian(tableProduct, cari);
                            }
                        }
                        // menampilakan menu user pembeli
                        penjual.tampilanMenuPenjual(tableUser,indekscari);
                        System.out.print("Masukan Pilihan menu : ");
                        nopilihan = input.nextInt();
                    }
                    
                } else {
                    System.out.println("Akun tidak ditemukan atau username/password salah !");
                }       
                
                
            } else if (nopilihan == 3) {
                // Menampilkan titel header registrasi menu
                System.out.println("-----------------------------------------------");
                System.out.println("|               Registrasi Akun               |");
                System.out.println("-----------------------------------------------");
                System.out.println("--   keluar tekan 0 di salah satu input     -- ");
                System.out.println("-----------------------------------------------");
                tableUser[0].inputDataUser(tableUser, indeksglobal);
                System.out.println(" ");
            }
            
            // menampilkan menu utama
            tableUser[0].tampilMenuUtama();
            System.out.print  ("Masukan Pilihan angka (1/2/3/4) : ");
            nopilihan = input.nextInt();
            
            
            
        }
        // pesan keluar aplikasi
        System.out.println("-----------------------------------------------");
        System.out.println("              Anda Keluar Aplikasi             ");
        System.out.println("-----------------------------------------------");
        
    }  
}
