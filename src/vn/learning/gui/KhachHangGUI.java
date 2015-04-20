/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.learning.gui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vn.learning.dao.KhachHangDAO;
import vn.learning.dao.KhachHangDAOImpl;
import vn.learning.model.KhachHang;

/**
 *
 * @author Admin
 */
public class KhachHangGUI extends javax.swing.JPanel {

    private KhachHangDAO khachHangDAO;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Creates new form KhachHang
     */
    public KhachHangGUI() {

        initComponents();
        fillDataToTable();
        emptyControl();
    }

    //push data vao table
    public void fillDataToTable() {
        tblKhachHang.setModel(new KhachHangTableModel());
        tblKhachHang.repaint();
        tblKhachHang.revalidate();
    }

    private void emptyControl() {
        txfSoCMND.setText("");
        txfHoTen.setText("");
        txfQueQuan.setText("");
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
        jPanel3 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfSoCMND = new javax.swing.JTextField();
        txfHoTen = new javax.swing.JTextField();
        txfQueQuan = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new java.awt.BorderLayout());

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear);

        jPanel1.add(jPanel3, java.awt.BorderLayout.WEST);

        jButton1.setText("Thêm mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setText("Thay đổi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jPanel1.add(jPanel2, java.awt.BorderLayout.EAST);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 300));

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Số CMND", "Họ Tên", "Quê Quán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachHang);

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setPreferredSize(new java.awt.Dimension(450, 100));

        jLabel1.setText("Số CMND");

        jLabel2.setText("Họ Tên");

        jLabel3.setText("Quê Quán");

        txfHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfHoTenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfSoCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(300, 300, 300))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfSoCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txfQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6, java.awt.BorderLayout.SOUTH);

        add(jPanel4, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String soCMND = txfSoCMND.getText();
        String hoTen = txfHoTen.getText();
        String queQuan = txfQueQuan.getText();

        KhachHang khachHang = new KhachHang();
        khachHang.setSoCMND(soCMND);
        khachHang.setHoTen(hoTen);
        khachHang.setQueQuan(queQuan);

        khachHangDAO = new KhachHangDAOImpl();
        khachHangDAO.addKhachHang(khachHang);

        JOptionPane.showMessageDialog(null, "Đã thêm vào thành công!");

        fillDataToTable();
        emptyControl();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        Integer row = tblKhachHang.getSelectedRow();
        setId((Integer) tblKhachHang.getModel().getValueAt(row, 0));
        String soCMND = (String) tblKhachHang.getModel().getValueAt(row, 1);
        String hoTen = (String) tblKhachHang.getModel().getValueAt(row, 2);
        String queQuan = (String) tblKhachHang.getModel().getValueAt(row, 3);
        txfSoCMND.setText(soCMND);
        txfHoTen.setText(hoTen);
        txfQueQuan.setText(queQuan);
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (id == null || id < 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng để thực hiện delete!");
        } else {
            khachHangDAO = new KhachHangDAOImpl();
            khachHangDAO.delteKhachHang(id);
            JOptionPane.showMessageDialog(null, "Delete thành công!");
            fillDataToTable();
            emptyControl();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txfHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfHoTenActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (id == null || id < 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng để thực hiện thay đổi");
        } else {
            khachHangDAO = new KhachHangDAOImpl();
            KhachHang khachHang = new KhachHang();
            khachHang.setId(id);
            khachHang.setSoCMND(txfSoCMND.getText());
            khachHang.setHoTen(txfHoTen.getText());
            khachHang.setQueQuan(txfQueQuan.getText());
            
            khachHangDAO.updateKhachHang(khachHang);
            JOptionPane.showMessageDialog(null, "Đã update thành công!");
            fillDataToTable();
            emptyControl();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        emptyControl();
    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txfHoTen;
    private javax.swing.JTextField txfQueQuan;
    private javax.swing.JTextField txfSoCMND;
    // End of variables declaration//GEN-END:variables
}
