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

@Entity(name ="additionEntity")
@Table(name ="addition_tbl")
public class Addition {
   @Id
   @SequenceGenerator(name = "additionSeq",sequenceName = "addition_seq",allocationSize = 1)
   @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "additionSeq")
   @Column(name="id")
   private Long Id;

   @Column(name="name")
    private String name;

   @Column(name="type")
    private String type;

   @Column(name="description")
    private String description;

   @Column(name="include_tax")
    private String includeTax;

   @Column(name="include_insurance")
    private String includeInsurance;

   @Column(name="amount")
    private String amount;


}
