/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.view;

import edu.ucsc.ce.controllers.ExamController;
import edu.ucsc.ce.controllers.StudentController;
import edu.ucsc.ce.methods.ComboBoxFilling;
import edu.ucsc.ce.models.ExamDTO;
import edu.ucsc.ce.models.ResultDTO;
import edu.ucsc.ce.models.StudentDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jinadi
 */
public class ViewAll extends javax.swing.JPanel {

    /**
     * Creates new form ViewUndergraduates
     */
    ArrayList<StudentDTO> studentDTOs = new ArrayList<>();
    ArrayList<ExamDTO> examDTOs = new ArrayList<>();

    public ViewAll() {
        initComponents();

       // loadStudent();
        loadExam();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbExam = new javax.swing.JComboBox<>();
        lblName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCourse = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbSem = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbYear = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Exam ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 48));

        cmbExam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbExam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cmbExam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbExamItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, 48));

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 180, 48));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 145, 48));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Course");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 145, 48));

        lblCourse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCourse.setForeground(new java.awt.Color(255, 255, 255));
        lblCourse.setText("Student ID");
        jPanel1.add(lblCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 180, 48));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("semester");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 76, 48));

        cmbSem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbSem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "1", "2" }));
        cmbSem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSemItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 120, 48));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("year");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 76, 48));

        cmbYear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "2018", "2017", "2016", "2015", "2014" }));
        cmbYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbYearItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 120, 48));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 200));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exam", "Subject", "Date", "Result", "Grade"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 780, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbExamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbExamItemStateChanged
        getAllStudentExam();
    }//GEN-LAST:event_cmbExamItemStateChanged

    private void cmbSemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSemItemStateChanged
        studentResult();
    }//GEN-LAST:event_cmbSemItemStateChanged

    private void cmbYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbYearItemStateChanged
        studentResult();
    }//GEN-LAST:event_cmbYearItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbExam;
    private javax.swing.JComboBox<String> cmbSem;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables

    private void studentResult() {
        if (cmbExam.getSelectedIndex() == 0) {
            getAllStudentExam();
        } else if (cmbExam.getSelectedIndex() != 0 && cmbSem.getSelectedIndex() == 0 && cmbYear.getSelectedIndex() == 0) {
            getStudentExam();
        } else if (cmbExam.getSelectedIndex() != 0 && cmbSem.getSelectedIndex() != 0 && cmbYear.getSelectedIndex() != 0) {
            forAllExamsSemYear();
        } else if (cmbExam.getSelectedIndex() == 0 && cmbSem.getSelectedIndex() != 0 && cmbYear.getSelectedIndex() != 0) {
            getForSemYear();
        }
    }

    private void getAllStudentExam() {
        try {
            //System.out.println(cmbSt.getSelectedIndex());
            ArrayList<ResultDTO> al = ExamController.getAllResultForExam(examDTOs.get(cmbExam.getSelectedIndex()).getEid());
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            for (ResultDTO resultDTO : al) {
                Object[] row = {resultDTO.getExamDTO().getExamType(), resultDTO.getExamDTO().getSubjectDTO().getName(), resultDTO.getExamDTO().getDate(), resultDTO.getResult(), resultDTO.getGrade()};
                dtm.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewAll.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewAll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getStudentExam() {
        try {
            ArrayList<ResultDTO> al = ExamController.getAllResultForExam( examDTOs.get(cmbExam.getSelectedIndex() - 1).getEid());
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            for (ResultDTO resultDTO : al) {
                Object[] row = {resultDTO.getExamDTO().getExamType(), resultDTO.getExamDTO().getSubjectDTO().getName(), resultDTO.getExamDTO().getDate(), resultDTO.getResult(), resultDTO.getGrade()};
                dtm.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewAll.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewAll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadExam() {
        try {
            examDTOs = ExamController.getAll();
            for (ExamDTO dTO : examDTOs) {
                cmbExam.addItem(dTO.getEid());
            }
            ComboBoxFilling combo = new ComboBoxFilling();
            combo.setSearchableCombo(cmbExam, true, "No eXAM found");
        } catch (SQLException ex) {
            Logger.getLogger(ViewAll.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewAll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    private void Year() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void forAllExamsSemYear() {
        try {
            ArrayList<ResultDTO> al;

            al = ExamController.getAllResultForExam(examDTOs.get(cmbExam.getSelectedIndex() - 1).getEid());

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            for (ResultDTO resultDTO : al) {
                String year[] = resultDTO.getExamDTO().getDate().split("-");
                System.out.println("year is" + year[1]);
                if (year[0].equals(cmbYear.getSelectedIndex()) && resultDTO.getExamDTO().getSubjectDTO().getSemester().equals(cmbSem.getSelectedItem())) {
                    Object[] row = {resultDTO.getExamDTO().getExamType(), resultDTO.getExamDTO().getSubjectDTO().getName(), resultDTO.getExamDTO().getDate(), resultDTO.getResult(), resultDTO.getGrade()};
                    dtm.addRow(row);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewAll.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewAll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getForSemYear() {
        try {
           // System.out.println(cmbSt.getSelectedIndex());
            ArrayList<ResultDTO> al;

            al = ExamController.getAllResult();

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            for (ResultDTO resultDTO : al) {
                String year[] = resultDTO.getExamDTO().getDate().split("-");
                if (year[0].equals(cmbYear.getSelectedItem()) && resultDTO.getExamDTO().getSubjectDTO().getSemester().equals(cmbSem.getSelectedItem())) {
                    Object[] row = {resultDTO.getExamDTO().getExamType(), resultDTO.getExamDTO().getSubjectDTO().getName(), resultDTO.getExamDTO().getDate(), resultDTO.getResult(), resultDTO.getGrade()};
                    dtm.addRow(row);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewAll.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewAll.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
