/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.controllers;

import edu.ucsc.ce.dbconnection.DBConnection;
import edu.ucsc.ce.models.CourseDTO;
import edu.ucsc.ce.models.InstructorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jinadi
 */
public class CourseController {
     public static boolean addCourse(CourseDTO c) throws SQLException, ClassNotFoundException {
        String sql = "insert into course  values(?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, c.getCid());
        stm.setObject(2, c.getName());
        stm.setObject(3, c.getSubjectPerSem1());
        stm.setObject(4, c.getSubjectPerSem2());
        stm.setObject(5, c.getBatchYear());
        stm.setObject(6, c.getType());
        stm.setObject(7, c.getCreditForSem());
        return stm.executeUpdate() > 0;
    }
}
