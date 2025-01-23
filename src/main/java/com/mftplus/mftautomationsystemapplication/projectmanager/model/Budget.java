package com.mftplus.mftautomationsystemapplication.projectmanager.model;


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

@Entity(name="budgetEntity")
@Table(name="budget_tbl")
public class Budget {

    @Id
    @SequenceGenerator(name = "budgetSeq", sequenceName = "budget_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "budgetSeq")
    @Column(name = "id")
    private Long id;
}
