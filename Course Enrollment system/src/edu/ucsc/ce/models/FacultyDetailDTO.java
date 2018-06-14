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
    private String fdid;
    private FacultyDTO facultyDTO;
    private CourseDTO courseDTO;
    private String intake;

    public FacultyDetailDTO(String fdid, FacultyDTO facultyDTO, CourseDTO courseDTO, String intake) {
        this.fdid = fdid;
        this.facultyDTO = facultyDTO;
        this.courseDTO = courseDTO;
        this.intake = intake;
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

    /**
     * @return the facultyDTO
     */
    public FacultyDTO getFacultyDTO() {
        return facultyDTO;
    }

    /**
     * @param facultyDTO the facultyDTO to set
     */
    public void setFacultyDTO(FacultyDTO facultyDTO) {
        this.facultyDTO = facultyDTO;
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
     * @param fdid the fdid to set
     */
    public void setFdid(String fdid) {
        this.fdid = fdid;
    }

    /**
     * @return the fdid
     */
    public String getFdid() {
        return fdid;
    }
    
}
