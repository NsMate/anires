package com.homecom.anires.entity;

import com.homecom.anires.entity.enums.AnimalType;
import com.homecom.anires.entity.enums.EventType;
import com.homecom.anires.entity.enums.Urgency;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "event")
public class Event extends BaseEntity {

    @Column(nullable = false)
    private double latitude;

    @Column(nullable = false)
    private double longitude;

    @Column(nullable = false)
    private double radiusKm;

    @Column(nullable = false)
    private Urgency urgency;

    @Column(nullable = false)
    private AnimalType animalType;

    @Column(nullable = false)
    private Boolean resolved;

    @Column(nullable = false)
    private EventType eventType;

    private String comment;

    @ManyToOne
    @JoinColumn(name = "created_by_id")
    private User createdBy;
}
