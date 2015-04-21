/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.learning.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import vn.learning.model.CuocGoi;
import vn.learning.util.DataBaseUtil;

/**
 *
 * @author Admin
 */
public class CuocGoiDAOImpl implements CuocGoiDAO {

    private DataBaseUtil dataBaseUtil;

    @Override
    public ArrayList<CuocGoi> getAllCuocGoi() throws SQLException {
        ArrayList<CuocGoi> cuocGois = new ArrayList<>();
        String sql = new StringBuilder().append("SELECT * FROM CUOC_GOI").toString();
        try {
            dataBaseUtil = new DataBaseUtil();
            dataBaseUtil.createConnection();
            ResultSet resultSet = dataBaseUtil.executePreparedStatement(sql);
            while (resultSet.next()) {
                CuocGoi cuocGoi = new CuocGoi();
                
                Integer id = resultSet.getInt("ID");
                String thueBaoDuocGoi = resultSet.getString("THUE_BAO_DUOC_GOI");
                Date thoiGianBatDau = resultSet.getDate("THOI_GIAN_BAT_DAU");
                Date thoiGianKetThuc = resultSet.getDate("THOI_GIAN_KET_THUC");
                
                cuocGoi.setId(id);
                cuocGoi.setThueBaoDuocGoi(thueBaoDuocGoi);
//                cuocGoi.setThoiGianBatDau(thoiGianBatDau);
//                cuocGoi.setThoiGianKetThuc(thoiGianKetThuc);
                
            }
        } catch (SQLException ex) {

        }
        return cuocGois;
    }

    @Override
    public void addCuocGoi(CuocGoi cuocGoi) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCuocGoi(CuocGoi cuocGoi) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCuocGoi(Integer id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
