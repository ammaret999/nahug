package com.appman.nahug.repository;

import com.appman.nahug.model.PhaseModel;
import com.appman.nahug.model.VaccineModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VaccineRepository extends JpaRepository<VaccineModel,Long> {
}
