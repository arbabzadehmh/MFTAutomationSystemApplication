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

@Entity(name="leaveEntity")
@Table(name="leave_tbl")
public class Leave {
    @Id
    @SequenceGenerator(name = "leaveSeq",sequenceName = "leave_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "leaveSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name="end_date")
    private LocalDate endDate;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @Column(name = "status")
    private String status;

    @Column(name="registration_date")
    private LocalDate registrationDate;

    @Column(name = "type")
    private String type;

    @Column(name="description")
    private String description;
}
