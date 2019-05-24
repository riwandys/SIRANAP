/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.Utama.administrator;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LAURENSIUS
 */
public class Dokter extends javax.swing.JFrame {
    
    public Dokter() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        tampilan();
    }
    
    private void kosongft(){
        nip.setText(null);
        nip1.setText(null);
        nama1.setText(null);
        nama.setText(null);
        spesialis.setText(null);
        spesialis1.setText(null);
        telepon.setText(null);
        telepon1.setText(null);
    }
    
    public void tampilan(){
        DefaultTableModel x = new DefaultTableModel();
        x.addColumn("NIP DOKTER");
        x.addColumn("NAMA DOKTER");
        x.addColumn("SPESIALIS");
        x.addColumn("NO TELEPON");
        
       try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rumah_sakit1","root","");
            Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from dokter";
            
            ResultSet rset=stmt.executeQuery(strSelect);
            
            while(rset.next()){
                x.addRow(new Object[] {rset.getString("NIP_DOKTER"),rset.getString("nama_DOKTER"),rset.getString("spesialis"),rset.getString("no_telpon")});
            }
            tbldokter.setModel(x);
        }catch(SQLException ex){
          
        }
    }
    
    private void tampilkandata(String kolom){
        DefaultTableModel x = new DefaultTableModel();
        x.addColumn("NIP DPKTER");
        x.addColumn("NAMA DOKTER");
        x.addColumn("SPESIALIS");
        x.addColumn("NO TELPON");
        
        try(
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rumah_sakit1",
                    "root",
                    "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from dokter order by "+kolom+" asc";
            
            ResultSet rset=stmt.executeQuery(strSelect);
            
            while(rset.next()){
                x.addRow(new Object[] {rset.getString(1),rset.getString(2),rset.getString(3),rset.getString(4)});
            }
            tbldokter.setModel(x);
        }catch(SQLException ex){
            
        }
    }
    
    private void tampilkancari(String kolom){
        DefaultTableModel x = new DefaultTableModel();
        x.addColumn("NIP DPKTER");
        x.addColumn("NAMA DOKTER");
        x.addColumn("SPESIALIS");
        x.addColumn("NO TELPON");
        
        try(
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rumah_sakit1",
                    "root",
                    "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from dokter where NIP_DOKTER like '%"+kolom+"%' or "+
                    "nama_DOKTER like '%"+kolom+"%' or SPESIALIS like '%"+kolom+"%'"+"or NO_TELPON like '%"+kolom+"%'";
            
            ResultSet rset=stmt.executeQuery(strSelect);
            
            while(rset.next()){
                x.addRow(new Object[] {rset.getString(1),rset.getString(2),rset.getString(3),rset.getString(4)});
            }
            tbldokter.setModel(x);
        }catch(SQLException ex){
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nip = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        spesialis = new javax.swing.JTextField();
        telepon = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        nama1 = new javax.swing.JTextField();
        spesialis1 = new javax.swing.JTextField();
        telepon1 = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        batal1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cari_data = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        urut = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldokter = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        nip1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1360, 740));
        setPreferredSize(new java.awt.Dimension(1360, 740));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("SIRANAP");
        jLabel1.setMaximumSize(new java.awt.Dimension(110, 40));
        jLabel1.setMinimumSize(new java.awt.Dimension(110, 40));
        jLabel1.setPreferredSize(new java.awt.Dimension(110, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setText("TAMBAH DATA");
        jLabel2.setMaximumSize(new java.awt.Dimension(78, 15));
        jLabel2.setMinimumSize(new java.awt.Dimension(78, 15));
        jLabel2.setPreferredSize(new java.awt.Dimension(78, 15));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setText("NIP DOKTER");
        jLabel3.setMaximumSize(new java.awt.Dimension(78, 15));
        jLabel3.setMinimumSize(new java.awt.Dimension(78, 15));
        jLabel3.setPreferredSize(new java.awt.Dimension(78, 15));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setText("NAMA DOKTER");
        jLabel4.setMaximumSize(new java.awt.Dimension(78, 15));
        jLabel4.setMinimumSize(new java.awt.Dimension(78, 15));
        jLabel4.setPreferredSize(new java.awt.Dimension(78, 15));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setText("SPESIALIS");
        jLabel5.setMaximumSize(new java.awt.Dimension(78, 15));
        jLabel5.setMinimumSize(new java.awt.Dimension(78, 15));
        jLabel5.setPreferredSize(new java.awt.Dimension(78, 15));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setText("NO TELEPON");
        jLabel6.setMaximumSize(new java.awt.Dimension(78, 15));
        jLabel6.setMinimumSize(new java.awt.Dimension(78, 15));
        jLabel6.setPreferredSize(new java.awt.Dimension(78, 15));

        nip.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        nip.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(64, 74, 84)));
        nip.setMaximumSize(new java.awt.Dimension(100, 20));
        nip.setMinimumSize(new java.awt.Dimension(100, 20));
        nip.setPreferredSize(new java.awt.Dimension(150, 20));

        nama.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        nama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(64, 74, 84)));
        nama.setMaximumSize(new java.awt.Dimension(100, 20));
        nama.setMinimumSize(new java.awt.Dimension(100, 20));
        nama.setPreferredSize(new java.awt.Dimension(150, 20));

        spesialis.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        spesialis.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(64, 74, 84)));
        spesialis.setMaximumSize(new java.awt.Dimension(100, 20));
        spesialis.setMinimumSize(new java.awt.Dimension(100, 20));
        spesialis.setPreferredSize(new java.awt.Dimension(150, 20));

        telepon.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        telepon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(64, 74, 84)));
        telepon.setMaximumSize(new java.awt.Dimension(100, 20));
        telepon.setMinimumSize(new java.awt.Dimension(100, 20));
        telepon.setPreferredSize(new java.awt.Dimension(150, 20));

        save.setBackground(new java.awt.Color(64, 74, 84));
        save.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("SAVE");
        save.setBorder(null);
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.setFocusPainted(false);
        save.setMaximumSize(new java.awt.Dimension(115, 30));
        save.setMinimumSize(new java.awt.Dimension(115, 30));
        save.setPreferredSize(new java.awt.Dimension(115, 30));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        batal.setBackground(new java.awt.Color(64, 74, 84));
        batal.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        batal.setForeground(new java.awt.Color(255, 255, 255));
        batal.setText("BATAL");
        batal.setBorder(null);
        batal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        batal.setFocusPainted(false);
        batal.setMaximumSize(new java.awt.Dimension(115, 30));
        batal.setMinimumSize(new java.awt.Dimension(115, 30));
        batal.setPreferredSize(new java.awt.Dimension(115, 30));
        batal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batalMouseClicked(evt);
            }
        });

        nama1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        nama1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(64, 74, 84)));
        nama1.setMaximumSize(new java.awt.Dimension(100, 20));
        nama1.setMinimumSize(new java.awt.Dimension(100, 20));
        nama1.setPreferredSize(new java.awt.Dimension(150, 20));

        spesialis1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        spesialis1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(64, 74, 84)));
        spesialis1.setMaximumSize(new java.awt.Dimension(100, 20));
        spesialis1.setMinimumSize(new java.awt.Dimension(100, 20));
        spesialis1.setPreferredSize(new java.awt.Dimension(150, 20));

        telepon1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        telepon1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(64, 74, 84)));
        telepon1.setMaximumSize(new java.awt.Dimension(100, 20));
        telepon1.setMinimumSize(new java.awt.Dimension(100, 20));
        telepon1.setPreferredSize(new java.awt.Dimension(150, 20));

        update.setBackground(new java.awt.Color(64, 74, 84));
        update.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");
        update.setBorder(null);
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.setFocusPainted(false);
        update.setMaximumSize(new java.awt.Dimension(75, 30));
        update.setMinimumSize(new java.awt.Dimension(75, 30));
        update.setPreferredSize(new java.awt.Dimension(75, 30));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        batal1.setBackground(new java.awt.Color(64, 74, 84));
        batal1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        batal1.setForeground(new java.awt.Color(255, 255, 255));
        batal1.setText("BATAL");
        batal1.setBorder(null);
        batal1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        batal1.setFocusPainted(false);
        batal1.setMaximumSize(new java.awt.Dimension(75, 30));
        batal1.setMinimumSize(new java.awt.Dimension(75, 30));
        batal1.setPreferredSize(new java.awt.Dimension(75, 30));
        batal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batal1MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setText("UPDATE DATA");
        jLabel7.setMaximumSize(new java.awt.Dimension(78, 15));
        jLabel7.setMinimumSize(new java.awt.Dimension(78, 15));
        jLabel7.setPreferredSize(new java.awt.Dimension(78, 15));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setText("NIP DOKTER");
        jLabel8.setMaximumSize(new java.awt.Dimension(78, 15));
        jLabel8.setMinimumSize(new java.awt.Dimension(78, 15));
        jLabel8.setPreferredSize(new java.awt.Dimension(78, 15));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel9.setText("NAMA DOKTER");
        jLabel9.setMaximumSize(new java.awt.Dimension(78, 15));
        jLabel9.setMinimumSize(new java.awt.Dimension(78, 15));
        jLabel9.setPreferredSize(new java.awt.Dimension(78, 15));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel10.setText("SPESIALIS");
        jLabel10.setMaximumSize(new java.awt.Dimension(78, 15));
        jLabel10.setMinimumSize(new java.awt.Dimension(78, 15));
        jLabel10.setPreferredSize(new java.awt.Dimension(78, 15));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel11.setText("NO TELEPON");
        jLabel11.setMaximumSize(new java.awt.Dimension(78, 15));
        jLabel11.setMinimumSize(new java.awt.Dimension(78, 15));
        jLabel11.setPreferredSize(new java.awt.Dimension(78, 15));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel12.setText("CARI DATA");

        cari_data.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        cari.setBackground(new java.awt.Color(64, 74, 84));
        cari.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        cari.setForeground(new java.awt.Color(255, 255, 255));
        cari.setText("CARI");
        cari.setBorder(null);
        cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cari.setFocusPainted(false);
        cari.setPreferredSize(new java.awt.Dimension(60, 30));
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel13.setText("URUT DATA");

        urut.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        urut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIP DOKTER", "NAMA DOKTER", "SPESIALIS", "NO TELEPON" }));
        urut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urutMouseClicked(evt);
            }
        });
        urut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urutActionPerformed(evt);
            }
        });

        tbldokter.setModel(new javax.swing.table.DefaultTableModel(
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
        tbldokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldokterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbldokter);

        delete.setBackground(new java.awt.Color(64, 74, 84));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.setBorder(null);
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.setFocusPainted(false);
        delete.setMaximumSize(new java.awt.Dimension(75, 30));
        delete.setMinimumSize(new java.awt.Dimension(75, 30));
        delete.setPreferredSize(new java.awt.Dimension(75, 30));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        nip1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        nip1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(64, 74, 84)));
        nip1.setMaximumSize(new java.awt.Dimension(100, 20));
        nip1.setMinimumSize(new java.awt.Dimension(100, 20));
        nip1.setPreferredSize(new java.awt.Dimension(150, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons8-left-32.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(40, 40));
        jButton1.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton1.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Data Dokter");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(nip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(spesialis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(telepon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(batal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nama1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nip1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spesialis1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telepon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(batal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(261, 261, 261)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addComponent(cari_data)
                            .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(urut, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(145, 145, 145))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(177, 177, 177))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nip1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nama1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spesialis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spesialis1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telepon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telepon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cari_data, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(urut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(batal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(batal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rumah_sakit1","root","");
            Statement stmt = conn.createStatement();
        ){
            String insert = "insert into dokter values ('"+nip.getText()+"','"+nama.getText()+"','"+spesialis.getText()+"','"+
                    telepon.getText()+"')";
            stmt.executeUpdate(insert);
            JOptionPane.showMessageDialog(null,"Berhasil menambahkan data");
            tampilan();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Gagal menambahkan data");
            ex.printStackTrace();
        }        
    }//GEN-LAST:event_saveActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbldokter.getModel();
        try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rumah_sakit1","root","");
            Statement stmt = conn.createStatement();
        ){
            String update = "update dokter set NIP_DOKTER='"+nip1.getText()+"',NAMA_DOKTER='"+nama1.getText()+
                    "',SPESIALIS='"+spesialis1.getText()+"',NO_TELPON='"+telepon1.getText()+
                    "' where NIP_DOKTER = '"+model.getValueAt(tbldokter.getSelectedRow(), 0).toString()+"'";
            stmt.executeUpdate(update);
            JOptionPane.showMessageDialog(null, "update data berhasil");
            tampilan();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"gagal update data");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       
    }//GEN-LAST:event_deleteActionPerformed

    private void urutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urutMouseClicked
       
    }//GEN-LAST:event_urutMouseClicked

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        String kolom = cari_data.getText();
        tampilkancari(kolom);
    }//GEN-LAST:event_cariActionPerformed

    private void tbldokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldokterMouseClicked
        DefaultTableModel model = (DefaultTableModel) tbldokter.getModel();
        nip1.setText(model.getValueAt(tbldokter.getSelectedRow(), 0).toString());
        nama1.setText(model.getValueAt(tbldokter.getSelectedRow(), 1).toString());
        spesialis1.setText(model.getValueAt(tbldokter.getSelectedRow(), 2).toString());
        telepon1.setText(model.getValueAt(tbldokter.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tbldokterMouseClicked

    private void urutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urutActionPerformed
         String kolom;

        if (urut.getSelectedItem()=="NIP DOKTER"){
            tampilkandata("NIP_DOKTER");
        } else if (urut.getSelectedItem()=="NAMA DOKTER"){
            tampilkandata("nama_DOKTER");
        }else if (urut.getSelectedItem()=="SPESIALIS"){
            tampilkandata("SPESIALIS");
        }else if (urut.getSelectedItem()=="NO TELEPON"){
            tampilkandata("NO_TELPON");
        }
    }//GEN-LAST:event_urutActionPerformed

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
       try(
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/rumah_sakit1",
                "root",
                "");
            Statement stmt = conn.createStatement();
        ){
            String delete = "delete from dokter where nip_dokter = '"+nip1.getText()+"'";
            stmt.executeUpdate(delete);
            tampilan();
        }catch (SQLException ex) {
           ex.printStackTrace();
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void batal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batal1MouseClicked
        // TODO add your handling code here:
        kosongft();
    }//GEN-LAST:event_batal1MouseClicked

    private void batalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batalMouseClicked
        kosongft();
    }//GEN-LAST:event_batalMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        Main objek = new Main(administrator);
        objek.setLocationRelativeTo(null);
        objek.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JButton batal1;
    private javax.swing.JButton cari;
    private javax.swing.JTextField cari_data;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nama1;
    private javax.swing.JTextField nip;
    private javax.swing.JTextField nip1;
    private javax.swing.JButton save;
    private javax.swing.JTextField spesialis;
    private javax.swing.JTextField spesialis1;
    private javax.swing.JTable tbldokter;
    private javax.swing.JTextField telepon;
    private javax.swing.JTextField telepon1;
    private javax.swing.JButton update;
    private javax.swing.JComboBox<String> urut;
    // End of variables declaration//GEN-END:variables
}
