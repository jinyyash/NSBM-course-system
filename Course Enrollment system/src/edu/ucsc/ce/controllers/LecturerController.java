/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.controllers;

import edu.ucsc.ce.dbconnection.DBConnection;
import edu.ucsc.ce.models.LecturerDTO;
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
public class LecturerController {

    public static boolean addLecturer(LecturerDTO c) throws SQLException, ClassNotFoundException {
        String sql = "insert into lecturer values(?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, c.getLid());
        stm.setObject(2, c.getNIC());
        stm.setObject(3, c.getName());
        stm.setObject(4, c.getQuali());
        stm.setObject(5, c.getSpeciality());
        return stm.executeUpdate() > 0;
    }

    public static LecturerDTO searchLecturerDTO(String LecturerDTOID) throws SQLException, ClassNotFoundException {
        String sql = "select * from lecturer where LID='" + LecturerDTOID + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        LecturerDTO lec = null;
        if (rst.next()) {
            lec = new LecturerDTO(LecturerDTOID, rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
        }
        return lec ;
    }

    public static boolean removeLecturerDTO(int LecturerDTOID) throws SQLException, ClassNotFoundException {
        String sql = "Delete from lecturer where LID='" + LecturerDTOID + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        return stm.executeUpdate(sql) > 0;
    }

    public static ArrayList<LecturerDTO> getAllLecturerDTO() throws SQLException, ClassNotFoundException {
        String sql = "select * from lecturer";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<LecturerDTO> courseList = new ArrayList();
        LecturerDTO lec;
        while (rst.next()) {
            lec = new LecturerDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));

            courseList.add(lec);
        }
        return courseList;

    }
     public static String getLastLecturerDTOID() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM lecturer ORDER BY LID DESC LIMIT 1";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String lec = null;
        if (rst.next()) {
           lec=rst.getString(1);
        }
        return lec ;
    }
      public static boolean updateLecture(LecturerDTO ldto) throws SQLException, ClassNotFoundException {
        String sql = "Update lecturer set nic=?, name=?, qualification=?,speciality=? where LID="+ldto.getLid()+"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, ldto.getNIC());
        stm.setObject(2, ldto.getName());
        stm.setObject(3, ldto.getQuali());
        stm.setObject(4, ldto.getSpeciality());
        int res = stm.executeUpdate();
        return res > 0;
    }
}
