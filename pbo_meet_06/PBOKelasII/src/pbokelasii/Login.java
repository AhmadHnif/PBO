package pbokelasii;

public class Login {
    
    private String username, password;
    
    // Constructor
    public Login() {
        this.username = "admin";
        this.password = "admin123";
    }
    
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    // Setter
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    // Getter
    public String getUsername() {
        return this.username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
}

