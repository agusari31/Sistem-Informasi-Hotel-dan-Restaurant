
package room;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistem.informasi.hotel.dan.restaurant.koneksi;

/**
 *
 * @author ASUS
 */
public class update_room_status extends javax.swing.JPanel {
    public DefaultTableModel model_tabel;
    koneksi kn = new koneksi();
    
    
    public update_room_status() {
        initComponents();
        model_tabel = new DefaultTableModel();
        tbl_room.setModel(model_tabel);
        
        model_tabel.addColumn("ID");
        model_tabel.addColumn("Jenis");
        model_tabel.addColumn("Status");
        
        setDataToTabel();
    }
    
    public void setDataToTabel(){
        model_tabel.getDataVector().removeAllElements();
        model_tabel.fireTableDataChanged();
        ResultSet data = null;
        
        String query ="SELECT* FROM tb_room";
        
        try{
            data = kn.getStatement().executeQuery(query);
            while(data.next()){
                Object[] o = new Object[4];
                o[0] = data.getString("id_room");
                o[1] = data.getString("jenis_kamar");
                o[2] = data.getString("status");
                
                model_tabel.addRow(o);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Data gagal di load");
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group_radio = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_room = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rd_ready = new javax.swing.JRadioButton();
        rd_booked = new javax.swing.JRadioButton();
        btn_batal = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_room.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Jenis Kamar", "Status"
            }
        ));
        tbl_room.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_roomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_room);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 558, 262));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 680, 10));

        jLabel1.setText("ID ROOM");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        tf_id.setEditable(false);
        add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 120, 30));

        jLabel2.setText("Status");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        group_radio.add(rd_ready);
        rd_ready.setText("Ready");
        add(rd_ready, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 120, -1));

        group_radio.add(rd_booked);
        rd_booked.setText("Booked");
        add(rd_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 120, -1));

        btn_batal.setBackground(new java.awt.Color(214, 48, 49));
        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setText("BATAL");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });
        add(btn_batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 110, 30));

        btn_update.setBackground(new java.awt.Color(108, 92, 231));
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_roomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_roomMouseClicked
        // TODO add your handling code here:
         String id = tbl_room.getValueAt(tbl_room.getSelectedRow(), 0).toString();
         String status = tbl_room.getValueAt(tbl_room.getSelectedRow(), 2).toString();
         
         tf_id.setText(id);
         if(status.equals("Ready")){
            rd_ready.setSelected(true);
            rd_booked.setSelected(false);
        }else if(status.equals("Booked")){
            rd_ready.setSelected(false);
            rd_booked.setSelected(true);
        }
    }//GEN-LAST:event_tbl_roomMouseClicked

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
        tf_id.setText("");
        group_radio.clearSelection();
        
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        String id = tf_id.getText().toString();
        String status = "";
        if(rd_ready.isSelected()){
            rd_ready.setSelected(true);
            rd_booked.setSelected(false);
            status = rd_ready.getText().toString();
        }else if(rd_booked.isSelected()){
            rd_ready.setSelected(false);
            rd_booked.setSelected(true);
            status = rd_booked.getText().toString();
        }
        
        String query = "UPDATE tb_room SET status = \""+status+"\" WHERE id_room = "+id;
        
        try{
            kn.getStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Update Data Berhasil ");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Update Data Gagal");
        }
        tf_id.setText("");
        group_radio.clearSelection();
        setDataToTabel();
    }//GEN-LAST:event_btn_updateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup group_radio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rd_booked;
    private javax.swing.JRadioButton rd_ready;
    private javax.swing.JTable tbl_room;
    private javax.swing.JTextField tf_id;
    // End of variables declaration//GEN-END:variables
}
