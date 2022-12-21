package com.appman.nahug.controller;

import com.appman.nahug.dto.PhaseDTO;
import com.appman.nahug.model.PhaseModel;
import com.appman.nahug.service.PhaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PhaseController {
    @Autowired
    PhaseService phaseService;

    @RequestMapping(value="/vaccine/phase", method= RequestMethod.POST)
    public PhaseModel createPhase(@RequestBody PhaseDTO phaseDTO) {
        return phaseService.createPhase(phaseDTO);
    }
    @RequestMapping(value="/vaccine/phase", method=RequestMethod.GET)
    public List<PhaseModel> readPhase() {
        return phaseService.getAllPhase();
    }
}
