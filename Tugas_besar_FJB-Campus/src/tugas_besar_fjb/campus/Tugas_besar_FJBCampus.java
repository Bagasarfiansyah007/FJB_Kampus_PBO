package tugas_besar_fjb.campus;
import Entitas.Pembeli;
import java.util.Scanner;

public class Tugas_besar_FJBCampus {

  
    public static void main(String[] args) {
        Pembeli[] pmb1 = new Pembeli[10];
        int indeksglobal = 0;
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("1.Input User");
        System.out.println("2.Tampil data");
        System.out.println("0.Keluar");
        System.out.println(" ");
        System.out.print("Masukan Pilihan menu : ");
        
        int no = input.nextInt();
        while (no != 0) {
            if (no == 1) {
                pmb1[indeksglobal] = new Pembeli();
                pmb1[indeksglobal].setPembeli();
                indeksglobal = indeksglobal + 1;
                
            } else if (no == 2) {
                for(int i = 0 ; i < indeksglobal ; i++){
                    pmb1[i].info();
                }
                        
            }
            
            System.out.println("1.Input User");
            System.out.println("2.Tampil data");
            System.out.println("0.Keluar");
            System.out.println(" ");
            System.out.print("Masukan Pilihan menu : ");

            no = input.nextInt();
        }
    }
    
}
