/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Data.Admin;
import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author LAURENSIUS
 */
public class Main extends javax.swing.JFrame {
    private Admin administrator;
    /**
     * Creates new form mainmenu
     * @param admin
     */
    public Main(Admin admin) {
        initComponents();
        administrator = admin;
        namaField.setText("Selamat datang, " + admin.getNama() + "!");
    }

    public Main(){
        initComponents();
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
        namaField = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        perawatanButton = new javax.swing.JButton();
        pasienButton = new javax.swing.JButton();
        dokterButton = new javax.swing.JButton();
        perawatButton = new javax.swing.JButton();
        kamarButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 420));
        setMinimumSize(new java.awt.Dimension(720, 420));
        setName(""); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(720, 420));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(720, 420));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 420));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 420));

        namaField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        namaField.setText("Selamat datang, <admin name>");

        logoutButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.setToolTipText("");
        logoutButton.setBorder(null);
        logoutButton.setBorderPainted(false);
        logoutButton.setContentAreaFilled(false);
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.setFocusPainted(false);
        logoutButton.setMaximumSize(new java.awt.Dimension(50, 20));
        logoutButton.setMinimumSize(new java.awt.Dimension(50, 20));
        logoutButton.setPreferredSize(new java.awt.Dimension(50, 20));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutButtonMouseExited(evt);
            }
        });
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        perawatanButton.setBackground(new java.awt.Color(255, 255, 255));
        perawatanButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        perawatanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/iconPerawatan.png"))); // NOI18N
        perawatanButton.setText("PERAWATAN");
        perawatanButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        perawatanButton.setBorderPainted(false);
        perawatanButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        perawatanButton.setFocusPainted(false);
        perawatanButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        perawatanButton.setMaximumSize(new java.awt.Dimension(100, 120));
        perawatanButton.setMinimumSize(new java.awt.Dimension(100, 120));
        perawatanButton.setPreferredSize(new java.awt.Dimension(100, 120));
        perawatanButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        perawatanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                perawatanButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                perawatanButtonMouseExited(evt);
            }
        });
        perawatanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perawatanButtonActionPerformed(evt);
            }
        });

        pasienButton.setBackground(new java.awt.Color(255, 255, 255));
        pasienButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pasienButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/iconPasien.png"))); // NOI18N
        pasienButton.setText("PASIEN");
        pasienButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pasienButton.setBorderPainted(false);
        pasienButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pasienButton.setFocusPainted(false);
        pasienButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pasienButton.setMaximumSize(new java.awt.Dimension(100, 120));
        pasienButton.setMinimumSize(new java.awt.Dimension(100, 120));
        pasienButton.setPreferredSize(new java.awt.Dimension(100, 120));
        pasienButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pasienButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pasienButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pasienButtonMouseExited(evt);
            }
        });
        pasienButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasienButtonActionPerformed(evt);
            }
        });

        dokterButton.setBackground(new java.awt.Color(255, 255, 255));
        dokterButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dokterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/iconDokter.png"))); // NOI18N
        dokterButton.setText("DOKTER");
        dokterButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dokterButton.setBorderPainted(false);
        dokterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dokterButton.setFocusPainted(false);
        dokterButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dokterButton.setMaximumSize(new java.awt.Dimension(100, 120));
        dokterButton.setMinimumSize(new java.awt.Dimension(100, 120));
        dokterButton.setPreferredSize(new java.awt.Dimension(100, 120));
        dokterButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dokterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dokterButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dokterButtonMouseExited(evt);
            }
        });
        dokterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokterButtonActionPerformed(evt);
            }
        });

        perawatButton.setBackground(new java.awt.Color(255, 255, 255));
        perawatButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        perawatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/iconPerawat.png"))); // NOI18N
        perawatButton.setText("PERAWAT");
        perawatButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        perawatButton.setBorderPainted(false);
        perawatButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        perawatButton.setFocusPainted(false);
        perawatButton.setFocusTraversalPolicyProvider(true);
        perawatButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        perawatButton.setMaximumSize(new java.awt.Dimension(100, 120));
        perawatButton.setMinimumSize(new java.awt.Dimension(100, 120));
        perawatButton.setPreferredSize(new java.awt.Dimension(100, 120));
        perawatButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        perawatButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                perawatButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                perawatButtonMouseExited(evt);
            }
        });
        perawatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perawatButtonActionPerformed(evt);
            }
        });

        kamarButton.setBackground(new java.awt.Color(255, 255, 255));
        kamarButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kamarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/iconKamar.png"))); // NOI18N
        kamarButton.setText("KAMAR");
        kamarButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        kamarButton.setBorderPainted(false);
        kamarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kamarButton.setFocusPainted(false);
        kamarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kamarButton.setMaximumSize(new java.awt.Dimension(100, 120));
        kamarButton.setMinimumSize(new java.awt.Dimension(100, 120));
        kamarButton.setPreferredSize(new java.awt.Dimension(100, 120));
        kamarButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        kamarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kamarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kamarButtonMouseExited(evt);
            }
        });
        kamarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kamarButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MENU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(perawatanButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kamarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(perawatButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dokterButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pasienButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namaField)
                .addGap(49, 49, 49)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pasienButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kamarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perawatButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dokterButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perawatanButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setColorMouseEntered(JButton button){
        button.setBackground(new Color(220,220,220));
    }
    
    private void resetColor(JButton button){
        button.setBackground(new Color(255,255,255));
    }
    
    private void pasienButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasienButtonActionPerformed
        Pasien x = new Pasien();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pasienButtonActionPerformed

    private void dokterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokterButtonActionPerformed
        Dokter x = new Dokter();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_dokterButtonActionPerformed

    private void perawatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perawatButtonActionPerformed
        Perawat x = new Perawat();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_perawatButtonActionPerformed

    private void kamarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kamarButtonActionPerformed
        Kamar x = new Kamar();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kamarButtonActionPerformed

    private void perawatanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perawatanButtonActionPerformed
        Perawatan x = new Perawatan();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_perawatanButtonActionPerformed

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        Utama objek = new Utama();
        objek.setLocationRelativeTo(null);
        objek.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void logoutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseEntered
        // TODO add your handling code here:
        setColorMouseEntered(logoutButton);
    }//GEN-LAST:event_logoutButtonMouseEntered

    private void logoutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseExited
        // TODO add your handling code here:
        resetColor(logoutButton);
    }//GEN-LAST:event_logoutButtonMouseExited

    private void perawatanButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perawatanButtonMouseEntered
        // TODO add your handling code here:
        setColorMouseEntered(perawatanButton);
    }//GEN-LAST:event_perawatanButtonMouseEntered

    private void perawatanButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perawatanButtonMouseExited
        // TODO add your handling code here:
        resetColor(perawatanButton);
    }//GEN-LAST:event_perawatanButtonMouseExited

    private void kamarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kamarButtonMouseEntered
        // TODO add your handling code here:
        setColorMouseEntered(kamarButton);
    }//GEN-LAST:event_kamarButtonMouseEntered

    private void kamarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kamarButtonMouseExited
        // TODO add your handling code here:
        resetColor(kamarButton);
    }//GEN-LAST:event_kamarButtonMouseExited

    private void perawatButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perawatButtonMouseEntered
        // TODO add your handling code here:
        setColorMouseEntered(perawatButton);
    }//GEN-LAST:event_perawatButtonMouseEntered

    private void perawatButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perawatButtonMouseExited
        // TODO add your handling code here:
        resetColor(perawatButton);
    }//GEN-LAST:event_perawatButtonMouseExited

    private void dokterButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dokterButtonMouseEntered
        // TODO add your handling code here:
        setColorMouseEntered(dokterButton);
    }//GEN-LAST:event_dokterButtonMouseEntered

    private void dokterButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dokterButtonMouseExited
        // TODO add your handling code here:
        resetColor(dokterButton);
    }//GEN-LAST:event_dokterButtonMouseExited

    private void pasienButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pasienButtonMouseEntered
        // TODO add your handling code here:
        setColorMouseEntered(pasienButton);
    }//GEN-LAST:event_pasienButtonMouseEntered

    private void pasienButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pasienButtonMouseExited
        // TODO add your handling code here:
        resetColor(pasienButton);
    }//GEN-LAST:event_pasienButtonMouseExited

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
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main gui = new Main();
     
                gui.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dokterButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kamarButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel namaField;
    private javax.swing.JButton pasienButton;
    private javax.swing.JButton perawatButton;
    private javax.swing.JButton perawatanButton;
    // End of variables declaration//GEN-END:variables
}
