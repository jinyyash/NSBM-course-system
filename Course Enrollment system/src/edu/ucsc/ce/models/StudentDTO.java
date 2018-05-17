/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.models;

/**
 *
 * @author Jinadi
 */
public class StudentDTO {
    private Integer sid;
    private Integer fid;
    private String name;
    private String address;
    private String dob;

    public StudentDTO(Integer sid, Integer fid, String name, String address, String dob) {
        this.sid = sid;
        this.fid = fid;
        this.name = name;
        this.address = address;
        this.dob = dob;
    }
    
    

    /**
     * @return the sid
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * @return the fid
     */
    public Integer getFid() {
        return fid;
    }

    /**
     * @param fid the fid to set
     */
    public void setFid(Integer fid) {
        this.fid = fid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }
    
}
