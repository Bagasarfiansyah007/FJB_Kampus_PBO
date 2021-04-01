package Entitas;


public class User {

    private int nim;
    private String Nama;
    private String fakultas;
    private String prodi;
    
    public void setNim(int nim){
        this.nim = nim;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }
    
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    
    public int getNim () {
        return nim;
    }
    
    public String getNama() {
        return Nama;
    }
    
    public String getfakultas () {
        return fakultas;
    }
    
    public String getProdi () {
        return prodi;
    }
    
}
