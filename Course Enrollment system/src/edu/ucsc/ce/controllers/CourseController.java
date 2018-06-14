/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.controllers;

import static edu.ucsc.ce.controllers.StudentController.addStudent;
import static edu.ucsc.ce.controllers.StudentController.addStudentPostgraduate;
import edu.ucsc.ce.dbconnection.DBConnection;
import edu.ucsc.ce.models.CourseDTO;
import edu.ucsc.ce.models.FacultyDetailDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        stm.setObject(5, c.getYear());
        stm.setObject(6, c.getType());
        stm.setObject(7, c.getCreditForSem());
        return stm.executeUpdate() > 0;
    }
      public static CourseDTO searchCourse(String iid) throws SQLException, ClassNotFoundException {
        String sql = "select * from course where cid='" + iid + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        CourseDTO cdto=null;
        if (rst.next()) {
           cdto=new CourseDTO(iid, rst.getString(2), Integer.parseInt(rst.getString(3)),Integer.parseInt( rst.getString(4)),Integer.parseInt( rst.getString(5)),rst.getString(6),Integer.parseInt(rst.getString(7)));
        }
        return cdto;
    }
 public static String getLastCourseID() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM course ORDER BY CID DESC LIMIT 1";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String lec = null;
        if (rst.next()) {
            lec = rst.getString(1);
        }
        return lec;
    }
   public static ArrayList<CourseDTO> getAll() throws SQLException, ClassNotFoundException {
        String sql = "select * from course";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<CourseDTO> list = new ArrayList<>();
        while (rst.next()) {
          CourseDTO cdto=new CourseDTO(rst.getString(1), rst.getString(2), Integer.parseInt(rst.getString(3)),Integer.parseInt( rst.getString(4)),Integer.parseInt( rst.getString(5)),rst.getString(6),Integer.parseInt(rst.getString(7)));
            list.add(cdto);
        }
        return list;
    }
    public static boolean addFacultyDetails(FacultyDetailDTO c) throws SQLException, ClassNotFoundException {
        String sql = "insert into facultydetails  values(?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, c.getFdid());
        stm.setObject(2, c.getCourseDTO().getCid());
        stm.setObject(3, c.getFacultyDTO().getFid());
        stm.setObject(4, c.getIntake());
       
        return stm.executeUpdate() > 0;
    }
     public static boolean addDetails(FacultyDetailDTO c,CourseDTO cdto) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDBConnection().getConnection();
        connection.setAutoCommit(false);
        boolean add = false;
        try {
            boolean ad = addCourse(cdto);
            boolean ad1 = addFacultyDetails(c);
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
}
