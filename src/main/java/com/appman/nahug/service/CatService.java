package com.appman.nahug.service;

import com.appman.nahug.model.CatModel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@org.springframework.stereotype.Service
public class CatService {

    private final List<CatModel> modelCats = new ArrayList<>();
    private final AtomicInteger counter = new AtomicInteger();

    //get
    public List<CatModel> list(){
        return modelCats;
    }

    public CatModel pathVariable(int id){
        return modelCats.stream().filter(result -> result.getId() == id).findFirst().orElseGet(() -> null);
    }

    public String Request(String name){
        return "CatID: "+ name;
    }

    //post
    public void addCat(CatModel modelCat){
        modelCats.add(new CatModel(counter.getAndIncrement(),modelCat.getName(),modelCat.getAge(),modelCat.getWeight(),modelCat.getGender()));
    }

    public void editCat(CatModel modelCat, int id){
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

