package com.appman.nahug.model;

import jakarta.persistence.*;

@Entity
@Table(name = "brand")
public class BrandModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_brand")
    private Long id_brand;
    @Column(name = "brand")
    private String brand;
    @Column(name = "description")
    private String description;
    @Column(name = "cal")
    private Long cal;

    public BrandModel(){}

    public BrandModel(Long id_brand, String brand, String description, Long cal) {
        this.id_brand = id_brand;
        this.brand = brand;
        this.description = description;
        this.cal = cal;
    }

    public Long getId_brand() {
        return id_brand;
    }

    public void setId_brand(Long id_brand) {
        this.id_brand = id_brand;
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

    public Long getCal() {
        return cal;
    }

    public void setCal(Long cal) {
        this.cal = cal;
    }

}
