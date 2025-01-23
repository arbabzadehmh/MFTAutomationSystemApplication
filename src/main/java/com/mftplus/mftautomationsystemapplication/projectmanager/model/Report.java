package com.mftplus.mftautomationsystemapplication.projectmanager.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name="reportEntity")
@Table(name="report_tbl")
public class Report {

    @Id
    @SequenceGenerator(name = "reportSeq", sequenceName = "report_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reportSeq")
    @Column(name = "id")
    private Long id;
}
