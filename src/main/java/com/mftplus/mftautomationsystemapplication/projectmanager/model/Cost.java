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

@Entity(name="costEntity")
@Table(name="cost_tbl")
public class Cost {

    @Id
    @SequenceGenerator(name = "costSeq", sequenceName = "cost_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "costSeq")
    @Column(name = "id")
    private Long id;
}
