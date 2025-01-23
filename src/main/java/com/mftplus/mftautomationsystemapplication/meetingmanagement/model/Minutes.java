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

@Entity(name="minutesEntity")
@Table(name="minutes_tbl")
public class Minutes {

    @Id
    @SequenceGenerator(name = "minutesSeq", sequenceName = "minutes_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "minutesSeq")
    @Column(name = "id")
    private Long id;
}
