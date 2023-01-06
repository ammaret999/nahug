package com.appman.nahug.service;

import com.appman.nahug.dto.VaccineDTO;
import com.appman.nahug.model.UserModel;
import com.appman.nahug.model.VaccineModel;
import com.appman.nahug.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineService {
    @Autowired
    VaccineRepository vaccineRepository;

    public VaccineModel addVaccine(VaccineDTO vaccineDTO) {
        VaccineModel vaccineModel = new VaccineModel();
        vaccineModel.setVaccine(vaccineDTO.getVaccine());
        vaccineModel.setAgeMonth(vaccineDTO.getAgeMonth());
        return vaccineRepository.save(vaccineModel);
    }

    public List<VaccineModel> getVaccine(){
        return vaccineRepository.findAll();
    }

    public void deleteVaccine(Long id){
        vaccineRepository.deleteById(id);
    }
}
