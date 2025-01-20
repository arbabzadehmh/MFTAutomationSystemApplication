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

@Entity(name="recruitmentEntity")
@Table(name="recruitment_tbl")
public class Recruitment {
    @Id
    @SequenceGenerator(name = "recruitmentSeq",sequenceName = "recruitment_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "recruitmentSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "start_date")
    private Date startDate;
    
    @Column(name="end_date")
    private Date endDate;

    @Column(name="description")
    private String description;
}
