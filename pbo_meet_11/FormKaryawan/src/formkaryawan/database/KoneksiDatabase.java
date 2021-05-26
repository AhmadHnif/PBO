package formkaryawan.database;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;
import java.sql.SQLException;

public class KoneksiDatabase {
    
    private static Connection koneksi;
    
    private static final String DB_NAME = "pbo_karyawan";
    
    private static final String URL = "jdbc:mysql://localhost:3306/" + DB_NAME;
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public Connection getKoneksi() {
        try {
            
            DriverManager.registerDriver(new Driver());
            
            koneksi = DriverManager.getConnection(URL, USER, PASSWORD);
            
        } catch (SQLException e) {
            System.err.println("--------- Koneksi MySQL ---------");
            System.err.println(e.getErrorCode() + " : " + e.getMessage());
        }
        
        return koneksi;
    }
}
