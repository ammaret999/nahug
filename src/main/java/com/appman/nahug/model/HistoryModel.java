package com.appman.nahug.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "history")
public class HistoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_vaccine")
    private VaccineModel vaccineModel;
    @ManyToOne
    @JoinColumn(name = "id_cat")
    private CatModel catModel;
    @Column(name="start_date")
    @JsonFormat(pattern = "yyyy:MM:dd")
    private LocalDate startDate;
    @Column(name="end_date")
    @JsonFormat(pattern = "yyyy:MM:dd")
    private LocalDate endDate;
    @Column(name = "count")
    private Long countVaccine;
    public HistoryModel() {
    }

    public HistoryModel(Long id, VaccineModel vaccineModel, CatModel catModel, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.vaccineModel = vaccineModel;
        this.catModel = catModel;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VaccineModel getVaccineModel() {
        return vaccineModel;
    }

    public void setVaccineModel(VaccineModel vaccineModel) {
        this.vaccineModel = vaccineModel;
    }

    public CatModel getCatModel() {
        return catModel;
    }

    public void setCatModel(CatModel catModel) {
        this.catModel = catModel;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
