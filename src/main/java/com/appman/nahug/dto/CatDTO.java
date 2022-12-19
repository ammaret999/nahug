package com.appman.nahug.dto;

import com.appman.nahug.model.UserModel;
import lombok.Data;

@Data
public class CatDTO {

    private String name;

    private Long age_year;

    private Long age_month;

    private Long weight;

    private String gender;

    private Long userId;

    private Long foodId;

    public CatDTO(String name, Long age_year, Long age_month, Long weight, String gender, Long userId, Long foodId) {
        this.name = name;
        this.age_year = age_year;
        this.age_month = age_month;
        this.weight = weight;
        this.gender = gender;
        this.userId = userId;
        this.foodId = foodId;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }
}