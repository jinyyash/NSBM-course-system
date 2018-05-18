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
    private Integer rid;
    private ExamDTO examDTO;
    private StudentDTO studentDTO;
    private SubjectDTO subjectDTO;
    private Double result;
    private Double grade;

    /**
     * @return the rid
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * @param rid the rid to set
     */
    public void setRid(Integer rid) {
        this.rid = rid;
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
