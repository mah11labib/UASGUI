package uas.gui;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author UsErs
 */
public class Insert {

    Koneksi konek = new Koneksi();
   

    public void insert(String Nama, String Alamat, String Tempattanggallahir, String JenisKelamin, String Agama ) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
         //   String sql = "insert into identitas (nim, nama, alamat, jeniskelamin)" + "values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
            String sql = "Insert into tbsiswa values('" + Nama+ "','" + Alamat+ "','" + Tempattanggallahir+ "','" + JenisKelamin+ "','" + Agama+ "')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}
