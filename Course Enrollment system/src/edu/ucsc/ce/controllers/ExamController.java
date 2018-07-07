/*=
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.controllers;

import edu.ucsc.ce.dbconnection.DBConnection;
import edu.ucsc.ce.models.ExamDTO;
import edu.ucsc.ce.models.FacultyDTO;
import edu.ucsc.ce.models.ResultDTO;
import edu.ucsc.ce.models.StudentDTO;
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
        ExamDTO examDTO = null;
        if (rst.next()) {
            examDTO = new ExamDTO(iid, SubjectController.searchSubjectDTO(rst.getString(2)), rst.getString(3), rst.getString(4), Double.parseDouble(rst.getString(5)), Double.parseDouble(rst.getString(6)));
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
            ExamDTO examDTO = new ExamDTO(rst.getString(1), SubjectController.searchSubjectDTO(rst.getString(2)), rst.getString(3), rst.getString(4), Double.parseDouble(rst.getString(5)), Double.parseDouble(rst.getString(6)));
            list.add(examDTO);
        }
        return list;
    }

    public static String getLastDTOID() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM result ORDER BY EID DESC LIMIT 1";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String lec = null;
        if (rst.next()) {
            lec = rst.getString(1);
        }
        return lec;
    }

    public static boolean Addresult(ResultDTO c, Connection conn) throws SQLException, ClassNotFoundException {
        String sql = "insert into result  values(?,?,?,?,?,?)";
        // Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, c.getRid());
        stm.setObject(2, c.getExamDTO().getEid());
        stm.setObject(3, c.getStudentDTO().getSid());
        stm.setObject(4, c.getExamDTO().getExamType());
        stm.setObject(5, c.getResult());
        stm.setObject(6, c.getGrade());
        return stm.executeUpdate() > 0;
    }

    public static boolean Addresult(ArrayList<ResultDTO> c) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        conn.setAutoCommit(false);
        int addC = 0;
        for (ResultDTO resultDTO : c) {
            boolean add = Addresult(resultDTO, conn);
            if (add) {
                addC++;
            }
        }
        if (addC == c.size()) {
            conn.commit();
            return true;
        } else {
            conn.rollback();
            return false;
        }
    }

    public static ArrayList<ResultDTO> getAllResult() throws SQLException, ClassNotFoundException {
        String sql = "select * from result";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<ResultDTO> list = new ArrayList<>();
        ExamDTO examDTO = null;
        StudentDTO studentDTO = null;
        ResultDTO dTO = null;
        while (rst.next()) {
            examDTO = searchExam(rst.getString(2));
            studentDTO = StudentController.searchStudentDTO(rst.getString(3));
            dTO = new ResultDTO(rst.getString(1), examDTO, studentDTO, Double.parseDouble(rst.getString(4)), rst.getString(5));
            list.add(dTO);
        }
        return list;
    }

    public static ArrayList<ResultDTO> getAllResultForStudent(String sid) throws SQLException, ClassNotFoundException {
        String sql = "select * from result where SID='" + sid + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<ResultDTO> list = new ArrayList<>();
        ExamDTO examDTO = null;
        StudentDTO studentDTO = null;
        ResultDTO dTO = null;
        while (rst.next()) {
            examDTO = searchExam(rst.getString(2));
            studentDTO = StudentController.searchStudentDTO(rst.getString(3));
            dTO = new ResultDTO(rst.getString(1), examDTO, studentDTO, Double.parseDouble(rst.getString(5)), rst.getString(6));
            list.add(dTO);
        }
        return list;
    }

    public static ArrayList<ResultDTO> getAllResultStudent() throws SQLException, ClassNotFoundException {
        String sql = "select * from result";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<ResultDTO> list = new ArrayList<>();
        ExamDTO examDTO = null;
        StudentDTO studentDTO = null;
        ResultDTO dTO = null;
        while (rst.next()) {
            examDTO = searchExam(rst.getString(2));
            studentDTO = StudentController.searchStudentDTO(rst.getString(3));
            dTO = new ResultDTO(rst.getString(1), examDTO, studentDTO, Double.parseDouble(rst.getString(5)), rst.getString(6));
            list.add(dTO);
        }
        return list;
    }

    public static ArrayList<ResultDTO> getAllResultForStudentExam(String sid, String eid) throws SQLException, ClassNotFoundException {
        String sql = "select * from result where eid='" + eid + "' && sid='" + sid + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<ResultDTO> list = new ArrayList<>();
        ExamDTO examDTO = null;
        StudentDTO studentDTO = null;
        ResultDTO dTO = null;
        while (rst.next()) {
            examDTO = searchExam(rst.getString(2));
            studentDTO = StudentController.searchStudentDTO(rst.getString(3));
            dTO = new ResultDTO(rst.getString(1), examDTO, studentDTO, Double.parseDouble(rst.getString(5)), rst.getString(6));
            list.add(dTO);
        }
        return list;
    }

}
