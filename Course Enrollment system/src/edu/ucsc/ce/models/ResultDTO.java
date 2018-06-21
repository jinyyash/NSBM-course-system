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
public class ResultDTO {
    private String rid;
    private ExamDTO examDTO;
    private StudentDTO studentDTO;
    private Double result;
    private String grade;

    public ResultDTO(String rid, ExamDTO examDTO, StudentDTO studentDTO, Double result, String grade) {
        this.rid = rid;
        this.examDTO = examDTO;
        this.studentDTO = studentDTO;
        this.result = result;
        this.grade = grade;
    }

    
    

    /**
     * @return the examDTO
     */
    public ExamDTO getExamDTO() {
        return examDTO;
    }

    /**
     * @param examDTO the examDTO to set
     */
    public void setExamDTO(ExamDTO examDTO) {
        this.examDTO = examDTO;
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
     * @return the result
     */
    public Double getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(Double result) {
        this.result = result;
    }

    /**
     * @return the grade
     */
    public Double getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
