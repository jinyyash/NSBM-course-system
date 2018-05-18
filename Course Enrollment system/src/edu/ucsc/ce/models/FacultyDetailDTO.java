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
public class FacultyDetailDTO {
    private Integer fdid;
    private Integer fid;
    private Integer cid;
    private String startDate;
    private String intake;

    /**
     * @return the fdid
     */
    public Integer getFdid() {
        return fdid;
    }

    /**
     * @param fdid the fdid to set
     */
    public void setFdid(Integer fdid) {
        this.fdid = fdid;
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
     * @return the cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the intake
     */
    public String getIntake() {
        return intake;
    }

    /**
     * @param intake the intake to set
     */
    public void setIntake(String intake) {
        this.intake = intake;
    }
    
}
