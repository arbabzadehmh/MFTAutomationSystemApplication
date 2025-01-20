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

@Entity(name="insuranceEntity")
@Table(name="insurance_tbl")
public class Insurance {
    @Id
    @SequenceGenerator(name = "insuranceSeq",sequenceName = "insurance_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "insuranceSeq")
    @Column(name = "id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name = "number")
    private String number;

    @Column(name="history")
    private int history;

    @Column(name = "type")
    private String type;

    @Column(name="description")
    private String description;

}
