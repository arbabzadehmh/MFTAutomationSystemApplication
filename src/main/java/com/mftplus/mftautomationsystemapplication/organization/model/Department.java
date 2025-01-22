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

@Entity(name="departmentEntity")
@Table(name="department_table")
public class Department {
    @Id
    @SequenceGenerator(name = "departmentSeq",sequenceName = "department_seq" , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "departmentSeq")
    @Column(name="id")
    private Long id;
}
