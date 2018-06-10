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
    private String sid;
    private LecturerDTO lectureDTO;
    private CourseDTO courseDTO;
    private String name;
    private String semester;
    private Integer credits;
    private Double price;
    private String duration;

    
    

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
    public LecturerDTO getLectureDTO() {
        return lectureDTO;
    }

    /**
     * @param lectureDTO the lectureDTO to set
     */
    public void setLectureDTO(LecturerDTO lectureDTO) {
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
     * @return the sid
     */
    public String getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(String sid) {
        this.sid = sid;
    }
}