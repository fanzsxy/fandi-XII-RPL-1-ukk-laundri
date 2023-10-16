/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apk_laundri_ukk;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class koneksi {
    private String url = "jdbc:mysql://localhost/laundry_ukk";
    private String username = "root";
    private String password = "";
    private Connection con;
    
    public void connect(){
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("koneksi berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public Connection getCon() {
        return con;
    }
}


