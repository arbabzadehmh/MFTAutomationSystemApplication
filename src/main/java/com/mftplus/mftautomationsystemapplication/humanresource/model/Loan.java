package com.mftplus.mftautomationsystemapplication.humanresource.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name="loanEntity")
@Table(name="loan_tbl")
public class Loan {
    @Id
    @SequenceGenerator(name = "loanSeq",sequenceName = "loan_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "loanSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name="total_amount")
    private Double totalAmount;

    @Column(name="count_installment")
    private Double countInstallment;

    @Column(name="amount_installment")
    private Double amountInstallment;


    @Column(name = "status")
    private String status;

    @Column(name="cration_date")
    private Date crationDate;

}
