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

@Entity(name="meetingEntity")
@Table(name="meeting_tbl")
public class Meeting {

    @Id
    @SequenceGenerator(name = "meetingSeq", sequenceName = "meeting_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meetingSeq")
    @Column(name = "id")
    private Long id;
}
