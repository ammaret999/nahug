package com.appman.nahug.repository;

import com.appman.nahug.model.VaccineModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccineRepository extends JpaRepository<VaccineModel,Long> {
}
