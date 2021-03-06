/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.learning.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import vn.learning.dao.SimDAO;
import vn.learning.dao.SimDAOImpl;
import vn.learning.model.Sim;

/**
 *
 * @author Admin
 */
public class SIMGUI extends javax.swing.JPanel {

    /**
     * Creates new form SIMGUI
     */
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private SimDAO simDAO;

    public SIMGUI() throws SQLException {
        initComponents();
        try {
            fillDataToTable();
        } catch (SQLException ex) {
            throw ex;
        }

    }

    private void fillDataToTable() throws SQLException {
        try {
            tblSim.setModel(new SimTableModel());
            tblSim.repaint();
            tblSim.revalidate();
        } catch (SQLException ex) {
            throw ex;
        }
    }

    private void emptyControl() {
        txfSoThueBao.setText("");
        dateChooseNgayDangKy.setDate(null);
        txfTaiKhoanChinh.setText("");
        txfTaiKhoanKhuyenMai.setText("");
        txfIdKhachHang.setText("");
        txfIdCuocGoi.setText("");
        txfIdGoiCuoc.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSim = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfSoThueBao = new javax.swing.JTextField();
        txfTaiKhoanChinh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txfTaiKhoanKhuyenMai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txfIdKhachHang = new javax.swing.JTextField();
        txfIdCuocGoi = new javax.swing.JTextField();
        txfIdGoiCuoc = new javax.swing.JTextField();
        dateChooseNgayDangKy = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnThemMoi = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(600, 800));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.BorderLayout());

        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new java.awt.BorderLayout());

        tblSim.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSimMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSim);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Số thuê bao");

        jLabel2.setText("Ngày đăng ký");

        jLabel3.setText("Tài khoản chính");

        jLabel4.setText("Tài khoản khuyến mãi");

        jLabel5.setText("ID khách hàng");

        jLabel6.setText("ID Cuộc gọi ");

        jLabel7.setText("ID gói cước");

        txfIdKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfIdKhachHangActionPerformed(evt);
            }
        });

        dateChooseNgayDangKy.setDateFormatString("MM/dd/yyyy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfSoThueBao, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(txfTaiKhoanChinh, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(dateChooseNgayDangKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txfIdKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(txfIdCuocGoi)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txfTaiKhoanKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txfIdGoiCuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(120, 261, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txfIdCuocGoi, txfIdGoiCuoc, txfIdKhachHang});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfSoThueBao)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateChooseNgayDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfTaiKhoanChinh)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfIdKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfIdCuocGoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfTaiKhoanKhuyenMai)
                    .addComponent(jLabel4)
                    .addComponent(txfIdGoiCuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(14, 14, 14))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txfIdCuocGoi, txfIdGoiCuoc, txfIdKhachHang});

        jPanel7.add(jPanel2, java.awt.BorderLayout.SOUTH);

        add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new java.awt.BorderLayout());

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel4.add(btnClear);

        jPanel3.add(jPanel4, java.awt.BorderLayout.WEST);

        btnThemMoi.setText("Thêm mới");
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });
        jPanel5.add(btnThemMoi);

        btnUpdate.setText("Thay đổi");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(btnUpdate);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(btnDelete);

        jPanel3.add(jPanel5, java.awt.BorderLayout.EAST);

        add(jPanel3, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void txfIdKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIdKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdKhachHangActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        emptyControl();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed

        try {

            simDAO = new SimDAOImpl();
            String soThueBao = txfSoThueBao.getText();

            java.util.Date date = dateChooseNgayDangKy.getDate();
            java.sql.Date ngayDangKy;
            if (date == null) {
                ngayDangKy = null;
            } else {
                ngayDangKy = new java.sql.Date(date.getTime());
            }

            Integer taiKhoanChinh = Integer.valueOf(txfTaiKhoanChinh.getText());
            Integer taiKhoanKhuyenMai = Integer.valueOf(txfTaiKhoanKhuyenMai.getText());
            Integer khachHangID = Integer.valueOf(txfIdKhachHang.getText());
            Integer goiCuocID = Integer.valueOf(txfIdGoiCuoc.getText());
            Integer cuocGoiID = Integer.valueOf(txfIdCuocGoi.getText());

            Sim sim = new Sim();
            sim.setSoThueBao(soThueBao);
            sim.setNgayDangKy(ngayDangKy);
            sim.setTaiKhoanChinh(taiKhoanChinh);
            sim.setTaiKhoanKhuyenMai(taiKhoanKhuyenMai);
            sim.setKhachHangID(khachHangID);
            sim.setGoiCuocID(goiCuocID);
            sim.setCuocGoiID(cuocGoiID);

            simDAO.addSim(sim);

            JOptionPane.showMessageDialog(null, "Đã thêm vào thành công!");

            fillDataToTable();
            emptyControl();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên dương vào cuộc gọi, khách hàng ID và cước nhắn tin...!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Không kết nối được database, vui lòng liên hệ nhà cung cấp dịch vụ để được giải quyết!");
        }
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            simDAO = new SimDAOImpl();
            if (id <= 0) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng để thực hiện thay đổi");
            } else {
                simDAO = new SimDAOImpl();

                Sim sim = new Sim();
                sim.setId(id);
                sim.setSoThueBao(txfSoThueBao.getText());
                
                java.util.Date date = dateChooseNgayDangKy.getDate();
                
                java.sql.Date ngayDangKy;
                if (date == null) {
                    ngayDangKy = null;
                } else {
                    ngayDangKy = new java.sql.Date(date.getTime());
                }
                
                sim.setNgayDangKy(ngayDangKy);
                
                sim.setTaiKhoanChinh(Integer.valueOf(txfTaiKhoanChinh.getText()));
                sim.setTaiKhoanKhuyenMai(Integer.valueOf(txfTaiKhoanKhuyenMai.getText()));
                sim.setKhachHangID(Integer.valueOf(txfIdKhachHang.getText()));
                sim.setGoiCuocID(Integer.valueOf(txfIdGoiCuoc.getText()));
                sim.setCuocGoiID(Integer.valueOf(txfIdCuocGoi.getText()));

                simDAO.updateSim(sim);
                JOptionPane.showMessageDialog(null, "Đã update thành công!");
                fillDataToTable();
                emptyControl();

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên dương vào cước gọi và cước nhắn tin!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Không kết nối được database, vui lòng liên hệ nhà cung cấp dịch vụ để được giải quyết!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        try {
            simDAO = new SimDAOImpl();
            if (id <= 0) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng để thực hiện delete!");
            } else {
                simDAO = new SimDAOImpl();
                simDAO.deleteSim(id);
                JOptionPane.showMessageDialog(null, "Delete thành công!");
                fillDataToTable();
                emptyControl();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Không kết nối được database, vui lòng liên hệ nhà cung cấp dịch vụ để được giải quyết!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblSimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSimMouseClicked
        Integer row = tblSim.getSelectedRow();
        setId((Integer) tblSim.getModel().getValueAt(row, 0));
        String soThueBao = (String) tblSim.getModel().getValueAt(row, 1);

        java.util.Date ngayDangKy = new java.util.Date();
        ngayDangKy = (java.util.Date) tblSim.getModel().getValueAt(row, 2);

        Integer taiKhoanChinh = (Integer) tblSim.getModel().getValueAt(row, 3);
        Integer taiKhoanKhuyenMai = (Integer) tblSim.getModel().getValueAt(row, 4);
        
        Integer khachHangID = (Integer) tblSim.getModel().getValueAt(row, 5);
        Integer goiCuocId = (Integer) tblSim.getModel().getValueAt(row, 6);
        Integer cuocGoiId = (Integer) tblSim.getModel().getValueAt(row, 7);
        
        txfSoThueBao.setText(soThueBao);
        dateChooseNgayDangKy.setDate(ngayDangKy);
        txfTaiKhoanChinh.setText(taiKhoanChinh.toString());
        txfTaiKhoanKhuyenMai.setText(taiKhoanKhuyenMai.toString());
        txfIdKhachHang.setText(khachHangID.toString());
        txfIdCuocGoi.setText(cuocGoiId.toString());
        txfIdGoiCuoc.setText(goiCuocId.toString());

    }//GEN-LAST:event_tblSimMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser dateChooseNgayDangKy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSim;
    private javax.swing.JTextField txfIdCuocGoi;
    private javax.swing.JTextField txfIdGoiCuoc;
    private javax.swing.JTextField txfIdKhachHang;
    private javax.swing.JTextField txfSoThueBao;
    private javax.swing.JTextField txfTaiKhoanChinh;
    private javax.swing.JTextField txfTaiKhoanKhuyenMai;
    // End of variables declaration//GEN-END:variables
}
