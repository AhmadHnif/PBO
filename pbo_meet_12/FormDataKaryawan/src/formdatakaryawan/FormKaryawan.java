package formdatakaryawan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class FormKaryawan extends javax.swing.JFrame {
    
    private final Connection conn;
    
    DefaultTableModel modelTabel;
    private int id;

    public FormKaryawan() {
        //Init koneksi
        conn = new KoneksiDatabase().getKoneksi();
        
        initComponents();
        
        // Init
        modelTabel = (DefaultTableModel) tabel_karyawan.getModel();
        tabel_karyawan.setModel(modelTabel);
        
        loadData();
        
        tf_keyword.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent arg0) {
                String key = tf_keyword.getText();
                cariKaryawan(key);
            }

            @Override
            public void removeUpdate(DocumentEvent arg0) {
                String key = tf_keyword.getText();
                cariKaryawan(key);
            }

            @Override
            public void changedUpdate(DocumentEvent arg0) {
                String key = tf_keyword.getText();
                cariKaryawan(key);
            }
        });
    }
    
    private void loadData() {
        //Reset baris
        modelTabel.setRowCount(0);
        
        String sql = "SELECT * FROM karyawan;";
        
        try {
            Statement st = conn.createStatement();
            ResultSet result = st.executeQuery(sql);
            
            while (result.next()) {                
                String[] data = new String[6];
                data[0] = result.getString("id");
                data[1] = result.getString("nama");
                data[2] = result.getString("kota");
                data[3] = result.getString("tanggal_lahir");
                data[4] = result.getString("pendidikan");
                data[5] = result.getString("status");
                
                modelTabel.addRow(data);
            }
            
            st.close();
        } catch (SQLException e) {
            System.err.println(e.getErrorCode() + " : " + e.getMessage());
        }
    }
    
    private void cariKaryawan(String keyword) {
        //Reset baris
        modelTabel.setRowCount(0);
        
        String sql = "SELECT * FROM karyawan " +
                "WHERE nama LIKE '%" + keyword + "%' "
                + "OR kota LIKE '%" + keyword + "%' "
                + "OR tanggal_lahir LIKE '%" + keyword + "%' "
                + "OR pendidikan LIKE '%" + keyword + "%' "
                + "OR status LIKE '%" + keyword + "%';";
        
        try {
            Statement st = conn.createStatement();
            ResultSet result = st.executeQuery(sql);
            
            while (result.next()) {                
                String[] data = new String[6];
                data[0] = result.getString("id");
                data[1] = result.getString("nama");
                data[2] = result.getString("kota");
                data[3] = result.getString("tanggal_lahir");
                data[4] = result.getString("pendidikan");
                data[5] = result.getString("status");
                
                modelTabel.addRow(data);
            }
            
            st.close();
        } catch (SQLException e) {
            System.err.println(e.getErrorCode() + " : " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialog_text = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_kota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_tanggal_lahir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cb_pendidikan = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cb_status = new javax.swing.JComboBox<>();
        btn_submit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_karyawan = new javax.swing.JTable();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        tf_keyword = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        btn_dialog = new javax.swing.JButton();

        dialog_text.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialog_text.setTitle("Dialog");
        dialog_text.setMinimumSize(new java.awt.Dimension(400, 300));
        dialog_text.setModal(true);

        jLabel7.setText("Ini adalah windoww Dialog");

        javax.swing.GroupLayout dialog_textLayout = new javax.swing.GroupLayout(dialog_text.getContentPane());
        dialog_text.getContentPane().setLayout(dialog_textLayout);
        dialog_textLayout.setHorizontalGroup(
            dialog_textLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_textLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        dialog_textLayout.setVerticalGroup(
            dialog_textLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_textLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        dialog_text.getAccessibleContext().setAccessibleDescription("");
        dialog_text.getAccessibleContext().setAccessibleParent(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Data Karyawan");
        setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Form Data Karyawan");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Nama");

        tf_nama.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Kota");

        tf_kota.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Tanggal Lahir");

        tf_tanggal_lahir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("Pendidikan");

        cb_pendidikan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cb_pendidikan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SMA/SMK", "D3", "Sarjana" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("Status");

        cb_status.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tetap", "Kontrak", "Magang" }));

        btn_submit.setBackground(new java.awt.Color(153, 255, 255));
        btn_submit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_submit.setText("Submit");
        btn_submit.setBorder(null);
        btn_submit.setBorderPainted(false);
        btn_submit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_submit.setFocusPainted(false);
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        tabel_karyawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Kota", "Tanggal Lahir", "Pendidikan", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabel_karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_karyawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_karyawan);

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formdatakaryawan/assets/ic_trash.png"))); // NOI18N
        btn_delete.setBorderPainted(false);
        btn_delete.setFocusPainted(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        btn_dialog.setText("Dialog");
        btn_dialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_tanggal_lahir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(59, 59, 59)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_nama)
                                            .addComponent(tf_kota, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_keyword, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_pendidikan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_update)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_delete))
                                    .addComponent(btn_dialog, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cb_pendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_kota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_tanggal_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_keyword)
                            .addComponent(btn_cari, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_dialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        String nama = tf_nama.getText();
        String kota = tf_kota.getText();
        String tanggal_lahir = tf_tanggal_lahir.getText();
        String pendidikan = cb_pendidikan.getSelectedItem().toString();
        String status = cb_status.getSelectedItem().toString();
                
        if (nama.equals("") || kota.equals("") || tanggal_lahir.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Form tidak boleh kosong!");
        } else {
            String sql = "INSERT INTO karyawan(nama, kota, tanggal_lahir, pendidikan, status) " + 
                    "VALUES(?, ?, ?, ?, ?)";
            
            try {                
                PreparedStatement ps = conn.prepareStatement(sql);
                
                ps.setString(1, nama);
                ps.setString(2, kota);
                ps.setString(3, tanggal_lahir);
                ps.setString(4, pendidikan);
                ps.setString(5, status);
                
                ps.executeUpdate();
                ps.close();
            } catch (SQLException e) {
                System.err.println(e.getErrorCode() + " : " + e.getMessage());
            }
        }
        
        loadData();
    }//GEN-LAST:event_btn_submitActionPerformed

    private void tabel_karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_karyawanMouseClicked
        int baris = tabel_karyawan.getSelectedRow();
        
        id = Integer.parseInt(tabel_karyawan.getValueAt(baris, 0).toString());
        
        String nama = tabel_karyawan.getValueAt(baris, 1).toString();
        tf_nama.setText(nama);
        
        String kota = tabel_karyawan.getValueAt(baris, 2).toString();
        tf_kota.setText(kota);
        
        String tanggal = tabel_karyawan.getValueAt(baris, 3).toString();
        tf_tanggal_lahir.setText(tanggal);
        
        String pendidikan = tabel_karyawan.getValueAt(baris, 4).toString();
        cb_pendidikan.setSelectedItem(pendidikan);
        
        String status = tabel_karyawan.getValueAt(baris, 5).toString();
        cb_status.setSelectedItem(status);
    }//GEN-LAST:event_tabel_karyawanMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        
        String nama = tf_nama.getText();
        String kota = tf_kota.getText();
        String tanggal_lahir = tf_tanggal_lahir.getText();
        String pendidikan = cb_pendidikan.getSelectedItem().toString();
        String status = cb_status.getSelectedItem().toString();
        
        if (nama.equals("") || kota.equals("") || tanggal_lahir.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Form tidak boleh kosong!");
        } else {
            String sql = "UPDATE karyawan SET " +
                    "nama = '" + nama + "', " +
                    "kota = '" + kota + "', " +
                    "tanggal_lahir = '" + tanggal_lahir + "', " +
                    "pendidikan = '" + pendidikan + "', " +
                    "status = '" + status + "' " +
                    "WHERE id = " + id +";";
            
            System.out.println("SQL = " + sql);
            
            try {                
                PreparedStatement ps = conn.prepareStatement(sql);
                
                ps.executeUpdate();
                ps.close();
            } catch (SQLException e) {
                System.err.println(e.getErrorCode() + " : " + e.getMessage());
            }
        }
        
        loadData();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        if (id == 0) {
            JOptionPane.showMessageDialog(rootPane, "Pilih data yang akan dihapus");
        } else {
            String sql = "DELETE FROM karyawan WHERE id = " + id + ";";
            
            System.out.println("SQL = " + sql);
            
            try {                
                PreparedStatement ps = conn.prepareStatement(sql);
                
                ps.executeUpdate();
                ps.close();
            } catch (SQLException e) {
                System.err.println(e.getErrorCode() + " : " + e.getMessage());
            }
        }
        
        loadData();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        String key = tf_keyword.getText();
        cariKaryawan(key);
    }//GEN-LAST:event_btn_cariActionPerformed

    private void btn_dialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dialogActionPerformed
        dialog_text.setVisible(true);
    }//GEN-LAST:event_btn_dialogActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormKaryawan().setVisible(true);
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_dialog;
    private javax.swing.JButton btn_submit;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_pendidikan;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JDialog dialog_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_karyawan;
    private javax.swing.JTextField tf_keyword;
    private javax.swing.JTextField tf_kota;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JTextField tf_tanggal_lahir;
    // End of variables declaration//GEN-END:variables
}
