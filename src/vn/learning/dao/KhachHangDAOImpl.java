/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.learning.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import vn.learning.model.KhachHang;
import vn.learning.util.DataBaseUtil;

/**
 *
 * @author Admin
 */
public class KhachHangDAOImpl implements KhachHangDAO {

    private DataBaseUtil dataBaseUtil;

    @Override
    public ArrayList<KhachHang> getAllKhachHang() throws SQLException {
        ArrayList<KhachHang> khachHangs = new ArrayList<>();
        try {
            dataBaseUtil = new DataBaseUtil();
            dataBaseUtil.createConnection();
            String sql = new StringBuilder().append("SELECT * FROM KHACH_HANG").toString();
            ResultSet resultSet = dataBaseUtil.executePreparedStatement(sql);
            while (resultSet.next()) {
                KhachHang khachHang = new KhachHang();
                Integer id = resultSet.getInt("ID");
                String soCMND = resultSet.getString("SO_CMND");
                String hoTen = resultSet.getString("HO_TEN");
                String queQuan = resultSet.getString("QUE_QUAN");

                khachHang.setId(id);
                khachHang.setSoCMND(soCMND);
                khachHang.setHoTen(hoTen);
                khachHang.setQueQuan(queQuan);

                khachHangs.add(khachHang);

            }
            return khachHangs;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            dataBaseUtil.closeConnection();
        }

    }

    @Override
    public void addKhachHang(KhachHang khachHang) throws SQLException {
        try {
            dataBaseUtil = new DataBaseUtil();
            String sql = new StringBuilder()
                    .append("INSERT INTO KHACH_HANG VALUES(?,?,?)")
                    .toString();
            dataBaseUtil.createConnection();
            dataBaseUtil.executeUpdate(sql, new Object[]{khachHang.getSoCMND(), khachHang.getHoTen(), khachHang.getQueQuan()});
        } catch (SQLException ex) {
            throw ex;
        } finally {
            dataBaseUtil.closeConnection();
        }
    }

    @Override
    public void delteKhachHang(Integer id) throws SQLException {
        String sql = new StringBuilder()
                .append("DELETE FROM KHACH_HANG WHERE KHACH_HANG.ID = ?")
                .toString();
        try {
            dataBaseUtil = new DataBaseUtil();
            dataBaseUtil.createConnection();
            dataBaseUtil.executeUpdate(sql, new Object[]{id});
        } catch (SQLException ex) {
            throw ex;
        } finally {
            dataBaseUtil.closeConnection();
        }

    }

    @Override
    public void updateKhachHang(KhachHang khachHang) throws SQLException {
        String sql = new StringBuilder()
                .append("UPDATE KHACH_HANG ")
                .append("SET SO_CMND = ?, HO_TEN = ?, QUE_QUAN = ? ")
                .append("where ID = ?")
                .toString();
        try {
            dataBaseUtil = new DataBaseUtil();
            dataBaseUtil.createConnection();
            dataBaseUtil.executeUpdate(sql, new Object[]{khachHang.getSoCMND(), khachHang.getHoTen(), khachHang.getQueQuan(), khachHang.getId()});
        } catch (SQLException ex) {
            throw ex;
        } finally {
            dataBaseUtil.closeConnection();
        }
    }

}
