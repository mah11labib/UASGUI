package uas.gui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author X1
 */
public class Update {
    Koneksi konek = new Koneksi();

    public void Update(String Nama, String Alamat, String Tempattanggallahir, String JenisKelamin, String Agama ) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql_Nama = "update tbsiswa set Nama='"+ Nama + "'where Nama ='" + Nama + "'";
            String sql_Alamat = "update tbsiswa  set Alamat='"+ Alamat + "'where Nama ='" + Nama + "'";
            String sql_Tempattanggallahir = "update tbsiswa  set Tempattanggallahir='"+ Tempattanggallahir + "'where Nama ='" + Nama + "'";
            String sql_JenisKelamin = "update tbsiswa  set Jeniskelamin='"+ JenisKelamin + "'where Nama ='" + Nama + "'";
            String sql_Agama = "update tbsiswa set Agama ='"+ Agama + "'where Nama ='" + Nama + "'";
            
            statement.executeUpdate(sql_Nama);
            statement.executeUpdate(sql_Alamat);
            statement.executeUpdate(sql_Tempattanggallahir);
            statement.executeUpdate(sql_JenisKelamin);
            statement.executeUpdate(sql_Agama);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }  
}