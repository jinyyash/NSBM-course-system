/*=
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.controllers;

import edu.ucsc.ce.dbconnection.DBConnection;
import edu.ucsc.ce.models.FacultyDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jinadi
 */
public class ExamController {
      public static boolean addFaculty(FacultyDTO c) throws SQLException, ClassNotFoundException {
        String sql = "insert into exam  values(?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, c.getFid());
        stm.setObject(2, c.getName());
        stm.setObject(3, c.getStartDate());
        return stm.executeUpdate() > 0;
    }
}
