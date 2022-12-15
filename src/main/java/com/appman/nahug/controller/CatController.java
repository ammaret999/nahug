package com.appman.nahug.controller;

import com.appman.nahug.dto.CatDTO;
import com.appman.nahug.model.CatModel;
import com.appman.nahug.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CatController {
    @Autowired
    CatService catService;

    @RequestMapping(value = "/user/cat", method = RequestMethod.POST)
    public CatModel createCat(@RequestBody CatDTO catDTO) {
        return catService.createCat(catDTO);
    }

    @RequestMapping(value = "/user/cat", method = RequestMethod.GET)
    public List<CatModel> readCat() {
        return catService.getCat();
    }

    @RequestMapping(value = "/user/cat/edit/{id_cat}", method = RequestMethod.PUT)
    public CatModel editCat(@RequestBody CatModel catModel,@PathVariable(value = "id_cat") Long id_cat) {
        return catService.editCat(catModel,id_cat);
    }
}


