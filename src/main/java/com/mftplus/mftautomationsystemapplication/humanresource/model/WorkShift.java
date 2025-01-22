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

@Entity(name = "workShift")
@Table(name = "work_shift_tbl")
public class WorkShift {
    @Id
    @SequenceGenerator(name = "workShiftSeq",sequenceName = "work_shift_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "workShiftSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name="status")
    private String status;
}
