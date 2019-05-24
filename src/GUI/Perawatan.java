/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.Utama.administrator;
import Proses.JConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Perawatan extends javax.swing.JFrame {
    Connection con;
    public Perawatan() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        con = JConnection.ConnectDb();
        this.loadOpsiPasien();
        this.loadOpsiDokter();
        this.loadOpsiKamar();
        tampilan();
    }
    
    private void kosongft(){
        pasienComboBox.setSelectedIndex(0);
        noadm.setText(null);
        masuk.setText(null);
        dokterComboBox.setSelectedIndex(0);
        keluar.setText(null);
        keluar2.setText(null);
        masuk2.setText(null);
        id2.setText(null);
        nip2.setText(null);
        kode2.setText(null);
        kamarComboBox.setSelectedIndex(0);
    }

    public void tampilan(){
        DefaultTableModel x = new DefaultTableModel();
        x.addColumn("NO ADMINISTRASI");
        x.addColumn("TANGGAL MASUK");
        x.addColumn("TANGGAL KELUAR");
        x.addColumn("BIAYA");
        x.addColumn("ID PASIEN");
        x.addColumn("NIP DOKTER");
        x.addColumn("KODE KAMAR");
        
       try(
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rumah_sakit1",
                    "root",
                    "");
                Statement stmt = conn.createStatement();
        ){  String strSelect = "select * from perawatan";
            
            ResultSet rset = stmt.executeQuery(strSelect);
            
            while(rset.next()){
                x.addRow(new Object[] {rset.getString("no_adm"),rset.getString("tgl_masuk"),rset.getString("tgl_keluar"),
                    rset.getString("biaya"),rset.getString("id_pasien"),rset.getString("nip_dokter"),rset.getString("kode_kamar")});
            }
            tablep.setModel(x);
        }catch(SQLException ex){
          
        }
    }
    
    private void tampilkandata(String kolom){
        DefaultTableModel x = new DefaultTableModel();
        x.addColumn("NO ADMINISTRASI");
        x.addColumn("TANGGAL MASUK");
        x.addColumn("TANGGAL KELUAR");
        x.addColumn("BIAYA");
        x.addColumn("ID PASIEN");
        x.addColumn("NIP DOKTER");
        x.addColumn("KODE KAMAR");
        
        try(
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rumah_sakit1",
                    "root",
                    "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from perawatan order by "+kolom+" asc";
            
            ResultSet rset=stmt.executeQuery(strSelect);
            
            while(rset.next()){
                x.addRow(new Object[] {rset.getString(1),rset.getString(2),rset.getString(3),rset.getString(4),rset.getString(5),rset.getString(6),rset.getString(7)});
            }
            tablep.setModel(x);
        }catch(SQLException ex){
            
        }
    }
    
    private void tampilkancari(String kolom){
        DefaultTableModel x = new DefaultTableModel();
        x.addColumn("NO ADMINISTRASI");
        x.addColumn("TANGGAL MASUK");
        x.addColumn("TANGGAL KELUAR");
        x.addColumn("BIAYA");
        x.addColumn("ID PASIEN");
        x.addColumn("NIP DOKTER");
        x.addColumn("KODE KAMAR");
        
        try(
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rumah_sakit1",
                    "root",
                    "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from perawatan where no_adm like '%"+kolom+"%' or "+
                    "tgl_masuk like '%"+kolom+"%' or tgl_keluar like '%"+kolom+"%'"+"or biaya like '%"+kolom+"%'"
                    +"or id_pasien like '%"+kolom+"%'"+"or nip_dokter like '%"+kolom+"%'"+"or kode_kamar like '%"+kolom+"%'";
            
            ResultSet rset=stmt.executeQuery(strSelect);
            
            while(rset.next()){
                x.addRow(new Object[] {rset.getString(1),rset.getString(2),rset.getString(3),rset.getString(4),rset.getString(5),rset.getString(6),rset.getString(7)});
            }
            tablep.setModel(x);
        }catch(SQLException ex){
            
        }
    }
    
    public void loadOpsiPasien(){
        
        try(
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rumah_sakit1",
                    "root",
                    "");
                Statement stmt = conn.createStatement();
        ){
            String query = "SELECT ID_PASIEN, NAMA_PASIEN FROM pasien ORDER BY ID_PASIEN";
            ResultSet rs = stmt.executeQuery(query); 
            while(rs.next()){
                pasienComboBox.addItem(rs.getString("ID_PASIEN"));
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void loadOpsiDokter(){
        
        try(
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rumah_sakit1",
                    "root",
                    "");
                Statement stmt = conn.createStatement();
        ){
            String query = "SELECT NIP_DOKTER, NAMA_DOKTER, SPESIALIS FROM dokter ORDER BY SPESIALIS";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                dokterComboBox.addItem(rs.getString("NIP_DOKTER"));
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void loadOpsiKamar(){
        
        try(
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rumah_sakit1",
                    "root",
                    "");
                Statement stmt = conn.createStatement();
        ){
            String query = "SELECT * FROM kamar ORDER BY KELAS";
            ResultSet rs = stmt.executeQuery(query); 
            while(rs.next()){
                kamarComboBox.addItem(rs.getString("KODE_KAMAR"));
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        masuk = new javax.swing.JTextField();
        keluar = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cari_data = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        urut = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablep = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nip2 = new javax.swing.JTextField();
        kode2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        keluar2 = new javax.swing.JTextField();
        id2 = new javax.swing.JTextField();
        save2 = new javax.swing.JButton();
        batal1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        masuk2 = new javax.swing.JTextField();
        noadm = new javax.swing.JTextField();
        pasienComboBox = new javax.swing.JComboBox<>();
        dokterComboBox = new javax.swing.JComboBox<>();
        kamarComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("SIRANAP");
        jLabel1.setMaximumSize(new java.awt.Dimension(110, 40));
        jLabel1.setMinimumSize(new java.awt.Dimension(110, 40));
        jLabel1.setPreferredSize(new java.awt.Dimension(110, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setText("TAMBAH DATA");
        jLabel2.setMaximumSize(new java.awt.Dimension(130, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(130, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(130, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setText("TANGGAL MASUK");
        jLabel4.setMaximumSize(new java.awt.Dimension(130, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(130, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(110, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setText("TANGGAL KELUAR");
        jLabel5.setMaximumSize(new java.awt.Dimension(130, 20));
        jLabel5.setMinimumSize(new java.awt.Dimension(130, 20));
        jLabel5.setPreferredSize(new java.awt.Dimension(110, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setText("ID PASIEN");
        jLabel6.setMaximumSize(new java.awt.Dimension(130, 20));
        jLabel6.setMinimumSize(new java.awt.Dimension(130, 20));
        jLabel6.setPreferredSize(new java.awt.Dimension(110, 20));

        masuk.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        masuk.setMaximumSize(new java.awt.Dimension(150, 20));
        masuk.setMinimumSize(new java.awt.Dimension(150, 20));
        masuk.setPreferredSize(new java.awt.Dimension(150, 20));

        keluar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        keluar.setMaximumSize(new java.awt.Dimension(150, 20));
        keluar.setMinimumSize(new java.awt.Dimension(150, 20));
        keluar.setPreferredSize(new java.awt.Dimension(150, 20));

        save.setBackground(new java.awt.Color(64, 74, 84));
        save.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("SAVE");
        save.setBorder(null);
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.setFocusPainted(false);
        save.setPreferredSize(new java.awt.Dimension(129, 30));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
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
        batal.setPreferredSize(new java.awt.Dimension(129, 30));
        batal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batalMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel12.setText("CARI DATA");

        cari_data.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        cari.setBackground(new java.awt.Color(64, 74, 84));
        cari.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        cari.setForeground(new java.awt.Color(255, 255, 255));
        cari.setText("CARI");
        cari.setBorder(null);
        cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cari.setFocusPainted(false);
        cari.setMaximumSize(new java.awt.Dimension(80, 30));
        cari.setMinimumSize(new java.awt.Dimension(80, 30));
        cari.setPreferredSize(new java.awt.Dimension(80, 30));
        cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cariMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel13.setText("URUT DATA");

        urut.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        urut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOMOR ADM", "TANGGAL MASUK", "TANGGAL KELUAR", "BIAYA", "ID PASIEN", "NIP DOKTER", "KODE KAMAR" }));
        urut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urutActionPerformed(evt);
            }
        });

        tablep.setModel(new javax.swing.table.DefaultTableModel(
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
        tablep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablepMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablep);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setText("NIP DOKTER");
        jLabel7.setMaximumSize(new java.awt.Dimension(130, 20));
        jLabel7.setMinimumSize(new java.awt.Dimension(130, 20));
        jLabel7.setPreferredSize(new java.awt.Dimension(110, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setText("KODE KAMAR");
        jLabel8.setMaximumSize(new java.awt.Dimension(130, 20));
        jLabel8.setMinimumSize(new java.awt.Dimension(130, 20));
        jLabel8.setPreferredSize(new java.awt.Dimension(110, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel9.setText("NIP DOKTER");
        jLabel9.setMaximumSize(new java.awt.Dimension(130, 20));
        jLabel9.setMinimumSize(new java.awt.Dimension(130, 20));
        jLabel9.setPreferredSize(new java.awt.Dimension(110, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel10.setText("KODE KAMAR");
        jLabel10.setMaximumSize(new java.awt.Dimension(130, 20));
        jLabel10.setMinimumSize(new java.awt.Dimension(130, 20));
        jLabel10.setPreferredSize(new java.awt.Dimension(110, 20));

        nip2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        nip2.setEnabled(false);
        nip2.setMaximumSize(new java.awt.Dimension(150, 20));
        nip2.setMinimumSize(new java.awt.Dimension(150, 20));
        nip2.setPreferredSize(new java.awt.Dimension(150, 20));

        kode2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        kode2.setEnabled(false);
        kode2.setMaximumSize(new java.awt.Dimension(150, 20));
        kode2.setMinimumSize(new java.awt.Dimension(150, 20));
        kode2.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel11.setText("EDIT DATA");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel24.setText("TANGGAL KELUAR");
        jLabel24.setMaximumSize(new java.awt.Dimension(130, 20));
        jLabel24.setMinimumSize(new java.awt.Dimension(130, 20));
        jLabel24.setPreferredSize(new java.awt.Dimension(110, 20));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel25.setText("ID PASIEN");
        jLabel25.setMaximumSize(new java.awt.Dimension(130, 20));
        jLabel25.setMinimumSize(new java.awt.Dimension(130, 20));
        jLabel25.setPreferredSize(new java.awt.Dimension(110, 20));

        keluar2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        keluar2.setMaximumSize(new java.awt.Dimension(150, 20));
        keluar2.setMinimumSize(new java.awt.Dimension(150, 20));
        keluar2.setPreferredSize(new java.awt.Dimension(150, 20));

        id2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        id2.setEnabled(false);
        id2.setMaximumSize(new java.awt.Dimension(150, 20));
        id2.setMinimumSize(new java.awt.Dimension(150, 20));
        id2.setPreferredSize(new java.awt.Dimension(150, 20));

        save2.setBackground(new java.awt.Color(64, 74, 84));
        save2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        save2.setForeground(new java.awt.Color(255, 255, 255));
        save2.setText("UPDATE");
        save2.setBorder(null);
        save2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save2.setFocusPainted(false);
        save2.setMaximumSize(new java.awt.Dimension(80, 30));
        save2.setMinimumSize(new java.awt.Dimension(80, 30));
        save2.setPreferredSize(new java.awt.Dimension(80, 30));
        save2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save2MouseClicked(evt);
            }
        });

        batal1.setBackground(new java.awt.Color(64, 74, 84));
        batal1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        batal1.setForeground(new java.awt.Color(255, 255, 255));
        batal1.setText("BATAL");
        batal1.setBorder(null);
        batal1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        batal1.setFocusPainted(false);
        batal1.setMaximumSize(new java.awt.Dimension(80, 30));
        batal1.setMinimumSize(new java.awt.Dimension(80, 30));
        batal1.setPreferredSize(new java.awt.Dimension(80, 30));
        batal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batal1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(64, 74, 84));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("DELETE");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setMaximumSize(new java.awt.Dimension(80, 30));
        jButton2.setMinimumSize(new java.awt.Dimension(80, 30));
        jButton2.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel26.setText("NO ADMINISTRASI");
        jLabel26.setMaximumSize(new java.awt.Dimension(130, 20));
        jLabel26.setMinimumSize(new java.awt.Dimension(130, 20));
        jLabel26.setPreferredSize(new java.awt.Dimension(110, 20));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel27.setText("TANGGAL MASUK");
        jLabel27.setMaximumSize(new java.awt.Dimension(130, 20));
        jLabel27.setMinimumSize(new java.awt.Dimension(130, 20));
        jLabel27.setPreferredSize(new java.awt.Dimension(110, 20));

        masuk2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        masuk2.setEnabled(false);
        masuk2.setMaximumSize(new java.awt.Dimension(150, 20));
        masuk2.setMinimumSize(new java.awt.Dimension(150, 20));
        masuk2.setPreferredSize(new java.awt.Dimension(150, 20));

        noadm.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        noadm.setEnabled(false);
        noadm.setMaximumSize(new java.awt.Dimension(150, 20));
        noadm.setMinimumSize(new java.awt.Dimension(150, 20));
        noadm.setPreferredSize(new java.awt.Dimension(150, 20));

        pasienComboBox.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        pasienComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih pasien --" }));
        pasienComboBox.setMaximumSize(new java.awt.Dimension(150, 20));
        pasienComboBox.setMinimumSize(new java.awt.Dimension(150, 20));
        pasienComboBox.setPreferredSize(new java.awt.Dimension(150, 20));

        dokterComboBox.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        dokterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih dokter --" }));
        dokterComboBox.setMaximumSize(new java.awt.Dimension(150, 20));
        dokterComboBox.setMinimumSize(new java.awt.Dimension(150, 20));
        dokterComboBox.setPreferredSize(new java.awt.Dimension(150, 20));

        kamarComboBox.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        kamarComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih kamar --" }));
        kamarComboBox.setMaximumSize(new java.awt.Dimension(150, 20));
        kamarComboBox.setMinimumSize(new java.awt.Dimension(150, 20));
        kamarComboBox.setPreferredSize(new java.awt.Dimension(150, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons8-left-32.png"))); // NOI18N
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Data Perawatan Pasien");
        jLabel3.setMaximumSize(new java.awt.Dimension(103, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(103, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(103, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                                .addGap(741, 741, 741))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(batal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dokterComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(kamarComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(masuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(keluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pasienComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(214, 214, 214)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(save2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(batal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(noadm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(masuk2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(keluar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(nip2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(kode2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(cari_data)
                                    .addComponent(urut, 0, 175, Short.MAX_VALUE)
                                    .addComponent(cari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(174, 174, 174))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(masuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(noadm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cari_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masuk2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pasienComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(keluar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dokterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kamarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(batal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(urut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nip2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kode2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cariMouseClicked
        // TODO add your handling code here:
        String kolom = cari_data.getText();
        tampilkancari(kolom);
    }//GEN-LAST:event_cariMouseClicked

    private void urutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urutActionPerformed
        String kolom;

        if (urut.getSelectedItem()=="NOMOR ADM"){
            tampilkandata("NO_ADM");
        } else if (urut.getSelectedItem()=="TANGGAL MASUK"){
            tampilkandata("TGL_MASUK");
        }else if (urut.getSelectedItem()=="TANGGAL KELUAR"){
            tampilkandata("TGL_KELUAR");
        }else if (urut.getSelectedItem()=="BIAYA"){
            tampilkandata("BIAYA");
        }else if (urut.getSelectedItem()=="ID PASIEN"){
            tampilkandata("ID_PASIEN");
        }else if (urut.getSelectedItem()=="NIP DOKTER"){
            tampilkandata("NIP_DOKTER");
        }else if (urut.getSelectedItem()=="KODE KAMAR"){
            tampilkandata("KODE_KAMAR");
        }
    }//GEN-LAST:event_urutActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
       try(Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rumah_sakit1",
                    "root",
                    "");
                Statement stmt = conn.createStatement();
        ){
            String insert = "insert into perawatan (tgl_masuk,tgl_keluar,biaya,id_pasien,"
                    + "nip_dokter,kode_kamar) values ('"
                    + masuk.getText() + "','" + keluar.getText() + "',datediff('"
                    + keluar.getText() + "','" + masuk.getText() + "')*"
                    + "(select tarif_perhari from kelas_kamar natural join kamar where "
                    +"kode_kamar='"+ kamarComboBox.getSelectedItem() + "'),'" +pasienComboBox.getSelectedItem() + "','"
                    + dokterComboBox.getSelectedItem() + "','" + kamarComboBox.getSelectedItem() + "')";
            stmt.executeUpdate(insert);
            JOptionPane.showMessageDialog(null,"tambah data berhasil");
            tampilan();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Gagal menambah data");
            ex.printStackTrace();
        }        
    }//GEN-LAST:event_saveMouseClicked

    private void batalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batalMouseClicked
        kosongft();
        
    }//GEN-LAST:event_batalMouseClicked

    private void batal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batal1MouseClicked
        kosongft();
    }//GEN-LAST:event_batal1MouseClicked

    private void tablepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablepMouseClicked
        DefaultTableModel model = (DefaultTableModel) tablep.getModel();
        noadm.setText(model.getValueAt(tablep.getSelectedRow(), 0).toString());
        masuk2.setText(model.getValueAt(tablep.getSelectedRow(), 1).toString());
        keluar2.setText(model.getValueAt(tablep.getSelectedRow(), 2).toString());
        id2.setText(model.getValueAt(tablep.getSelectedRow(), 4).toString());
        nip2.setText(model.getValueAt(tablep.getSelectedRow(), 5).toString());
        kode2.setText(model.getValueAt(tablep.getSelectedRow(), 6).toString());
    }//GEN-LAST:event_tablepMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try(
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/rumah_sakit1",
                "root",
                "");
            Statement stmt = conn.createStatement();
        ){
            String delete = "delete from perawatan where no_adm = '"+noadm.getText()+"'";
            stmt.executeUpdate(delete);
            tampilan();
        }catch (SQLException ex) {
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void save2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save2MouseClicked
        DefaultTableModel model = (DefaultTableModel) tablep.getModel();
        try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rumah_sakit1","root","");
            Statement stmt = conn.createStatement();
        ){
            String update = "update perawatan set tgl_keluar='"+keluar2.getText()+"',biaya=datediff('"
                    +keluar2.getText()+"','"+masuk2.getText()+"')*(select tarif_perhari from kelas_kamar where kelas in"
                    + "(select kelas from kamar where kode_kamar='"+kode2.getText()+"')) where no_adm = '"+
                    model.getValueAt(tablep.getSelectedRow(), 0).toString()+"'";
            stmt.executeUpdate(update);
            JOptionPane.showMessageDialog(null, "update data berhasil");
            tampilan();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"gagal update data");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_save2MouseClicked

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
            java.util.logging.Logger.getLogger(Perawatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perawatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perawatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perawatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perawatan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JButton batal1;
    private javax.swing.JButton cari;
    private javax.swing.JTextField cari_data;
    private javax.swing.JComboBox<String> dokterComboBox;
    private javax.swing.JTextField id2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kamarComboBox;
    private javax.swing.JTextField keluar;
    private javax.swing.JTextField keluar2;
    private javax.swing.JTextField kode2;
    private javax.swing.JTextField masuk;
    private javax.swing.JTextField masuk2;
    private javax.swing.JTextField nip2;
    private javax.swing.JTextField noadm;
    private javax.swing.JComboBox<String> pasienComboBox;
    private javax.swing.JButton save;
    private javax.swing.JButton save2;
    private javax.swing.JTable tablep;
    private javax.swing.JComboBox<String> urut;
    // End of variables declaration//GEN-END:variables
}
