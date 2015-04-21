/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.learning.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import vn.learning.model.CuocGoi;

/**
 *
 * @author Admin
 */
public interface CuocGoiDAO {

    public ArrayList<CuocGoi> getAllCuocGoi() throws SQLException;

    public void addCuocGoi(CuocGoi cuocGoi) throws SQLException;

    public void updateCuocGoi(CuocGoi cuocGoi) throws SQLException;

    public void deleteCuocGoi(Integer id) throws SQLException;
}
