/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.view;

import edu.ucsc.ce.controllers.InstructorControll;
import edu.ucsc.ce.models.InstructorDTO;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jinadi
 */
public class UpdateInstructorForm1 extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomeForm
     */
    public UpdateInstructorForm1() {
        initComponents();
        enchan();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("download.png")));

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
        jLabel9 = new javax.swing.JLabel();
        txtNIC1 = new javax.swing.JTextField();
        txtEma = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAdd = new javax.swing.JTextArea();
        txtQ = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtIID = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtName2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel9.setText("Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 180, 70));

        txtNIC1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel1.add(txtNIC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 320, 40));

        txtEma.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtEma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmaActionPerformed(evt);
            }
        });
        jPanel1.add(txtEma, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 320, 40));

        txtAdd.setColumns(20);
        txtAdd.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtAdd.setRows(5);
        jScrollPane3.setViewportView(txtAdd);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 320, 110));

        txtQ.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel1.add(txtQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 320, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/Material Icons_e7f0(10)_48.png"))); // NOI18N
        jLabel11.setText("Instructor");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 230, 50));

        txtIID.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel1.add(txtIID, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 260, 40));

        txtTel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        jPanel1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 320, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel10.setText("Telphone");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 160, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel8.setText("E-Mail");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 160, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel7.setText("Qualification");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 120, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 160, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel5.setText("Instructor id");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 190, 60));

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/Material Icons_e7f0(10)_48.png"))); // NOI18N
        jLabel3.setText("Student");
        pnlDash.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 200, 50));

        jPanel1.add(pnlDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 710));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 640, 20));

        jLabel18.setBackground(new java.awt.Color(153, 153, 153));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("            Update");
        jLabel18.setOpaque(true);
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 630, 170, 50));

        jLabel17.setBackground(new java.awt.Color(153, 153, 153));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("           Cancel");
        jLabel17.setOpaque(true);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 630, 170, 50));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/Material Icons_e8fa(5)_48.png"))); // NOI18N
        jLabel12.setText("jLabel7");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 50, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel13.setText("NIC");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 190, 60));

        txtName2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel1.add(txtName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 320, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel4.setText("_");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, -20, 30, 50));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel14.setText("X");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 20, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/background-xx.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1000, 720));

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

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        jLabel18.setBackground(Color.BLACK);
        jLabel18.setForeground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        jLabel18.setBackground(Color.GRAY);
        jLabel18.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        jLabel17.setBackground(Color.BLACK);
        jLabel17.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        jLabel17.setBackground(Color.GRAY);
        jLabel17.setForeground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseExited

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        searchInstructor();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void txtEmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmaActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        update();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(UpdateInstructorForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateInstructorForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateInstructorForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateInstructorForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateInstructorForm1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JTextArea txtAdd;
    private javax.swing.JTextField txtEma;
    private javax.swing.JTextField txtIID;
    private javax.swing.JTextField txtNIC1;
    private javax.swing.JTextField txtName2;
    private javax.swing.JTextField txtQ;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    private void enchan() {

    }

    private void searchInstructor() {
        try {
            String id = txtIID.getText();
            InstructorDTO instructorDTO = InstructorControll.searchInstructor(id);
            txtNIC1.setText(instructorDTO.getNic());
            txtName2.setText(instructorDTO.getName());
            txtAdd.setText(instructorDTO.getAddress());
            txtQ.setText(instructorDTO.getQualification());
            txtTel.setText(instructorDTO.getTel() + "");
            txtEma.setText(instructorDTO.getEmail());

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UpdateInstructorForm1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void update() {
        try {
            String id = txtIID.getText();
            String name = txtName2.getText();
            String nic = txtNIC1.getText();
            String add = txtAdd.getText();
            String qua = txtQ.getText();
            int tel = Integer.parseInt(txtTel.getText());
            String email = txtEma.getText();
            InstructorDTO dTO = new InstructorDTO(id, nic, name, add, qua, tel, email);
            boolean up = InstructorControll.updateInstructor(dTO);
            if (up) {
                JOptionPane.showMessageDialog(null, "Instructor updated sucessfully");
            } else {
                JOptionPane.showMessageDialog(null, "oopz!!Try Again");

            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "oopz!!Try Again");
            Logger.getLogger(UpdateInstructorForm1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
