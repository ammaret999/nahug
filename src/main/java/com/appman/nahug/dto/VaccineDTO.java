package com.appman.nahug.dto;

public class VaccineDTO {
    private String vaccine;

    public VaccineDTO() {
    }

    public VaccineDTO(String vaccine) {
        this.vaccine = vaccine;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }
}

