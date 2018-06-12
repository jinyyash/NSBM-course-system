/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.controllers;

import edu.ucsc.ce.dbconnection.DBConnection;
import edu.ucsc.ce.models.InstructorDTO;
import edu.ucsc.ce.models.SubjectDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jinadi
 */
public class SubjectController {

    public static boolean addSubject(SubjectDTO c) throws SQLException, ClassNotFoundException {
        String sql = "insert into subject values(?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, c.getSid());
        stm.setObject(2, c.getLectureDTO().getLid());
        stm.setObject(3, c.getCourseDTO().getCid());
        stm.setObject(4, c.getName());
        stm.setObject(5, c.getSemester());
        stm.setObject(6, c.getCredits());
        stm.setObject(7, c.getPrice());
        stm.setObject(8, c.getDuration());
        return stm.executeUpdate() > 0;
    }

    public static String getLastID() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM subject ORDER BY SSID DESC LIMIT 1";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String lec = null;
        if (rst.next()) {
            lec = rst.getString(1);
        }
        return lec;
    }

    public static String getLastID(String cid) throws SQLException, ClassNotFoundException {
        String sql = " select * from subject where SSID like '"+cid+"%'ORDER BY SSID DESC LIMIT 1";
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
