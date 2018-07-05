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
public class YearTimeTableDTO {

    private String Tid;
    private SubjectDTO subjectDTO;
    private String year;
    private String sem;
    private String day;
    private String Hall;

    /**
     * @return the Tid
     */
    public String getTid() {
        return Tid;
    }

    /**
     * @param Tid the Tid to set
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
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

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the sem
     */
    public String getSem() {
        return sem;
    }

    /**
     * @param sem the sem to set
     */
    public void setSem(String sem) {
        this.sem = sem;
    }

    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the Hall
     */
    public String getHall() {
        return Hall;
    }

    /**
     * @param Hall the Hall to set
     */
    public void setHall(String Hall) {
        this.Hall = Hall;
    }
}
