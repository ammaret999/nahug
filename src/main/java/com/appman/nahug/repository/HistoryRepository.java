package com.appman.nahug.repository;

import com.appman.nahug.model.HistoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepository<HistoryModel,Long> {
}
