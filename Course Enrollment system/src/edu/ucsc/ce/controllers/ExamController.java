/*=
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.controllers;

import edu.ucsc.ce.dbconnection.DBConnection;
import edu.ucsc.ce.models.ExamDTO;
import edu.ucsc.ce.models.FacultyDTO;
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
public class ExamController {

    public static boolean addExam(ExamDTO c) throws SQLException, ClassNotFoundException {
        String sql = "insert into exam  values(?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, c.getEid());
        stm.setObject(2, c.getSubjectDTO().getSid());
        stm.setObject(3, c.getExamType());
        stm.setObject(4, c.getDate());
        stm.setObject(5, c.getStime());
        stm.setObject(6, c.getEtime());
        return stm.executeUpdate() > 0;
    }
    public static ExamDTO searchExam(String iid) throws SQLException, ClassNotFoundException {
        String sql = "select * from exam where eid='" + iid + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ExamDTO examDTO=null;
        if (rst.next()) {
            examDTO= new ExamDTO(iid,SubjectController.searchSubjectDTO(rst.getString(2)),rst.getString(3), rst.getString(4), Double.parseDouble(rst.getString(5)), Double.parseDouble(rst.getString(6)));
        }
        return examDTO;
    }
    public static ArrayList<ExamDTO> getAll() throws SQLException, ClassNotFoundException {
        String sql = "select * from exam";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<ExamDTO> list = new ArrayList<>();
        while (rst.next()) {
            ExamDTO examDTO= new ExamDTO(rst.getString(1),SubjectController.searchSubjectDTO(rst.getString(2)),rst.getString(3), rst.getString(4), Double.parseDouble(rst.getString(5)), Double.parseDouble(rst.getString(6)));
            list.add(examDTO);
        }
        return list;
    }
}
