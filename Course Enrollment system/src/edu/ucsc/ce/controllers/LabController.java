/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.controllers;

import edu.ucsc.ce.dbconnection.DBConnection;
import edu.ucsc.ce.models.CourseDTO;
import edu.ucsc.ce.models.LabDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Jinadi
 */
public class LabController {
     public static boolean addLab(LabDTO c) throws SQLException, ClassNotFoundException {
        String sql = "insert into lab  values(?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, c.getLid());
        stm.setObject(2, c.getName());
        stm.setObject(3, c.getType());
        stm.setObject(4, c.getNumOfOc());
        stm.setObject(5, c.getNumOfCom());
        return stm.executeUpdate() > 0;
    }
      public static ArrayList<LabDTO> getAll() throws SQLException, ClassNotFoundException {
        String sql = "select * from lab";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<LabDTO> list = new ArrayList<>();
        while (rst.next()) {
          LabDTO cdto=new LabDTO(rst.getString(1), rst.getString(2), rst.getString(3),Integer.parseInt( rst.getString(4)),Integer.parseInt( rst.getString(5)));
            list.add(cdto);
        }
        return list;
    }
      public static String getLastLabID() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM lab ORDER BY LID DESC LIMIT 1";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String lec = null;
        if (rst.next()) {
            lec = rst.getString(1);
        }
        return lec;
    }
}
