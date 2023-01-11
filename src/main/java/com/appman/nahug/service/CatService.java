package com.appman.nahug.service;

import com.appman.nahug.dto.CatDTO;
import com.appman.nahug.model.CatModel;
import com.appman.nahug.model.UserModel;
import com.appman.nahug.repository.BrandRepository;
import com.appman.nahug.repository.CatRepository;
import com.appman.nahug.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CatService {

    @Autowired
    CatRepository catRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    BrandRepository brandRepository;

    // CREATE
    public CatModel createCat(CatDTO catDTO) {
        CatModel catModel = new CatModel();
        catModel.setUserModelId(userRepository.findById(catDTO.getUserId()).orElseGet(null));
        catModel.setName(catDTO.getName());
        catModel.setAgeYear(catDTO.getAgeYear());
        catModel.setAgeMonth(catDTO.getAgeMonth());
        catModel.setWeight(catDTO.getWeight());
        catModel.setGender(catDTO.getGender());
        catModel.setBrandModelId(brandRepository.findById(catDTO.getFoodId()).orElseGet(null));
        catModel.setCal_day(
                calculate_cal(catModel.getWeight(),catModel.getBrandModelId().getCal())
        );
        return catRepository.save(catModel);
    }

    // put
    public CatModel editCat(CatModel catModel,Long catId) {
        CatModel Update = catRepository.findById(catId).get();

        Update.setName(catModel.getName());
        Update.setAgeYear(catModel.getAgeYear());
        Update.setAgeMonth(catModel.getAgeMonth());
        Update.setWeight(catModel.getWeight());
        Update.setGender(catModel.getGender());
        Update.setUserModelId(userRepository.findById(catModel.getUserModelId().getId_user()).orElseGet(null));
        Update.setBrandModelId(brandRepository.findById(catModel.getBrandModelId().getId_brand()).orElseGet(null));
        Update.setCal_day(
                calculate_cal(Update.getWeight(),Update.getBrandModelId().getCal())
        );
        return catRepository.save(Update);
    }

    public Long calculate_cal(Long weight,Long calFood){
        if(weight <= 0 || calFood <= 0) {
            return 0L;
        }
        else if(weight <= 2){
            return  (((30 * weight) + 70) * 100 / calFood);
        }
        else {
            return (long) (70 * Math.pow(weight,0.75) * 100 / calFood);
        }
    }

    //READ
    public List<CatModel> getCat() {
        return catRepository.findAll();
    }

    public void deleteCat(Long id){catRepository.deleteById(id);}
}