package com.mftplus.mftautomationsystemapplication.humanresource.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;


@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name="missionEntity")
@Table(name="mission_tbl")
public class Mission {
    @Id
    @SequenceGenerator(name = "missionSeq",sequenceName = "mission_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "missionSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "request_date")
    private LocalDate requestDate;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name="end_date")
    private LocalDate endDate;

    @Column(name = "entry_time")
    private LocalTime entryTime;

    @Column(name = "exit_time")
    private LocalTime exitTime;

    @Column(name="time_extension")
    private String timeExtension;

    @Column(name = "origin")
    private String origin;

    @Column(name = "destination")
    private String destination;

    @Column(name = "distance")
    private double distance;

    @Column(name = "travel_method")
    private String travelMethod;

    @Column(name="accommodation")
    private String accommodation;

    @Column(name="creation_date")
    private LocalDate creationDate;

    @Column(name="description")
    private String description;

}
