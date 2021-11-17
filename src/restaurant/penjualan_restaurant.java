/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import sistem.informasi.hotel.dan.restaurant.koneksi;

/**
 *
 * @author ASUS
 */
public class penjualan_restaurant extends javax.swing.JPanel {
    public int beras, wortel, timun, daging_ayam, telur, bumbu_nasgor, minyak, mie, tomat,bumbu_miegor;
    public int serbuk_teh, serbuk_jeruk;

    koneksi kn = new koneksi();
    public penjualan_restaurant() {
        initComponents();
        getDataBahan();
    }
    
    void getDataBahan(){
       String query_bahan = "SELECT * FROM tb_bahan_makananminuman";
       String nama_bahan = "";
       ResultSet data = null;
       
       
       try{
           data = kn.getStatement().executeQuery(query_bahan);
           while(data.next()){
               nama_bahan = data.getString("nama_bahan");
               if(nama_bahan.equals("Beras")){
                   beras = Integer.parseInt(data.getString("jumlah"));
                   
               }else if(nama_bahan.equals("Wortel")){
                   wortel = Integer.parseInt(data.getString("jumlah"));
                   
               }else if(nama_bahan.equals("Timun")){
                   timun = Integer.parseInt(data.getString("jumlah"));
                   
               }else if(nama_bahan.equals("Daging Ayam")){
                   daging_ayam = Integer.parseInt(data.getString("jumlah"));
                   
               }else if(nama_bahan.equals("Telur")){
                   telur = Integer.parseInt(data.getString("jumlah"));
                   
               }else if(nama_bahan.equals("Bumbu Nasi Goreng")){
                   bumbu_nasgor = Integer.parseInt(data.getString("jumlah"));
                   
               }else if(nama_bahan.equals("Minyak")){
                   minyak = Integer.parseInt(data.getString("jumlah"));
                   
               }else if(nama_bahan.equals("Mie")){
                   mie = Integer.parseInt(data.getString("jumlah"));
                   
               }else if(nama_bahan.equals("Tomat")){
                   tomat = Integer.parseInt(data.getString("jumlah"));
                   
               }else if(nama_bahan.equals("Bumbu Mie Goreng")){
                   bumbu_miegor = Integer.parseInt(data.getString("jumlah"));
                   
               }else if(nama_bahan.equals("Serbuk Teh")){
                   serbuk_teh = Integer.parseInt(data.getString("jumlah"));
                   
               }else if(nama_bahan.equals("Serbuk Jeruk")){
                   serbuk_jeruk = Integer.parseInt(data.getString("jumlah"));
                   
               }
           }
       }catch(Exception e){
           System.out.println("Load Data Gagal");
       }
       
       System.out.println("Tess");
       System.out.println(beras);
       System.out.println(wortel);
       System.out.println(timun);
       System.out.println(daging_ayam);
       System.out.println(telur);
       System.out.println(bumbu_nasgor);
       System.out.println(minyak);
       System.out.println(mie);
       System.out.println(tomat);
       System.out.println(bumbu_miegor);
       System.out.println(serbuk_teh);
       System.out.println(serbuk_jeruk);
    }
    
    void hitungBahanMakanan(int nasgor, int miegor){
        int beras_nasgor = nasgor*200;
        int wortel_nasgor = nasgor*50;
        int timun_nasgor = nasgor*50;
        int daging_nasgor = nasgor*60;
        int telur_nasgor = nasgor*2;
        int hit_bumbu_nasgor = nasgor*1;
        int minyak_nasgor = nasgor*10;
        
        int mie_miegor = miegor*2;
        int wortel_miegor = miegor*45;
        int tomat_miegor = miegor*1;
        int daging_miegor = miegor*50;
        int telur_miegor = miegor*2;
        int hit_bumbu_miegor = miegor*1;
        int minyak_miegor = miegor*10;
        
        //bahan yang digunakan pada kedua makanan
        wortel = wortel-(wortel_nasgor + wortel_miegor);
        daging_ayam = daging_ayam-(daging_nasgor + daging_miegor);
        telur = telur-(telur_nasgor + telur_miegor);
        minyak = minyak-(minyak_nasgor+minyak_miegor);
        
        
        beras = beras - beras_nasgor;
        timun = timun - timun_nasgor;
        bumbu_nasgor = bumbu_nasgor - hit_bumbu_nasgor;
        
        mie = mie - mie_miegor;
        tomat = tomat - tomat_miegor;
        bumbu_miegor = bumbu_miegor - hit_bumbu_miegor;
        
        String query_beras = "UPDATE tb_bahan_makananminuman SET `jumlah` = "+beras+" WHERE nama_bahan = 'Beras'";
        String query_wortel = "UPDATE tb_bahan_makananminuman SET `jumlah` = "+wortel+" WHERE nama_bahan = 'Wortel'";
        String query_timun = "UPDATE tb_bahan_makananminuman SET `jumlah` = "+timun+" WHERE nama_bahan = 'Timun'";
        String query_daging = "UPDATE tb_bahan_makananminuman SET `jumlah` = "+daging_ayam+" WHERE nama_bahan = 'Daging Ayam'";
        String query_telur = "UPDATE tb_bahan_makananminuman SET `jumlah` = "+telur+" WHERE nama_bahan = 'Telur'";
        String query_bumbu_nasgor = "UPDATE tb_bahan_makananminuman SET `jumlah` = "+bumbu_nasgor+" WHERE nama_bahan = 'Bumbu Nasi Goreng'";
        String query_minyak = "UPDATE tb_bahan_makananminuman SET `jumlah` = "+minyak+" WHERE nama_bahan = 'Minyak'";
        String query_mie = "UPDATE tb_bahan_makananminuman SET `jumlah` = "+mie+" WHERE nama_bahan = 'Mie'";
        String query_tomat = "UPDATE tb_bahan_makananminuman SET `jumlah` = "+tomat+" WHERE nama_bahan = 'Tomat'";
        String query_bumbu_miegor = "UPDATE tb_bahan_makananminuman SET `jumlah` = "+bumbu_miegor+" WHERE nama_bahan = 'Bumbu Mie Goreng'";
        
        /*System.out.println(query_beras);
        System.out.println(query_wortel);
        System.out.println(query_timun);
        System.out.println(query_daging);
        System.out.println(query_telur);
        System.out.println(query_bumbu_nasgor);
        System.out.println(query_minyak);
        System.out.println(query_mie);
        System.out.println(query_tomat);
        System.out.println(query_bumbu_miegor);
        */
        
        try{
            kn.getStatement().executeUpdate(query_beras);
            kn.getStatement().executeUpdate(query_wortel);
            kn.getStatement().executeUpdate(query_timun);
            kn.getStatement().executeUpdate(query_daging);
            kn.getStatement().executeUpdate(query_telur);
            kn.getStatement().executeUpdate(query_bumbu_nasgor);
            kn.getStatement().executeUpdate(query_minyak);
            kn.getStatement().executeUpdate(query_mie);
            kn.getStatement().executeUpdate(query_tomat);
            kn.getStatement().executeUpdate(query_bumbu_miegor);
            
            JOptionPane.showMessageDialog(this, "Update data bahan makaan berhasil");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Update data bahan makanan gagal");
        }
        
    }
    
