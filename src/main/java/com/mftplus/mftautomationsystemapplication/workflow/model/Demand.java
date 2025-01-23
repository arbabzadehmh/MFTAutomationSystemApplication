package com.mftplus.mftautomationsystemapplication.workflow.model;

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

@Entity(name="demandEntity")
@Table(name="demand_tbl")
public class Demand {

    @Id
    @SequenceGenerator(name = "demandSeq", sequenceName = "demand_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "demandSeq")
    @Column(name = "id")
    private Long id;
}
