/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.learning.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import vn.learning.model.Sim;
import vn.learning.util.DataBaseUtil;

/**
 *
 * @author Admin
 */
public class SimDAOImpl implements SimDAO {

    private DataBaseUtil dataBaseUtil;
    

    @Override
    public ArrayList<Sim> getAllSim() throws SQLException {
        ArrayList<Sim> sims = new ArrayList<Sim>();
        String sql = new StringBuilder().append("SELECT * FROM SIM").toString();
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
                Integer goiCuocID = resultSet.getInt("GOI_CUOC_ID");
                Integer cuocGoiID = resultSet.getInt(("CUOC_GOI_ID"));
                
                sim.setId(id);
                sim.setSoThueBao(soThueBao);
                sim.setNgayDangKy(ngayDangKy);
                sim.setTaiKhoanChinh(taiKhoanChinh);
                sim.setTaiKhoanKhuyenMai(taiKhoanKhuyenMai);
                sim.setKhachHangID(khachHangID);
                sim.setCuocGoiID(cuocGoiID);
                sim.setGoiCuocID(goiCuocID);
                
                sims.add(sim);
                
            }
        } catch (SQLException ex) {
            throw ex;
        } finally {
            dataBaseUtil.closeConnection();
        }
        return sims;
    }

    @Override
    public void addSim(Sim sim) throws SQLException {
        String sql = new StringBuilder()
                .append("INSERT INTO SIM(SO_THUE_BAO,NGAY_DANG_KY,TAI_KHOAN_CHINH,TAI_KHOAN_KHUYEN_MAI,KHACH_HANG_ID,GOI_CUOC_ID,CUOC_GOI_ID) VALUES(?,?,?,?,?,?,?)")
                .toString();
        try {
            dataBaseUtil = new DataBaseUtil();
            dataBaseUtil.createConnection();
            dataBaseUtil.executeUpdate(sql, new Object[]{sim.getSoThueBao(), sim.getNgayDangKy(), sim.getTaiKhoanChinh(), sim.getTaiKhoanKhuyenMai(), sim.getKhachHangID(), sim.getGoiCuocID(), sim.getCuocGoiID()});
        } catch (SQLException ex) {
            throw ex;
        } finally {
            dataBaseUtil.closeConnection();
        }
    }

    @Override
    public void updateSim(Sim sim) throws SQLException {
         String sql = new StringBuilder()
                .append("UPDATE SIM ")
                .append("SET SO_THUE_BAO = ?, NGAY_DANG_KY = ?, TAI_KHOAN_CHINH = ?, TAI_KHOAN_KHUYEN_MAI = ?, KHACH_HANG_ID = ?, GOC_CUOC=?, CUOC_GOI=? ")
                .append("WHERE ID = ?")
                .toString();
        try {
            dataBaseUtil = new DataBaseUtil();
            dataBaseUtil.createConnection();
            dataBaseUtil.executeUpdate(sql, new Object[]{sim.getSoThueBao(), sim.getNgayDangKy(), sim.getTaiKhoanChinh(), sim.getTaiKhoanKhuyenMai(), sim.getKhachHangID(), sim.getGoiCuocID(), sim.getCuocGoiID()});
        } catch (SQLException ex) {
            throw ex;
        } finally {
            dataBaseUtil.closeConnection();
        }
    }

    @Override
    public void deleteSim(Integer id) throws SQLException {
        String sql = new StringBuilder()
                .append("DELETE FROM SIM WHERE SIM.ID = ?")
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

}
