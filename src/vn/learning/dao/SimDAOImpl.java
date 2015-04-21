/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vn.learning.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import vn.learning.model.Sim;
import vn.learning.util.DataBaseUtil;

/**
 *
 * @author Admin
 */
public class SimDAOImpl implements SimDAO{

    private DataBaseUtil dataBaseUtil;
    
    @Override
    public ArrayList<Sim> getAllSim() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
