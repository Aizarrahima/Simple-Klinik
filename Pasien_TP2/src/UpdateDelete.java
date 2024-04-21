/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aizarrahima
 */
import javax.swing.JOptionPane;
import java.sql.*;
import database.dbconnection;
import java.util.Date;
import java.text.SimpleDateFormat;

public class UpdateDelete extends javax.swing.JFrame {

    Connection conn;
    Statement stmt;
    ResultSet rs;

    dbconnection koneksi;

    String nama, alamat;
    int nik;
    Date tanggal_lahir;

    /**
     * Creates new form UpdateDelete
     */
    public UpdateDelete() {
        initComponents();

        koneksi = new dbconnection();
        conn = koneksi.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSearchNIK = new javax.swing.JPanel();
        jLabelNIK = new javax.swing.JLabel();
        jTextFieldNIK = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jPanelIdentitasPasien = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jLabelAlamat = new javax.swing.JLabel();
        jLabelTanggalLahir = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jTextFieldAlamat = new javax.swing.JTextField();
        jDateChooserTanggalLahir = new com.toedter.calendar.JDateChooser();
        jButtonCancel = new javax.swing.JButton();
        jPanelPesan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPesan = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelSearchNIK.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search NIK", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14))); // NOI18N

        jLabelNIK.setText("NIK");

        jTextFieldNIK.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNIKFocusLost(evt);
            }
        });
        jTextFieldNIK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNIKActionPerformed(evt);
            }
        });

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSearchNIKLayout = new javax.swing.GroupLayout(jPanelSearchNIK);
        jPanelSearchNIK.setLayout(jPanelSearchNIKLayout);
        jPanelSearchNIKLayout.setHorizontalGroup(
            jPanelSearchNIKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchNIKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNIK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jTextFieldNIK, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSearchNIKLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSearch)
                .addContainerGap())
        );
        jPanelSearchNIKLayout.setVerticalGroup(
            jPanelSearchNIKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchNIKLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelSearchNIKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNIK)
                    .addComponent(jTextFieldNIK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelIdentitasPasien.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identitas Pasien", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14))); // NOI18N

        jLabelName.setText("Nama");

        jTextFieldNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNamaFocusLost(evt);
            }
        });

        jLabelAlamat.setText("Alamat");

        jLabelTanggalLahir.setText("Tanggal Lahir");

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIdentitasPasienLayout = new javax.swing.GroupLayout(jPanelIdentitasPasien);
        jPanelIdentitasPasien.setLayout(jPanelIdentitasPasienLayout);
        jPanelIdentitasPasienLayout.setHorizontalGroup(
            jPanelIdentitasPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentitasPasienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIdentitasPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIdentitasPasienLayout.createSequentialGroup()
                        .addGroup(jPanelIdentitasPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTanggalLahir)
                            .addComponent(jLabelAlamat)
                            .addComponent(jLabelName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelIdentitasPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNama)
                            .addComponent(jTextFieldAlamat)
                            .addComponent(jDateChooserTanggalLahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIdentitasPasienLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonDelete)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancel)))
                .addContainerGap())
        );
        jPanelIdentitasPasienLayout.setVerticalGroup(
            jPanelIdentitasPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentitasPasienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIdentitasPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelIdentitasPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlamat)
                    .addComponent(jTextFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelIdentitasPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTanggalLahir)
                    .addComponent(jDateChooserTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelIdentitasPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPesan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14))); // NOI18N

        jTextAreaPesan.setColumns(20);
        jTextAreaPesan.setRows(5);
        jScrollPane1.setViewportView(jTextAreaPesan);

        javax.swing.GroupLayout jPanelPesanLayout = new javax.swing.GroupLayout(jPanelPesan);
        jPanelPesan.setLayout(jPanelPesanLayout);
        jPanelPesanLayout.setHorizontalGroup(
            jPanelPesanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelPesanLayout.setVerticalGroup(
            jPanelPesanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesanLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelIdentitasPasien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSearchNIK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPesan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSearchNIK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelIdentitasPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelPesan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        try {
            nik = Integer.parseInt(jTextFieldNIK.getText());
        } catch (NumberFormatException ex) {
            jTextAreaPesan.setText("NIK harus berupa angka.");
        }
        
        cariPasien();
        tampilData();
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        nama = jTextFieldNama.getText();
        alamat = jTextFieldAlamat.getText();
        tanggal_lahir = jDateChooserTanggalLahir.getDate();

        updateData();
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTextFieldNIKFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNIKFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNIKFocusLost

    private void jTextFieldNamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNamaFocusLost
        // TODO add your handling code here:
        checkNama();
    }//GEN-LAST:event_jTextFieldNamaFocusLost

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        hapusDataPasien();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextFieldNIKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNIKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNIKActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        dispose();
        ListData tableDataPasien = new ListData();
        tableDataPasien.setVisible(true);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void checkNama() {
        boolean checkNama;
        nama = jTextFieldNama.getText().toString();
        String errorNama = "Nama hanya terdiri dari karakter huruf A-Z.";

        checkNama = nama.matches("[a-zA-Z\s]+");

        if (checkNama == false) {
            jTextAreaPesan.setText(errorNama);
        }
    }

    private boolean updateData() {
        try {
            stmt = conn.createStatement();

            // date format
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String tanggal_lahir_format = dateFormat.format(tanggal_lahir);

            int update = stmt.executeUpdate("UPDATE pasien SET nama = '" + nama + "', "
                    + "alamat = '" + alamat + "', "
                    + "tanggal_lahir = '" + tanggal_lahir_format + "'"
                    + "WHERE nik = " + nik + "");

            if (update == 1) {
                JOptionPane.showMessageDialog(rootPane, "Data berhasil diubah");
                
                dispose();
                ListData tableDataPasien = new ListData();
                tableDataPasien.setVisible(true);
            }
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error 2: " + ex.getMessage());
        }
        return false;
    }

    private void cariPasien() {
        String sql = "SELECT pasien.nik, pasien.nama, pasien.alamat, pasien.tanggal_lahir FROM pasien WHERE nik = " + nik + " ";

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(rootPane, "NIK tidak ditemukan!");
            } else {
                while (rs.next()) {
                    nama = rs.getString("nama");
                    nik = rs.getInt("nik");
                    alamat = rs.getString("alamat");
                    tanggal_lahir = rs.getDate("tanggal_lahir");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error 2: " + ex.getMessage());
        }
    }

    private void tampilData() {
        jTextFieldNama.setText(nama);
        jTextFieldAlamat.setText(alamat);
        jDateChooserTanggalLahir.setDate(tanggal_lahir);
    }

    private boolean hapusDataPasien() {
        try {
            stmt = conn.createStatement();

            int delete = stmt.executeUpdate("DELETE FROM pasien WHERE nik = '" + nik + "'");

            if (delete == 1) {
                JOptionPane.showMessageDialog(rootPane, "Data berhasil dihapus!");
                
                dispose();
                ListData tableDataPasien = new ListData();
                tableDataPasien.setVisible(true);
            }
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error 2: " + ex.getMessage());
        }
        return false;
    }

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
                if ("Macos".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private com.toedter.calendar.JDateChooser jDateChooserTanggalLahir;
    private javax.swing.JLabel jLabelAlamat;
    private javax.swing.JLabel jLabelNIK;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelTanggalLahir;
    private javax.swing.JPanel jPanelIdentitasPasien;
    private javax.swing.JPanel jPanelPesan;
    private javax.swing.JPanel jPanelSearchNIK;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaPesan;
    private javax.swing.JTextField jTextFieldAlamat;
    private javax.swing.JTextField jTextFieldNIK;
    private javax.swing.JTextField jTextFieldNama;
    // End of variables declaration//GEN-END:variables
}
