package Entitas;
import java.util.Scanner;


public class Pembeli extends User{
    private int saldo;
    private int jumlah_barang;
    
    public void setPembeli() {
        int nim;
        String nama,fakultas,prodi;
        Scanner input = new Scanner(System.in);
        
        System.out.print("nama mahasiswa     : ");
        nama = input.nextLine();
        super.setNama(nama);
        
        System.out.print("nim mahasiswa      : ");
        nim = input.nextInt();
        super.setNim(nim);
        
        fakultas = input.nextLine();
        
        System.out.print("fakultas mahasiswa : ");
        fakultas = input.nextLine();
        super.setFakultas(fakultas);
        
        System.out.print("prodi mahasiswa    : ");
        prodi = input.nextLine();
        super.setProdi(prodi);
        
        System.out.print("Saldo mahasiswa    : ");
        saldo = input.nextInt();
        
        
    }
    
    public int getSaldo () {
        return saldo;
    }
    
    public void info(){
        System.out.println(" ");
        System.out.println("nim mahasiswa      : " + super.getNim());
        System.out.println("Nama mahasiswa     : " + super.getNama());
        System.out.println("Fakultas mahasiswa : " + super.getfakultas());
        System.out.println("Prodi mahasiswa    : " + super.getProdi());
        System.out.println("Saldo mahasiswa    : " + getSaldo());
    }
    /**public int getJumlah_barang() {
        return jumlah_barang;
    }**/
    
}
