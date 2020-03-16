/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3desktopdb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tsanpride
 */
public class Karyawan extends javax.swing.JFrame {

    /**
     * Creates new form DbKaryawan
     */
    public Karyawan() {
        initComponents();
        //selectAll();
        loadTableKaryawan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbKaryawan = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNama = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        cbJabatan = new javax.swing.JTextPane();
        btnBaru = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtTel = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtStat = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Jabatan", "Telepon", "Status"
            }
        ));
        tbKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbKaryawan);

        txtNama.setEditable(false);
        jScrollPane2.setViewportView(txtNama);

        cbJabatan.setEnabled(false);
        jScrollPane3.setViewportView(cbJabatan);

        btnBaru.setText("Baru");
        btnBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaruActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.setEnabled(false);
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.setEnabled(false);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.setEnabled(false);

        btnBatal.setText("Batal");
        btnBatal.setEnabled(false);
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Nama");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel2.setText("Jabatan");

        jLabel3.setFont(new java.awt.Font("Garuda", 3, 24)); // NOI18N
        jLabel3.setText("DB MANAGER KARYAWAN");

        txtTel.setEditable(false);
        txtTel.setEnabled(false);
        jScrollPane4.setViewportView(txtTel);

        txtStat.setEnabled(false);
        jScrollPane5.setViewportView(txtStat);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel4.setText("Telepon");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel5.setText("Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(btnHapus)
                                .addGap(30, 30, 30)
                                .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnSimpan)
                                .addGap(26, 26, 26)
                                .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(327, 327, 327))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHapus)
                            .addComponent(btnBatal)
                            .addComponent(btnBaru))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan)
                            .addComponent(btnUbah))
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        btnSimpan.setEnabled(false);
        btnBatal.setEnabled(false);
        txtNama.setEditable(false);
        cbJabatan.setEditable(false);
        txtTel.setEditable(false);
        txtStat.setEditable(false);
        btnBaru.setEnabled(true);
        btnUbah.setEnabled(true);
        btnHapus.setEnabled(true);
        tbKaryawan.setEnabled(true);
        disableTable = false;
    }//GEN-LAST:event_btnBatalActionPerformed
    boolean disableTable=false;
    int selectedID;
    
    private void tbKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKaryawanMouseClicked
        // TODO add your handling code here:
        if(disableTable==false){
            btnUbah.setEnabled(true);
            btnHapus.setEnabled(true);
            selectedID = (int)tbKaryawan.getValueAt(tbKaryawan.getSelectedRow(), 0);
            txtNama.setText(tbKaryawan.getValueAt(tbKaryawan.getSelectedRow(), 1).toString());
            cbJabatan.setSelectedItem(tbKaryawan.getValueAt(tbKaryawan.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_tbKaryawanMouseClicked

    private void btnBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruActionPerformed
        // TODO add your handling code here:
        btnSimpan.setEnabled(true);
        btnBatal.setEnabled(true);
        txtNama.setEditable(true);
        cbJabatan.setEditable(true);
        txtTel.setEditable(true);
        txtStat.setEditable(true);
        btnBaru.setEnabled(false);
        btnUbah.setEnabled(false);
        btnHapus.setEnabled(false);
        tbKaryawan.setEnabled(false);
        disableTable = true;
        
        txtNama.setText("");
        cbJabatan.setText("");
        txtTel.setText("");
        txtStat.setText("");
        modeInsert=true;
    }//GEN-LAST:event_btnBaruActionPerformed
boolean modeInsert = true;
    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        btnSimpan.setEnabled(true);
        btnBatal.setEnabled(true);
        txtNama.setEditable(true);
        cbJabatan.setEditable(true);
        txtTel.setEditable(true);
        txtStat.setEditable(true);
        btnBaru.setEnabled(false);
        btnUbah.setEnabled(false);
        btnHapus.setEnabled(false);
        tbKaryawan.setEnabled(false);
        disableTable = true;
        modeInsert = false;
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        String[] option = {"Ya", "Tidak"};
        int response = JOptionPane.showOptionDialog(
                this, "Anda akan menghapus data "+txtNama.getText(), "Peringatan!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
                );
        if(response == JOptionPane.YES_OPTION){
            try {
                Statement stmt = conn.createStatement();
                stmt.executeUpdate("DELETE FROM karyawan WHERE id_karyawan='"+selectedID+"'");
                txtNama.setText("");
                cbJabatan.setText("");
                txtTel.setText("");
                txtStat.setText("");
                loadTableKaryawan();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaru;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JTextPane cbJabatan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tbKaryawan;
    private javax.swing.JTextPane txtNama;
    private javax.swing.JTextPane txtStat;
    private javax.swing.JTextPane txtTel;
    // End of variables declaration//GEN-END:variables
     
    
    private Connection connectDB(){
        String url = "jdbc:sqlite:src/p3desktopdb/data.db";
        Connection conn = null;
        try {
            conn = java.sql.DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void selectAll(){
        String sql = "SELECT * FROM karyawan";

        try (Connection conn = this.connectDB();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()){
                System.out.println(rs.getInt("id_karyawan") + "\t" +
                                   rs.getString("nm_karyawan") + "\t" +
                                   rs.getString("jab_karyawan"));
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    Connection conn = this.connectDB();
    public void loadTableKaryawan(){
        String sql = "SELECT * FROM karyawan";
        Object[] kolom = { "ID", "Nama", "Jabatan", "Telepon", "Status"};
        DefaultTableModel dataModel = new DefaultTableModel(null, kolom);
        tbKaryawan.setModel(dataModel);
        tbKaryawan.getColumnModel().getColumn(0).setMaxWidth(30);
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                int id =rs.getInt("id_karyawan");
                String nama = rs.getString("nm_karyawan");
                String jabatan = rs.getString("jab_karyawan");
                String telepon = rs.getString("tel_karyawan");
                String status = rs.getString("stat_karyawan");
                
                Object[] data={id, nama, jabatan, telepon, status};
                dataModel.addRow(data);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}