package com.appman.nahug.service;

import com.appman.nahug.model.CatModel;
import com.appman.nahug.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class CatService {

    @Autowired
        CatRepository catRepository;

//    private final AtomicInteger counter = new AtomicInteger();

    // CREATE
    public CatModel createCat(CatModel catModel) {
        return catRepository.save(catModel);
    }

    // READ
    public List<CatModel> getCat() {
        return catRepository.findAll();
    }

    // DELETE
    public void deleteCat(Long empId) {
        catRepository.deleteById(empId);
    }

    // UPDATE
    public CatModel updateCat(Long id, CatModel catModel) {
        CatModel catUpdate = catRepository.findById(id).get();
        catUpdate.setName(catModel.getName());
        catUpdate.setAge(catModel.getAge());
        catUpdate.setWeight(catModel.getWeight());
        catUpdate.setGender(catModel.getGender());

        return catRepository.save(catUpdate);
    }

//    //get
//    public List<CatModel> list(){
//        return modelCats;
//    }
//
//    public CatModel pathVariable(int id){
//        return modelCats.stream().filter(result -> result.getId() == id).findFirst().orElseGet(() -> null);
//    }
//
//    public String Request(String name){
//        return "CatID: "+ name;
//    }
//
//    //post
//    public void addCat(CatModel modelCat){
//        modelCats.add(new CatModel(counter.getAndIncrement(),modelCat.getName(),modelCat.getAge(),modelCat.getWeight(),modelCat.getGender()));
//    }
//
//    public void editCat(CatModel modelCat, int id){
//        modelCats.stream().filter(result -> result.getId() == id)
//                .findFirst()
//                .ifPresentOrElse(result -> {
//                    result.setName(modelCat.getName());
//                }, () -> {
//
//                });
//    }
//
//    public void deleteCat(int id){
//        modelCats.stream().filter(result -> result.getId() == id)
//                .findFirst()
//                .ifPresentOrElse(result -> {
//                    modelCats.remove(result);
//                }, () -> {
//
//                });
//    }
}

