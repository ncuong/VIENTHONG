/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vn.learning.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import vn.learning.model.TheNopTien;
import vn.learning.util.DataBaseUtil;

/**
 *
 * @author Admin
 */
public class TheNopTienDAOImpl implements TheNopTienDAO{

    
    DataBaseUtil dataBaseUtil = new DataBaseUtil();
    @Override
    public ArrayList<TheNopTien> getAllTheNop() {
        ArrayList<TheNopTien> theNopTiens = new ArrayList<>();
        try {
            dataBaseUtil.createConnection();
            String sql = new StringBuilder().append("SELECT * FROM THE_NOP_TIEN").toString();
            ResultSet resultSet = dataBaseUtil.executePreparedStatement(sql);
            while (resultSet.next()) {
                TheNopTien theNopTien = new TheNopTien();
                Integer id = resultSet.getInt("ID");
                String soSeri = resultSet.getString("SO_SERI");
                Integer menhGia = resultSet.getInt("MENH_GIA");
                Date thoiGianNop = resultSet.getDate("THOI_GIAN_NOP");
                Boolean trangThai = resultSet.getBoolean("TRANG_THAI");
                
                theNopTien.setId(id);
                theNopTien.setSoSeri(soSeri);
                theNopTien.setMenhGia(menhGia);
                theNopTien.setThoiGianNop(thoiGianNop);
                theNopTien.setTrangThai(trangThai);
                
                theNopTiens.add(theNopTien);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TheNopTienDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dataBaseUtil.closeConnection();
        }
        return theNopTiens;
    }

    @Override
    public void addTheNop(TheNopTien theNopTien) {
        
        try {
            String sql = new StringBuilder()
                    .append("INSERT INTO THE_NOP_TIEN(SO_SERI, MENH_GIA, THOI_GIAN_NOP, TRANG_THAI) VALUES(?,?,?,?)")
                    .toString();
            dataBaseUtil.createConnection();
            dataBaseUtil.executeUpdate(sql, new Object[]{theNopTien.getSoSeri(), theNopTien.getMenhGia(), theNopTien.getThoiGianNop(), theNopTien.isTrangThai()});
        } catch (SQLException ex) {
            Logger.getLogger(TheNopTienDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dataBaseUtil.closeConnection();
        }
    }

    @Override
    public void deleteTheNop(Integer id) {
        String sql = new StringBuilder()
                .append("DELETE FROM THE_NOP_TIEN WHERE THE_NOP_TIEN.ID = ?")
                .toString();
        try {
            dataBaseUtil.createConnection();
            dataBaseUtil.executeUpdate(sql, new Object[]{id});
        } catch (SQLException ex) {
            Logger.getLogger(TheNopTienDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dataBaseUtil.closeConnection();
        }
    }

    @Override
    public void updateTheNop(TheNopTien theNop) {
        try {
            String sql = new StringBuilder()
                    .append("UPDATE THE_NOP_TIEN ")
                    .append("SET SO_SERI = ?, MENH_GIA = ?, THOI_GIAN_NOP = ?, TRANG_THAI = ? ")
                    .append("WHERE ID = ?")
                    .toString();
            dataBaseUtil.createConnection();
            dataBaseUtil.executeUpdate(sql, new Object[]{theNop.getSoSeri(), theNop.getMenhGia(), theNop.getThoiGianNop(), theNop.isTrangThai(), theNop.getId()});
        } catch (SQLException ex) {
            Logger.getLogger(TheNopTienDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dataBaseUtil.closeConnection();
        }
    }
    
}
