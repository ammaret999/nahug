package com.appman.nahug.repository;

import com.appman.nahug.model.CatModel;
import com.appman.nahug.model.HistoryModel;
import com.appman.nahug.model.VaccineModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoryRepository extends JpaRepository<HistoryModel,Long> {
    List<HistoryModel> findAllByCatModelId(Long cat);
    List<HistoryModel> findAllByVaccineModelIdAndCatModelId(Long vaccineId,Long catId);

}
