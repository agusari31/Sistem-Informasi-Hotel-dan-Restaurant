
package restaurant;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistem.informasi.hotel.dan.restaurant.koneksi;

/**
 *
 * @author ASUS
 */
public class master_bahan_makanan extends javax.swing.JPanel {
    public DefaultTableModel model_tabel;
    koneksi kn = new koneksi();
   
    public master_bahan_makanan() {
        initComponents();
        
        model_tabel = new DefaultTableModel();
        tbl_bahanMakanan.setModel(model_tabel);
        
        model_tabel.addColumn("ID Bahan");
        model_tabel.addColumn("Nama Bahan");
        model_tabel.addColumn("Jumlah Stok");
        model_tabel.addColumn("Satuan");
        
        setDataToTabel();
    }
    
     public void setDataToTabel(){
        model_tabel.getDataVector().removeAllElements();
        model_tabel.fireTableDataChanged();
        ResultSet data = null;
        
        String query ="SELECT* FROM tb_bahan_makananMinuman";
        
        try{
            data = kn.getStatement().executeQuery(query);
            while(data.next()){
                Object[] o = new Object[4];
                o[0] = data.getString("id_bahan");
                o[1] = data.getString("nama_bahan");
                o[2] = data.getString("jumlah");
                o[3] = data.getString("satuan");
                
                model_tabel.addRow(o);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Data gagal di load");
            
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_bahanMakanan = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        tf_idBahan = new javax.swing.JTextField();
        tf_satuan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_jumlah = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_kosongkan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tf_namaBahan = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_bahanMakanan.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_bahanMakanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_bahanMakananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_bahanMakanan);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 760, 210));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 242, 760, 10));

        jLabel1.setText("ID Bahan");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        tf_idBahan.setEditable(false);
        add(tf_idBahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 140, 30));
        add(tf_satuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 140, 30));

        jLabel2.setText("Satuan");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        jLabel3.setText("Jumlah Stok");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));
        add(tf_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 140, 30));

        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 100, 30));

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 100, 30));

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 100, 30));

        btn_kosongkan.setText("Kosongkan");
        btn_kosongkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kosongkanActionPerformed(evt);
            }
        });
        add(btn_kosongkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 100, 30));

        jLabel4.setText("Nama Bahan");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));
        add(tf_namaBahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_bahanMakananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_bahanMakananMouseClicked
        // TODO add your handling code here:
        String id_bahan = tbl_bahanMakanan.getValueAt(tbl_bahanMakanan.getSelectedRow(), 0).toString();
        String nama_bahan = tbl_bahanMakanan.getValueAt(tbl_bahanMakanan.getSelectedRow(), 1).toString();
        String jumlah_stok = tbl_bahanMakanan.getValueAt(tbl_bahanMakanan.getSelectedRow(), 2).toString();
        String satuan = tbl_bahanMakanan.getValueAt(tbl_bahanMakanan.getSelectedRow(), 3).toString();

        tf_idBahan.setText(id_bahan);
        tf_namaBahan.setText(nama_bahan);
        tf_satuan.setText(satuan);
        tf_jumlah.setText(jumlah_stok);
    }//GEN-LAST:event_tbl_bahanMakananMouseClicked

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        String id_bahan = tf_idBahan.getText().toString();
        String nama_bahan = tf_namaBahan.getText().toString();
        String jumlah_stok = tf_jumlah.getText().toString();
        String satuan = tf_satuan.getText().toString();
       

        String query = "INSERT INTO tb_bahan_makananminuman (nama_bahan, jumlah, satuan) VALUES ('"
                + nama_bahan+"',"+jumlah_stok+", '"+satuan+"')";
;
        try{
            kn.getStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Data berhasil Ditambahkan");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan");
        }
        setDataToTabel();

        tf_idBahan.setText("");
        tf_namaBahan.setText("");
        tf_jumlah.setText("");
        tf_satuan.setText("");
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        String id_bahan = tf_idBahan.getText().toString();
        String nama_bahan = tf_namaBahan.getText().toString();
        String jumlah_stok = tf_jumlah.getText().toString();
        String satuan = tf_satuan.getText().toString();

        
        String query = "UPDATE tb_bahan_makananminuman SET nama_bahan = \""+nama_bahan+"\", jumlah = "
                + jumlah_stok+", satuan = \""+satuan+"\"WHERE id_bahan = "+id_bahan;

        try{
            kn.getStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Edit Data Berhasil");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Edit Data Gagal");
        }
        setDataToTabel();

        tf_idBahan.setText("");
        tf_namaBahan.setText("");
        tf_satuan.setText("");
        tf_jumlah.setText("");
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        String id_bahan = tf_idBahan.getText().toString();
        String query = "DELETE FROM tb_bahan_makananminuman WHERE id_bahan = "+id_bahan;

        int i = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus data ?");
        if(i==0){
            try{
                kn.getStatement().executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
            }
        }
        setDataToTabel();

        tf_idBahan.setText("");
        tf_namaBahan.setText("");
        tf_satuan.setText("");
        tf_jumlah.setText("");
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_kosongkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kosongkanActionPerformed
        // TODO add your handling code here:
        tf_idBahan.setText("");
        tf_namaBahan.setText("");
        tf_satuan.setText("");
        tf_jumlah.setText("");
    }//GEN-LAST:event_btn_kosongkanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_kosongkan;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl_bahanMakanan;
    private javax.swing.JTextField tf_idBahan;
    private javax.swing.JTextField tf_jumlah;
    private javax.swing.JTextField tf_namaBahan;
    private javax.swing.JTextField tf_satuan;
    // End of variables declaration//GEN-END:variables
}
