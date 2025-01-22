package com.mftplus.mftautomationsystemapplication.humanresource.model;

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

@Entity(name="administrativeRulingEntity")
@Table(name="administrative_ruling_tbl")
public class AdministrativeRuling {
    @Id
    @SequenceGenerator(name = "administrativeRulingSeq",sequenceName = "administrative_ruling_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "administrativeRulingSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "salary")
    private double salary;

    @Column(name = "type")
    private String type;

    @Column(name="description")
    private String description;
}
