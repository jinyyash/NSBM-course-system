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
import java.sql.SQLException;

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
}
