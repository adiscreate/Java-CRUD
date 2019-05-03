/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author adi
 */
public class Config {
    public static Connection koneksi;
    
    public static Connection configDB() throws SQLException {
    try {
        String url = "jdbc:mysql://localhost:3306/db_latihan";
        String username = "root";
        String password = "xxxxxx";
        
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        koneksi = DriverManager.getConnection(url,username,password);
    } catch (Exception e) {
        System.err.println("Gagal koneksi");
        JOptionPane.showMessageDialog(null, "Gagal koneksi. Silahkan cek server database Anda.");
        System.exit(0);
    } 
    return koneksi;
    }
    
    
}
