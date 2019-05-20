package Data;

public class Pasien {
    private String idPasien;
    private String namaPasien;
    private String jenisKelamin;
    private String tglLahir;
    private String noTelpon;
    private String alamatPasien;
    
    public void setID(String idPasien){
        this.idPasien = idPasien;
    }
    
    public String getID(){
        return idPasien;
    }
    
    public void setNamaPasien(String namaPasien){
        this.namaPasien = namaPasien;
    }
    
    public String getNamaPasien(){
        return namaPasien;
    }
    
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    
    public String getJenisKelamin(){
        return jenisKelamin;
    }
    
    public void setTglLahir(String tglLahir){
        this.tglLahir = tglLahir;
    }
    
    public String getTglLahir(){
        return tglLahir;
    }
    
    public void setnoTelpon(String noTelpon){
        this.noTelpon = noTelpon;
    }
    
    public String getNoTelpon(){
        return noTelpon;
    }
    
    public void setalamatPasien(String alamatPasien){
        this.alamatPasien = alamatPasien;
    }
    
    public String getalamatPasien(){
        return alamatPasien;
    }
}