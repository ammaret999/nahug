package com.appman.nahug.controller;

import com.appman.nahug.model.CatModel;
import com.appman.nahug.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CatController {
    @Autowired
    CatService service;

    //get
    @GetMapping("/cat")
    public List<CatModel> arr(){
        return service.list();
    }

    //get by id
    @GetMapping( "/cat/{id}")
    @ResponseBody
    public CatModel pathVariable(@PathVariable int id){
        return service.pathVariable(id);
    }

    //get search
    //cat/search?name=kao
    @GetMapping( "/cat/search")
    @ResponseBody
    public String Request(@RequestParam("name") String name){
        return service.Request(name);
    }

    //post
    @PostMapping("/cat")
    public void addCat(@RequestBody CatModel modelCat){
        service.addCat(modelCat);
    }

    //put
    @PutMapping( "/cat/{id}")
    public void editCat(@RequestBody CatModel modelCat, @PathVariable int id){
        service.editCat(modelCat,id);
    }

    //delete
    @DeleteMapping( "/cat/{id}")
    public void deleteCat(@PathVariable int id){
        service.deleteCat(id);
    }
}

