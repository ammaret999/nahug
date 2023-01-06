package com.appman.nahug.service;

import com.appman.nahug.dto.PhaseDTO;
import com.appman.nahug.model.CatModel;
import com.appman.nahug.model.PhaseModel;
import com.appman.nahug.model.VaccineModel;
import com.appman.nahug.repository.PhaseRepository;
import com.appman.nahug.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhaseService {
    @Autowired
    PhaseRepository phaseRepository;

    public PhaseModel createPhase(PhaseDTO phaseDTO) {
        PhaseModel phaseModel = new PhaseModel();
        phaseModel.setNext(phaseDTO.getNext());
        phaseModel.setTime(phaseDTO.getTime());
        phaseModel.setVaccineId(phaseDTO.getVaccineId());
        phaseModel.setPhase(phaseDTO.getPhase());

        return phaseRepository.save(phaseModel);
    }


    public List<PhaseModel> getAllPhase() {
        return phaseRepository.findAll();
    }

    public void deletePhase(Long id){
        phaseRepository.deleteById(id);
    }
}
