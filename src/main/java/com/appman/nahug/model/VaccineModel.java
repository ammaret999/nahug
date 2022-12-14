package com.appman.nahug.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vaccine")
public class VaccineModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vaccine")
    private Long id;
    @Column(name = "name_vaccine")
    private String vaccine;
    @Column(name = "cat_month")
    private String cat_month;
    @Column(name = "month")
    private Long month;

    public VaccineModel() {
    }

    public VaccineModel(Long id, String vaccine, String cat_month, Long month) {
        this.id = id;
        this.vaccine = vaccine;
        this.cat_month = cat_month;
        this.month = month;
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

    public String getCat_month() {
        return cat_month;
    }

    public void setCat_month(String cat_month) {
        this.cat_month = cat_month;
    }

    public Long getMonth() {
        return month;
    }

    public void setMonth(Long month) {
        this.month = month;
    }
}
