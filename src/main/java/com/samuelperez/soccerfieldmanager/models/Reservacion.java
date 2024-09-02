package com.samuelperez.soccerfieldmanager.models;

import java.sql.Date;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "reservacion")
public class Reservacion {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date startTime;
    private Date endTiem;
    private String payment;

    private Status status;

    @ManyToOne
    private User user;
    
    @ManyToOne
    private SoccerField soccerField;

}
