package com.appman.nahug.service;

import com.appman.nahug.dto.CatDTO;
import com.appman.nahug.model.CatModel;
import com.appman.nahug.model.UserModel;
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

    // CREATE
    public CatModel createCat(CatDTO catDTO) {
        CatModel catModel = new CatModel();

        catModel.setUserModel(userRepository.findById(catDTO.getId_u()).orElseGet(null));
        catModel.setName(catDTO.getName());
        catModel.setAge_year(catDTO.getAge_year());
        catModel.setAge_month(catDTO.getAge_month());
        catModel.setWeight(catDTO.getWeight());
        catModel.setGender(catDTO.getGender());

        return catRepository.save(catModel);
    }

    //READ
    public List<CatModel> getCat() {
        return catRepository.findAll();
    }

//    public List<CatModel> getCatByEmali(String email){
//        return catRepository.findByEmail(email);
//    }


//
//    // DELETE
//    public void deleteCat(Long catId) {
//        catRepository.deleteById(catId);
//    }
//
//    // UPDATE
//    public CatModel updateCat(Long id, CatModel catModel) {
//        CatModel catUpdate = catRepository.findById(id).get();
//        catUpdate.setName(catModel.getName());
//        catUpdate.setAge_year(catModel.getAge_year());
//        catUpdate.setAge_month(catModel.getAge_month());
//        catUpdate.setWeight(catModel.getWeight());
//        catUpdate.setGender(catModel.getGender());
//
//        return catRepository.save(catUpdate);
//    }

}