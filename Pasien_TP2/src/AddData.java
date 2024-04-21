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

public class AddData extends javax.swing.JFrame {

    Connection conn;
    Statement stmt;
    ResultSet rs;

    dbconnection koneksi;

    String nama, alamat;
    int nik;
    Date tanggal_lahir;

    /**
     * Creates new form AddData
     */
    public AddData() {
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

        jPanelDataPasien = new javax.swing.JPanel();
        jLabelNama = new javax.swing.JLabel();
        jLabelAlamat = new javax.swing.JLabel();
        jLabelNIK = new javax.swing.JLabel();
        jLabelTanggalLahir = new javax.swing.JLabel();
        jTextFieldNIK = new javax.swing.JTextField();
        jTextFieldAlamat = new javax.swing.JTextField();
        jTextFieldNama = new javax.swing.JTextField();
        jButtonTambah = new javax.swing.JButton();
        jDateChooserTanggalLahir = new com.toedter.calendar.JDateChooser();
        jButtonCancel = new javax.swing.JButton();
        jPanelPesan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPesan = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelDataPasien.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Pasien", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 13))); // NOI18N

        jLabelNama.setText("Nama");

        jLabelAlamat.setText("Alamat");

        jLabelNIK.setText("NIK");

        jLabelTanggalLahir.setText("Tanggal Lahir");

        jTextFieldNIK.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNIKFocusLost(evt);
            }
        });

        jTextFieldAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlamatActionPerformed(evt);
            }
        });

        jTextFieldNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNamaFocusLost(evt);
            }
        });

        jButtonTambah.setText("Tambah");
        jButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDataPasienLayout = new javax.swing.GroupLayout(jPanelDataPasien);
        jPanelDataPasien.setLayout(jPanelDataPasienLayout);
        jPanelDataPasienLayout.setHorizontalGroup(
            jPanelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDataPasienLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDataPasienLayout.createSequentialGroup()
                        .addComponent(jButtonCancel)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTambah))
                    .addGroup(jPanelDataPasienLayout.createSequentialGroup()
                        .addGroup(jPanelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTanggalLahir)
                            .addComponent(jLabelNIK)
                            .addComponent(jLabelAlamat)
                            .addComponent(jLabelNama))
                        .addGap(31, 31, 31)
                        .addGroup(jPanelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNIK)
                            .addComponent(jTextFieldAlamat)
                            .addComponent(jTextFieldNama)
                            .addComponent(jDateChooserTanggalLahir, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDataPasienLayout.setVerticalGroup(
            jPanelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDataPasienLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDataPasienLayout.createSequentialGroup()
                        .addGroup(jPanelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNama)
                            .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAlamat)
                            .addComponent(jTextFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNIK)
                            .addComponent(jTextFieldNIK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTanggalLahir))
                    .addComponent(jDateChooserTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTambah)
                    .addComponent(jButtonCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPesan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 13))); // NOI18N

        jTextAreaPesan.setColumns(20);
        jTextAreaPesan.setRows(5);
        jScrollPane1.setViewportView(jTextAreaPesan);

        javax.swing.GroupLayout jPanelPesanLayout = new javax.swing.GroupLayout(jPanelPesan);
        jPanelPesan.setLayout(jPanelPesanLayout);
        jPanelPesanLayout.setHorizontalGroup(
            jPanelPesanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPesanLayout.setVerticalGroup(
            jPanelPesanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesanLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDataPasien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPesan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelPesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlamatActionPerformed

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
        // TODO add your handling code here:
        nama = jTextFieldNama.getText();
        alamat = jTextFieldAlamat.getText();
        tanggal_lahir = jDateChooserTanggalLahir.getDate();

        try {
            nik = Integer.parseInt(jTextFieldNIK.getText());
        } catch (NumberFormatException ex) {
            jTextAreaPesan.setText("NIK harus berupa angka.");
        }
        
        checkNIK();
        clearForm();
    }//GEN-LAST:event_jButtonTambahActionPerformed

    private void jTextFieldNamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNamaFocusLost
        // TODO add your handling code here:
        checkNama();
    }//GEN-LAST:event_jTextFieldNamaFocusLost

    private void jTextFieldNIKFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNIKFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNIKFocusLost

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        dispose();
        ListData tableDataPasien = new ListData();
        tableDataPasien.setVisible(true);
    }//GEN-LAST:event_jButtonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(AddData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddData().setVisible(true);
            }
        });
    }

    private void checkNama() {
        boolean checkNama;
        nama = jTextFieldNama.getText().toString();
        String errorNama = "Nama hanya terdiri dari karakter huruf A-Z.";

        checkNama = nama.matches("[a-zA-Z\s]+");

        if (checkNama == false) {
            jTextAreaPesan.setText(errorNama);
        }
    }

    private boolean checkNIK() {
        String sql = "SELECT pasien.nik FROM pasien WHERE nik = " + nik + "";
        try{
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery(sql);
            
            if(!rs.next()){
                insertData();
            } else {
                JOptionPane.showMessageDialog(rootPane, "NIK tidak boleh sama!");
                jTextAreaPesan.setText("NIK tidak boleh sama!");
            }
            return true;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error 2: " + ex.getMessage());
        }
        return false;
    }
    
    private boolean insertData() {
        try {
            stmt = conn.createStatement();

            // date format
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String tanggal_lahir_format = dateFormat.format(tanggal_lahir);

            // query
            int insert = stmt.executeUpdate("INSERT INTO pasien(nama, alamat, nik, tanggal_lahir) VALUES ('" + nama + "', '" + alamat + "', " + nik + " , '" + tanggal_lahir_format + "')");

            if (insert == 1) {
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Tersimpan");
                
                dispose();
                
                ListData formDataPasien = new ListData();
                formDataPasien.setVisible(true);
            }
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error 2: " + ex.getMessage());
        }
        return false;
    }

    private void clearForm() {
        jTextFieldNama.setText("");
        jTextFieldAlamat.setText("");
        jTextFieldNIK.setText("");
        jDateChooserTanggalLahir.setDate(null); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonTambah;
    private com.toedter.calendar.JDateChooser jDateChooserTanggalLahir;
    private javax.swing.JLabel jLabelAlamat;
    private javax.swing.JLabel jLabelNIK;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelTanggalLahir;
    private javax.swing.JPanel jPanelDataPasien;
    private javax.swing.JPanel jPanelPesan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaPesan;
    private javax.swing.JTextField jTextFieldAlamat;
    private javax.swing.JTextField jTextFieldNIK;
    private javax.swing.JTextField jTextFieldNama;
    // End of variables declaration//GEN-END:variables
}