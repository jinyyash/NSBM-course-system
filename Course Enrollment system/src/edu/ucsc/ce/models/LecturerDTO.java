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
public class LecturerDTO {
    private String lid;
    private String NIC;
    private String name;
    private String quali;
    private String speciality;

    public LecturerDTO(String lid, String NIC, String name, String quali, String speciality) {
        this.lid = lid;
        this.NIC = NIC;
        this.name = name;
        this.quali = quali;
        this.speciality = speciality;
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
     * @return the quali
     */
    public String getQuali() {
        return quali;
    }

    /**
     * @param quali the quali to set
     */
    public void setQuali(String quali) {
        this.quali = quali;
    }

    /**
     * @return the NIC
     */
    public String getNIC() {
        return NIC;
    }

    /**
     * @param NIC the NIC to set
     */
    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    /**
     * @return the speciality
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     * @param speciality the speciality to set
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * @return the lid
     */
    public String getLid() {
        return lid;
    }

    /**
     * @param lid the lid to set
     */
    public void setLid(String lid) {
        this.lid = lid;
    }
    
}
