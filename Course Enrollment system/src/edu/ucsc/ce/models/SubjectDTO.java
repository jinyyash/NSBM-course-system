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
public class SubjectDTO {
    private Integer sid;
    private LectureDTO lectureDTO;
    private String name;
    private String semester;
    private Integer credits;
    private Double price;
    private String duration;

    /**
     * @return the sid
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    

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
     * @return the credits
     */
    public Integer getCredits() {
        return credits;
    }

    /**
     * @param credits the credits to set
     */
    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the lectureDTO
     */
    public LectureDTO getLectureDTO() {
        return lectureDTO;
    }

    /**
     * @param lectureDTO the lectureDTO to set
     */
    public void setLectureDTO(LectureDTO lectureDTO) {
        this.lectureDTO = lectureDTO;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }
}