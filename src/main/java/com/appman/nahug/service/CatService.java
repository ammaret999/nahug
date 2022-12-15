package com.appman.nahug.service;

import com.appman.nahug.dto.CatDTO;
import com.appman.nahug.dto.FoodEditDTO;
import com.appman.nahug.model.CatModel;
import com.appman.nahug.repository.BrandRepository;
import com.appman.nahug.repository.CatRepository;
import com.appman.nahug.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        catModel.setUserModelId(userRepository.findById(catDTO.getId_u()).orElseGet(null));
        catModel.setName(catDTO.getName());
        catModel.setAge_year(catDTO.getAge_year());
        catModel.setAge_month(catDTO.getAge_month());
        catModel.setWeight(catDTO.getWeight());
        catModel.setGender(catDTO.getGender());
        catModel.setBrandModelId(brandRepository.findById(catDTO.getId_f()).orElseGet(null));
        catModel.setCal_day(
                calculate_cal(catModel.getWeight(),catModel.getBrandModelId().getCal())
        );
        return catRepository.save(catModel);
    }

    // put
//    public CatModel editCat(FoodEditDTO foodEditDTO) {
//        CatModel catModel = new CatModel();
//        catModel.setBrandModelId(brandRepository.findById(foodEditDTO.getId_f()).orElseGet(null));
//        catModel.setCal_day(
//                calculate_cal(catModel.getWeight(),catModel.getBrandModelId().getCal())
//        );
//        return catRepository.save(catModel);
//    }

    public Long calculate_cal(Long weight,Long calFood){
        return (((30 * weight)+70) * 100 / calFood);
    }

    //READ
    public List<CatModel> getCat() {
        return catRepository.findAll();
    }


}