package com.appman.nahug.model;

import jakarta.persistence.*;

@Entity
@Table(name = "brand")
public class BrandModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_brand")
    private Long id;
    @Column(name = "brand")
    private String brand;
    @Column(name = "description")
    private String description;
    @Column(name = "kgCal")
    private Long kgCal;

    public BrandModel(){}

    public BrandModel(Long id, String brand, String description, Long kgCal) {
        this.id = id;
        this.brand = brand;
        this.description = description;
        this.kgCal = kgCal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getKgCal() {
        return kgCal;
    }

    public void setKgCal(Long kgCal) {
        this.kgCal = kgCal;
    }
}
