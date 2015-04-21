/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.learning.gui;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import vn.learning.dao.TheNopTienDAO;
import vn.learning.dao.TheNopTienDAOImpl;
import vn.learning.model.TheNopTien;

/**
 *
 * @author Admin
 */
public class TheNopTienTableModel extends AbstractTableModel {

    private String[] columnNames = {"ID", "Số Seri", "Mệnh giá", "Thời gian nộp", "Trạng thái"};
    private TheNopTienDAO theNopTienDAO;
//    private ArrayList<TheNopTien> theNopTiens = theNopTienDAO.getAllTheNop();
    private ArrayList<TheNopTien> theNopTiens;

    public ArrayList<TheNopTien> getTheNopTiens() {
        return theNopTiens;
    }

    public void setTheNopTiens(ArrayList<TheNopTien> theNopTiens) {
        this.theNopTiens = theNopTiens;
    }

    public TheNopTienTableModel() throws SQLException {
        try {
            theNopTienDAO = new TheNopTienDAOImpl();
            setTheNopTiens(theNopTienDAO.getAllTheNop());
        } catch (SQLException ex) {
            throw ex;
        }
    }

    @Override
    public int getRowCount() {
        return theNopTiens.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TheNopTien theNopTien = theNopTiens.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return theNopTien.getId();
            case 1:
                return theNopTien.getSoSeri();
            case 2:
                return theNopTien.getMenhGia();
            case 3:
                return theNopTien.getThoiGianNop();
            case 4:
                return theNopTien.isTrangThai();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

}
