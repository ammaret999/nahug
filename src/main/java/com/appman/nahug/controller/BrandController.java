package com.appman.nahug.controller;

import com.appman.nahug.model.BrandModel;
import com.appman.nahug.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BrandController {
    @Autowired
    BrandService brandService;

    @RequestMapping(value = "/user/cat/brand",method = RequestMethod.POST)
    public BrandModel creatBrand(@RequestBody BrandModel brandModel){
        return brandService.addBrand(brandModel);
    }

    @RequestMapping(value = "/user/cat/brand",method = RequestMethod.GET)
    public List<BrandModel> getBrand(){return brandService.getBrand();}
}
