package com.mftplus.mftautomationsystemapplication.ticketing.model;


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

@Entity(name="wordEntity")
@Table(name="word_tbl")
public class Word {

    @Id
    @SequenceGenerator(name = "wordSeq", sequenceName = "word_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wordSeq")
    @Column(name = "id")
    private Long id;
}
