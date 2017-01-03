/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siram.internal;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BadikIrwan
 */
public class FormSuplier extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormSuplier
     */
    public FormSuplier() {
        autokode();
        initComponents();
        aktif(false);
        autokode();
        getData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btntambah = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtkodesuplier = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnamasuplier = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtkodepos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtkota = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnotlp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtfax = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtketerangan = new javax.swing.JTextArea();
        btnsimpan = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setBorder(null);

        btntambah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btntambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siram/picture/add.png"))); // NOI18N
        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siram/picture/edit.png"))); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siram/picture/delete.png"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnkeluar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siram/picture/exit.png"))); // NOI18N
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Suplier"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Kode suplier");

        txtkodesuplier.setEditable(false);
        txtkodesuplier.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nama Suplier");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Alamat");

        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane2.setViewportView(txtalamat);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Kode pos");

        txtkodepos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Kota");

        txtkota.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("No. Telpon");

        txtnotlp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Fax");

        txtfax.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Keterangan");

        txtketerangan.setColumns(20);
        txtketerangan.setRows(5);
        jScrollPane3.setViewportView(txtketerangan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtkodesuplier, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnamasuplier, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtkodepos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(136, 136, 136)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfax, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(70, 70, 70)
                            .addComponent(txtkota, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnotlp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtkodesuplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtkota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnamasuplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtnotlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtkodepos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtfax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnsimpan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siram/picture/save.png"))); // NOI18N
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btntambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnedit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnhapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnkeluar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntambah)
                    .addComponent(btnsimpan)
                    .addComponent(btnedit)
                    .addComponent(btnhapus)
                    .addComponent(btnkeluar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        kosongkan();
        aktif(true);
    }//GEN-LAST:event_btntambahActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        String kode = txtkodesuplier.getText();
        String nama = txtnamasuplier.getText();
        String alamat = txtalamat.getText();
        String kodepos = txtkodepos.getText();
        String kota = txtkota.getText();
        String notlp = txtnotlp.getText();
        String fax = txtfax.getText();
        String keterangan = txtketerangan.getText();
        Connection con = com.siram.koneksi.Koneksi.getKoneksi();
        try {
            if(kode.equals("")||nama.equals("")||alamat.equals("")||kodepos.equals("")||kota.equals("")||notlp.equals("")||fax.equals("")||keterangan.equals("")) {
                JOptionPane.showMessageDialog(this, "Data ada yang kosong", "pesan", JOptionPane.ERROR_MESSAGE);
            } else {
                Statement st = con.createStatement();
                String sql = "UPDATE suplier SET kode_suplier='"+kode+"',nama_suplier='"+nama+"',alamat='"+alamat+"',"
                       + "kodepos='"+kodepos+"',kota='"+kota+"',telpon='"+notlp+"',fax='"+fax+"',keterangan='"+keterangan+"' WHERE kode_suplier='"+kode+"'"; 
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(rootPane, "Data berhasil di diedit");
            } 
            
        } catch(SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Data gagal diedit", "Pesan", JOptionPane.WARNING_MESSAGE);
        }
        kosongkan();
        getData();
    }//GEN-LAST:event_btneditActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        Connection con = (Connection)com.siram.koneksi.Koneksi.getKoneksi();
        int baris = tabel.getSelectedRow();
        try {
            Statement st = con.createStatement();
            if(baris == -1) {
                JOptionPane.showMessageDialog(rootPane, "Anda belum memilih tabel");
            } else {
                String sql = "DELETE FROM suplier WHERE kode_suplier='"+tabel.getModel().getValueAt(baris, 0)+"'";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Data berhasil di hapus");
            }
            
        } catch(Exception e) {
            
        }
        kosongkan();
        getData();
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        String kode = txtkodesuplier.getText();
        String nama = txtnamasuplier.getText();
        String alamat = txtalamat.getText();
        String kodepos = txtkodepos.getText();
        String kota = txtkota.getText();
        String notlp = txtnotlp.getText();
        String fax = txtfax.getText();
        String keterangan = txtketerangan.getText();
        Connection con = com.siram.koneksi.Koneksi.getKoneksi();
        try {
            Statement st = con.createStatement();
            String sql = "INSERT INTO suplier(kode_suplier,nama_suplier,alamat,kodepos,kota,telpon,fax,keterangan)"
                    + "VALUE('"+kode+"','"+nama+"','"+alamat+"','"+kodepos+"','"+kota+"','"+notlp+"','"+fax+"','"+keterangan+"')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
        } catch(Exception e) {
            e.printStackTrace();
        }
        kosongkan();
        getData();
        autokode();
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        try {
            int row =tabel.getSelectedRow();
            String tabel_klik=(tabel.getModel().getValueAt(row, 0).toString());
            Connection con =(Connection)com.siram.koneksi.Koneksi.getKoneksi();
            Statement st = con.createStatement();
            ResultSet sql = st.executeQuery("SELECT * FROM suplier WHERE kode_suplier='"+tabel_klik+"'");
            if(sql.next()){
                String kode = sql.getString("kode_suplier");
                txtkodesuplier.setText(kode);
                String nama = sql.getString("nama_suplier");
                txtnamasuplier.setText(nama);
                String alamat = sql.getString("alamat");
                txtalamat.setText(alamat);
                String kodepos = sql.getString("kodepos");
                txtkodepos.setText(kodepos);
                String kota = sql.getString("kota");
                txtkota.setText(kota);
                String notlp = sql.getString("telpon");
                txtnotlp.setText(notlp);
                String fax = sql.getString("fax");
                txtfax.setText(fax);
                String keterangan = sql.getString("keterangan");
                txtketerangan.setText(keterangan);
            } 
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tabelMouseClicked

    public void aktif(boolean b) {
        //txtkodesuplier.setEditable(b);
        txtnamasuplier.setEditable(b);
        txtalamat.setEditable(b);
        txtkodepos.setEditable(b);
        txtkota.setEditable(b);
        txtfax.setEditable(b);
        txtnotlp.setEditable(b);
        txtketerangan.setEditable(b);
    }
    
    private void kosongkan() {
        txtnamasuplier.setText("");
        txtalamat.setText("");
        txtkodepos.setText("");
        txtkota.setText("");
        txtfax.setText("");
        txtnotlp.setText("");
        txtketerangan.setText("");
        
    }
    
    private void autokode() {
        try {
            Connection con = com.siram.koneksi.Koneksi.getKoneksi();
            String sql= "SELECT MAX(right(kode_suplier,2)) AS no FROM suplier";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                if(rs.first()==false) {
                    txtkodesuplier.setText("SP00001");
                } else {
                    rs.last();
                   int auto_id = rs.getInt(1) + 1;
                   String no = String.valueOf(auto_id);
                   int noLong = no.length();
                   //MENGATUR jumlah 0
                    for(int a=0;a<4-noLong;a++)
                    { 
                        no = "0" + no;
                    }
                   txtkodesuplier.setText("SP" + no);
                }
            }
        } catch (Exception e) {
            
        }
    }
            
    public void getData() {
        DefaultTableModel tbm = new DefaultTableModel();
        tbm.addColumn("KODE SUPLIER");
        tbm.addColumn("NAMA SUPLIER");
        tbm.addColumn("ALAMAT");
        tbm.addColumn("KODE POS");
        tbm.addColumn("KOTA");
        tbm.addColumn("NO.TLP");
        tbm.addColumn("FAX");
        tbm.addColumn("KETERANGAN");
        try {
            Connection con = (Connection)com.siram.koneksi.Koneksi.getKoneksi();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from suplier");
            while(rs.next()) {
                tbm.addRow(new Object[] {
                    rs.getString("kode_suplier"), rs.getString("nama_suplier"), rs.getString("alamat"), rs.getString("kodepos"),
                    rs.getString("kota"),rs.getString("telpon"), rs.getString("fax"), rs.getString("keterangan")});
               tabel.setModel(tbm);
            }
        } catch(Exception e) {
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btntambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabel;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtfax;
    private javax.swing.JTextArea txtketerangan;
    private javax.swing.JTextField txtkodepos;
    private javax.swing.JTextField txtkodesuplier;
    private javax.swing.JTextField txtkota;
    private javax.swing.JTextField txtnamasuplier;
    private javax.swing.JTextField txtnotlp;
    // End of variables declaration//GEN-END:variables
}