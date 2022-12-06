//package com.appman.nahug.controller;
//
//import com.appman.nahug.model.ModelCat;
//import com.appman.nahug.service.Service;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.atomic.AtomicInteger;
//
//@RestController
//public class NewControllerCat {
//    @Autowired
//    Service service;
//
//    //get
//    @GetMapping("/cat")
//    public List<ModelCat> arr(){
//        return service.list();
//    }
//
//    //get by id
//    @GetMapping( "/cat/{id}")
//    @ResponseBody
//    public ModelCat pathVariable(@PathVariable int id){
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
//    public void addCat(@RequestBody ModelCat modelCat){
//        service.addCat(modelCat);
//    }
//
//    //put
//    @PutMapping( "/cat/{id}")
//    public void editCat(@RequestBody ModelCat modelCat,@PathVariable int id){
//        service.editCat(modelCat,id);
//    }
//
//    //delete
//    @DeleteMapping( "/cat/{id}")
//    public void deleteCat(@PathVariable int id){
//        service.deleteCat(id);
//    }
//}
//
//
