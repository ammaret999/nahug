package com.appman.nahug.dto;

import java.util.Date;

public class HistoryDTO {
    private Long idCat;
    private Long idVaccine;

    public HistoryDTO(Long idCat, Long idVaccine) {
        this.idCat = idCat;
        this.idVaccine = idVaccine;
    }

    public Long getIdCat() {
        return idCat;
    }

    public void setIdCat(Long idCat) {
        this.idCat = idCat;
    }

    public Long getIdVaccine() {
        return idVaccine;
    }

    public void setIdVaccine(Long idVaccine) {
        this.idVaccine = idVaccine;
    }
}
