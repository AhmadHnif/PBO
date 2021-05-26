package formdatakaryawan;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDatabase {
    
    private Connection koneksi;
    
    private final String url = "jdbc:mysql://localhost:3306/pbo_karyawan";
    private final String user = "root";
    private final String password = ""; 
    
    public Connection getKoneksi() {
        if (koneksi == null) {
            try {
                DriverManager.registerDriver(new Driver());
                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.err.println("Koneksi database : " + getClass().getName());
                System.err.println(e.getErrorCode() + " : " + e.getMessage());
            }
        }
        
        return koneksi;
    }
    
}
