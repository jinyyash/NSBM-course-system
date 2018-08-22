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
import edu.ucsc.ce.models.InstructorDTO;
import edu.ucsc.ce.models.LecturerDTO;
import edu.ucsc.ce.models.PostgraduateDTO;
import edu.ucsc.ce.models.StudentDTO;
import edu.ucsc.ce.models.Student_SubDTO;
import edu.ucsc.ce.models.SubjectDTO;
import edu.ucsc.ce.models.UndergraduateDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jinadi
 */
public class StudentController {

    public static boolean addStudent(StudentDTO c) throws SQLException, ClassNotFoundException {
        String sql = "insert into student values(?,?,?,?,?,?,?,?,?,?,?,?)";
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
        stm.setObject(9, c.getState());
         stm.setObject(10, c.getEmail());
          stm.setObject(11, c.getParentName());
           stm.setObject(12, c.getParentEmail());
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

    public static String getLastDTOID() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM student ORDER BY LID DESC LIMIT 1";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String lec = null;
        if (rst.next()) {
            lec = rst.getString(1);
        }
        return lec;
    }

    public static ArrayList<StudentDTO> getAll() throws SQLException, ClassNotFoundException {
        String sql = "select * from student";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<StudentDTO> courseList = new ArrayList();
        StudentDTO dTO = null;
        CourseDTO courseDTO = null;
        FacultyDTO facultyDTO = null;
        while (rst.next()) {
            courseDTO = CourseController.searchCourse(rst.getString(2));
            facultyDTO = Facultycontroller.searchCourse(rst.getString(3));
            dTO = new StudentDTO(rst.getString(1), courseDTO, facultyDTO, rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), Integer.parseInt(rst.getString(9)),rst.getString(10),rst.getString(11),rst.getString(12));

            courseList.add(dTO);
        }
        return courseList;

    }

    public static boolean addStudentSubject(ArrayList<CourseDetailDTO> courseDetailDTOs, StudentDTO sdto) throws SQLException, ClassNotFoundException {
        String sql = "insert into student_sub values(?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        conn.setAutoCommit(false);
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(2, sdto.getSid());
        //stm.setObject(2, c.getCourseDTO().getCid());
        for (CourseDetailDTO courseDetailDTO : courseDetailDTOs) {
            stm.setObject(1, sdto.getSid() + courseDetailDTO.getSubjectDTO().getSid());
            stm.setObject(3, sdto.getSid());
            stm.setObject(2, courseDetailDTO.getSubjectDTO().getSid());
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

    public static Boolean checkUpdateCounts(int[] updateCounts) {
        boolean[] co = new boolean[updateCounts.length];
        for (int i = 0; i < updateCounts.length; i++) {
            if (updateCounts[i] >= 0) {
                System.out.println("OK; updateCount=" + updateCounts[i]);
                co[i] = true;
            } else if (updateCounts[i] == Statement.SUCCESS_NO_INFO) {
                System.out.println("OK; updateCount=Statement.SUCCESS_NO_INFO");
                co[i] = true;
            } else if (updateCounts[i] == Statement.EXECUTE_FAILED) {
                System.out.println("Failure; updateCount=Statement.EXECUTE_FAILED");
                co[i] = false;
            }
        }
        for (int i = 0; i < updateCounts.length; i++) {
            co[0] &= co[i];
        }
        return co[0];
    }

    public static ArrayList<Student_SubDTO> getAllStudentSub() throws SQLException, ClassNotFoundException {
        String sql = "select * from Student_Sub";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Student_SubDTO> courseList = new ArrayList();
        StudentDTO dTO = null;
        Student_SubDTO student_SubDTO = null;
        SubjectDTO sdto = null;
        while (rst.next()) {
            dTO = searchStudentDTO(rst.getString(2));
            sdto = SubjectController.searchSubjectDTO(rst.getString(3));
            student_SubDTO = new Student_SubDTO(rst.getString(1), dTO, sdto);

            courseList.add(student_SubDTO);
        }
        return courseList;

    }

    public static StudentDTO searchStudentDTO(String ID) throws SQLException, ClassNotFoundException {
        String sql = "select * from student where SID='" + ID + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        StudentDTO dTO = null;
        CourseDTO courseDTO = null;
        FacultyDTO facultyDTO = null;
        if (rst.next()) {
            courseDTO = CourseController.searchCourse(rst.getString(2));
            facultyDTO = Facultycontroller.searchCourse(rst.getString(3));
            dTO = new StudentDTO(rst.getString(1), courseDTO, facultyDTO, rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), Integer.parseInt(rst.getString(9)),rst.getString(10),rst.getString(11),rst.getString(12));
        }
        return dTO;
    }

    public static StudentDTO searchStudentDTONIC(String ID) throws SQLException, ClassNotFoundException {
        String sql = "select * from student where nic='" + ID + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        StudentDTO dTO = null;
        CourseDTO courseDTO = null;
        FacultyDTO facultyDTO = null;
        if (rst.next()) {
            courseDTO = CourseController.searchCourse(rst.getString(2));
            facultyDTO = Facultycontroller.searchCourse(rst.getString(3));
            dTO = new StudentDTO(rst.getString(1), courseDTO, facultyDTO, rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), Integer.parseInt(rst.getString(9)),rst.getString(10),rst.getString(11),rst.getString(12));
        }
        return dTO;
    }

    public static ArrayList<Student_SubDTO> getAllStudentSubForstudent(String id) throws SQLException, ClassNotFoundException {
        String sql = "select * from Student_Sub where SID='" + id + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Student_SubDTO> courseList = new ArrayList();
        StudentDTO dTO = null;
        Student_SubDTO student_SubDTO = null;
        SubjectDTO sdto = null;
        while (rst.next()) {
            dTO = searchStudentDTO(rst.getString(3));
            sdto = SubjectController.searchSubjectDTO(rst.getString(2));
            student_SubDTO = new Student_SubDTO(rst.getString(1), dTO, sdto);

            courseList.add(student_SubDTO);
        }
        return courseList;

    }

    public static ArrayList<UndergraduateDTO> getAllUndergraduate() throws SQLException, ClassNotFoundException {
        String sql = "select * from undergraduate";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<UndergraduateDTO> courseList = new ArrayList();
        StudentDTO dTO = null;
        UndergraduateDTO udto = null;
        while (rst.next()) {
            dTO = searchStudentDTO(rst.getString("sid"));
            udto = new UndergraduateDTO(dTO, Integer.parseInt(rst.getString("yearOfExam")), rst.getString("alResult"), rst.getString("rank"), Double.parseDouble(rst.getString("z")));
            courseList.add(udto);
        }
        return courseList;

    }

    public static ArrayList<PostgraduateDTO> getAllPostgraduate() throws SQLException, ClassNotFoundException {
        String sql = "select * from postgraduate";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<PostgraduateDTO> courseList = new ArrayList();
        StudentDTO dTO = null;
        PostgraduateDTO udto = null;
        while (rst.next()) {
            dTO = searchStudentDTO(rst.getString("sid"));
            udto = new PostgraduateDTO(dTO,rst.getString(2), rst.getString(3), rst.getString(4));
            courseList.add(udto);
        }
        return courseList;

    }

    public static boolean removeStudent(String PaymentID) throws SQLException, ClassNotFoundException {
        String sql = "Delete from student where nic='" + PaymentID + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        return stm.executeUpdate(sql) > 0;
    }

   

    public static ArrayList<Student_SubDTO> getAllStudentSubforStudent(String id) throws SQLException, ClassNotFoundException {
        String sql = "select distinct * from Student_Sub where sid='" + id + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Student_SubDTO> courseList = new ArrayList();
        StudentDTO dTO = null;
        Student_SubDTO student_SubDTO = null;
        SubjectDTO sdto = null;
        while (rst.next()) {
            dTO = searchStudentDTO(rst.getString(3));
            sdto = SubjectController.searchSubjectDTO(rst.getString(2));
            student_SubDTO = new Student_SubDTO(rst.getString(1), dTO, sdto);

            courseList.add(student_SubDTO);
        }
        return courseList;

    }

}
