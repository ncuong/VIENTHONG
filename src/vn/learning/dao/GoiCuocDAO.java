/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vn.learning.dao;

import java.util.ArrayList;
import vn.learning.model.GoiCuoc;

/**
 *
 * @author Admin
 */
public interface GoiCuocDAO {
    public ArrayList<GoiCuoc> getAllGoiCuoc();
    public void addGoiCuoc(GoiCuoc goiCuoc);
    public void deleteGoiCuoc(Integer id);
    public void updateGoiCuoc(GoiCuoc goiCuoc);
}
