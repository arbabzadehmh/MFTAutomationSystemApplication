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

@Entity(name ="deductionsAndBonusesEntity")
@Table(name ="deductions_and_bonuses_tbl")
public class DeductionsAndBonuses {
   @Id
   @SequenceGenerator(name = "deductionsAndBonusesSeq",sequenceName = "deductions_and_bonuses_seq",allocationSize = 1)
   @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "deductionsAndBonusesSeq")
   @Column(name="id")
   private Long Id;

   @Column(name="name")
    private String name;

   @Column(name="type")
    private String type;

   @Column(name="is_tax_applicable")
    private boolean isTaxApplicable;

   @Column(name="is_insurance_applicable")
    private String isInsuranceApplicable;

   @Column(name="amount")
    private double amount;

    @Column(name="description")
    private String description;

}
