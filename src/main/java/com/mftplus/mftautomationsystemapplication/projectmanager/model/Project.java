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

@Entity(name="projectEntity")
@Table(name="project_tbl")
public class Project {

    @Id
    @SequenceGenerator(name = "projectSeq", sequenceName = "project_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "projectSeq")
    @Column(name = "id")
    private Long id;
}
