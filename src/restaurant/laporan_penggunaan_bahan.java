/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author ASUS
 */
public class laporan_penggunaan_bahan extends javax.swing.JFrame {

    /**
     * Creates new form laporan_penggunaan_bahan
     */
    public laporan_penggunaan_bahan() {
        initComponents();
    }
    
    void setTgl(String tgl_mulai, String tgl_end){
        lbl_tgl_mulai.setText(tgl_mulai);
        lbl_tgl_sampai.setText(tgl_end);
        
    }
    void setTotalBahanNasgor(int n){
        int beras = n*200;
        int wortel = n*50;
        int timun = n*50;
        int daging = n*60;
        int telur = n*2;
        int bumbu = n*1;
        int minyak = n*10;
        
        lbl_berasNasgor.setText(String.valueOf(beras));
        lbl_wortelNasgor.setText(String.valueOf(wortel));
        lbl_timunNasgor.setText(String.valueOf(timun));
        lbl_ayamNasgor.setText(String.valueOf(daging));
        lbl_telurNasgor.setText(String.valueOf(telur));
        lbl_bumbuNasgor.setText(String.valueOf(bumbu));
        lbl_minyakNasgor.setText(String.valueOf(minyak));
    }
    
    
    void setTotalBahanMiegor(int n){
        int mie = n*2;
        int wortel = n*45;
        int tomat= n*1;
        int daging = n*50;
        int telur = n*2;
        int bumbu = n*1;
        int minyak = n*10;
        
        lbl_mie.setText(String.valueOf(mie));
        lbl_wortelMiegor.setText(String.valueOf(wortel));
        lbl_tomatMiegor.setText(String.valueOf(tomat));
        lbl_ayamMiegor.setText(String.valueOf(daging));
        lbl_telurMiegor.setText(String.valueOf(telur));
        lbl_bumbuMiegor.setText(String.valueOf(bumbu));
        lbl_minyakMiegor.setText(String.valueOf(minyak));
    }
    
    void setTotalBahanEsTeh(int n){
        lbl_esteh.setText(String.valueOf(n));
    }
    
