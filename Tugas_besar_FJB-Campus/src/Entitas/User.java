package Entitas;


public class User {

    private int nim;
    private String Nama;
    private String fakultas;
    private String prodi;
    private String username;
    private String Password;
    
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
    
    public String getNama() {
        return Nama;
    }    
    
    public int getNim () {
        return nim;
    }

    public String getfakultas () {
        return fakultas;
    }
    
    public String getProdi () {
        return prodi;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String Password){
        this.Password = Password;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return Password;
    }
}
