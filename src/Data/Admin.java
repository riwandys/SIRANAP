package Data;

public class Admin {
    private String nama;
    private String username;
    private String password;
    
    public Admin (String username, String password, String nama){
        setUsername(username);
        setPassword(password);
        setNama(nama);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
