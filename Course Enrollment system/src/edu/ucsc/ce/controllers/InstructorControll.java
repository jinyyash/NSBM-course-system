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
import java.util.ArrayList;

/**
 *
 * @author Jinadi
 */
public class InstructorControll {

    public static boolean addLecturer(InstructorDTO c) throws SQLException, ClassNotFoundException {
        String sql = "insert into instructor values(?,?,?,?,?,?,?)";
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

    public static InstructorDTO searchInstructor(String iid) throws SQLException, ClassNotFoundException {
        String sql = "select * from instructor where iid='" + iid + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        InstructorDTO idto=null;
        if (rst.next()) {
            idto = new InstructorDTO(iid, rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5),Integer.parseInt(rst.getString(6)),rst.getString(7));
        }
        return idto;
    }

    public static String getLastInstrucorDTOID() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM instructor ORDER BY IID DESC LIMIT 1";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String lec = null;
        if (rst.next()) {
            lec = rst.getString(1);
        }
        return lec;
    }
    public static boolean updateInstructor(InstructorDTO c) throws SQLException, ClassNotFoundException {
        String sql = "Update instructor set nic=?, name=?,address=?, qualification=?,tel=?,email=? where IID='"+c.getIid()+"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, c.getNic());
        stm.setObject(2, c.getName());
        stm.setObject(3, c.getAddress());
        stm.setObject(4, c.getQualification());
        stm.setObject(5, c.getTel());
        stm.setObject(6, c.getEmail());
        int res = stm.executeUpdate();
        return res > 0;
    }
    public static ArrayList<InstructorDTO> getAlDTO() throws SQLException, ClassNotFoundException {
        String sql = "select * from instructor";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<InstructorDTO> courseList = new ArrayList();
        InstructorDTO lec;
        while (rst.next()) {
            lec = new InstructorDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5),Integer.parseInt(rst.getString(6)),rst.getString(7));

            courseList.add(lec);
        }
        return courseList;

    }
}
