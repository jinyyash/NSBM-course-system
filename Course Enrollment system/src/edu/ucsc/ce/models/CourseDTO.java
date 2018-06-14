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
public class CourseDTO {

    private String cid;
    private String name;
    private Integer subjectPerSem1;
    private Integer subjectPerSem2;
    private Integer Year;         
    private String type;
    private Integer creditForSem;

    public CourseDTO(String cid, String name, Integer subjectPerSem1, Integer subjectPerSem2, Integer Year, String type, Integer creditForSem) {
        this.cid = cid;
        this.name = name;
        this.subjectPerSem1 = subjectPerSem1;
        this.subjectPerSem2 = subjectPerSem2;
        this.Year = Year;
        this.type = type;
        this.creditForSem = creditForSem;
    }
 
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the credit
     */
    

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
     * @return the subjectPerSem1
     */
    public Integer getSubjectPerSem1() {
        return subjectPerSem1;
    }

    /**
     * @param subjectPerSem1 the subjectPerSem1 to set
     */
    public void setSubjectPerSem1(Integer subjectPerSem1) {
        this.subjectPerSem1 = subjectPerSem1;
    }

    /**
     * @return the subjectPerSem2
     */
    public Integer getSubjectPerSem2() {
        return subjectPerSem2;
    }

    /**
     * @param subjectPerSem2 the subjectPerSem2 to set
     */
    public void setSubjectPerSem2(Integer subjectPerSem2) {
        this.subjectPerSem2 = subjectPerSem2;
    }

    /**
     * @return the batchYear
     */
    public Integer getYear() {
        return Year;
    }

    /**
     * @param batchYear the batchYear to set
     */
    public void setYear(Integer Year) {
        this.Year = Year;
    }

    /**
     * @return the creditForSem
     */
    public Integer getCreditForSem() {
        return creditForSem;
    }

    /**
     * @param creditForSem the creditForSem to set
     */
    public void setCreditForSem(Integer creditForSem) {
        this.creditForSem = creditForSem;
    }

    /**
     * @return the cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

}
