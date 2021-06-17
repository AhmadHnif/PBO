package coba;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author taufik
 */
public class koneksi {
    
    private Connection koneksi;
    
    private final String url = "jdbc:mysql://localhost/dbmahasiswa";
    private final String user = "root";
    private final String password = "";
    
    // koneksi database
    public Connection getKoneksi(){
        if (koneksi == null){
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
    
    public Connection getLogin(){
        if (koneksi == null){
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
