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

@Entity(name="contractTypeEntity")
@Table(name="contract_type_tbl")
public class ContractType {
    @Id
    @SequenceGenerator(name = "contractTypeSeq",sequenceName = "contract_type_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "contractTypeSeq")
    @Column(name = "id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name = "status")
    private String status;

    @Column(name="description")
    private String description;

}
