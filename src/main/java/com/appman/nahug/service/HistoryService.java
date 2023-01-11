package com.appman.nahug.service;

import com.appman.nahug.dto.CatDTO;
import com.appman.nahug.dto.HistoryDTO;
import com.appman.nahug.dto.NextDateDTO;
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
import java.util.Collections;
import java.util.List;
import java.util.Objects;

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
        historyModel.setVaccineModel(vaccineRepository.findById(historyDTO.getIdVaccine()).orElse(null));
        historyModel.setCatModel(catRepository.findById(historyDTO.getIdCat()).orElse(null));
        LocalDate local = LocalDate.now();
        historyModel.setStartDate(local);
        return historyRepository.save(historyModel);
    }

    public List<HistoryModel> getAllHistory() {
        return historyRepository.findAll();
    }

    public void deleteHistory(Long id){
        historyRepository.deleteById(id);
    }

    public List<HistoryModel> showHistoryAll(Long catId) {
        List<HistoryModel> historyModels = historyRepository.findAllByCatModelId(catId);
        return historyModels;
    }

    public LocalDate showNextVaccine(NextDateDTO nextDateDTO){
        List<HistoryModel> historyModels = historyRepository.findAllByVaccineModelIdAndCatModelId(nextDateDTO.getVaccineId(),nextDateDTO.getCatId());
        Long countHistory = historyModels.stream().count();
        List<PhaseModel> phaseModels = phaseRepository.findAllByVaccineId(nextDateDTO.getVaccineId());
        Long countPhase = phaseModels.stream().count();

        Long history = countHistory;

        if(countHistory > 0) {
            for (int i = 0; history >= 0; i++) {
                PhaseModel phaseNow = phaseModels.get(i);
                history = history - phaseNow.getTime();

                if (history <= 0 && phaseNow.getNext() != 0) {
                    HistoryModel historyModelFinal = historyModels.get(Math.toIntExact(countHistory) - 1);
                    return historyModelFinal.getStartDate().plusMonths(phaseNow.getNext());
                } else if (i == countPhase - 1) {
                    HistoryModel historyModelFinal = historyModels.get(Math.toIntExact(countHistory) - 1);
                    return historyModelFinal.getStartDate().plusMonths(phaseNow.getNext());
                }
            }
        }
        LocalDate toDay = LocalDate.now();
        return toDay;
    }
}
