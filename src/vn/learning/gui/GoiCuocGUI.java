/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.learning.gui;

import javax.swing.JOptionPane;
import vn.learning.dao.GoiCuocDAO;
import vn.learning.dao.GoiCuocDAOImpl;
import vn.learning.model.GoiCuoc;

/**
 *
 * @author Admin
 */
public class GoiCuocGUI extends javax.swing.JPanel {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private GoiCuocDAO goiCuocDAO;

    /**
     * Creates new form GoiCuoc
     */
    public GoiCuocGUI() {
        initComponents();
        fillDataToTable();
    }

    private void fillDataToTable() {
        tblGoiCuoc.setModel(new GoiCuocTableModel());
        tblGoiCuoc.repaint();
        tblGoiCuoc.revalidate();
    }

    private void emptyControl() {
        txfTenGoiCuoc.setText("");
        txfCuocGoiNoiMang.setText("");
        txfCuocGoiNgoaiMang.setText("");
        txfCuocNhanTinNoiMang.setText("");
        txfCuocNhanTinNgoaiMang.setText("");
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
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGoiCuoc = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txfTenGoiCuoc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txfCuocGoiNoiMang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txfCuocGoiNgoaiMang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txfCuocNhanTinNoiMang = new javax.swing.JTextField();
        txfCuocNhanTinNgoaiMang = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnThemMoi = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(600, 800));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 300));

        tblGoiCuoc.setModel(new javax.swing.table.DefaultTableModel(
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
        tblGoiCuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGoiCuocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGoiCuoc);

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Tên gói cước");

        jLabel2.setText("Cước gọi nội mạng");

        jLabel3.setText("Cước gọi ngoại mạng");

        jLabel4.setText("Cước nhắn tin nội mạng");

        jLabel5.setText("Cước nhắn tin ngoại mạng");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfCuocGoiNgoaiMang)
                            .addComponent(txfCuocGoiNoiMang, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(31, 31, 31)
                                .addComponent(txfCuocNhanTinNoiMang, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txfCuocNhanTinNgoaiMang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txfTenGoiCuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txfCuocGoiNoiMang, txfCuocNhanTinNgoaiMang, txfCuocNhanTinNoiMang});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfTenGoiCuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfCuocGoiNoiMang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txfCuocNhanTinNoiMang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfCuocGoiNgoaiMang)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(txfCuocNhanTinNgoaiMang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel6, java.awt.BorderLayout.SOUTH);

        add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new java.awt.BorderLayout());

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear);

        jPanel2.add(jPanel3, java.awt.BorderLayout.WEST);

        btnThemMoi.setText("Thêm mới");
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });
        jPanel4.add(btnThemMoi);

        btnUpdate.setText("Thay đổi");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel4.add(btnUpdate);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete);

        jPanel2.add(jPanel4, java.awt.BorderLayout.EAST);

        add(jPanel2, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        emptyControl();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed

        goiCuocDAO = new GoiCuocDAOImpl();

        try {
            String tenGoiCuoc = txfTenGoiCuoc.getText();
            Integer cuocGoiNoiMang = Integer.valueOf(txfCuocGoiNoiMang.getText());
            Integer cuocGoiNgoaiMang = Integer.valueOf(txfCuocGoiNgoaiMang.getText());
            Integer cuocNhanTinNoiMang = Integer.valueOf(txfCuocNhanTinNoiMang.getText());
            Integer cuocNhanTinNgoaiMang = Integer.valueOf(txfCuocNhanTinNgoaiMang.getText());

            GoiCuoc goiCuoc = new GoiCuoc();
            goiCuoc.setTenGoiCuoc(tenGoiCuoc);
            goiCuoc.setCuocGoiNoiMang(cuocGoiNoiMang);
            goiCuoc.setCuocGoiNgoaiMang(cuocGoiNgoaiMang);
            goiCuoc.setCuocNhanTinNoiMang(cuocNhanTinNoiMang);
            goiCuoc.setCuocNhanTinNgoaiMang(cuocNhanTinNgoaiMang);

            goiCuocDAO.addGoiCuoc(goiCuoc);

            JOptionPane.showMessageDialog(null, "Đã thêm vào thành công!");

            fillDataToTable();
            emptyControl();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên dương vào cước gọi và cước nhắn tin!");
        }

    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void tblGoiCuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGoiCuocMouseClicked
        Integer row = tblGoiCuoc.getSelectedRow();
        setId((Integer) tblGoiCuoc.getModel().getValueAt(row, 0));
        String tenGoiCuoc = (String) tblGoiCuoc.getModel().getValueAt(row, 1);
        Integer cuocGoiNoiMang = (Integer) tblGoiCuoc.getModel().getValueAt(row, 2);
        Integer cuocGoiNgoaiMang = (Integer) tblGoiCuoc.getModel().getValueAt(row, 3);
        Integer cuocNhanTinNoiMang = (Integer) tblGoiCuoc.getModel().getValueAt(row, 4);
        Integer cuocNhanTinNgoaiMang = (Integer) tblGoiCuoc.getModel().getValueAt(row, 5);

        txfTenGoiCuoc.setText(tenGoiCuoc);
        txfCuocGoiNoiMang.setText(cuocGoiNoiMang.toString());
        txfCuocGoiNgoaiMang.setText(cuocGoiNgoaiMang.toString());
        txfCuocNhanTinNoiMang.setText(cuocNhanTinNoiMang.toString());
        txfCuocNhanTinNgoaiMang.setText(cuocNhanTinNgoaiMang.toString());

    }//GEN-LAST:event_tblGoiCuocMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        if (id == null || id < 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng để thực hiện delete!");
        } else {
            goiCuocDAO = new GoiCuocDAOImpl();
            goiCuocDAO.deleteGoiCuoc(id);
            JOptionPane.showMessageDialog(null, "Delete thành công!");
            fillDataToTable();
            emptyControl();
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            if (id == null || id < 0) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng để thực hiện thay đổi");
            } else {
                goiCuocDAO = new GoiCuocDAOImpl();

                GoiCuoc goiCuoc = new GoiCuoc();
                goiCuoc.setId(id);
                goiCuoc.setTenGoiCuoc(txfTenGoiCuoc.getText());
                goiCuoc.setCuocGoiNoiMang(Integer.valueOf(txfCuocGoiNoiMang.getText()));
                goiCuoc.setCuocGoiNgoaiMang(Integer.valueOf(txfCuocGoiNgoaiMang.getText()));
                goiCuoc.setCuocNhanTinNoiMang(Integer.valueOf(txfCuocNhanTinNoiMang.getText()));
                goiCuoc.setCuocNhanTinNgoaiMang(Integer.valueOf(txfCuocNhanTinNgoaiMang.getText()));

                goiCuocDAO.updateGoiCuoc(goiCuoc);
                JOptionPane.showMessageDialog(null, "Đã update thành công!");
                fillDataToTable();
                emptyControl();

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên dương vào cước gọi và cước nhắn tin!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGoiCuoc;
    private javax.swing.JTextField txfCuocGoiNgoaiMang;
    private javax.swing.JTextField txfCuocGoiNoiMang;
    private javax.swing.JTextField txfCuocNhanTinNgoaiMang;
    private javax.swing.JTextField txfCuocNhanTinNoiMang;
    private javax.swing.JTextField txfTenGoiCuoc;
    // End of variables declaration//GEN-END:variables
}
