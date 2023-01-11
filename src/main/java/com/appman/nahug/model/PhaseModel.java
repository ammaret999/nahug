package com.appman.nahug.model;

import jakarta.persistence.*;
@Entity
@Table(name = "phase")
public class PhaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_phase")
    private Long id;
    @Column(name = "next_time")
    private Long next;
    @Column(name = "count_vaccine")
    private Long time;
    @Column(name = "vaccine_id")
    private Long vaccineId;
    @Column(name = "phase")
    private Long phase;

    public PhaseModel() {
    }

    public PhaseModel(Long id, Long vaccineId, Long phase, Long next, Long time) {
        this.id = id;
        this.vaccineId = vaccineId;
        this.phase = phase;
        this.next = next;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
