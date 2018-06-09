/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.controllers;

import edu.ucsc.ce.dbconnection.DBConnection;
import edu.ucsc.ce.models.InstructorDTO;
import edu.ucsc.ce.models.LecturerDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jinadi
 */
public class InstructorControll {

    public static boolean addLecturer(InstructorDTO c) throws SQLException, ClassNotFoundException {
        String sql = "insert into instructor values(?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, c.getIid());
        stm.setObject(2, c.getNic());
        stm.setObject(3, c.getName());
        stm.setObject(4, c.getAddress());
        stm.setObject(5, c.getQualification());
        stm.setObject(6, c.getTel());
        stm.setObject(7, c.getEmail());
        return stm.executeUpdate() > 0;
    }

    public static LecturerDTO searchLecturerDTO(String LecturerDTOID) throws SQLException, ClassNotFoundException {
        String sql = "select * from lecturer where LecturerDTOID='" + LecturerDTOID + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        LecturerDTO lec = null;
        if (rst.next()) {
            lec = new LecturerDTO(LecturerDTOID, rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
        }
        return lec;
    }

    public static String getLastLecturerDTOID() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM lecturer ORDER BY LID DESC LIMIT 1";
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