    void hitungBahanMinuman(int es_teh, int es_jeruk){
        int hit_serbukTeh = es_teh*1;
        int hit_serbukJeruk = es_jeruk*1;
        
        serbuk_teh = serbuk_teh - hit_serbukTeh;
        serbuk_jeruk =serbuk_jeruk - hit_serbukJeruk;
        
        String query_esTeh = "UPDATE tb_bahan_makananminuman SET `jumlah` = "+serbuk_teh+" WHERE nama_bahan = 'Serbuk Teh'";
        String query_esJeruk = "UPDATE tb_bahan_makananminuman SET `jumlah` = "+serbuk_jeruk+" WHERE nama_bahan = 'Serbuk Jeruk'";
        
        try{
            kn.getStatement().executeUpdate(query_esTeh);
            kn.getStatement().executeUpdate(query_esJeruk);
            JOptionPane.showMessageDialog(this, "Update data bahan minuman berhasil");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Update data bahan minuman gagal");
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_nasiGoreng = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_mieGoreng = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_esTeh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_esJeruk = new javax.swing.JTextField();
        chooseTgl = new com.toedter.calendar.JDateChooser();
        btn_tambah = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tanggal");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Junlah Penjualan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nasi Goreng");

        tf_nasiGoreng.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Mie Goreng");

        tf_mieGoreng.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Es Teh");

        tf_esTeh.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Es Jeruk");

        tf_esJeruk.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(36, 36, 36)
                        .addComponent(tf_nasiGoreng, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(42, 42, 42)
                        .addComponent(tf_mieGoreng, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(74, 74, 74)
                        .addComponent(tf_esTeh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(62, 62, 62)
                        .addComponent(tf_esJeruk, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(tf_nasiGoreng, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(tf_mieGoreng, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_esTeh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tf_esJeruk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 430, 240));

        chooseTgl.setDateFormatString("yyyy-MM-dd");
        add(chooseTgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 240, 30));

        btn_tambah.setBackground(new java.awt.Color(108, 92, 231));
        btn_tambah.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 100, 30));

        btn_batal.setBackground(new java.awt.Color(214, 48, 49));
        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setText("BATAL");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });
        add(btn_batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:    
       String formatTgl = "yyyy-MM-dd";
       SimpleDateFormat format_date = new SimpleDateFormat(formatTgl);
       
       String tanggal = String.valueOf(format_date.format(chooseTgl.getDate()));
       String nasi_goreng = tf_nasiGoreng.getText().toString();
       String mie_goreng = tf_mieGoreng.getText().toString();
       String es_teh = tf_esTeh.getText().toString();
       String es_jeruk = tf_esJeruk.getText().toString();
       
       String query = "INSERT INTO tb_penjualan (tanggal, nasi_goreng, mie_goreng, es_teh, es_jeruk) VALUES "
               + "('"+tanggal+"', '"+nasi_goreng+"', '"+mie_goreng+"', '"+es_teh+"', '"+es_jeruk+"')";
       
       try{
           kn.getStatement().executeUpdate(query);
           hitungBahanMakanan(Integer.parseInt(nasi_goreng), Integer.parseInt(mie_goreng));
           hitungBahanMinuman(Integer.parseInt(es_teh), Integer.parseInt(es_jeruk));
           JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");      
           
           chooseTgl.setDate(null);
            tf_nasiGoreng.setText("0");
            tf_mieGoreng.setText("0");
            tf_esTeh.setText("0");
            tf_esJeruk.setText("0");
       }catch(Exception e){
           JOptionPane.showMessageDialog(this, "Data Gagal Ditambahkan");
       }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
        chooseTgl.setDate(null);
        tf_nasiGoreng.setText("0");
        tf_mieGoreng.setText("0");
        tf_esTeh.setText("0");
        tf_esJeruk.setText("0");
    }//GEN-LAST:event_btn_batalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_tambah;
    private com.toedter.calendar.JDateChooser chooseTgl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_esJeruk;
    private javax.swing.JTextField tf_esTeh;
    private javax.swing.JTextField tf_mieGoreng;
    private javax.swing.JTextField tf_nasiGoreng;
    // End of variables declaration//GEN-END:variables
}
