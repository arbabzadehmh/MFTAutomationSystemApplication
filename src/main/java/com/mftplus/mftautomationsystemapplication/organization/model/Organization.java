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

@Entity(name="organizationEntity")
@Table(name="organization_tbl")
public class Organization {

    @Id
    @SequenceGenerator(name = "organizationSeq", sequenceName = "organization_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organizationSeq")
    @Column(name = "id")
    private Long id;
}
