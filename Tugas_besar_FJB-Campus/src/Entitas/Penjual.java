
package Entitas;


public class Penjual {
    private int produk_terjual;
    
    public void setPenjual(){
        int nim;
        String nama,fakultas,prodi;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama Mahasiswa     : ");
        nama = input.nextLine();
        super.setNama(nama);
        
        System.out.print("NIM Mahasiswa      : ");
        nim = input.nextInt();
        super.setNim(nim);
        
        fakultas = input.nextLine();
        
        System.out.print("Fakultas Mahasiswa : ");
        fakultas = input.nextLine();
        super.setFakultas(fakultas);
        
        System.out.print("Prodi Mahasiswa    : ");
        prodi = input.nextLine();
        super.setProdi(prodi);
    }
    public void menjual(){
        
    }
    public void konfirmasi(){
        
    }
    public void info(){
        System.out.println(" ");
        System.out.println("NIM Mahasiswa      : " + super.getNim());
        System.out.println("Nama Mahasiswa     : " + super.getNama());
        System.out.println("Fakultas Mahasiswa : " + super.getfakultas());
        System.out.println("Prodi Mahasiswa    : " + super.getProdi());
    }
}
