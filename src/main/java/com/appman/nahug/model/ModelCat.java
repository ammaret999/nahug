package com.appman.nahug.model;

public class ModelCat {
    private int id;
    private String name;
    private long age;
    private long weight;
    private String gender;

    public ModelCat(){}

    public ModelCat(int id,String name, long age, long weight, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
