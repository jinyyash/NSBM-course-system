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
public class ExamDTO {
    private Integer eid;
    private SubjectDTO subjectDTO;
    private String examType;
    private String date;
    private Double Stime;
    private Double Etime;

    public ExamDTO(Integer eid, SubjectDTO subjectDTO, String examType, String date, Double Stime, Double Etime) {
        this.eid = eid;
        this.subjectDTO = subjectDTO;
        this.examType = examType;
        this.date = date;
        this.Stime = Stime;
        this.Etime = Etime;
    }
 
    /**
     * @return the eid
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * @param eid the eid to set
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * @return the examType
     */
    public String getExamType() {
        return examType;
    }

    /**
     * @param examType the examType to set
     */
    public void setExamType(String examType) {
        this.examType = examType;
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
        this.date = date;
    }

    /**
     * @return the Stime
     */
    public Double getStime() {
        return Stime;
    }

    /**
     * @param Stime the Stime to set
     */
    public void setStime(Double Stime) {
        this.Stime = Stime;
    }

    /**
     * @return the Etime
     */
    public Double getEtime() {
        return Etime;
    }

    /**
     * @param Etime the Etime to set
     */
    public void setEtime(Double Etime) {
        this.Etime = Etime;
    }

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
    
    
    
    
}
