/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vn.learning.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import vn.learning.model.GoiCuoc;
import vn.learning.util.DataBaseUtil;

/**
 *
 * @author Admin
 */
public class GoiCuocDAOImpl implements GoiCuocDAO{

    DataBaseUtil dataBaseUtil = new DataBaseUtil();
    
    @Override
    public ArrayList<GoiCuoc> getAllGoiCuoc() {
        ArrayList<GoiCuoc> goiCuocs = new ArrayList<GoiCuoc>();
        try {
            
            dataBaseUtil.createConnection();
            String sql = new StringBuilder().append("SELECT * FROM GOI_CUOC").toString();
            ResultSet resultSet = dataBaseUtil.executePreparedStatement(sql);
            while (resultSet.next()) {
                GoiCuoc goiCuoc = new GoiCuoc();
                Integer id = resultSet.getInt("ID");
                String tenGoiCuoc = resultSet.getString("TEN_GOI_CUOC");
                Integer cuocGoiNoiMang = resultSet.getInt("CUOC_GOI_NOI_MANG");
                Integer cuocGoiNgoaiMang = resultSet.getInt("CUOC_GOI_NGOAI_MANG");
                Integer cuocNhanTinNoiMang = resultSet.getInt("CUOC_NHAN_TIN_NOI_MANG");
                Integer cuocNhanTinNgoaiMang = resultSet.getInt("CUOC_NHAN_TIN_NGOAI_MANG");
                
                goiCuoc.setId(id);
                goiCuoc.setTenGoiCuoc(tenGoiCuoc);
                goiCuoc.setCuocGoiNoiMang(cuocGoiNoiMang);
                goiCuoc.setCuocGoiNgoaiMang(cuocGoiNgoaiMang);
                goiCuoc.setCuocNhanTinNoiMang(cuocNhanTinNoiMang);
                goiCuoc.setCuocNhanTinNgoaiMang(cuocNhanTinNgoaiMang);
                
                goiCuocs.add(goiCuoc);
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GoiCuocDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GoiCuocDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dataBaseUtil.closeConnection();
        }
        
        return goiCuocs;
    }

    @Override
    public void addGoiCuoc(GoiCuoc goiCuoc) {
        try {
            String sql = new StringBuilder()
                    .append("INSERT INTO GOI_CUOC VALUES(?,?,?,?,?)")
                    .toString();
            dataBaseUtil.createConnection();
            dataBaseUtil.executeUpdate(sql, new Object[]{goiCuoc.getTenGoiCuoc(), goiCuoc.getCuocGoiNoiMang(), goiCuoc.getCuocGoiNgoaiMang(), goiCuoc.getCuocNhanTinNoiMang(), goiCuoc.getCuocNhanTinNgoaiMang()});
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GoiCuocDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GoiCuocDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dataBaseUtil.closeConnection();
        }
    }

    @Override
    public void deleteGoiCuoc(Integer id) {
        String sql = new StringBuilder()
                .append("DELETE FROM GOI_CUOC WHERE GOI_CUOC.ID = ?")
                .toString();
        try {
            dataBaseUtil.createConnection();
            dataBaseUtil.executeUpdate(sql, new Object[]{id});
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GoiCuocDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GoiCuocDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dataBaseUtil.closeConnection();
        }
    }

    @Override
    public void updateGoiCuoc(GoiCuoc goiCuoc) {
        String sql = new StringBuilder()
                .append("UPDATE GOI_CUOC ")
                .append("SET TEN_GOI_CUOC = ?, CUOC_GOI_NOI_MANG = ?, CUOC_GOI_NGOAI_MANG = ?, CUOC_NHAN_TIN_NOI_MANG = ?, CUOC_NHAN_TIN_NGOAI_MANG = ? ")
                .append("WHERE ID = ?")
                .toString();
        try {
            dataBaseUtil.createConnection();
            dataBaseUtil.executeUpdate(sql, new Object[]{goiCuoc.getTenGoiCuoc(), goiCuoc.getCuocGoiNoiMang(), goiCuoc.getCuocGoiNgoaiMang(), goiCuoc.getCuocNhanTinNoiMang(), goiCuoc.getCuocNhanTinNgoaiMang(), goiCuoc.getId()});
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GoiCuocDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GoiCuocDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dataBaseUtil.closeConnection();
        }
    }
    
}
