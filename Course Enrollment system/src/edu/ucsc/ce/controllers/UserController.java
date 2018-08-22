/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.controllers;


import edu.ucsc.ce.dbconnection.DBConnection;
import edu.ucsc.ce.models.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * 
 */
public class UserController {

    public static boolean addNewUser(User user) throws ClassNotFoundException, SQLException {
        String sql = "Insert into user values('" + user.getUserName() + "','" + user.getName() + "',PASSWORD('" + user.getPassword() + "')"+",'"+user.getType()+"'"+")";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    public static boolean checkUser(User user) throws SQLException, ClassNotFoundException {
        String sql = "Select * from user where userName='" + user.getUserName() + "' && password=PASSWORD('" + user.getPassword() + "')";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkValidity(String userName) throws SQLException, ClassNotFoundException {
        String sql = "Select * from user where userName='" + userName + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return false;
        } else {
            return true;
        }
    }
    
    //checkValidity and searchUser methods are both same but needed to give more credits to the meaning 
    public static boolean searchUser(String userName) throws SQLException, ClassNotFoundException {
        String sql = "Select * from user where userName='" + userName + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean deleteUser(String userName) throws SQLException, ClassNotFoundException {
        String sql = "delete from user where userName='" + userName + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;
    }
    
     public static User searchUserU(String userName) throws SQLException, ClassNotFoundException {
        String sql = "Select * from user where userName='" + userName + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        User user=null;
        while (rst.next()) {
             user=new User(userName, rst.getString(2), rst.getString(3), Integer.parseInt(rst.getString(4)));
        } 
        return user;
    }
}
