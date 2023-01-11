package com.appman.nahug.repository;

import com.appman.nahug.model.PhaseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhaseRepository extends JpaRepository<PhaseModel,Long> {
    List<PhaseModel> findAllByVaccineId(Long vaccineId);
//    PhaseModel findByVaccineIdAndPhase(Long vaccineId,Long phase);
}
