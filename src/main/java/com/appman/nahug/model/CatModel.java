package com.appman.nahug.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cat_profile")
public class CatModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;
    @Column(name="age")
    private Long age;
    @Column(name="weight")
    private Long weight;
    @Column(name="gender")
    private String gender;

    public CatModel(){}

    public CatModel(Long id, String name, Long age, Long weight, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
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

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
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


//    @Override
//    public String toString() {
//        return "CatModel{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", weight=" + weight +
//                ", gender='" + gender + '\'' +
//                '}';
//    }
}
