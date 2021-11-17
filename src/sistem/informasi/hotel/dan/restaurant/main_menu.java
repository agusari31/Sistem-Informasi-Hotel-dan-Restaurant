/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.hotel.dan.restaurant;

import restaurant.laporan_penjualan;
import restaurant.master_bahan_makanan;
import restaurant.penjualan_restaurant;
import room.master_room;
import room.update_room_status;

/**
 *
 * @author ASUS
 */
public class main_menu extends javax.swing.JFrame {

    /**
     * Creates new form main_menu
     */
    public main_menu() {
        initComponents();
         
         lbl_judulForm.setText("Status Room");
        update_room_status urs = new update_room_status();
        
        panelForm.removeAll();
        panelForm.repaint();
        panelForm.revalidate();
        
        panelForm.add(urs);
        panelForm.repaint();
        panelForm.revalidate();
    }
    
    public void setNamaPegawai(String nama, String id){
        lbl_namaPegawai.setText(nama);
        lbl_idPegawai.setText(id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_judulAplikasi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_menu = new javax.swing.JPanel();
        lbl_namaPegawai = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_idPegawai = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl_penjualanRestaurant = new javax.swing.JLabel();
        lbl_updateRoomStatus = new javax.swing.JLabel();
        lbl_masterRoom = new javax.swing.JLabel();
        lbl_masterRestaurant = new javax.swing.JLabel();
        lbl_laporanRestaurant = new javax.swing.JLabel();
        panel_judulMenu = new javax.swing.JPanel();
        lbl_judulForm = new javax.swing.JLabel();
        panelForm = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(150, 50, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_judulAplikasi.setBackground(new java.awt.Color(162, 155, 254));
        panel_judulAplikasi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BACK OFFICE HOTEL AND RESTAURANT");
        panel_judulAplikasi.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(panel_judulAplikasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 60));

        panel_menu.setBackground(new java.awt.Color(99, 110, 114));

        lbl_namaPegawai.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_namaPegawai.setForeground(new java.awt.Color(255, 255, 255));
        lbl_namaPegawai.setText("Nama Pegawai");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID :");

        lbl_idPegawai.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_idPegawai.setForeground(new java.awt.Color(255, 255, 255));
        lbl_idPegawai.setText("Nomer ID");

        jPanel2.setBackground(new java.awt.Color(162, 155, 254));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MENU");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        lbl_penjualanRestaurant.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_penjualanRestaurant.setForeground(new java.awt.Color(255, 255, 255));
        lbl_penjualanRestaurant.setText("Penjualan Restaurant");
        lbl_penjualanRestaurant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_penjualanRestaurantMouseClicked(evt);
            }
        });

        lbl_updateRoomStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_updateRoomStatus.setForeground(new java.awt.Color(255, 255, 255));
        lbl_updateRoomStatus.setText("Update Room Status");
        lbl_updateRoomStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_updateRoomStatusMouseClicked(evt);
            }
        });

        lbl_masterRoom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_masterRoom.setForeground(new java.awt.Color(255, 255, 255));
        lbl_masterRoom.setText("Master Room");
        lbl_masterRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_masterRoomMouseClicked(evt);
            }
        });

        lbl_masterRestaurant.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_masterRestaurant.setForeground(new java.awt.Color(255, 255, 255));
        lbl_masterRestaurant.setText("Master Restaurant");
        lbl_masterRestaurant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_masterRestaurantMouseClicked(evt);
            }
        });

        lbl_laporanRestaurant.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_laporanRestaurant.setForeground(new java.awt.Color(255, 255, 255));
        lbl_laporanRestaurant.setText("Laporan Restaurant");
        lbl_laporanRestaurant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_laporanRestaurantMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_menuLayout.createSequentialGroup()
                        .addComponent(lbl_laporanRestaurant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panel_menuLayout.createSequentialGroup()
                        .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_namaPegawai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel_menuLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_idPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 15, Short.MAX_VALUE)))
                        .addGap(22, 22, 22))
                    .addComponent(lbl_masterRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_penjualanRestaurant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                        .addComponent(lbl_masterRestaurant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(lbl_updateRoomStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_namaPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_idPegawai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_masterRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_updateRoomStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_masterRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_penjualanRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_laporanRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(307, 307, 307))
        );

        getContentPane().add(panel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 220, 530));

        panel_judulMenu.setBackground(new java.awt.Color(223, 230, 233));

        lbl_judulForm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_judulForm.setText("Judul Form");

        javax.swing.GroupLayout panel_judulMenuLayout = new javax.swing.GroupLayout(panel_judulMenu);
        panel_judulMenu.setLayout(panel_judulMenuLayout);
        panel_judulMenuLayout.setHorizontalGroup(
            panel_judulMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_judulMenuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbl_judulForm, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(573, Short.MAX_VALUE))
        );
        panel_judulMenuLayout.setVerticalGroup(
            panel_judulMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_judulMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_judulForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panel_judulMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 820, 40));

        panelForm.setBackground(new java.awt.Color(255, 255, 255));
        panelForm.setLayout(new java.awt.CardLayout());
        getContentPane().add(panelForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 820, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_updateRoomStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_updateRoomStatusMouseClicked
        // TODO add your handling code here:
        lbl_judulForm.setText("Status Room");
        update_room_status urs = new update_room_status();
        
        panelForm.removeAll();
        panelForm.repaint();
        panelForm.revalidate();
        
        panelForm.add(urs);
        panelForm.repaint();
        panelForm.revalidate();
    }//GEN-LAST:event_lbl_updateRoomStatusMouseClicked

    private void lbl_masterRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_masterRoomMouseClicked
        // TODO add your handling code here:
        lbl_judulForm.setText("Master Room");
        master_room mr = new master_room();
        
        panelForm.removeAll();
        panelForm.repaint();
        panelForm.revalidate();
        
        panelForm.add(mr);
        panelForm.repaint();
        panelForm.revalidate();
    }//GEN-LAST:event_lbl_masterRoomMouseClicked

    private void lbl_masterRestaurantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_masterRestaurantMouseClicked
        // TODO add your handling code here:
        lbl_judulForm.setText("Master Restaurant");
        master_bahan_makanan mbm = new master_bahan_makanan();
        
        panelForm.removeAll();
        panelForm.repaint();
        panelForm.revalidate();
        
        panelForm.add(mbm);
        panelForm.repaint();
        panelForm.revalidate();
    }//GEN-LAST:event_lbl_masterRestaurantMouseClicked

    private void lbl_penjualanRestaurantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_penjualanRestaurantMouseClicked
        // TODO add your handling code here:
        lbl_judulForm.setText("Penjualan Restaurant");
        penjualan_restaurant pr = new penjualan_restaurant();
        
        panelForm.removeAll();
        panelForm.repaint();
        panelForm.revalidate();
        
        panelForm.add(pr);
        panelForm.repaint();
        panelForm.revalidate();
    }//GEN-LAST:event_lbl_penjualanRestaurantMouseClicked

    private void lbl_laporanRestaurantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_laporanRestaurantMouseClicked
        // TODO add your handling code here:
        lbl_judulForm.setText("Laporan Restaurant");
        laporan_penjualan lp = new laporan_penjualan();
        
        panelForm.removeAll();
        panelForm.repaint();
        panelForm.revalidate();
        
        panelForm.add(lp);
        panelForm.repaint();
        panelForm.revalidate();
    }//GEN-LAST:event_lbl_laporanRestaurantMouseClicked

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
            java.util.logging.Logger.getLogger(main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_idPegawai;
    private javax.swing.JLabel lbl_judulForm;
    private javax.swing.JLabel lbl_laporanRestaurant;
    private javax.swing.JLabel lbl_masterRestaurant;
    private javax.swing.JLabel lbl_masterRoom;
    private javax.swing.JLabel lbl_namaPegawai;
    private javax.swing.JLabel lbl_penjualanRestaurant;
    private javax.swing.JLabel lbl_updateRoomStatus;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPanel panel_judulAplikasi;
    private javax.swing.JPanel panel_judulMenu;
    private javax.swing.JPanel panel_menu;
    // End of variables declaration//GEN-END:variables
}