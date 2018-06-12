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
public class UndergraduateDTO {
    private StudentDTO studentDTO;
    private Integer yearOfExam;
    private String al_result;
    private String rank;
    private Double z;

    public UndergraduateDTO(StudentDTO studentDTO, Integer yearOfExam, String al_result, String rank, Double z) {
        this.studentDTO = studentDTO;
        this.yearOfExam = yearOfExam;
        this.al_result = al_result;
        this.rank = rank;
        this.z = z;
    }

    
    /**
     * @return the studentDTO
     */
    public StudentDTO getStudentDTO() {
        return studentDTO;
    }

    /**
     * @param studentDTO the studentDTO to set
     */
    public void setStudentDTO(StudentDTO studentDTO) {
        this.studentDTO = studentDTO;
    }

    /**
     * @return the yearOfExam
     */
    public Integer getYearOfExam() {
        return yearOfExam;
    }

    /**
     * @param yearOfExam the yearOfExam to set
     */
    public void setYearOfExam(Integer yearOfExam) {
        this.yearOfExam = yearOfExam;
    }

    /**
     * @return the al_result
     */
    public String getAl_result() {
        return al_result;
    }

    /**
     * @param al_result the al_result to set
     */
    public void setAl_result(String al_result) {
        this.al_result = al_result;
    }

    /**
     * @return the rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * @return the z
     */
    public Double getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(Double z) {
        this.z = z;
    }
    
}
