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
public class CourseDetailDTO {
    private String cdid;
    private CourseDTO courseDTO;
    private SubjectDTO subjectDTO;
    private String semester;

    public CourseDetailDTO(String cdid, CourseDTO courseDTO, SubjectDTO subjectDTO, String semester) {
        this.cdid = cdid;
        this.courseDTO = courseDTO;
        this.subjectDTO = subjectDTO;
        this.semester = semester;
    }

  
    
    /**
     * @return the semester
     */
    public String getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }

    /**
     * @return the courseDTO
     */
    public CourseDTO getCourseDTO() {
        return courseDTO;
    }

    /**
     * @param courseDTO the courseDTO to set
     */
    public void setCourseDTO(CourseDTO courseDTO) {
        this.courseDTO = courseDTO;
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
     * @return the cdid
     */
    public String getCdid() {
        return cdid;
    }

    /**
     * @param cdid the cdid to set
     */
    public void setCdid(String cdid) {
        this.cdid = cdid;
    }
}
