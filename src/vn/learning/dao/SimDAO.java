/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.learning.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import vn.learning.model.Sim;

/**
 *
 * @author Admin
 */
public interface SimDAO {

    public ArrayList<Sim> getAllSim() throws SQLException;

    public void addSim(Sim sim) throws SQLException;

    public void updateSim(Sim sim) throws SQLException;

    public void deleteSim(Integer id) throws SQLException;
}
