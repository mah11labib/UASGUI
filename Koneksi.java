package uas.gui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



    

public class Koneksi {
    Connection con=null;
    String statuskoneksi = null;
    public void koneksi(){
        
        
        try
        {
            String connectionURL = "jdbc:mysql://localhost:3306/dbsiswa";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);
          // JOptionPane.showMessageDialog(null, "Sukses Koneksi");
           statuskoneksi = "Berhasil";
        }

        catch(Exception e)
        {
       // JOptionPane.showMessageDialog(null, e);
       // System.exit(0);
        statuskoneksi = "Gagal";
        }
}
    public static void main(String[] args) {
        Koneksi koneksi = new Koneksi();
        koneksi.koneksi();
    }
}