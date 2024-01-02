package uas.gui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author UsEr
 */
public class Delete {
    Koneksi konek = new Koneksi();
   

    public void delete(String Nama ) {

        try {
            konek.koneksi();
            Statement statement = (Statement) konek.con.createStatement();
            String sql = "delete from tbsiswa where Nama ='" + Nama + "'";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}


