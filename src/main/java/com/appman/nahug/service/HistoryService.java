package com.appman.nahug.service;

import com.appman.nahug.dto.CatDTO;
import com.appman.nahug.dto.HistoryDTO;
import com.appman.nahug.model.CatModel;
import com.appman.nahug.model.HistoryModel;
import com.appman.nahug.model.PhaseModel;
import com.appman.nahug.model.VaccineModel;
import com.appman.nahug.repository.CatRepository;
import com.appman.nahug.repository.HistoryRepository;
import com.appman.nahug.repository.PhaseRepository;
import com.appman.nahug.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class HistoryService {
    @Autowired
    HistoryRepository historyRepository;
    @Autowired
    CatRepository catRepository;
    @Autowired
    VaccineRepository vaccineRepository;
    @Autowired
    PhaseRepository phaseRepository;
    public HistoryModel createHistory(HistoryDTO historyDTO){
        HistoryModel historyModel = new HistoryModel();
        CatModel catModelTarget = catRepository.findById(historyDTO.getIdCat()).orElse(null);
        VaccineModel vaccineModelTarget = vaccineRepository.findById(historyDTO.getIdVaccine()).orElse(null);

        if(catModelTarget.getAge_year() >= 1 || catModelTarget.getAge_month() >= vaccineModelTarget.getAgeMonth()) {
            LocalDate todayDate = LocalDate.now();
            LocalDate endDate = todayDate;
            historyModel.setVaccineModel(vaccineModelTarget);
            historyModel.setCatModel(catModelTarget);
            historyModel.setStartDate(todayDate);
            historyModel.setEndDate(endDate);

            return historyRepository.save(historyModel);
        }
        else {
            return historyModel;
        }
    }

    public List<HistoryModel> getAllHistory() {
        return historyRepository.findAll();
    }

    public void deleteHistory(Long id){
        historyRepository.deleteById(id);
    }
}
