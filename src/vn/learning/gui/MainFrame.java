/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.learning.gui;

import java.awt.BorderLayout;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class MainFrame extends javax.swing.JFrame {

    KhachHangGUI khachHangGUI;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        mainPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuSIM = new javax.swing.JMenuItem();
        menuSim = new javax.swing.JMenuItem();
        menuCuocGoi = new javax.swing.JMenuItem();
        menuGoiCuoc = new javax.swing.JMenuItem();
        menuTheNop = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý viễn thông");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        mainPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Quản lý");

        menuSIM.setText("Khách hàng");
        menuSIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSIMActionPerformed(evt);
            }
        });
        jMenu1.add(menuSIM);

        menuSim.setText("SIM");
        menuSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSimActionPerformed(evt);
            }
        });
        jMenu1.add(menuSim);

        menuCuocGoi.setText("Cuộc gọi");
        menuCuocGoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCuocGoiActionPerformed(evt);
            }
        });
        jMenu1.add(menuCuocGoi);

        menuGoiCuoc.setText("Gói cước");
        menuGoiCuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGoiCuocActionPerformed(evt);
            }
        });
        jMenu1.add(menuGoiCuoc);

        menuTheNop.setText("Thẻ nộp");
        menuTheNop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTheNopActionPerformed(evt);
            }
        });
        jMenu1.add(menuTheNop);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        menuAbout.setText("About");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        jMenu2.add(menuAbout);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuGoiCuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGoiCuocActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        try {
            GoiCuocGUI goiCuocGUI = new GoiCuocGUI();
            mainPanel.add(goiCuocGUI, BorderLayout.CENTER);
            mainPanel.repaint();
            mainPanel.revalidate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Không kết nối được database, vui lòng liên hệ nhà cung cấp dịch vụ để được giải quyết!");
        }
    }//GEN-LAST:event_menuGoiCuocActionPerformed

    private void menuTheNopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTheNopActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        try {
            TheNopTienGUI theNop = new TheNopTienGUI();
            mainPanel.add(theNop, BorderLayout.CENTER);
            mainPanel.repaint();
            mainPanel.revalidate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Không kết nối được database, vui lòng liên hệ nhà cung cấp dịch vụ để được giải quyết!");
        }
    }//GEN-LAST:event_menuTheNopActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void menuSIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSIMActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        try {
            khachHangGUI = new KhachHangGUI();
            mainPanel.add(khachHangGUI, BorderLayout.CENTER);
            mainPanel.repaint();
            mainPanel.revalidate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Không kết nối được database, vui lòng liên hệ nhà cung cấp dịch vụ để được giải quyết!");
        }
    }//GEN-LAST:event_menuSIMActionPerformed

    private void menuSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSimActionPerformed

        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        try {
            SIMGUI simgui = new SIMGUI();
            mainPanel.add(simgui, BorderLayout.CENTER);
            mainPanel.repaint();
            mainPanel.revalidate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Không kết nối được database, vui lòng liên hệ nhà cung cấp dịch vụ để được giải quyết!");
        }
    }//GEN-LAST:event_menuSimActionPerformed

    private void menuCuocGoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCuocGoiActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        try {
            CuocGoiGUI cuocGoiGUI = new CuocGoiGUI();
            mainPanel.add(cuocGoiGUI, BorderLayout.CENTER);
            mainPanel.repaint();
            mainPanel.revalidate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Không kết nối được database, vui lòng liên hệ nhà cung cấp dịch vụ để được giải quyết!");
        }

    }//GEN-LAST:event_menuCuocGoiActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        AboutGUI aboutGUI = new AboutGUI();
        mainPanel.add(aboutGUI, BorderLayout.CENTER);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_menuAboutActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuItem menuCuocGoi;
    private javax.swing.JMenuItem menuGoiCuoc;
    private javax.swing.JMenuItem menuSIM;
    private javax.swing.JMenuItem menuSim;
    private javax.swing.JMenuItem menuTheNop;
    // End of variables declaration//GEN-END:variables
}
