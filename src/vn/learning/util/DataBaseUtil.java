/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.learning.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DataBaseUtil {

    private Connection connection;
    PreparedStatement pstt;
    ResultSet rs;

    private static final String DRIVER_CLASS = "net.sourceforge.jtds.jdbc.Driver";
    private static final String URL = "jdbc:jtds:sqlserver://localhost:1433;databaseName=SIM";
    private static final String USER_NAME = "sa";
    private static final String PASSWORD = "123456";

    public void createConnection() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER_CLASS);
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw e;
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void closeConnection() {
        try {
            pstt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet executePreparedStatement(String sql, Object[] params) throws SQLException {
        try {
            pstt = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                pstt.setObject(i + 1, params[i]);
            }
            rs = pstt.executeQuery();
        } catch (SQLException e) {

            e.printStackTrace();
            throw e;
        }
        return rs;
    }

    public ResultSet executePreparedStatement(String sql) throws SQLException {
        try {
            pstt = connection.prepareStatement(sql);
            rs = pstt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return rs;
    }

    public void executeUpdate(String sql, Object[] params) throws SQLException {
        try {
            pstt = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                pstt.setObject(i + 1, params[i]);
            }
            pstt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }

    }
}
