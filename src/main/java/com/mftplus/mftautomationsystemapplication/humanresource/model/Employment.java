package com.mftplus.mftautomationsystemapplication.humanresource.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name="employmentEntity")
@Table(name="employment_tbl")
public class Employment {
    @Id
    @SequenceGenerator(name = "employmentSeq",sequenceName = "employment_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "employmentSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "start_date")
    private LocalDate startDate;
    
    @Column(name="end_date")
    private LocalDate endDate;

    @Column(name = "standard_work_hours_weekly")
    private int standardWorkHoursWeekly;

    @Column(name = "standard_work_hours_monthly")
    private int standardWorkHoursMonthly;

    @Column(name = "standard_leave_hours_yearly")
    private int standardLeaveHoursYearly;


    @Column(name="description")
    private String description;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "employment_contract_tbl",
            joinColumns = @JoinColumn(name = "employment_id"),
            inverseJoinColumns = @JoinColumn(name = "contract_id"),
            foreignKey = @ForeignKey(name = "fk_employment_contract"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_employment_contract")
    )

    private List<Contract> contractList;
}
