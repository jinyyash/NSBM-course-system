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
    private Integer pid;
    private Integer ssid;
    private String date;
    private String time;

    /**
     * @return the pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(Integer pid) {
        java.lang.Integer oldPid = this.pid;
        this.pid = pid;
        propertyChangeSupport.firePropertyChange(PROP_PID, oldPid, pid);
    }

    /**
     * @return the ssid
     */
    public Integer getSsid() {
        return ssid;
    }

    /**
     * @param ssid the ssid to set
     */
    public void setSsid(Integer ssid) {
        java.lang.Integer oldSsid = this.ssid;
        this.ssid = ssid;
        propertyChangeSupport.firePropertyChange(PROP_SSID, oldSsid, ssid);
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
        propertyChangeSupport.firePropertyChange(PROP_DATE, oldDate, date);
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
        propertyChangeSupport.firePropertyChange(PROP_TIME, oldTime, time);
    }
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    public static final String PROP_PID = "pid";
    public static final String PROP_SSID = "ssid";
    public static final String PROP_DATE = "date";
    public static final String PROP_TIME = "time";
    
}
