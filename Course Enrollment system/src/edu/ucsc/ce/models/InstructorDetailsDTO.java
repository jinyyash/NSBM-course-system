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
public class InstructorDetailsDTO {
    private Integer idid;
    private InstructorDTO instructorDTO;
    private SubjectDTO subjectDTO;

    /**
     * @return the idid
     */
    public Integer getIdid() {
        return idid;
    }

    /**
     * @param idid the idid to set
     */
    public void setIdid(Integer idid) {
        this.idid = idid;
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
