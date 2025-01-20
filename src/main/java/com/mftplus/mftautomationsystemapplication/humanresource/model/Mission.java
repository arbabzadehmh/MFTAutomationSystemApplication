package com.mftplus.mftautomationsystemapplication.humanresource.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Date;

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

    @Column(name = "start_date")
    private Date startDate;

    @Column(name="end_date")
    private Date endDate;

    @Column(name="time_extension")
    private String timeExtension;

    @Column(name = "origin")
    private String origin;

    @Column(name = "destination")
    private String destination;

    @Column(name = "distance")
    private String distance;

    @Column(name = "attached")
    private String attached;

    @Column(name = "residence")
    private String residence;

    @Column(name = "transport_type")
    private String transportType;

    @Column(name="cration_date")
    private Date crationDate;

    @Column(name="description")
    private String description;
}
