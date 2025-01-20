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

@Entity(name="rulingEntity")
@Table(name="ruling_tbl")
public class Ruling {
    @Id
    @SequenceGenerator(name = "rulingSeq",sequenceName = "ruling_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "rulingSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "earnings")
    private Long earnings;

    @Column(name = "type")
    private String type;

    @Column(name="description")
    private String description;
}
