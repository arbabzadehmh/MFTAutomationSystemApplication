package com.mftplus.mftautomationsystemapplication.humanresource.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.bouncycastle.asn1.x509.Time;

import java.time.LocalTime;
import java.util.Date;

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
    private Date startDate;

    @Column(name="end_date")
    private Date endDate;

    @Column(name="start_clock")
    private LocalTime startClock;

    @Column(name="end_clock")
    private LocalTime endClock;

    @Column(name = "status")
    private String status;

    @Column(name="cration_date")
    private Date crationDate;

    @Column(name = "type")
    private String type;

    @Column(name="description")
    private String description;
}
