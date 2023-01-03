package com.appman.nahug.controller;

import com.appman.nahug.model.BrandModel;
import com.appman.nahug.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BrandController {
    @Autowired
    BrandService brandService;

    @RequestMapping(value = "/brand",method = RequestMethod.POST)
    public BrandModel creatBrand(@RequestBody BrandModel brandModel){
        return brandService.addBrand(brandModel);
    }

    @RequestMapping(value = "/brand",method = RequestMethod.GET)
    public List<BrandModel> getBrand(){return brandService.getBrand();}

    @RequestMapping(value="/brand/{id}", method=RequestMethod.DELETE)
    public void deleteCat(@PathVariable(value = "id") Long id) {
        brandService.deleteBrand(id);
    }
}
