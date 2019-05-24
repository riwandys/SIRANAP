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
public final class Pasien extends javax.swing.JFrame {
    
    public Pasien() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        tampilan();
    }
    
    private void kosongft(){
        id.setText(null);
        id2.setText(null);
        nama2.setText(null);
        nama.setText(null);
        jk.setSelectedIndex(0);
        jk2.setSelectedIndex(0);
        telepon.setText(null);
        telepon2.setText(null);
        alamat.setText(null);
        alamat1.setText(null);
        tahun.setText(null);
        tahun1.setText(null);
        bulan.setSelectedIndex(0);
        bulan1.setSelectedIndex(0);
        hari.setSelectedIndex(0);
        hari1.setSelectedIndex(0);
    }
    public void tampilan(){
        DefaultTableModel x = new DefaultTableModel();
        x.addColumn("ID PASIEN");
        x.addColumn("NAMA PASIEN");
        x.addColumn("JENIS KELAMIN");
        x.addColumn("TANGGAL LAHIR");
        x.addColumn("NO TELEPON");
        x.addColumn("ALAMAT");
        
       try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rumah_sakit1","root","");
            Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from pasien";
            
            ResultSet rset=stmt.executeQuery(strSelect);
            
            while(rset.next()){
                x.addRow(new Object[] {rset.getString("id_pasien"),rset.getString("nama_pasien"),rset.getString("jenis_kelamin"),
                    rset.getString("tgl_lahir"),rset.getString("no_telpon"),rset.getString("alamat")});
            }
            tblpasien.setModel(x);
        }catch(SQLException ex){
          
        }
    }
    
    private void tampilkandata(String kolom){
        DefaultTableModel x = new DefaultTableModel();
        x.addColumn("ID PASIEN");
        x.addColumn("NAMA PASIEN");
        x.addColumn("JENIS KELAMIN");
        x.addColumn("TANGGAL LAHIR");
        x.addColumn("NO TELEPON");
        x.addColumn("ALAMAT");
        
        try(
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rumah_sakit1",
                    "root",
                    "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from pasien order by "+kolom+" asc";
            
            ResultSet rset=stmt.executeQuery(strSelect);
            
            while(rset.next()){
                x.addRow(new Object[] {rset.getString(1),rset.getString(2),rset.getString(3),rset.getString(4),rset.getString(5),rset.getString(6)});
            }
            tblpasien.setModel(x);
        }catch(SQLException ex){
            
        }
    }
    
    private void tampilkancari(String kolom){
        DefaultTableModel x = new DefaultTableModel();
        x.addColumn("ID PASIEN");
        x.addColumn("NAMA PASIEN");
        x.addColumn("JENIS KELAMIN");
        x.addColumn("TANGGAL LAHIR");
        x.addColumn("NO TELEPON");
        x.addColumn("ALAMAT");
        
        try(
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rumah_sakit1",
                    "root",
                    "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from pasien where id_pasien like '%"+kolom+"%' or "+
                    "nama_pasien like '%"+kolom+"%' or jenis_kelamin like '%"+kolom+"%'"+"or NO_TELPON like '%"+kolom+"%'"
                    +"or alamat like '%"+kolom+"%'"+"or tgl_lahir like '%"+kolom+"%'";
            
            ResultSet rset=stmt.executeQuery(strSelect);
            
            while(rset.next()){
                x.addRow(new Object[] {rset.getString(1),rset.getString(2),rset.getString(3),rset.getString(4),rset.getString(5),rset.getString(6)});
            }
            tblpasien.setModel(x);
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
        id = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        telepon = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cari_data = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        urut = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpasien = new javax.swing.JTable();
        jk = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        tahun = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        nama2 = new javax.swing.JTextField();
        telepon2 = new javax.swing.JTextField();
        save1 = new javax.swing.JButton();
        jk2 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        batal2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        id2 = new javax.swing.JTextField();
        save2 = new javax.swing.JButton();
        hari = new javax.swing.JComboBox<>();
        bulan = new javax.swing.JComboBox<>();
        hari1 = new javax.swing.JComboBox<>();
        tahun1 = new javax.swing.JTextField();
        bulan1 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        alamat1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1360, 740));
        setMinimumSize(new java.awt.Dimension(1360, 740));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1360, 740));
        jPanel1.setMinimumSize(new java.awt.Dimension(1360, 740));
        jPanel1.setPreferredSize(new java.awt.Dimension(1360, 740));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("SIRANAP");
        jLabel1.setMaximumSize(new java.awt.Dimension(110, 40));
        jLabel1.setMinimumSize(new java.awt.Dimension(110, 40));
        jLabel1.setPreferredSize(new java.awt.Dimension(110, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setText("TAMBAH DATA");
        jLabel2.setMaximumSize(new java.awt.Dimension(83, 15));
        jLabel2.setMinimumSize(new java.awt.Dimension(83, 15));
        jLabel2.setPreferredSize(new java.awt.Dimension(83, 15));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setText("ID PASIEN");
        jLabel3.setMaximumSize(new java.awt.Dimension(83, 15));
        jLabel3.setMinimumSize(new java.awt.Dimension(83, 15));
        jLabel3.setPreferredSize(new java.awt.Dimension(83, 15));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setText("NAMA PASIEN");
        jLabel4.setMaximumSize(new java.awt.Dimension(83, 15));
        jLabel4.setMinimumSize(new java.awt.Dimension(83, 15));
        jLabel4.setPreferredSize(new java.awt.Dimension(83, 15));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setText("JENIS KELAMIN");
        jLabel5.setMaximumSize(new java.awt.Dimension(83, 15));
        jLabel5.setMinimumSize(new java.awt.Dimension(83, 15));
        jLabel5.setPreferredSize(new java.awt.Dimension(83, 15));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setText("NO TELEPON");
        jLabel6.setMaximumSize(new java.awt.Dimension(83, 15));
        jLabel6.setMinimumSize(new java.awt.Dimension(83, 15));
        jLabel6.setPreferredSize(new java.awt.Dimension(83, 15));

        id.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        id.setMaximumSize(new java.awt.Dimension(150, 20));
        id.setMinimumSize(new java.awt.Dimension(150, 20));
        id.setPreferredSize(new java.awt.Dimension(150, 20));

        nama.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        nama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        nama.setMaximumSize(new java.awt.Dimension(150, 20));
        nama.setMinimumSize(new java.awt.Dimension(150, 20));
        nama.setPreferredSize(new java.awt.Dimension(150, 20));

        telepon.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        telepon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        telepon.setMaximumSize(new java.awt.Dimension(150, 20));
        telepon.setMinimumSize(new java.awt.Dimension(150, 20));
        telepon.setPreferredSize(new java.awt.Dimension(150, 20));

        save.setBackground(new java.awt.Color(64, 74, 84));
        save.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("SAVE");
        save.setBorder(null);
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.setFocusPainted(false);
        save.setMaximumSize(new java.awt.Dimension(110, 30));
        save.setMinimumSize(new java.awt.Dimension(110, 30));
        save.setPreferredSize(new java.awt.Dimension(110, 30));
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
        batal.setMaximumSize(new java.awt.Dimension(110, 30));
        batal.setMinimumSize(new java.awt.Dimension(110, 30));
        batal.setPreferredSize(new java.awt.Dimension(110, 30));
        batal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batalMouseClicked(evt);
            }
        });

        jLabel12.setText("CARI DATA");

        cari_data.setMaximumSize(new java.awt.Dimension(150, 20));
        cari_data.setMinimumSize(new java.awt.Dimension(150, 20));
        cari_data.setPreferredSize(new java.awt.Dimension(150, 20));

        cari.setBackground(new java.awt.Color(64, 74, 84));
        cari.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        cari.setForeground(new java.awt.Color(255, 255, 255));
        cari.setText("CARI");
        cari.setBorder(null);
        cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cari.setFocusPainted(false);
        cari.setPreferredSize(new java.awt.Dimension(150, 30));
        cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cariMouseClicked(evt);
            }
        });

        jLabel13.setText("URUT DATA");

        urut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID PASIEN", "NAMA PASIEN", "TANGGAL LAHIR", "NO TELEPON" }));
        urut.setMaximumSize(new java.awt.Dimension(150, 20));
        urut.setMinimumSize(new java.awt.Dimension(150, 20));
        urut.setPreferredSize(new java.awt.Dimension(150, 20));
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

        tblpasien.setModel(new javax.swing.table.DefaultTableModel(
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
        tblpasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpasienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblpasien);

        jk.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LAKI - LAKI", "PEREMPUAN", " " }));
        jk.setMaximumSize(new java.awt.Dimension(150, 20));
        jk.setMinimumSize(new java.awt.Dimension(150, 20));
        jk.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel14.setText("TANGGAL LAHIR");
        jLabel14.setMaximumSize(new java.awt.Dimension(83, 15));
        jLabel14.setMinimumSize(new java.awt.Dimension(83, 15));
        jLabel14.setPreferredSize(new java.awt.Dimension(83, 15));

        tahun.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tahun.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tahun.setMaximumSize(new java.awt.Dimension(40, 20));
        tahun.setMinimumSize(new java.awt.Dimension(40, 20));
        tahun.setPreferredSize(new java.awt.Dimension(40, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel15.setText("ALAMAT");
        jLabel15.setMaximumSize(new java.awt.Dimension(83, 15));
        jLabel15.setMinimumSize(new java.awt.Dimension(83, 15));
        jLabel15.setPreferredSize(new java.awt.Dimension(83, 15));

        alamat.setColumns(20);
        alamat.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        alamat.setRows(5);
        alamat.setMaximumSize(new java.awt.Dimension(150, 60));
        alamat.setMinimumSize(new java.awt.Dimension(150, 60));
        alamat.setPreferredSize(new java.awt.Dimension(150, 60));
        jScrollPane2.setViewportView(alamat);

        nama2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        nama2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        nama2.setMaximumSize(new java.awt.Dimension(150, 20));
        nama2.setMinimumSize(new java.awt.Dimension(150, 20));
        nama2.setPreferredSize(new java.awt.Dimension(150, 20));

        telepon2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        telepon2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        telepon2.setMaximumSize(new java.awt.Dimension(150, 20));
        telepon2.setMinimumSize(new java.awt.Dimension(150, 20));
        telepon2.setPreferredSize(new java.awt.Dimension(150, 20));

        save1.setBackground(new java.awt.Color(64, 74, 84));
        save1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        save1.setForeground(new java.awt.Color(255, 255, 255));
        save1.setText("UPDATE");
        save1.setBorder(null);
        save1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save1.setFocusPainted(false);
        save1.setMaximumSize(new java.awt.Dimension(70, 30));
        save1.setMinimumSize(new java.awt.Dimension(70, 30));
        save1.setPreferredSize(new java.awt.Dimension(70, 30));
        save1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save1MouseClicked(evt);
            }
        });

        jk2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jk2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LAKI-LAKI", "PEREMPUAN" }));
        jk2.setMaximumSize(new java.awt.Dimension(150, 20));
        jk2.setMinimumSize(new java.awt.Dimension(150, 20));
        jk2.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel16.setText("TANGGAL LAHIR");
        jLabel16.setMaximumSize(new java.awt.Dimension(83, 15));
        jLabel16.setMinimumSize(new java.awt.Dimension(83, 15));
        jLabel16.setPreferredSize(new java.awt.Dimension(83, 15));

        batal2.setBackground(new java.awt.Color(64, 74, 84));
        batal2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        batal2.setForeground(new java.awt.Color(255, 255, 255));
        batal2.setText("BATAL");
        batal2.setBorder(null);
        batal2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        batal2.setFocusPainted(false);
        batal2.setMaximumSize(new java.awt.Dimension(70, 30));
        batal2.setMinimumSize(new java.awt.Dimension(70, 30));
        batal2.setPreferredSize(new java.awt.Dimension(70, 30));
        batal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batal2MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel17.setText("ALAMAT");
        jLabel17.setMaximumSize(new java.awt.Dimension(83, 15));
        jLabel17.setMinimumSize(new java.awt.Dimension(83, 15));
        jLabel17.setPreferredSize(new java.awt.Dimension(83, 15));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel18.setText("UPDATE DATA");
        jLabel18.setMaximumSize(new java.awt.Dimension(83, 15));
        jLabel18.setMinimumSize(new java.awt.Dimension(83, 15));
        jLabel18.setPreferredSize(new java.awt.Dimension(83, 15));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel19.setText("ID PASIEN");
        jLabel19.setMaximumSize(new java.awt.Dimension(83, 15));
        jLabel19.setMinimumSize(new java.awt.Dimension(83, 15));
        jLabel19.setPreferredSize(new java.awt.Dimension(83, 15));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel20.setText("NAMA PASIEN");
        jLabel20.setMaximumSize(new java.awt.Dimension(83, 15));
        jLabel20.setMinimumSize(new java.awt.Dimension(83, 15));
        jLabel20.setPreferredSize(new java.awt.Dimension(83, 15));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel21.setText("JENIS KELAMIN");
        jLabel21.setMaximumSize(new java.awt.Dimension(83, 15));
        jLabel21.setMinimumSize(new java.awt.Dimension(83, 15));
        jLabel21.setPreferredSize(new java.awt.Dimension(83, 15));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel22.setText("NO TELEPON");
        jLabel22.setMaximumSize(new java.awt.Dimension(83, 15));
        jLabel22.setMinimumSize(new java.awt.Dimension(83, 15));
        jLabel22.setPreferredSize(new java.awt.Dimension(83, 15));

        id2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        id2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        id2.setMaximumSize(new java.awt.Dimension(150, 20));
        id2.setMinimumSize(new java.awt.Dimension(150, 20));
        id2.setPreferredSize(new java.awt.Dimension(150, 20));

        save2.setBackground(new java.awt.Color(64, 74, 84));
        save2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        save2.setForeground(new java.awt.Color(255, 255, 255));
        save2.setText("DELETE");
        save2.setBorder(null);
        save2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save2.setFocusPainted(false);
        save2.setMaximumSize(new java.awt.Dimension(70, 30));
        save2.setMinimumSize(new java.awt.Dimension(70, 30));
        save2.setPreferredSize(new java.awt.Dimension(70, 30));
        save2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save2MouseClicked(evt);
            }
        });

        hari.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        hari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        hari.setMaximumSize(new java.awt.Dimension(40, 20));
        hari.setMinimumSize(new java.awt.Dimension(40, 20));
        hari.setPreferredSize(new java.awt.Dimension(40, 20));

        bulan.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        bulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        bulan.setMaximumSize(new java.awt.Dimension(40, 20));
        bulan.setMinimumSize(new java.awt.Dimension(40, 20));
        bulan.setPreferredSize(new java.awt.Dimension(40, 20));

        hari1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        hari1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "" }));
        hari1.setMaximumSize(new java.awt.Dimension(40, 20));
        hari1.setMinimumSize(new java.awt.Dimension(40, 20));
        hari1.setPreferredSize(new java.awt.Dimension(40, 20));
        hari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hari1ActionPerformed(evt);
            }
        });

        tahun1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tahun1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tahun1.setMaximumSize(new java.awt.Dimension(40, 20));
        tahun1.setMinimumSize(new java.awt.Dimension(40, 20));
        tahun1.setPreferredSize(new java.awt.Dimension(40, 20));

        bulan1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        bulan1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        bulan1.setMaximumSize(new java.awt.Dimension(40, 20));
        bulan1.setMinimumSize(new java.awt.Dimension(40, 20));
        bulan1.setPreferredSize(new java.awt.Dimension(40, 20));

        alamat1.setColumns(20);
        alamat1.setRows(5);
        alamat1.setMaximumSize(new java.awt.Dimension(150, 60));
        alamat1.setMinimumSize(new java.awt.Dimension(150, 60));
        alamat1.setPreferredSize(new java.awt.Dimension(150, 60));
        jScrollPane4.setViewportView(alamat1);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons8-left-32.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setMaximumSize(new java.awt.Dimension(40, 40));
        jButton3.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton3.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Data Pasien");
        jLabel7.setMaximumSize(new java.awt.Dimension(103, 25));
        jLabel7.setMinimumSize(new java.awt.Dimension(103, 25));
        jLabel7.setPreferredSize(new java.awt.Dimension(103, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(batal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(telepon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(tahun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(bulan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(hari, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(262, 262, 262)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cari_data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel13)
                                                .addComponent(urut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel12))
                                        .addGap(154, 154, 154))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(save1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(nama2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jk2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(tahun1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(bulan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(hari1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(telepon2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(save2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(batal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cari_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jk2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tahun1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bulan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hari1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(urut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telepon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(batal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(save1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(batal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(save2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hari1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hari1ActionPerformed

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
      try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rumah_sakit1","root","");
            Statement stmt = conn.createStatement();
        ){
            String insert = "insert into pasien values ('"+id.getText()+"','"+nama.getText()+"','"+jk.getSelectedItem()+"','"+
                    tahun.getText()+"-"+bulan.getSelectedItem()+"-"+hari.getSelectedItem()+"','"+telepon.getText()+"','"+
                    alamat.getText()+"')";
            stmt.executeUpdate(insert);
            JOptionPane.showMessageDialog(null,"tambah data berhasil");
            tampilan();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"gagal tambah data");
            ex.printStackTrace();
        }        
    }//GEN-LAST:event_saveMouseClicked

    private void save1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save1MouseClicked
        DefaultTableModel model = (DefaultTableModel) tblpasien.getModel();
        try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rumah_sakit1","root","");
            Statement stmt = conn.createStatement();
        ){
            String update = "update pasien set id_pasien='"+id2.getText()+"',NAMA_PASIEN='"+nama2.getText()+
                    "',jenis_kelamin='"+jk2.getSelectedItem()+"',tgl_lahir='"+tahun1.getText()+"-"+bulan1.getSelectedItem()+
                    "-"+hari1.getSelectedItem()+
                    "',no_telpon='"+telepon2.getText()+"',alamat='"+alamat1.getText()+
                    "' where id_pasien = '"+model.getValueAt(tblpasien.getSelectedRow(), 0).toString()+"'";
            stmt.executeUpdate(update);
            JOptionPane.showMessageDialog(null, "update data berhasil");
            tampilan();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"gagal update data");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_save1MouseClicked

    private void cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cariMouseClicked
        String kolom = cari_data.getText();
        tampilkancari(kolom);
    }//GEN-LAST:event_cariMouseClicked

    private void urutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_urutMouseClicked

    private void urutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urutActionPerformed
       String kolom;

        if (urut.getSelectedItem()=="ID PASIEN"){
            tampilkandata("ID_PASIEN");
        } else if (urut.getSelectedItem()=="NAMA PASIEN"){
            tampilkandata("nama_PASIEN");
        }else if (urut.getSelectedItem()=="TANGGAL LAHIR"){
            tampilkandata("TGL_LAHIR");
        }else if (urut.getSelectedItem()=="NO TELEPON"){
            tampilkandata("NO_TELPON");
        }
    }//GEN-LAST:event_urutActionPerformed

    private void save2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save2MouseClicked
      try(
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/rumah_sakit1",
                "root",
                "");
            Statement stmt = conn.createStatement();
        ){
            String delete = "delete from PASIEN where id_pasien = '"+id2.getText()+"'";
            stmt.executeUpdate(delete);
            tampilan();
        }catch (SQLException ex) {
        }
    }//GEN-LAST:event_save2MouseClicked

    private void batal2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batal2MouseClicked
        kosongft();
    }//GEN-LAST:event_batal2MouseClicked

    private void batalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batalMouseClicked
       kosongft();
    }//GEN-LAST:event_batalMouseClicked

    private void tblpasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpasienMouseClicked
       DefaultTableModel model = (DefaultTableModel) tblpasien.getModel();
        id2.setText(model.getValueAt(tblpasien.getSelectedRow(), 0).toString());
        nama2.setText(model.getValueAt(tblpasien.getSelectedRow(), 1).toString());
        jk2.setSelectedItem(model.getValueAt(tblpasien.getSelectedRow(), 2).toString().toUpperCase());
        telepon2.setText(model.getValueAt(tblpasien.getSelectedRow(), 4).toString());
        alamat1.setText(model.getValueAt(tblpasien.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_tblpasienMouseClicked

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
  Main objek = new Main(administrator);
        objek.setLocationRelativeTo(null);
        objek.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.JTextArea alamat1;
    private javax.swing.JButton batal;
    private javax.swing.JButton batal2;
    private javax.swing.JComboBox<String> bulan;
    private javax.swing.JComboBox<String> bulan1;
    private javax.swing.JButton cari;
    private javax.swing.JTextField cari_data;
    private javax.swing.JComboBox<String> hari;
    private javax.swing.JComboBox<String> hari1;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> jk;
    private javax.swing.JComboBox<String> jk2;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nama2;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JButton save2;
    private javax.swing.JTextField tahun;
    private javax.swing.JTextField tahun1;
    private javax.swing.JTable tblpasien;
    private javax.swing.JTextField telepon;
    private javax.swing.JTextField telepon2;
    private javax.swing.JComboBox<String> urut;
    // End of variables declaration//GEN-END:variables
}

