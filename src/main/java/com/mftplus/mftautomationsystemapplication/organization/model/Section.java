package com.mftplus.mftautomationsystemapplication.organization.model;


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

@Entity(name="sectionEntity")
@Table(name="section_tbl")
public class Section {

    @Id
    @SequenceGenerator(name = "sectionSeq", sequenceName = "section_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sectionSeq")
    @Column(name = "id")
    private Long id;
}
