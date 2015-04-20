/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.learning.gui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import vn.learning.dao.KhachHangDAO;
import vn.learning.dao.KhachHangDAOImpl;
import vn.learning.model.KhachHang;

/**
 *
 * @author Admin
 */
public class KhachHangTableModel extends AbstractTableModel {

    private String[] columnNames = {"ID", "Số CMND", "Họ Tên", "Quê Quán"};
    private KhachHangDAO khachHangDAO = new KhachHangDAOImpl();
    private ArrayList<KhachHang> khachHangs = khachHangDAO.getAllKhachHang();

    @Override
    public int getRowCount() {
        return khachHangs.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        KhachHang khachHang = khachHangs.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return khachHang.getId();
            case 1:
                return khachHang.getSoCMND();
            case 2:
                return khachHang.getHoTen();
            case 3:
                return khachHang.getQueQuan();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

}
