package com.appman.nahug.dto;

public class CatDTO {

    private String name;

    private Long ageYear;

    private Long ageMonth;

    private Long weight;

    private String gender;

    private Long userId;

    private Long foodId;

    public CatDTO(String name, Long ageYear, Long ageMonth, Long weight, String gender, Long userId, Long foodId) {
        this.name = name;
        this.ageYear = ageYear;
        this.ageMonth = ageMonth;
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