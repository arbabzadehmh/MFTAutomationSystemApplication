package com.mftplus.mftautomationsystemapplication.humanresource.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name = "contractEntity")
@Table(name = "contract_tbl")
public class Contract {
    @Id
    @SequenceGenerator(name = "contractSeq", sequenceName = "contract_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contractSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany
    private List<Insurance> insuranceList;

    @OneToMany
    private List<ContractType> contractTypeList;

    @OneToOne
    private Tax tax;

    @OneToOne
    private TimeShift timeShift;
}
