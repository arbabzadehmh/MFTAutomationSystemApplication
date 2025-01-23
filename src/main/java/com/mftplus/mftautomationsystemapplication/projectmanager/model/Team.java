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

@Entity(name="teamEntity")
@Table(name="team_tbl")
public class Team {

    @Id
    @SequenceGenerator(name = "teamSeq", sequenceName = "team_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teamSeq")
    @Column(name = "id")
    private Long id;
}
