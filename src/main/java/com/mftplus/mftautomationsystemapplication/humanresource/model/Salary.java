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

@Entity(name = "salaryEntity")
@Table(name = "salary_tbl")
public class Salary {
    @Id
    @SequenceGenerator(name = "salarySeq", sequenceName = "salary_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "salarySeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "day")
    private int day;

    @Column(name = "efficient")//karane
    private int efficient;


    @OneToMany
    private List<Addition> additionList;

    @OneToOne
    private Contract contract;


    @OneToOne
    private TimeSheet timeSheet;

    @OneToMany
    private List<Loan> loanList;

    @OneToMany
    private List<Ruling> rulingList;


}
