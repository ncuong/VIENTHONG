/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vn.learning.gui;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import vn.learning.dao.SimDAO;
import vn.learning.dao.SimDAOImpl;
import vn.learning.model.Sim;

/**
 *
 * @author NoName
 */
public class SimTableModel extends AbstractTableModel{
    private String[] columnNames = {"ID", "Số thuê bao", "Ngày đăng ký", "Tài khoản chính", "Tài khoản khuyến mãi", "ID khách hàng", "Gói cước", "Cuộc gọi"};

    private SimDAO simDAO;
    private ArrayList<Sim> sims;

    public ArrayList<Sim> getSims() {
        return sims;
    }

    public void setSims(ArrayList<Sim> sims) {
        this.sims = sims;
    }

    
      public SimTableModel() throws SQLException {
        try {
            simDAO = new SimDAOImpl();
            setSims(simDAO.getAllSim());
        } catch (SQLException ex) {
            throw ex;
        }
    }
    @Override
    public int getRowCount() {
         return sims.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Sim sim = sims.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return sim.getId();
            case 1:
                return sim.getSoThueBao();
            case 2:
                return sim.getNgayDangKy();
            case 3:
                return sim.getTaiKhoanChinh();
            case 4:
                return sim.getTaiKhoanKhuyenMai();
            case 5:
                return sim.getKhachHangID();
            case 6:
                return sim.getGoiCuocID();
            case 7: 
                return sim.getCuocGoiID();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

}
