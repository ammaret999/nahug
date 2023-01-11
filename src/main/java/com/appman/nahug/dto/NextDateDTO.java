package com.appman.nahug.dto;

import com.appman.nahug.model.HistoryModel;

import java.util.List;

public class NextDateDTO {
    public Long catId;
    public Long vaccineId;

    public NextDateDTO(Long catId, Long vaccineId) {
        this.catId = catId;
        this.vaccineId = vaccineId;
    }

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public Long getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(Long vaccineId) {
        this.vaccineId = vaccineId;
    }
}
