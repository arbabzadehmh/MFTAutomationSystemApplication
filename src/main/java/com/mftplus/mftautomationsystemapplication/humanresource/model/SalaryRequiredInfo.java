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

@Entity(name = "salaryRequiredInfoEntity")
@Table(name = "salary_info_tbl")
public class SalaryRequiredInfo {
    @Id
    @SequenceGenerator(name = "salaryInfoSeq", sequenceName = "salary_info_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "salaryInfoSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "number_of_days")
    private int numberOfDays;

    @Column(name = "efficient")//karane
    private int efficient;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "salary_info_deductions_bonuses_tbl",
            joinColumns = @JoinColumn(name = "salary_info_id"),
            inverseJoinColumns = @JoinColumn(name = "deductions_bonuses_id"),
            foreignKey = @ForeignKey(name = "fk_salary_info_deductions_bonuses"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_salary_info_deductions_bonuses")
    )
    private List<DeductionsAndBonuses> deductionsAndBonusesList;

    @OneToOne
    @JoinColumn(
            name = "contract_id",
            foreignKey = @ForeignKey(name = "fk_salary_info_contract")
    )
    private Contract contract;

    @OneToOne
    @JoinColumn(
            name = "time_sheet_id",
            foreignKey = @ForeignKey(name = "fk_salary_info_time_sheet")
    )
    private TimeSheet timeSheet;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "salary_info_loan_tbl",
            joinColumns = @JoinColumn(name = "salary_info_id"),
            inverseJoinColumns = @JoinColumn(name = "loan_id"),
            foreignKey = @ForeignKey(name = "fk_salary_info_loan"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_salary_info_loan")
    )
    private List<Loan> loanList;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "salary_info_administrative_ruling_tbl",
            joinColumns = @JoinColumn(name = "salary_info_id"),
            inverseJoinColumns = @JoinColumn(name = "administrative_ruling_id"),
            foreignKey = @ForeignKey(name = "fk_salary_info_administrative_ruling"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_salary_info_administrative_ruling")
    )
    private List<AdministrativeRuling> administrativeRulingList;


}
