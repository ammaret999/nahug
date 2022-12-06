package com.appman.nahug.service;

import com.appman.nahug.model.ModelCat;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@org.springframework.stereotype.Service
public class Service {

    private final List<ModelCat> modelCats = new ArrayList<>();
    private final AtomicInteger counter = new AtomicInteger();

    //get
    public List<ModelCat> list(){
        return modelCats;
    }

    public ModelCat pathVariable(int id){
        return modelCats.stream().filter(result -> result.getId() == id).findFirst().orElseGet(() -> null);
    }

    public String Request(String name){
        return "CatID: "+ name;
    }

    //post
    public void addCat(ModelCat modelCat){
        modelCats.add(new ModelCat(counter.getAndIncrement(),modelCat.getName(),modelCat.getAge(),modelCat.getWeight(),modelCat.getGender()));
    }

    public void editCat(ModelCat modelCat, int id){
        modelCats.stream().filter(result -> result.getId() == id)
                .findFirst()
                .ifPresentOrElse(result -> {
                    result.setName(modelCat.getName());
                }, () -> {

                });
    }

    public void deleteCat(int id){
        modelCats.stream().filter(result -> result.getId() == id)
                .findFirst()
                .ifPresentOrElse(result -> {
                    modelCats.remove(result);
                }, () -> {

                });
    }
}

