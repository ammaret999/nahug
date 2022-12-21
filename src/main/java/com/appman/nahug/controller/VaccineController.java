package com.appman.nahug.controller;

import com.appman.nahug.dto.VaccineDTO;
import com.appman.nahug.model.UserModel;
import com.appman.nahug.model.VaccineModel;
import com.appman.nahug.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VaccineController {
    @Autowired
    VaccineService vaccineService;

    //vaccine
    @RequestMapping(value="/vaccine", method=RequestMethod.POST)
    public VaccineModel createVaccine(@RequestBody VaccineDTO vaccineDTO) {
        return vaccineService.addVaccine(vaccineDTO);
    }
    @RequestMapping(value="/vaccine", method=RequestMethod.GET)
    public List<VaccineModel> readVaccine() {
        return vaccineService.getVaccine();
    }

}
