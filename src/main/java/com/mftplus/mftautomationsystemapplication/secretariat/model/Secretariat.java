package com.mftplus.mftautomationsystemapplication.secretariat.model;


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

@Entity(name="secretariatEntity")
@Table(name="secretariat_tbl")
public class Secretariat {

    @Id
    @SequenceGenerator(name = "secretariatSeq", sequenceName = "secretariat_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secretariatSeq")
    @Column(name = "id")
    private Long id;
}
