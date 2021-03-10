package pbomeet05;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private Connection koneksi;
    
    public Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/toko_buku";
                String user = "root";
                String password = "";
                
                DriverManager.registerDriver(new Driver());
                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.err.println("Koneksi error : " + e.getMessage());
            }
        }
        return koneksi;
    }
}
