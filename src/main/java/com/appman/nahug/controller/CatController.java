package com.appman.nahug.controller;

import com.appman.nahug.model.CatModel;
import com.appman.nahug.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CatController {
    @Autowired
    CatService catservice;

    @RequestMapping(value="/cat", method=RequestMethod.POST)
    public CatModel createCat(@RequestBody CatModel catModel) {
        return catservice.createCat(catModel);
    }

    @RequestMapping(value="/cat", method=RequestMethod.GET)
    public List<CatModel> readCat() {
        return catservice.getCat();
    }

    @RequestMapping(value="/cat/{id}", method=RequestMethod.PUT)
    public CatModel editCat(@PathVariable(value = "id") Integer id, @RequestBody CatModel catModel) {
        return catservice.updateCat(id, catModel);
    }

    @RequestMapping(value="/cat/{id}", method=RequestMethod.DELETE)
    public void deleteCat(@PathVariable(value = "id") Integer id) {
        catservice.deleteCat(id);
    }

//    //get
//    @GetMapping("/cat")
//    public List<CatModel> arr(){
//        return service.list();
//    }
//
//    //get by id
//    @GetMapping( "/cat/{id}")
//    @ResponseBody
//    public CatModel pathVariable(@PathVariable int id){
//        return service.pathVariable(id);
//    }
//
//    //get search
//    //cat/search?name=kao
//    @GetMapping( "/cat/search")
//    @ResponseBody
//    public String Request(@RequestParam("name") String name){
//        return service.Request(name);
//    }
//
//    //post
//    @PostMapping("/cat")
//    public void addCat(@RequestBody CatModel modelCat){
//        service.addCat(modelCat);
//    }
//
//    //put
//    @PutMapping( "/cat/{id}")
//    public void editCat(@RequestBody CatModel modelCat, @PathVariable int id){
//        service.editCat(modelCat,id);
//    }
//
//    //delete
//    @DeleteMapping( "/cat/{id}")
//    public void deleteCat(@PathVariable int id){
//        service.deleteCat(id);
//    }
}

