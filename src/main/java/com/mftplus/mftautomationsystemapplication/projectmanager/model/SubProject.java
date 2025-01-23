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

@Entity(name="subProjectEntity")
@Table(name="sub_project_tbl")
public class SubProject {

    @Id
    @SequenceGenerator(name = "subProjectSeq", sequenceName = "sub_project_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subProjectSeq")
    @Column(name = "id")
    private Long id;
}
