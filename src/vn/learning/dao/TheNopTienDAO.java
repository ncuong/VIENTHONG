/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vn.learning.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import vn.learning.model.TheNopTien;

/**
 *
 * @author Admin
 */
public interface TheNopTienDAO {
    public ArrayList<TheNopTien> getAllTheNop() throws SQLException;
    public void addTheNop(TheNopTien theNopTien);
    public void deleteTheNop(Integer id);
    public void updateTheNop(TheNopTien theNopTien);
}
