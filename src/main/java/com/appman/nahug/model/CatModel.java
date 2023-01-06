package com.appman.nahug.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cat")
public class CatModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cat")
    private Long id_cat;
    @Column(name="name")
    private String name;
    @Column(name="age_year")
    private Long age_year;
    @Column(name="age_month")
    private Long age_month;
    @Column(name="weight")
    private Long weight;
    @Column(name="gender")
    private String gender;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private UserModel userModel;

    @ManyToOne
    @JoinColumn(name = "id_food")
    private BrandModel brandModelId;
    @Column(name = "cal_day")
    private Long cal_day;

    public CatModel(){}

    public CatModel(Long id_cat, String name, Long age_year, Long age_month, Long weight, String gender, UserModel userModelId, BrandModel brandModelId, Long cat_day) {
        this.id_cat = id_cat;
        this.name = name;
        this.age_year = age_year;
        this.age_month = age_month;
        this.weight = weight;
        this.gender = gender;
        this.userModel = userModelId;
        this.brandModelId = brandModelId;
        this.cal_day = cat_day;
    }

    public Long getId_cat() {
        return id_cat;
    }

    public void setId_cat(Long id_cat) {
        this.id_cat = id_cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge_year() {
        return age_year;
    }

    public void setAge_year(Long age_year) {
        this.age_year = age_year;
    }

    public Long getAge_month() {
        return age_month;
    }

    public void setAge_month(Long age_month) {
        this.age_month = age_month;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public UserModel getUserModelId() {
        return userModel;
    }

    public void setUserModelId(UserModel userModelId) {
        this.userModel = userModelId;
    }

    public BrandModel getBrandModelId() {
        return brandModelId;
    }

    public void setBrandModelId(BrandModel brandModelId) {
        this.brandModelId = brandModelId;
    }

    public Long getCal_day() {
        return cal_day;
    }

    public void setCal_day(Long cat_day) {
        this.cal_day = cat_day;
    }
}
