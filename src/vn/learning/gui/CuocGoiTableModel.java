/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vn.learning.gui;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import vn.learning.dao.CuocGoiDAO;
import vn.learning.dao.CuocGoiDAOImpl;
import vn.learning.model.CuocGoi;

/**
 *
 * @author NoName
 */
public class CuocGoiTableModel extends AbstractTableModel{
    
     private String[] columnNames = {"ID", "Thuê bao được gọi", "Thời gian bắt đầu", "Thời gian kết thúc"};

    private CuocGoiDAO cuocGoiDAO;
    private ArrayList<CuocGoi> cuocGois;

    public ArrayList<CuocGoi> getCuocGois() {
        return cuocGois;
    }

    public void setCuocGois(ArrayList<CuocGoi> cuocGois) {
        this.cuocGois = cuocGois;
    }

     public CuocGoiTableModel() throws SQLException {
        try {
            cuocGoiDAO = new CuocGoiDAOImpl();
            setCuocGois(cuocGoiDAO.getAllCuocGoi());
        } catch (SQLException ex) {
            throw ex;
        }
    }
    @Override
    public int getRowCount() {
       return cuocGois.size();
    }

    @Override
    public int getColumnCount() {
         return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         CuocGoi cuocGoi = cuocGois.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cuocGoi.getId();
            case 1:
                return cuocGoi.getThueBaoDuocGoi();
            case 2:
                return cuocGoi.getThoiGianBatDau();
            case 3:
                return cuocGoi.getThoiGianKetThuc();
            default:
                return null;
        }
    }
     @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

}
