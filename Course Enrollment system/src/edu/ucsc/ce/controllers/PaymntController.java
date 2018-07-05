/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.controllers;

import static edu.ucsc.ce.controllers.ExamController.Addresult;
import edu.ucsc.ce.dbconnection.DBConnection;
import edu.ucsc.ce.models.LecturerDTO;
import edu.ucsc.ce.models.PaymentDTO;
import edu.ucsc.ce.models.ResultDTO;
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
public class PaymntController {
     public static String getID() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM payment ORDER BY PID DESC LIMIT 1";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String lec = null;
        if (rst.next()) {
           lec=rst.getString(1);
        }
        return lec ;
    }
      public static boolean addPayment(PaymentDTO c,Connection conn) throws SQLException, ClassNotFoundException {
        String sql = "insert into payment values(?,?,?,?,?)";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, c.getPid());
        stm.setObject(2, c.getStudentDTO().getSid());
        stm.setObject(3, c.getSubjectDTO().getSid());
        stm.setObject(4, c.getDate());
        stm.setObject(5, c.getTime());
        return stm.executeUpdate() > 0;
    }
       public static boolean AddPaymentList(ArrayList<PaymentDTO> c) throws SQLException, ClassNotFoundException {
      Connection conn = DBConnection.getDBConnection().getConnection();
      conn.setAutoCommit(false);
      int addC=0;
         for (PaymentDTO p : c) {
             boolean add=addPayment(p, conn);
             if(add){
                 addC++;
             }
         }
         if(addC==c.size()){
             conn.commit();
             return true;
         }else{
             conn.rollback();
             return false;
         }
    }

}
