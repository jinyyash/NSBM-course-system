/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.controllers;

import edu.ucsc.ce.dbconnection.DBConnection;
import edu.ucsc.ce.models.CourseDTO;
import edu.ucsc.ce.models.CourseDetailDTO;
import edu.ucsc.ce.models.FacultyDTO;
import edu.ucsc.ce.models.LecturerDTO;
import edu.ucsc.ce.models.StudentDTO;
import edu.ucsc.ce.models.SubjectDTO;
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
public class SubjectController {

    static Connection connection;

    public static boolean addSubject(SubjectDTO c) throws SQLException, ClassNotFoundException {
        String sql = "insert into subject values(?,?,?,?,?,?,?,?,?)";

        connection = DBConnection.getDBConnection().getConnection();
        connection.setAutoCommit(false);
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, c.getSid());
        stm.setObject(2, c.getLectureDTO().getLid());
        stm.setObject(3, c.getCourseDTO().getCid());
        stm.setObject(4, c.getName());
        stm.setObject(5, c.getSemester());
        stm.setObject(6, c.getCredits());
        stm.setObject(7, c.getPrice());
        stm.setObject(8, c.getDuration());
          stm.setObject(9, c.getLocation());
        return stm.executeUpdate() > 0;
    }

    public static String getLastID() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM subject ORDER BY SSID DESC LIMIT 1";
        connection = DBConnection.getDBConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String lec = null;
        if (rst.next()) {
            lec = rst.getString(1);
        }
        return lec;
    }

    public static String getLastID(String cid) throws SQLException, ClassNotFoundException {
        String sql = " select * from subject where SSID like '" + cid + "%'ORDER BY SSID DESC LIMIT 1";
        connection = DBConnection.getDBConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String lec = null;
        if (rst.next()) {
            lec = rst.getString(1);
        }
        return lec;
    }
     public static SubjectDTO searchSubjectDTO(String LecturerDTOID) throws SQLException, ClassNotFoundException {
        String sql = "select * from subject where SSID='" + LecturerDTOID + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        SubjectDTO subjectDTO = null;
        if (rst.next()) {
            LecturerDTO  dTO=LecturerController.searchLecturerDTO(rst.getString(2));
            CourseDTO courseDTO=CourseController.searchCourse( rst.getString(3));
            subjectDTO = new SubjectDTO(LecturerDTOID,dTO,courseDTO, rst.getString(4), rst.getString(5),Integer.parseInt( rst.getString(6)),Double.parseDouble( rst.getString(7)), rst.getString(8),rst.getString(9));
        }
        return subjectDTO ;
    }

    public static boolean addCourseDetails(CourseDetailDTO c) throws SQLException, ClassNotFoundException {
        String sql = "insert into courseDetails values(?,?,?,?)";
        connection = DBConnection.getDBConnection().getConnection();
        connection.setAutoCommit(false);
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, c.getCdid());
        stm.setObject(2, c.getCourseDTO().getCid());
        stm.setObject(3, c.getSubjectDTO().getSid());
        stm.setObject(4, c.getSemester());

        return stm.executeUpdate() > 0;
    }

    public static boolean addDetails(SubjectDTO dTO, CourseDetailDTO courseDetailDTO) throws SQLException, ClassNotFoundException {

        connection.setAutoCommit(false);
        boolean add = false;
        try {
            boolean ad = addSubject(dTO);
            System.out.println(" commit 1 " + ad);
            connection.commit();
            boolean ad1 = addCourseDetails(courseDetailDTO);
            System.out.println(" commit 2 " + ad1);
            connection.commit();
            System.out.println(" commit  ");
            add = ad & ad1;

        } catch (SQLException ex) {
            connection.rollback();
            add = false;
            System.out.println(" rolla ");
            // throw ex;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.setAutoCommit(true);
            System.out.println(" commit gweyey ");
        }
        return add;
    }
     public static ArrayList<CourseDetailDTO> getAllSubjectDetail() throws SQLException, ClassNotFoundException {
        String sql = "select * from courseDetails";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<CourseDetailDTO> courseSubList = new ArrayList();
          CourseDTO courseDTO=null;
          SubjectDTO subjectDTO=null;
        while (rst.next()) {
            courseDTO=CourseController.searchCourse(rst.getString(2));
            subjectDTO=searchSubjectDTO(rst.getString(3));
 
            CourseDetailDTO courseDetailDTO=new CourseDetailDTO(rst.getString(1),courseDTO,subjectDTO, rst.getString(4));

            courseSubList.add(courseDetailDTO);
        }
        return courseSubList;

    }
     public static ArrayList<SubjectDTO> AllSubjects(String cid) throws SQLException, ClassNotFoundException {
        String sql = "select * from subject where CID='" + cid + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        SubjectDTO subjectDTO = null;
        ArrayList<SubjectDTO> arrayList=new ArrayList<>();
        if (rst.next()) {
            LecturerDTO  dTO=LecturerController.searchLecturerDTO(rst.getString(2));
            CourseDTO courseDTO=CourseController.searchCourse( rst.getString(3));
        
            subjectDTO = new SubjectDTO(rst.getString(1),dTO,courseDTO, rst.getString(4), rst.getString(5),Integer.parseInt( rst.getString(6)),Double.parseDouble( rst.getString(7)), rst.getString(8),rst.getString(9));
            arrayList.add(subjectDTO);
        }
        return arrayList ;
    }
     
}
