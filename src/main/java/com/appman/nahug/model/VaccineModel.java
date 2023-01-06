package com.appman.nahug.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vaccine")
public class VaccineModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vaccine")
    private Long id;
    @Column(name = "name_vaccine")
    private String vaccine;
    @Column(name = "age_month")
    private Long ageMonth;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "vaccine_id",referencedColumnName = "id_vaccine")
    private List<PhaseModel> phaseModels;

    public VaccineModel() {
    }

    public VaccineModel(Long id, String vaccine, Long ageMonth, ArrayList<PhaseModel> phaseModels) {
        this.id = id;
        this.vaccine = vaccine;
        this.ageMonth = ageMonth;
        this.phaseModels = phaseModels;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public List<PhaseModel> getPhaseModels() {
        return phaseModels;
    }

    public void setPhaseModels(List<PhaseModel> phaseModels) {
        this.phaseModels = phaseModels;
    }

    public Long getAgeMonth() {
        return ageMonth;
    }

    public void setAgeMonth(Long ageMonth) {
        this.ageMonth = ageMonth;
    }
}
