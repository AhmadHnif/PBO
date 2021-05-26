package formkaryawan;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import formkaryawan.database.KoneksiDatabase;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainFormKaryawan extends javax.swing.JFrame {
    
    // Instansiasi
    private final KoneksiDatabase db =  new KoneksiDatabase();
    private Statement mStatement;
    
    private final DefaultTableModel tableModel;

    /*
    * Constructor
    */
    public MainFormKaryawan() {
        initComponents();
        
        this.tableModel = (DefaultTableModel) tabel_karyawan.getModel();
        tabel_karyawan.setModel(tableModel);
        
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_kota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_tanggal_lahir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cb_pendidikan = new javax.swing.JComboBox<>();
        cb_status = new javax.swing.JComboBox<>();
        btn_submit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_karyawan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Karyawan - PBO Praktik");
        setBackground(new java.awt.Color(51, 153, 255));
        setMinimumSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Form Data Karyawan");

        jLabel2.setText("Nama");

        jLabel3.setText("Kota");

        jLabel4.setText("Tanggal Lahir");

        jLabel5.setText("Pendidikan");

        jLabel6.setText("Status");

        cb_pendidikan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SMA/SMK", "D3", "Sarjana" }));

        cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tetap", "Kontrak", "Magang" }));

        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        tabel_karyawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Kota", "Tanggal lahir", "Pendidikan", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabel_karyawan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_nama)
                                    .addComponent(tf_kota, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addComponent(tf_tanggal_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_submit)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cb_pendidikan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cb_pendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_kota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_tanggal_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_submit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        String nama = tf_nama.getText();
        String kota = tf_kota.getText();
        String tanggal = tf_tanggal_lahir.getText();
        String pendidikan = cb_pendidikan.getSelectedItem().toString();
        String status = cb_status.getSelectedItem().toString();
        
        /*
        * Validasi form -> tidak boleh kosong
        */
        if (nama.equals("") || kota.equals("") || tanggal.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Form tidak boleh kosong", "Validasi", JOptionPane.ERROR_MESSAGE);
        } else {
            
            /*
            * Insert ke database
            */
            try {
                String sql = "INSERT INTO karyawan (nama, kota, tanggal_lahir, pendidikan, status) " +
                    "VALUES (?, ?, ?, ?, ?);";
                
                try (PreparedStatement ps = db.getKoneksi().prepareStatement(sql)) {
                    ps.setString(1, nama);
                    ps.setString(2, kota);
                    ps.setString(3, tanggal);
                    ps.setString(4, pendidikan);
                    ps.setString(5, status);
                    
                    ps.executeUpdate();
                }
                
            } catch (SQLException e) {
                System.err.println("---- Insert Data Karyawan ----");
                System.err.println(e.getErrorCode() + " : " + e.getMessage());
            }
            
            JOptionPane.showMessageDialog(rootPane, "Data berhasil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        }
        
        /*
        * Reset form -> hapus semua text di TextField
        */
        resetFform();
        loadData();
    }//GEN-LAST:event_btn_submitActionPerformed

    private void loadData() {
        tableModel.setRowCount(0);
        
        try {
            
            mStatement = db.getKoneksi().createStatement();
            
            String sql = "SELECT * FROM karyawan;";
            
            ResultSet rs = mStatement.executeQuery(sql);
            
            while (rs.next()) {                
                String[] data = new String[6];
                data[0] = rs.getString("id");
                data[1] = rs.getString("nama");
                data[2] = rs.getString("kota");
                data[3] = rs.getString("tanggal_lahir");
                data[4] = rs.getString("pendidikan");
                data[5] = rs.getString("status");
                
                tableModel.addRow(data);
            }
        } catch (SQLException e) {
            System.err.println("---- Load Data Karyawan ----");
            System.err.println(e.getErrorCode() + " : " + e.getMessage());
        }
    }
    
    private void resetFform() {
        tf_nama.setText("");
        tf_kota.setText("");
        tf_tanggal_lahir.setText("");
        
        cb_pendidikan.setSelectedIndex(0);
        cb_status.setSelectedIndex(0);
    }
   
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
            java.util.logging.Logger.getLogger(MainFormKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFormKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFormKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFormKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFormKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_submit;
    private javax.swing.JComboBox<String> cb_pendidikan;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabel_karyawan;
    private javax.swing.JTextField tf_kota;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JTextField tf_tanggal_lahir;
    // End of variables declaration//GEN-END:variables

    private Object KoneksiDatabase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
