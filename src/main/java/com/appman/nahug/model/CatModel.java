package com.appman.nahug.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cat")
public class CatModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cat")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="age_year")
    private Long ageYear;
    @Column(name="age_month")
    private Long ageMonth;
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

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_cat",referencedColumnName = "id_cat")
//    private List<HistoryModel> historyModels;

    public CatModel(){}

    public CatModel(Long id, String name, Long ageYear, Long ageMonth, Long weight, String gender, UserModel userModel, BrandModel brandModelId, Long cal_day) {
        this.id = id;
        this.name = name;
        this.ageYear = ageYear;
        this.ageMonth = ageMonth;
        this.weight = weight;
        this.gender = gender;
        this.userModel = userModel;
        this.brandModelId = brandModelId;
        this.cal_day = cal_day;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAgeYear() {
        return ageYear;
    }

    public void setAgeYear(Long ageYear) {
        this.ageYear = ageYear;
    }

    public Long getAgeMonth() {
        return ageMonth;
    }

    public void setAgeMonth(Long ageMonth) {
        this.ageMonth = ageMonth;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
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
