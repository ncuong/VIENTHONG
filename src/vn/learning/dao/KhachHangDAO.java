/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vn.learning.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import vn.learning.model.KhachHang;

/**
 *
 * @author Admin
 */
public interface KhachHangDAO {
    public ArrayList<KhachHang> getAllKhachHang() throws SQLException;
    public void addKhachHang(KhachHang khachHang) throws SQLException;
    public void delteKhachHang(Integer id) throws SQLException;
    public void updateKhachHang(KhachHang khachHang) throws SQLException;
}
