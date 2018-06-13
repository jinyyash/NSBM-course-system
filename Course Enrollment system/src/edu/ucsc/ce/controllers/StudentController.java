/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.controllers;

import edu.ucsc.ce.dbconnection.DBConnection;
import edu.ucsc.ce.models.InstructorDTO;
import edu.ucsc.ce.models.PostgraduateDTO;
import edu.ucsc.ce.models.StudentDTO;
import edu.ucsc.ce.models.UndergraduateDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jinadi
 */
public class StudentController {

    public static boolean addStudent(StudentDTO c) throws SQLException, ClassNotFoundException {
        String sql = "insert into student values(?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, c.getSid());
        stm.setObject(2, c.getCourseDTO().getCid());
        stm.setObject(3, c.getFacultyDTO().getFid());
        stm.setObject(4, c.getNIC());
        stm.setObject(5, c.getName());
        stm.setObject(6, c.getBatch());
        stm.setObject(7, c.getAddress());
        stm.setObject(8, c.getDob());
        return stm.executeUpdate() > 0;
    }

    public static boolean addStudentUdergraduate(UndergraduateDTO c) throws SQLException, ClassNotFoundException {
        String sql = "insert into undergraduate values(?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, c.getStudentDTO().getSid());
        stm.setObject(2, c.getYearOfExam());
        stm.setObject(3, c.getAl_result());
        stm.setObject(4, c.getRank());
        stm.setObject(5, c.getZ());

        return stm.executeUpdate() > 0;
    }

    public static boolean addStudentPostgraduate(PostgraduateDTO c) throws SQLException, ClassNotFoundException {
        String sql = "insert into postgraduate values(?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, c.getStudentDTO().getSid());
        stm.setObject(2, c.getYear());
        stm.setObject(3, c.getQuali());
        stm.setObject(4, c.getInstitute());

        return stm.executeUpdate() > 0;
    }

    public static boolean addUndergraduate(StudentDTO sdto, UndergraduateDTO undergraduateDTO) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDBConnection().getConnection();
        connection.setAutoCommit(false);
        boolean add = false;
        try {
            boolean ad = addStudent(sdto);
            boolean ad1 = addStudentUdergraduate(undergraduateDTO);
            add = ad & ad1;
        } catch (SQLException ex) {

            try {
                connection.rollback();
            } catch (Exception ex1) {
                Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex1);
            }
            throw ex;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.setAutoCommit(true);
        }
        return add;
    }

    public static boolean addPostGraduate(StudentDTO sdto, PostgraduateDTO postgraduateDTO) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDBConnection().getConnection();
        connection.setAutoCommit(false);
        boolean add = false;
        try {
            boolean ad = addStudent(sdto);
            boolean ad1 = addStudentPostgraduate(postgraduateDTO);
            add = ad & ad1;
        } catch (SQLException ex) {

            try {
                connection.rollback();
            } catch (Exception ex1) {
                Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex1);
            }
            throw ex;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.setAutoCommit(true);
        }
        return add;
    }

    public static String getLastID() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM student ORDER BY SID DESC LIMIT 1";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String lec = null;
        if (rst.next()) {
            lec = rst.getString(1);
        }
        return lec;
    }
     public static String getLastLecturerDTOID() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM student ORDER BY LID DESC LIMIT 1";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String lec = null;
        if (rst.next()) {
           lec=rst.getString(1);
        }
        return lec ;
    }
}
