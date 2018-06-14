/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.controllers;

import edu.ucsc.ce.dbconnection.DBConnection;
import edu.ucsc.ce.models.CourseDTO;
import edu.ucsc.ce.models.FacultyDTO;
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
public class Facultycontroller {
     public static boolean addFaculty(FacultyDTO c) throws SQLException, ClassNotFoundException {
        String sql = "insert into faculty  values(?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, c.getFid());
        stm.setObject(2, c.getName());
        stm.setObject(3, c.getStartDate());
        return stm.executeUpdate() > 0;
    }
      public static ArrayList<FacultyDTO> getAll() throws SQLException, ClassNotFoundException {
        String sql = "select * from faculty";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<FacultyDTO> list = new ArrayList<>();
        while (rst.next()) {
          FacultyDTO cdto=new FacultyDTO(rst.getString(1), rst.getString(2), rst.getString(3));
            list.add(cdto);
        }
        return list;
    }
      public static String getLastLabID() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM faculty ORDER BY FID DESC LIMIT 1";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String lec = null;
        if (rst.next()) {
            lec = rst.getString(1);
        }
        return lec;
    }
        public static FacultyDTO searchCourse(String iid) throws SQLException, ClassNotFoundException {
        String sql = "select * from faculty where fid='" + iid + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        FacultyDTO cdto=null;
        if (rst.next()) {
           cdto=new FacultyDTO(iid, rst.getString(2), rst.getString(3));
        }
        return cdto;
    }
}
