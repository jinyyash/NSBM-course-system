/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.models;

import java.beans.PropertyChangeSupport;

/**
 *
 * @author Jinadi
 */
public class PaymentDTO {

    private String pid;
    private SubjectDTO subjectDTO;
    private StudentDTO studentDTO;
    private String date;
    private String time;

    /**
     * @param pid
     * @param subjectDTO
     * @param studentDTO
     * @return the pid
     */
    public PaymentDTO(String pid, SubjectDTO subjectDTO, StudentDTO studentDTO, String date, String time) {
        this.pid = pid;
        this.subjectDTO = subjectDTO;
        this.studentDTO = studentDTO;
        this.date = date;
        this.time = time;
    }

    public String getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(String pid) {

        this.pid = pid;

    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        java.lang.String oldDate = this.date;
        this.date = date;
        getPropertyChangeSupport().firePropertyChange(getPROP_DATE(), oldDate, date);
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        java.lang.String oldTime = this.time;
        this.time = time;
        getPropertyChangeSupport().firePropertyChange(getPROP_TIME(), oldTime, time);
    }
    private transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    private static String PROP_PID = "pid";
    private static String PROP_SSID = "ssid";
    private static String PROP_DATE = "date";
    private static String PROP_TIME = "time";

    /**
     * @return the subjectDTO
     */
    public SubjectDTO getSubjectDTO() {
        return subjectDTO;
    }

    /**
     * @param subjectDTO the subjectDTO to set
     */
    public void setSubjectDTO(SubjectDTO subjectDTO) {
        this.subjectDTO = subjectDTO;
    }

    /**
     * @return the studentDTO
     */
    public StudentDTO getStudentDTO() {
        return studentDTO;
    }

    /**
     * @param studentDTO the studentDTO to set
     */
    public void setStudentDTO(StudentDTO studentDTO) {
        this.studentDTO = studentDTO;
    }

    /**
     * @return the propertyChangeSupport
     */
    public PropertyChangeSupport getPropertyChangeSupport() {
        return propertyChangeSupport;
    }

    /**
     * @param propertyChangeSupport the propertyChangeSupport to set
     */
    public void setPropertyChangeSupport(PropertyChangeSupport propertyChangeSupport) {
        this.propertyChangeSupport = propertyChangeSupport;
    }

    /**
     * @return the PROP_PID
     */
    public static String getPROP_PID() {
        return PROP_PID;
    }

    /**
     * @param aPROP_PID the PROP_PID to set
     */
    public static void setPROP_PID(String aPROP_PID) {
        PROP_PID = aPROP_PID;
    }

    /**
     * @return the PROP_SSID
     */
    public static String getPROP_SSID() {
        return PROP_SSID;
    }

    /**
     * @param aPROP_SSID the PROP_SSID to set
     */
    public static void setPROP_SSID(String aPROP_SSID) {
        PROP_SSID = aPROP_SSID;
    }

    /**
     * @return the PROP_DATE
     */
    public static String getPROP_DATE() {
        return PROP_DATE;
    }

    /**
     * @param aPROP_DATE the PROP_DATE to set
     */
    public static void setPROP_DATE(String aPROP_DATE) {
        PROP_DATE = aPROP_DATE;
    }

    /**
     * @return the PROP_TIME
     */
    public static String getPROP_TIME() {
        return PROP_TIME;
    }

    /**
     * @param aPROP_TIME the PROP_TIME to set
     */
    public static void setPROP_TIME(String aPROP_TIME) {
        PROP_TIME = aPROP_TIME;
    }

}
