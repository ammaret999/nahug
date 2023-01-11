package com.appman.nahug.dto;

public class VaccineDTO {
    private String vaccine;
    private Long ageMonth;

    public VaccineDTO() {
    }

    public VaccineDTO(String vaccine, Long ageMonth) {
        this.vaccine = vaccine;
        this.ageMonth = ageMonth;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public Long getAgeMonth() {
        return ageMonth;
    }

    public void setAgeMonth(Long ageMonth) {
        this.ageMonth = ageMonth;
    }
}

