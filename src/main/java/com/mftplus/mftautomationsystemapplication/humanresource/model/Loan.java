package com.mftplus.mftautomationsystemapplication.humanresource.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;


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
    private LocalDate startDate;

    @Column(name="total_amount")
    private Double totalAmount;

    @Column(name="number_of_installment")
    private Double numberOfInstallment;

    @Column(name="installment_amount")
    private Double installmentAmount;


    @Column(name = "status")
    private String status;

    @Column(name="registration_date")
    private LocalDate registrationDate;

}
