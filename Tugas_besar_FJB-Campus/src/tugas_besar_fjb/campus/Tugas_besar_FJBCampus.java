package tugas_besar_fjb.campus;
import Entitas.Pembeli;
import Entitas.Penjual;
import Relasi.Product;
import java.util.Scanner;

public class Tugas_besar_FJBCampus {
    public static void main(String[] args) {
        Pembeli[] tablePembeli = new Pembeli[10];
        Penjual[] tablePenjual = new Penjual[10];
        Product[] tableProduct = new Product[10];
        int indeksglobal = 0;
        int nopilihan;
        int indekscari = 0;
        boolean kebenaran = false;
        Scanner input = new Scanner(System.in);
        
        String[] nama = {"andi","bagus","kahirul"};
        
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
        System.out.print  ("Masukan Pilihan angka (1/2/3/4) : ");
        nopilihan = input.nextInt();
        
        while (nopilihan != 0) {
            
            if (nopilihan == 1) {
                System.out.println("-----------------------------------------------");
                System.out.println("|            Login Sebagai Pembeli            |");
                System.out.println("-----------------------------------------------");
                System.out.println("--   keluar tekan 0 di setiap form input    -- ");
                System.out.println("-----------------------------------------------");
                System.out.print("Username : ");
                String username = input.nextLine();
                username = input.nextLine();
                System.out.print("Password : ");
                String password = input.nextLine();                
                while (tablePembeli[indekscari].getUsername().intern() != username && tablePembeli[indekscari].getPassword() != password.intern() && indekscari <= tablePembeli.length){
                    kebenaran = username.intern() == nama[indekscari].intern();
                    indekscari++;
                }
                
                kebenaran = username.intern() == nama[indekscari].intern();
                    
                if (kebenaran == true){
                    System.out.println("-----------------------------------------------");
                    System.out.println("|            Login Sebagai Pembeli            |");
                    System.out.println("-----------------------------------------------");
                    System.out.println("|    Sukses login sebagai user : " + tablePembeli[indekscari].getNim() + "    |");
                    System.out.println("-----------------------------------------------");
                    System.out.println("1.Input User");
                    System.out.println("2.Tampil data");
                    System.out.println("0.Keluar");
                    System.out.println(" ");
                    System.out.print("Masukan Pilihan menu : ");

                    nopilihan = input.nextInt();
                    while (nopilihan != 0) {
                        if (nopilihan == 1) {
                            tablePembeli[indeksglobal] = new Pembeli();
                            tablePembeli[indeksglobal].setUser();
                            indeksglobal = indeksglobal + 1;

                        } else if (nopilihan == 2) {
                            for(int i = 0 ; i < indeksglobal ; i++){
                                tablePembeli[i].info();
                            }

                        }

                        System.out.println("1.Input User");
                        System.out.println("2.Tampil data");
                        System.out.println("0.Keluar");
                        System.out.println(" ");
                        System.out.print("Masukan Pilihan menu : ");

                        nopilihan = input.nextInt();
                    }
                    
                } else {
                    System.out.println("Akun tidak ditemukan atau username/password salah !");
                }
               
            } else if (nopilihan == 2) {
            
            } else if (nopilihan == 3) {
            
            } else if (nopilihan == 4) {
            
            }

            
            System.out.println("-----------------------------------------------");
            System.out.println("|   Selamat datang di FJB E-COMMERCE campus   |");
            System.out.println("-----------------------------------------------");
            System.out.println("                    Login As                   ");
            System.out.println("-----------------------------------------------");
            System.out.println("1.User Pembeli");
            System.out.println("2.User Penjual");
            System.out.println("3.Admin Aplikasi");
            System.out.println("0.Keluar");
            System.out.println("-----------------------------------------------");
            System.out.print  ("Masukan Pilihan angka (1/2/3) : ");
            nopilihan = input.nextInt();
            
        }
        
        System.out.println("-----------------------------------------------");
        System.out.println("              Anda Keluar Aplikasi             ");
        System.out.println("-----------------------------------------------");
    }
    
}
