/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.view;

import edu.ucsc.ce.controllers.CourseController;
import edu.ucsc.ce.controllers.Facultycontroller;
import edu.ucsc.ce.controllers.LecturerController;
import edu.ucsc.ce.controllers.StudentController;
import edu.ucsc.ce.methods.ComboBoxFilling;
import edu.ucsc.ce.models.CourseDTO;
import edu.ucsc.ce.models.FacultyDTO;
import edu.ucsc.ce.models.StudentDTO;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.freixas.jcalendar.JCalendarCombo;

/**
 *
 * @author Jinadi
 */
public class AddStudentForm extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomeForm
     */
   public static ArrayList<CourseDTO> course=new ArrayList<>();
   public static ArrayList<FacultyDTO> fac=new ArrayList<>();
    public StudentDTO dTO;
    public AddStudentForm() {
        initComponents();
        enchan();
        loadCourse();
        loadFca();
        setID();
        setDate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pnlDash = new javax.swing.JPanel();
        lblrepo = new javax.swing.JLabel();
        lblDash = new javax.swing.JLabel();
        lblStude = new javax.swing.JLabel();
        lblLec = new javax.swing.JLabel();
        lblins = new javax.swing.JLabel();
        lblPayment = new javax.swing.JLabel();
        lblSett = new javax.swing.JLabel();
        lblExam = new javax.swing.JLabel();
        lblsub = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAdd = new javax.swing.JTextArea();
        cmbCal = new org.freixas.jcalendar.JCalendarCombo();
        cmbfac = new javax.swing.JComboBox<>();
        pnlMain = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbCourse = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        txtID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDash.setBackground(new java.awt.Color(0, 0, 0));
        pnlDash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblrepo.setBackground(new java.awt.Color(102, 102, 102));
        lblrepo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblrepo.setForeground(new java.awt.Color(255, 255, 255));
        lblrepo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/icomoon_e653(1)_48.png"))); // NOI18N
        lblrepo.setText("   Report");
        lblrepo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblrepoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblrepoMouseExited(evt);
            }
        });
        pnlDash.add(lblrepo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 200, 50));

        lblDash.setBackground(new java.awt.Color(204, 0, 204));
        lblDash.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblDash.setForeground(new java.awt.Color(255, 255, 255));
        lblDash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/FontAwesome_f009(14)_48.png"))); // NOI18N
        lblDash.setText("    DashBoard");
        lblDash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDashMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDashMouseExited(evt);
            }
        });
        pnlDash.add(lblDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 50));

        lblStude.setBackground(new java.awt.Color(102, 102, 102));
        lblStude.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblStude.setForeground(new java.awt.Color(255, 255, 255));
        lblStude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/FontAwesome_f0c0(12)_48.png"))); // NOI18N
        lblStude.setText("    Student");
        lblStude.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStudeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStudeMouseExited(evt);
            }
        });
        pnlDash.add(lblStude, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 50));

        lblLec.setBackground(new java.awt.Color(102, 102, 102));
        lblLec.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblLec.setForeground(new java.awt.Color(255, 255, 255));
        lblLec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/icomoon_e657(3)_48.png"))); // NOI18N
        lblLec.setText("    Lecturer");
        lblLec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLecMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLecMouseExited(evt);
            }
        });
        pnlDash.add(lblLec, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, 50));

        lblins.setBackground(new java.awt.Color(102, 102, 102));
        lblins.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblins.setForeground(new java.awt.Color(255, 255, 255));
        lblins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/octicons_f037(4)_48.png"))); // NOI18N
        lblins.setText("   Instructor");
        lblins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblinsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblinsMouseExited(evt);
            }
        });
        pnlDash.add(lblins, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 200, 50));

        lblPayment.setBackground(new java.awt.Color(102, 102, 102));
        lblPayment.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblPayment.setForeground(new java.awt.Color(255, 255, 255));
        lblPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/icomoon_e651(0)_48.png"))); // NOI18N
        lblPayment.setText("   Payment");
        lblPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPaymentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPaymentMouseExited(evt);
            }
        });
        pnlDash.add(lblPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 200, 50));

        lblSett.setBackground(new java.awt.Color(102, 102, 102));
        lblSett.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblSett.setForeground(new java.awt.Color(255, 255, 255));
        lblSett.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/Material Icons_e8fa(5)_48.png"))); // NOI18N
        lblSett.setText("   Settings");
        lblSett.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSettMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSettMouseExited(evt);
            }
        });
        pnlDash.add(lblSett, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 200, 50));

        lblExam.setBackground(new java.awt.Color(102, 102, 102));
        lblExam.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblExam.setForeground(new java.awt.Color(255, 255, 255));
        lblExam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/icomoon_e651(0)_48.png"))); // NOI18N
        lblExam.setText("   Exam");
        lblExam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExamMouseExited(evt);
            }
        });
        pnlDash.add(lblExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 200, 50));

        lblsub.setBackground(new java.awt.Color(102, 102, 102));
        lblsub.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblsub.setForeground(new java.awt.Color(255, 255, 255));
        lblsub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/Material Icons_e89c(7)_48.png"))); // NOI18N
        lblsub.setText("   Subject");
        lblsub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblsubMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblsubMouseExited(evt);
            }
        });
        pnlDash.add(lblsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 200, 50));

        jLabel1.setText("profile");
        pnlDash.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 90));

        jPanel1.add(pnlDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 710));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/Material Icons_e7f0(10)_48.png"))); // NOI18N
        jLabel3.setText("Student");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 200, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel4.setText("Address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 180, 110));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel5.setText("Date Of Birth");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 190, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel6.setText("Faculty");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 160, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel9.setText("Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 180, 70));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jRadioButton1.setText("Undergraduate");
        jRadioButton1.setFocusPainted(false);
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, 30));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jRadioButton2.setText("Postgraduate");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel15.setText("Student State");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 160, 60));

        txtName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 320, 40));

        txtAdd.setColumns(20);
        txtAdd.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtAdd.setRows(5);
        jScrollPane3.setViewportView(txtAdd);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 310, 90));
        jPanel1.add(cmbCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 170, 40));

        cmbfac.setEditable(true);
        cmbfac.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jPanel1.add(cmbfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 170, 50));

        pnlMain.setOpaque(false);
        jPanel1.add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 730, 290));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel10.setText("NIC");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 180, 70));

        txtNIC.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel1.add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 320, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel7.setText("Course");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 160, 50));

        cmbCourse.setEditable(true);
        cmbCourse.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cmbCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCourseActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 170, 50));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 72, 710, 10));

        txtID.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 230, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel11.setText("Student ID");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 90, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/background-xx.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 750));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblDashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashMouseEntered
        lblDash.setFont(new Font("Segoe UI", Font.BOLD, 20));

    }//GEN-LAST:event_lblDashMouseEntered

    private void lblDashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashMouseExited
        lblDash.setFont(new Font("Segoe UI Light", Font.BOLD, 18));

    }//GEN-LAST:event_lblDashMouseExited

    private void lblStudeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStudeMouseEntered
        lblStude.setFont(new Font("Segoe UI", Font.BOLD, 20));

    }//GEN-LAST:event_lblStudeMouseEntered

    private void lblLecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLecMouseEntered
        lblLec.setFont(new Font("Segoe UI", Font.BOLD, 20));        // TODO add your handling code here:
    }//GEN-LAST:event_lblLecMouseEntered

    private void lblinsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblinsMouseEntered
        lblins.setFont(new Font("Segoe UI", Font.BOLD, 20));        // TODO add your handling code here:
    }//GEN-LAST:event_lblinsMouseEntered

    private void lblPaymentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPaymentMouseEntered
        lblPayment.setFont(new Font("Segoe UI", Font.BOLD, 20));        // TODO add your handling code here:
    }//GEN-LAST:event_lblPaymentMouseEntered

    private void lblsubMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsubMouseEntered
        lblsub.setFont(new Font("Segoe UI", Font.BOLD, 20));        // TODO add your handling code here:
    }//GEN-LAST:event_lblsubMouseEntered

    private void lblrepoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblrepoMouseEntered
        lblrepo.setFont(new Font("Segoe UI", Font.BOLD, 20));        // TODO add your handling code here:
    }//GEN-LAST:event_lblrepoMouseEntered

    private void lblExamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExamMouseEntered
        lblExam.setFont(new Font("Segoe UI", Font.BOLD, 20));        // TODO add your handling code here:
    }//GEN-LAST:event_lblExamMouseEntered

    private void lblSettMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSettMouseEntered
        lblSett.setFont(new Font("Segoe UI", Font.BOLD, 20));        // TODO add your handling code here:
    }//GEN-LAST:event_lblSettMouseEntered

    private void lblStudeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStudeMouseExited
        lblStude.setFont(new Font("Segoe UI Light", Font.BOLD, 18));    // TODO add your handling code here:
    }//GEN-LAST:event_lblStudeMouseExited

    private void lblLecMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLecMouseExited
        lblLec.setFont(new Font("Segoe UI Light", Font.BOLD, 18));        // TODO add your handling code here:
    }//GEN-LAST:event_lblLecMouseExited

    private void lblinsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblinsMouseExited
        lblins.setFont(new Font("Segoe UI Light", Font.BOLD, 18));        // TODO add your handling code here:
    }//GEN-LAST:event_lblinsMouseExited

    private void lblPaymentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPaymentMouseExited
        lblPayment.setFont(new Font("Segoe UI Light", Font.BOLD, 18));        // TODO add your handling code here:
    }//GEN-LAST:event_lblPaymentMouseExited

    private void lblsubMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsubMouseExited
        lblsub.setFont(new Font("Segoe UI Light", Font.BOLD, 18));        // TODO add your handling code here:
    }//GEN-LAST:event_lblsubMouseExited

    private void lblrepoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblrepoMouseExited
        lblrepo.setFont(new Font("Segoe UI Light", Font.BOLD, 18));        // TODO add your handling code here:
    }//GEN-LAST:event_lblrepoMouseExited

    private void lblExamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExamMouseExited
        lblExam.setFont(new Font("Segoe UI Light", Font.BOLD, 18)); // TODO add your handling code here:
    }//GEN-LAST:event_lblExamMouseExited

    private void lblSettMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSettMouseExited
        lblSett.setFont(new Font("Segoe UI Light", Font.BOLD, 18));        // TODO add your handling code here:
    }//GEN-LAST:event_lblSettMouseExited

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        pnlMain.removeAll();
        UnderGraduate form = new UnderGraduate();
        form.setSize(pnlMain.getSize());
        pnlMain.add(form);
        pnlMain.repaint();
        pnlMain.revalidate(); // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void cmbCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCourseActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
       pnlMain.removeAll();
        PostGraduate form = new PostGraduate();
        form.setSize(pnlMain.getSize());
        pnlMain.add(form);
        pnlMain.repaint();
        pnlMain.revalidate();  // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public static org.freixas.jcalendar.JCalendarCombo cmbCal;
    public static javax.swing.JComboBox<String> cmbCourse;
    public static javax.swing.JComboBox<String> cmbfac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JRadioButton jRadioButton1;
    public static javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDash;
    private javax.swing.JLabel lblExam;
    private javax.swing.JLabel lblLec;
    private javax.swing.JLabel lblPayment;
    private javax.swing.JLabel lblSett;
    private javax.swing.JLabel lblStude;
    private javax.swing.JLabel lblins;
    private javax.swing.JLabel lblrepo;
    private javax.swing.JLabel lblsub;
    private javax.swing.JPanel pnlDash;
    private javax.swing.JPanel pnlMain;
    public static javax.swing.JTextArea txtAdd;
    public static javax.swing.JTextField txtID;
    public static javax.swing.JTextField txtNIC;
    public static javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void enchan() {
        setLocationRelativeTo(null);
    }

    private void loadCourse() {
  try {
             course=CourseController.getAll();
            for (CourseDTO courseDTO : course) {
                cmbCourse.addItem(courseDTO.getName());
            }
           ComboBoxFilling combo = new ComboBoxFilling();
            combo.setSearchableCombo(cmbCourse, true, "No Course found");
        } catch (SQLException ex) {
            Logger.getLogger(AddSubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddSubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }    }

    private void loadFca() {
  try {
             fac=Facultycontroller.getAll();
            for (FacultyDTO courseDTO : fac) {
                cmbfac.addItem(courseDTO.getName());
            }
           ComboBoxFilling combo = new ComboBoxFilling();
            combo.setSearchableCombo(cmbfac, true, "No Course found");
        } catch (SQLException ex) {
            Logger.getLogger(AddSubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddSubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }    }

    private void setID() {
        try {
            String lecID = StudentController.getLastID();
            if (lecID==null) {
                txtID.setText("S001");
            } else {
                String id = lecID.substring(lecID.length() - 1, lecID.length());
                txtID.setText(lecID.substring(0, lecID.length()-1) + (Integer.parseInt(id) + 1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddStudentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddStudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setDate() {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        cmbCal.setDateFormat(format);
    }
}
