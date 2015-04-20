/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.learning.gui;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import vn.learning.dao.GoiCuocDAO;
import vn.learning.dao.GoiCuocDAOImpl;
import vn.learning.model.GoiCuoc;

/**
 *
 * @author Admin
 */
public class GoiCuocTableModel extends AbstractTableModel {

    private String[] columnNames = {"ID", "Tên gói cước", "Cước gọi nội mạng", "Cước gọi ngoại mạng", "Cước nhắn tin nội mạng", "Cước nhắn tin ngoại mạng"};
    private GoiCuocDAO goiCuocDAO;
    private ArrayList<GoiCuoc> goiCuocs;

    public ArrayList<GoiCuoc> getGoiCuocs() {
        return goiCuocs;
    }

    public void setGoiCuocs(ArrayList<GoiCuoc> goiCuocs) {
        this.goiCuocs = goiCuocs;
    }
    
    

    public GoiCuocTableModel() throws SQLException{
        
        try {
            goiCuocDAO = new GoiCuocDAOImpl();
            setGoiCuocs(goiCuocDAO.getAllGoiCuoc());
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
    @Override
    public int getRowCount() {
        return goiCuocs.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GoiCuoc goiCuoc = goiCuocs.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return goiCuoc.getId();
            case 1:
                return goiCuoc.getTenGoiCuoc();
            case 2:
                return goiCuoc.getCuocGoiNoiMang();
            case 3:
                return goiCuoc.getCuocGoiNgoaiMang();
            case 4:
                return goiCuoc.getCuocNhanTinNoiMang();
            case 5:
                return goiCuoc.getCuocNhanTinNgoaiMang();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
