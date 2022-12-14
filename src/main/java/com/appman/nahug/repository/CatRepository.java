package com.appman.nahug.repository;

import com.appman.nahug.model.CatModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatRepository extends JpaRepository<CatModel,Long> {
}
