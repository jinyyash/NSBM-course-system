/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.controllers;

import static edu.ucsc.ce.controllers.StudentController.checkUpdateCounts;
import edu.ucsc.ce.dbconnection.DBConnection;
import edu.ucsc.ce.models.CourseDTO;
import edu.ucsc.ce.models.CourseDetailDTO;
import edu.ucsc.ce.models.InstructorDTO;
import edu.ucsc.ce.models.LabDTO;
import edu.ucsc.ce.models.LabDetailDTO;
import edu.ucsc.ce.models.StudentDTO;
import edu.ucsc.ce.models.SubjectDTO;
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
public class LabController {

    public static boolean addLab(LabDTO c) throws SQLException, ClassNotFoundException {
        String sql = "insert into lab  values(?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, c.getLid());
        stm.setObject(2, c.getName());
        stm.setObject(3, c.getType());
        stm.setObject(4, c.getNumOfOc());
        stm.setObject(5, c.getNumOfCom());
        return stm.executeUpdate() > 0;
    }

    public static ArrayList<LabDTO> getAll() throws SQLException, ClassNotFoundException {
        String sql = "select * from lab";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<LabDTO> list = new ArrayList<>();
        while (rst.next()) {
            LabDTO cdto = new LabDTO(rst.getString(1), rst.getString(2), rst.getString(3), Integer.parseInt(rst.getString(4)), Integer.parseInt(rst.getString(5)));
            list.add(cdto);
        }
        return list;
    }

    public static String getLastLabID() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM lab ORDER BY LID DESC LIMIT 1";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String lec = null;
        if (rst.next()) {
            lec = rst.getString(1);
        }
        return lec;
    }

    public static boolean addInstructorLab(ArrayList<LabDetailDTO> al) throws SQLException, ClassNotFoundException {
        String sql = "insert into labDetails values(?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        conn.setAutoCommit(false);
        PreparedStatement stm = conn.prepareStatement(sql);
        //stm.setObject(2, sdto.getSid());
        //stm.setObject(2, c.getCourseDTO().getCid());
        for (LabDetailDTO courseDetailDTO : al) {
            stm.setObject(1, courseDetailDTO.getLdid());
            stm.setObject(2, courseDetailDTO.getLabDTO().getLid());
            stm.setObject(3,  courseDetailDTO.getInstructorDTO().getIid());
            stm.setObject(4,  courseDetailDTO.getSubjectDTO().getSid());
            stm.addBatch();
        }

        int[] c = stm.executeBatch();
        Boolean check = checkUpdateCounts(c);
        try {
            if (check) {
                conn.commit();
            } else {
                conn.rollback();
            }
        } finally {
            conn.setAutoCommit(true);
        }
        return check;
    }
     public static String getLastLabDetailID() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM labDetails ORDER BY LID DESC LIMIT 1";
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
