package com.mftplus.mftautomationsystemapplication.meetingmanagement.model;


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

@Entity(name="projectListEntity")
@Table(name="project_list_tbl")
public class ProjectList {

    @Id
    @SequenceGenerator(name = "projectListSeq", sequenceName = "project_list_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "projectListSeq")
    @Column(name = "id")
    private Long id;
}
