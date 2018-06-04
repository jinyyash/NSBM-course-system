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
public class LabDetailDTO {
    private Integer ldid;
    private LabDTO labDTO;
    private InstructorDTO instructorDTO;
    private SubjectDTO subjectDTO;

    /**
     * @return the ldid
     */
    public Integer getLdid() {
        return ldid;
    }

    /**
     * @param ldid the ldid to set
     */
    public void setLdid(Integer ldid) {
        this.ldid = ldid;
    }

    /**
     * @return the labDTO
     */
    public LabDTO getLabDTO() {
        return labDTO;
    }

    /**
     * @param labDTO the labDTO to set
     */
    public void setLabDTO(LabDTO labDTO) {
        this.labDTO = labDTO;
    }

    /**
     * @return the instructorDTO
     */
    public InstructorDTO getInstructorDTO() {
        return instructorDTO;
    }

    /**
     * @param instructorDTO the instructorDTO to set
     */
    public void setInstructorDTO(InstructorDTO instructorDTO) {
        this.instructorDTO = instructorDTO;
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
