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
public class LabDTO {
    private Integer lid;
    private String name;
    private String type;
    private Integer numOfOc;
    private Integer numOfCom;

    /**
     * @return the lid
     */
    public Integer getLid() {
        return lid;
    }

    /**
     * @param lid the lid to set
     */
    public void setLid(Integer lid) {
        this.lid = lid;
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
     * @return the numOfOc
     */
    public Integer getNumOfOc() {
        return numOfOc;
    }

    /**
     * @param numOfOc the numOfOc to set
     */
    public void setNumOfOc(Integer numOfOc) {
        this.numOfOc = numOfOc;
    }

    /**
     * @return the numOfCom
     */
    public Integer getNumOfCom() {
        return numOfCom;
    }

    /**
     * @param numOfCom the numOfCom to set
     */
    public void setNumOfCom(Integer numOfCom) {
        this.numOfCom = numOfCom;
    }
    
}
