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

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "cat_id_user_fkey",referencedColumnName = "id_user")
    @ManyToOne
    @JoinColumn(name = "id_u")
    private UserModel userModelId;

    public CatModel(){}

    public CatModel(Long id_cat, String name, Long age_year, Long age_month, Long weight, String gender, UserModel userModel) {
        this.id_cat = id_cat;
        this.name = name;
        this.age_year = age_year;
        this.age_month = age_month;
        this.weight = weight;
        this.gender = gender;
        this.userModelId = userModel;
    }

    public UserModel getUserModel() {
        return userModelId;
    }

    public void setUserModel(UserModel userModel) {
        this.userModelId = userModel;
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

}
