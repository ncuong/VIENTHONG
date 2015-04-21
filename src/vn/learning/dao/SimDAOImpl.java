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
import vn.learning.model.Sim;
import vn.learning.util.DataBaseUtil;

/**
 *
 * @author Admin
 */
public class SimDAOImpl implements SimDAO {

    private DataBaseUtil dataBaseUtil;
    private KhachHangDAO khachHangDAO;
//    private CuocGoiDAO cuocGoiDAO;
    

    @Override
    public ArrayList<Sim> getAllSim() throws SQLException {
        ArrayList<Sim> sims = new ArrayList<>();
        String sql = new StringBuilder().append("SELECT * FROM KHACH_HANG").toString();//have to change this line
        try {
            dataBaseUtil = new DataBaseUtil();
            dataBaseUtil.createConnection();
            
            ResultSet resultSet = dataBaseUtil.executePreparedStatement(sql);
            while (resultSet.next()) {
                Sim sim = new Sim();
                Integer id = resultSet.getInt("ID");
                String soThueBao = resultSet.getString("SO_THUE_BAO");
                Date ngayDangKy = resultSet.getDate("NGAY_DANG_KY");
                Integer taiKhoanChinh = resultSet.getInt("TAI_KHOAN_CHINH");
                Integer taiKhoanKhuyenMai = resultSet.getInt("TAI_KHOAN_KHUYEN_MAI");
                
                Integer khachHangID = resultSet.getInt("KHACH_HANG_ID");
                Integer goiCuocID = resultSet.getInt("GOC_CUOC");
                Integer cuocGoiID = resultSet.getInt(("CUOC_GOI"));
                
                
                
                
                sim.setId(id);
                
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return sims;
    }

    @Override
    public void addSim(Sim sim) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateSim(Sim sim) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteSim(Integer id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
