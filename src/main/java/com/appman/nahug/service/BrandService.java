package com.appman.nahug.service;

import com.appman.nahug.model.BrandModel;
import com.appman.nahug.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {
    @Autowired
    BrandRepository brandRepository;

    public BrandModel addBrand(BrandModel brandModel){
        return brandRepository.save(brandModel);
    }

    public List<BrandModel> getBrand(){
        return brandRepository.findAll();
    }

    public void deleteBrand(Long id){brandRepository.deleteById(id);}
}