    void setTotalBahanEsJeuk(int n){
        lbl_esjeruk.setText(String.valueOf(n));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label100 = new javax.swing.JLabel();
        label101 = new javax.swing.JLabel();
        label102 = new javax.swing.JLabel();
        label103 = new javax.swing.JLabel();
        label104 = new javax.swing.JLabel();
        label105 = new javax.swing.JLabel();
        label106 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        lbl_minyakMiegor = new javax.swing.JLabel();
        lbl_mie = new javax.swing.JLabel();
        lbl_wortelMiegor = new javax.swing.JLabel();
        lbl_tomatMiegor = new javax.swing.JLabel();
        lbl_ayamMiegor = new javax.swing.JLabel();
        lbl_telurMiegor = new javax.swing.JLabel();
        lbl_bumbuMiegor = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lbl_minyakNasgor = new javax.swing.JLabel();
        lbl_berasNasgor = new javax.swing.JLabel();
        lbl_wortelNasgor = new javax.swing.JLabel();
        lbl_timunNasgor = new javax.swing.JLabel();
        lbl_ayamNasgor = new javax.swing.JLabel();
        lbl_telurNasgor = new javax.swing.JLabel();
        lbl_bumbuNasgor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_tgl_sampai = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_tgl_mulai = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_esjeruk = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        lbl_esteh = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(150, 50, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(253, 203, 110));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mie Goreng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label100.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label100.setForeground(new java.awt.Color(255, 255, 255));
        label100.setText("Minyak");
        jPanel2.add(label100, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        label101.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label101.setForeground(new java.awt.Color(255, 255, 255));
        label101.setText("Mie");
        jPanel2.add(label101, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        label102.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label102.setForeground(new java.awt.Color(255, 255, 255));
        label102.setText("Wortel");
        jPanel2.add(label102, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        label103.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label103.setForeground(new java.awt.Color(255, 255, 255));
        label103.setText("Tomat");
        jPanel2.add(label103, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        label104.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label104.setForeground(new java.awt.Color(255, 255, 255));
        label104.setText("Daging Ayam");
        jPanel2.add(label104, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        label105.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label105.setForeground(new java.awt.Color(255, 255, 255));
        label105.setText("Telur");
        jPanel2.add(label105, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        label106.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label106.setForeground(new java.awt.Color(255, 255, 255));
        label106.setText("Bumbu Mie Goreng");
        jPanel2.add(label106, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText(":");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 20, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText(":");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 20, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText(":");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 20, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText(":");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 20, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText(":");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 20, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText(":");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 20, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText(":");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 20, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("bks");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 30, 30, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("gr");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("buah");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("gr");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("butir");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("sachet");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("ml");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        lbl_minyakMiegor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_minyakMiegor.setForeground(new java.awt.Color(255, 255, 255));
        lbl_minyakMiegor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_minyakMiegor.setText("jLabel3");
        jPanel2.add(lbl_minyakMiegor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 60, -1));

        lbl_mie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_mie.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mie.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_mie.setText("jLabel3");
        jPanel2.add(lbl_mie, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 30, 60, -1));

        lbl_wortelMiegor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_wortelMiegor.setForeground(new java.awt.Color(255, 255, 255));
        lbl_wortelMiegor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_wortelMiegor.setText("jLabel3");
        jPanel2.add(lbl_wortelMiegor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 60, -1));

        lbl_tomatMiegor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_tomatMiegor.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tomatMiegor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_tomatMiegor.setText("jLabel3");
        jPanel2.add(lbl_tomatMiegor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 60, -1));

        lbl_ayamMiegor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_ayamMiegor.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ayamMiegor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_ayamMiegor.setText("jLabel3");
        jPanel2.add(lbl_ayamMiegor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 60, -1));

        lbl_telurMiegor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_telurMiegor.setForeground(new java.awt.Color(255, 255, 255));
        lbl_telurMiegor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_telurMiegor.setText("jLabel3");
        jPanel2.add(lbl_telurMiegor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 60, -1));

        lbl_bumbuMiegor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_bumbuMiegor.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bumbuMiegor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_bumbuMiegor.setText("jLabel3");
        jPanel2.add(lbl_bumbuMiegor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 60, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 380, 250));

        jPanel3.setBackground(new java.awt.Color(9, 132, 227));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nasi Goreng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ml");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Wortel");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Timun");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Daging ayam");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Telur");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Bumbu Nasi Goreng");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Minyak");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(":");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 20, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(":");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 20, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(":");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 20, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(":");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 20, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText(":");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 20, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText(":");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 20, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(":");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 20, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Beras");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("gr");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("gr");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("gr");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("gr");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("butir");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("sachet");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        lbl_minyakNasgor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_minyakNasgor.setForeground(new java.awt.Color(255, 255, 255));
        lbl_minyakNasgor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_minyakNasgor.setText("jLabel27");
        jPanel3.add(lbl_minyakNasgor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 60, -1));

        lbl_berasNasgor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_berasNasgor.setForeground(new java.awt.Color(255, 255, 255));
        lbl_berasNasgor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_berasNasgor.setText("jLabel27");
        jPanel3.add(lbl_berasNasgor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 60, -1));

        lbl_wortelNasgor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_wortelNasgor.setForeground(new java.awt.Color(255, 255, 255));
        lbl_wortelNasgor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_wortelNasgor.setText("jLabel27");
        jPanel3.add(lbl_wortelNasgor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 60, -1));

        lbl_timunNasgor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_timunNasgor.setForeground(new java.awt.Color(255, 255, 255));
        lbl_timunNasgor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_timunNasgor.setText("jLabel27");
        jPanel3.add(lbl_timunNasgor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 60, -1));

        lbl_ayamNasgor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_ayamNasgor.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ayamNasgor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_ayamNasgor.setText("jLabel27");
        jPanel3.add(lbl_ayamNasgor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 60, -1));

        lbl_telurNasgor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_telurNasgor.setForeground(new java.awt.Color(255, 255, 255));
        lbl_telurNasgor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_telurNasgor.setText("jLabel27");
        jPanel3.add(lbl_telurNasgor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 60, -1));

        lbl_bumbuNasgor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_bumbuNasgor.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bumbuNasgor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_bumbuNasgor.setText("jLabel27");
        jPanel3.add(lbl_bumbuNasgor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 60, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 380, 250));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("LAPORAN PEENGGUNAAN BAHAN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel2.setText("Sampai Tanggal :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        lbl_tgl_sampai.setText("yyyy-mm-dd");
        jPanel1.add(lbl_tgl_sampai, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 100, -1));

        jLabel4.setText("Dari Tanggal :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        lbl_tgl_mulai.setText("yyyy-mm-dd");
        jPanel1.add(lbl_tgl_mulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 100, -1));

        jPanel4.setBackground(new java.awt.Color(99, 110, 114));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Es Jeruk", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Serbuk Jeuk :  ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 50, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Shacet");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, 20));

        lbl_esjeruk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_esjeruk.setForeground(new java.awt.Color(255, 255, 255));
        lbl_esjeruk.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_esjeruk.setText("jLabel41");
        jPanel4.add(lbl_esjeruk, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 70, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 380, 120));

        jPanel5.setBackground(new java.awt.Color(225, 112, 85));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Es Teh", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Serbuk Teh : ");
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 50, -1, 20));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Shacet");
        jPanel5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, 20));

        lbl_esteh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_esteh.setForeground(new java.awt.Color(255, 255, 255));
        lbl_esteh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_esteh.setText("jLabel41");
        jPanel5.add(lbl_esteh, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 70, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 380, 120));

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(laporan_penggunaan_bahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laporan_penggunaan_bahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laporan_penggunaan_bahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laporan_penggunaan_bahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laporan_penggunaan_bahan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel label100;
    private javax.swing.JLabel label101;
    private javax.swing.JLabel label102;
    private javax.swing.JLabel label103;
    private javax.swing.JLabel label104;
    private javax.swing.JLabel label105;
    private javax.swing.JLabel label106;
    private javax.swing.JLabel lbl_ayamMiegor;
    private javax.swing.JLabel lbl_ayamNasgor;
    private javax.swing.JLabel lbl_berasNasgor;
    private javax.swing.JLabel lbl_bumbuMiegor;
    private javax.swing.JLabel lbl_bumbuNasgor;
    private javax.swing.JLabel lbl_esjeruk;
    private javax.swing.JLabel lbl_esteh;
    private javax.swing.JLabel lbl_mie;
    private javax.swing.JLabel lbl_minyakMiegor;
    private javax.swing.JLabel lbl_minyakNasgor;
    private javax.swing.JLabel lbl_telurMiegor;
    private javax.swing.JLabel lbl_telurNasgor;
    private javax.swing.JLabel lbl_tgl_mulai;
    private javax.swing.JLabel lbl_tgl_sampai;
    private javax.swing.JLabel lbl_timunNasgor;
    private javax.swing.JLabel lbl_tomatMiegor;
    private javax.swing.JLabel lbl_wortelMiegor;
    private javax.swing.JLabel lbl_wortelNasgor;
    // End of variables declaration//GEN-END:variables
}
