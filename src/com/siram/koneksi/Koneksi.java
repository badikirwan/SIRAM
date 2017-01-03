/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siram.koneksi;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author BadikIrwan
 */
public class Koneksi {
    private static Connection con;
    public Koneksi() {
        
    }
    public static Connection getKoneksi() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/siram", "root", "");
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal");
        }
        return con;
    }
    
}
