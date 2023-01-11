package com.appman.nahug.dto;

public class PhaseDTO {
    private Long next;
    private Long time;
    private Long vaccineId;
    private Long phase;

    public PhaseDTO(Long next, Long time, Long vaccineId, Long phase) {
        this.next = next;
        this.time = time;
        this.vaccineId = vaccineId;
        this.phase = phase;
    }

    public Long getNext() {
        return next;
    }

    public void setNext(Long next) {
        this.next = next;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(Long vaccineId) {
        this.vaccineId = vaccineId;
    }

    public Long getPhase() {
        return phase;
    }

    public void setPhase(Long phase) {
        this.phase = phase;
    }
}
